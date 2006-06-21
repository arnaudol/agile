/*
* Copyright 2005 Arnaud Prost
* 
* Arnaud.prost@gmail.com
* 
* This software is a computer program whose purpose is to ease the 
* management of software project.
* 
* This software is governed by the CeCILL  license under French law and
* abiding by the rules of distribution of free software.  You can  use, 
* modify and/ or redistribute the software under the terms of the CeCILL
* license as circulated by CEA, CNRS and INRIA at the following URL
* "http://www.cecill.info". 
* 
* As a counterpart to the access to the source code and  rights to copy,
* modify and redistribute granted by the license, users are provided only
* with a limited warranty  and the software's author,  the holder of the
* economic rights,  and the successive licensors  have only  limited
* liability. 
* 
* In this respect, the user's attention is drawn to the risks associated
* with loading,  using,  modifying and/or developing or reproducing the
* software by the user in light of its specific status of free software,
* that may mean  that it is complicated to manipulate,  and  that  also
* therefore means  that it is reserved for developers  and  experienced
* professionals having in-depth computer knowledge. Users are therefore
* encouraged to load and test the software's suitability as regards their
* requirements in conditions enabling the security of their systems and/or 
* data to be ensured and,  more generally, to use and operate it in the 
* same conditions as regards security. 
* 
* The fact that you are presently reading this means that you have had
* knowledge of the CeCILL license and that you accept its terms.
*/

package net.sf.pmr.core.data.user.company;

import java.util.List;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.MapperTestCase;
import net.sf.pmr.core.domain.user.company.Company;

import org.dbunit.dataset.ITable;
import org.springframework.dao.ConcurrencyFailureException;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class CompanyMapperTest extends MapperTestCase {
    
    
    private CompanyMapper companyMapper;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
//      get the company mapper
        companyMapper = CoreObjectFactory.getCompanyMapper();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    
    /**
     * test if object is not a singleton.
     */
    public final void testSingleton() {
        
        assertTrue("singleton", CoreObjectFactory.isSingleton("companyMapper"));

    }

    public final void testFindByIDWithCompanyFound() throws Exception {

        // load a company
        Company company = (Company) companyMapper.findById(1);

        assertEquals("id", new Integer(1), new Integer(company.getPersistanceId()));
        assertEquals("name", "openEnterprise", company.getName());
        assertEquals("version", 1, company.getPersistanceVersion());
        
        company.getAddress();

    }

    public final void testFindByIDWithoutCompanyFound() throws Exception {

        // load a company
        Company company = (Company) companyMapper.findById(1888);

        assertEquals("id", null, company);

    }
    
    public final void testfindAllWithCompanysFound() throws Exception {
    	
    		
    		// find all user data from database
    		List list = companyMapper.findAll();
    		
    		// check
    		String query = "select * FROM COMPANY";

    		ITable databaseData = getConnection().createQueryTable("ExpectedData",query);

    	    assertEquals("Number of company Found", databaseData.getRowCount(), list.size());
    	   
    	   
    	}

    public final void testAddWithoutConcurrencyFailureException()
            throws Exception {

        // get a new company
        Company company = CoreObjectFactory.getCompany();
        company.setName("World Company");

        companyMapper.addOrUpdate(company);

        //	check
        String query = "select * FROM COMPANY WHERE name='World Company'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("name", "World Company", databaseData.getValue(0, "name"));
        assertEquals("Version", new Long(0), (Long) databaseData.getValue(0,
                "version"));

    }

    public final void testAddDoesntThrowConcurrencyFailureException()
            throws Exception {

        // get a new company
        Company company1 =  CoreObjectFactory.getCompany();
        Company company2 =  CoreObjectFactory.getCompany();

        company1.setName("World Company");

        company2.setName("World Company");

        // add
        companyMapper.addOrUpdate(company1);

        try {
            companyMapper.addOrUpdate(company2);
        } catch (ConcurrencyFailureException e) {
            fail("should not throw ConcurrencyFailureException");
        }

        //		check
        String query = "select * FROM COMPANY WHERE name='World Company'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 2, databaseData.getRowCount());

        assertEquals("name", "World Company", databaseData.getValue(0, "name"));
        assertEquals("Version", new Long(0), (Long) databaseData.getValue(0,
                "version"));

        assertEquals("name", "World Company", databaseData.getValue(1, "name"));
        assertEquals("Version", new Long(0), (Long) databaseData.getValue(1,
                "version"));

    }

    public final void testUpdateWithoutConcurrencyFailureException()
            throws Exception {


        // load a company
        Company company = (Company) companyMapper.findById(1);

        // change name
        company.setName("blablabla");

        // update
        companyMapper.addOrUpdate(company);

        // check
        String query = "select * FROM COMPANY WHERE id='1'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0,
                "id"));
        assertEquals("name", "blablabla", databaseData.getValue(0, "name"));
        assertEquals("version", new Long(2), (Long) databaseData.getValue(0,
                "version"));

    }

    public final void testUpdateWitConcurrencyFailureException()
            throws Exception {


        // load a company
        Company company1 = (Company) companyMapper.findById(1);
        Company company2 = (Company) companyMapper.findById(1);

        // change name
        company1.setName("blopblop");
        company2.setName("bipbip");

        // update
        companyMapper.addOrUpdate(company1);

        try {
            companyMapper.addOrUpdate(company2);
            fail("should throw ConcurrencyFailureException");
        } catch (ConcurrencyFailureException e) {

        }

        // check
        String query = "select * FROM COMPANY WHERE id='1'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0,
                "id"));
        assertEquals("name", "blopblop", databaseData.getValue(0, "name"));
        assertEquals("version", new Long(2), (Long) databaseData.getValue(0,
                "version"));

    }

    public final void testDeleteWithoutConcurrencyFailureException()
            throws Exception {


        // load a company
        Company company = (Company) companyMapper.findById(2);

        // update
        companyMapper.delete(company);

        // check
        String query = "select * FROM COMPANY WHERE id='2'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 0, databaseData.getRowCount());

    }

    public final void testDeleteWithConcurrencyFailureException()
            throws Exception {

        // load a company
        Company company1 = (Company) companyMapper.findById(2);
        Company company2 = (Company) companyMapper.findById(2);

        // update
        companyMapper.delete(company1);

        try {
            companyMapper.delete(company2);
            fail("should throw ConcurrencyFailureException");
        } catch (ConcurrencyFailureException e) {

        }

        // check
        String query = "select * FROM COMPANY WHERE id='2'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 0, databaseData.getRowCount());

    }

}
