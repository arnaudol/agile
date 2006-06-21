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
public class CompanyValidatorTest extends TestCase {
    
    private Company company;
    
    private Validator companyValidator;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        company = new CompanyImpl();
        
        companyValidator = CoreObjectFactory.getCompanyValidator();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
    public final void testValidateMandatoryProperties() {
        
        // In french
        Errors errors = companyValidator.validate(company);
        
        assertEquals("le nom est obligatoire", errors.getFieldError("name", Locale.FRENCH));
        
        // In English
        errors = companyValidator.validate(company);
        
        assertEquals("name is mandatory", errors.getFieldError("name", Locale.ENGLISH));
        
    }
    
    /**
     *  Max length = 100 
     */
    public final void testValidateNamePropertyLength() {
        
        company.setName("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
        
        // In french
        Errors errors = companyValidator.validate(company);
        
        assertEquals("le nom est trop long", errors.getFieldError("name", Locale.FRENCH));
        
        // In English
        errors = companyValidator.validate(company);
        assertEquals("name is too long", errors.getFieldError("name", Locale.ENGLISH));
        
        // EveryThing OK
        company.setName("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
        errors = companyValidator.validate(company);
        assertFalse(errors.hasFieldErrors("name"));
        
    }
    
    public final void testValidateWhenCompanyIsOK() {
        
        company.setName("World Company");
        Errors errors = companyValidator.validate(company);
        assertFalse(errors.hasErrors());        
        
    }
}