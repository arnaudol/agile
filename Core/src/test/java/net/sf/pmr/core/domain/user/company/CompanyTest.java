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

package net.sf.pmr.core.domain.user.company;

import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;


/**
 * @author APROST
 */
public class CompanyTest extends TestCase {

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	 /**
     * test the construction of the object in the ApplicationContext
     *
     */
    public final void testObjectConstruction() {
        
        // get a member from the application context
        Company company = CoreObjectFactory.getCompany();
        
        assertTrue("Address", company.getAddress() instanceof Address);
        assertEquals("Id", new Integer(0), new Integer(company.getPersistanceId()));
        assertEquals("Name", "", company.getName());
        assertEquals("Version", 0, company.getPersistanceVersion());
              
    }	
    
    
    /**
     * test if object is not a singleton
     *
     */
    public final void testSingleton() {
        
        assertFalse("not singleton", CoreObjectFactory.isSingleton("company"));

    }
	
    
    public final void testEquals () {
        
        Company company1 = new CompanyImpl();
        
        Company company2 = new CompanyImpl();
        
        assertTrue(company1.equals(company2));
        
        company1.setPersistanceId(1);
        
        assertFalse(company1.equals(company2));
        
        company1.setPersistanceId(0);
        company1.setName("world company");
        
        assertFalse(company1.equals(company2));
        
    }
    
    public final void testHashCode () {
        
        
    Company company1 = new CompanyImpl();
    
    Company company2 = new CompanyImpl();
    
    assertTrue(company1.hashCode() == company2.hashCode());
    
    company1.setPersistanceId(1);
    
    assertFalse(company1.hashCode() == company2.hashCode());
    
    company1.setPersistanceId(0);
    company1.setName("world company");
    
    assertFalse(company1.hashCode() == company2.hashCode());
    
    }
	
}