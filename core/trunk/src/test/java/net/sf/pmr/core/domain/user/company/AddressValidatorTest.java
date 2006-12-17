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

import java.util.Locale;

import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class AddressValidatorTest extends TestCase {
    
    private Address address;
    
    private Validator addressValidator;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        address = new AddressImpl();
        
        addressValidator = CoreObjectFactory.getAddressValidator();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /*
     * All properties are mandatory
     */
    public final void testValidateMandatoryProperties() {
        
        // In french
        Errors errors = addressValidator.validate(address);
        
        assertEquals("le pays est obligatoire", errors.getFieldError("country", Locale.FRENCH));
        assertEquals("la ville est obligatoire", errors.getFieldError("city", Locale.FRENCH));
        assertEquals("le code postal est obligatoire", errors.getFieldError("postalCode", Locale.FRENCH));
        assertEquals("la rue est obligatoire", errors.getFieldError("streetName", Locale.FRENCH));
        assertEquals("le numéro de rue est obligatoire", errors.getFieldError("streetNumber", Locale.FRENCH));
        
        // In english        
        assertEquals("country is mandatory", errors.getFieldError("country", Locale.ENGLISH));
        assertEquals("city is mandatory", errors.getFieldError("city", Locale.ENGLISH));
        assertEquals("postal code is mandatory", errors.getFieldError("postalCode", Locale.ENGLISH));
        assertEquals("street name is mandatory", errors.getFieldError("streetName", Locale.ENGLISH));
        assertEquals("street number is mandatory", errors.getFieldError("streetNumber", Locale.ENGLISH));
        
    }
    
   
    
    public final void testValidateWhenAddressIsOK() {
        
        address.setCity("Big City");
        address.setCountry("Big Country");
        address.setPostalCode("Postal Code");
        address.setStreetName("Scooby");
        address.setStreetNumber("12 doo");
        
        Errors errors = addressValidator.validate(address);
        
        assertFalse(errors.hasErrors());
        
    }



}