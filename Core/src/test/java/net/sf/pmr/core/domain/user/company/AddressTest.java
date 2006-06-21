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
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class AddressTest extends TestCase {
	
	private Address address;

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		address = CoreObjectFactory.getAddress();
		
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Constructor for AdressTest.
	 * @param arg0
	 */
	public AddressTest(String arg0) {
		super(arg0);
	}

	 /**
     * test the construction of the object in the ApplicationContext
     *
     */
    public final void testObjectConstruction() {
        
        // get a member from the application context
        Address address = CoreObjectFactory.getAddress();
        
        assertEquals("City", null, address.getCity());
        assertEquals("Country", null, address.getCountry());
        assertEquals("PostalCode", null, address.getPostalCode());
        assertEquals("StreetName", null, address.getStreetName());
        assertEquals("StreetNumber", null, address.getStreetNumber());
              
    }	
    
    /**
     * test if object is not a singleton
     *
     */
    public final void testSingleton() {
        
        assertFalse("not singleton", CoreObjectFactory.isSingleton("address"));

    }
    
    
    public final void testEquals () {
        
        Address address1 = new AddressImpl();
        
        Address address2 = new AddressImpl();
        
        assertTrue(address1.equals(address2));
        
        address1.setCity("lyon");
        
        assertFalse(address1.equals(address2));
        
        address1.setCity(null);
        address1.setCountry("France");
        
        assertFalse(address1.equals(address2));
        
        address1.setCountry(null);
        address1.setPostalCode("69");
        
        assertFalse(address1.equals(address2));
        
        address1.setPostalCode(null);
        address1.setStreetName("rue");
        
        assertFalse(address1.equals(address2));
        
        address1.setStreetName(null);
        address1.setStreetNumber("1");
        
        assertFalse(address1.equals(address2));
        
    }
    
    
    public final void testHasCode () {
        
        Address address1 = new AddressImpl();
        
        Address address2 = new AddressImpl();
        
        assertTrue(address1.hashCode() == address2.hashCode());
        
        address1.setCity("lyon");
        
        assertFalse(address1.hashCode() == address2.hashCode());
        
        address1.setCity(null);
        address1.setCountry("France");
        
        assertFalse(address1.hashCode() == address2.hashCode());
        
        address1.setCountry(null);
        address1.setPostalCode("69");
        
        assertFalse(address1.hashCode() == address2.hashCode());
        
        address1.setPostalCode(null);
        address1.setStreetName("rue");
        
        assertFalse(address1.hashCode() == address2.hashCode());
        
        address1.setStreetName(null);
        address1.setStreetNumber("1");
        
        assertFalse(address1.hashCode() == address2.hashCode());
        
    }
    
//    public final void testHashCode () {
//        
//        
//    Company company1 = new CompanyImpl();
//    
//    Company company2 = new CompanyImpl();
//    
//    assertTrue(company1.hashCode() == company2.hashCode());
//    
//    company1.setId(1);
//    
//    assertFalse(company1.hashCode() == company2.hashCode());
//    
//    company1.setId(0);
//    company1.setName("world company");
//    
//    assertFalse(company1.hashCode() == company2.hashCode());
//    
//    }
    
}
