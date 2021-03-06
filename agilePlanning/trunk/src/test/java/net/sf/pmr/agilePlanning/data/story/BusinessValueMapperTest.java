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

package net.sf.pmr.agilePlanning.data.story;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.MapperTestCase;
import net.sf.pmr.agilePlanning.data.story.BusinessValueMapper;
import net.sf.pmr.agilePlanning.domain.story.BusinessValue;

import org.dbunit.dataset.ITable;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class BusinessValueMapperTest extends MapperTestCase {

    private BusinessValueMapper businessValueMapper;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // get the country mapper
        businessValueMapper = AgilePlanningObjectFactory.getBusinessValueMapper();

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test findAll BusinessValue
     * @throws Exception
     */
    public final void testFindAll() throws Exception {

        ITable databaseData = getConnection().createQueryTable("ExpectedData", "SELECT * FROM BUSINESSVALUE");
        
        assertEquals("BusinessValueMapper", databaseData.getRowCount(), businessValueMapper.findAll().size());

    }
    
    /**
     * Test quand la BusinessValue est trouv�e. 
     */
    public final void testFindByIdWhenBusinessValueIsFound() {
        
        BusinessValue businessValue = businessValueMapper.findById(1);
        
        assertNotNull(businessValue);
        assertEquals(1, businessValue.getId());
        assertEquals("HIGH", businessValue.getDescription());
        
    }

    /**
     * Test quand la BusinessValue n'est pas trouv�e.
     * La m�thode doit retourner null. 
     */
    public final void testFindByIdWhenBusinessValueIsNotFound() {
        
        BusinessValue businessValue = businessValueMapper.findById(999);
        
        assertNull(businessValue);
        
    }
    
}