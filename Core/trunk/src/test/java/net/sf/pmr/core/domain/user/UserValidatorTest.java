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

package net.sf.pmr.core.domain.user;

import java.util.Locale;

import junit.framework.TestCase;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;
import de.abstrakt.mock.MockCore;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class UserValidatorTest extends TestCase {

    private User user;
    
    private Validator userValidator;
    
    private MockUserRepository mockUserRepository;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        user = new UserImpl();
        
        mockUserRepository = new MockUserRepository();
        userValidator = new UserValidatorImpl(mockUserRepository);
        
       
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public final void testValidateMandatoryProperties() {

        // first in french
        Errors errors = userValidator.validate(user);
        
        assertEquals("le login est obligatoire", errors.getFieldError("login", Locale.FRENCH));
        assertEquals("le mot de passe est obligatoire", errors.getFieldError("password", Locale.FRENCH));
        assertEquals("le nom est obligatoire", errors.getFieldError("lastName", Locale.FRENCH));
        assertEquals("le prénom est obligatoire", errors.getFieldError("firstName", Locale.FRENCH));
        assertEquals("l'adresse email est obligatoire", errors.getFieldError("email", Locale.FRENCH));
        
        // then in english
        errors = userValidator.validate(user);
        assertEquals("login is mandatory", errors.getFieldError("login", Locale.ENGLISH));
        assertEquals("password is mandatory", errors.getFieldError("password", Locale.ENGLISH));
        assertEquals("lastname is mandatory", errors.getFieldError("lastName", Locale.ENGLISH));
        assertEquals("firstname is mandatory", errors.getFieldError("firstName", Locale.ENGLISH));
        assertEquals("email is mandatory", errors.getFieldError("email", Locale.ENGLISH));
        
    }
    
    public final void testValidateLoginPropertyLength() {
        
        
        MockCore.reset();
        
        // first in french
        user.setLogin("AAAA");
        
        Errors errors = userValidator.validate(user);
        assertEquals("le login doit avoir entre 5 et 10 caractères", errors.getFieldError("login", Locale.FRENCH));
        
        user.setLogin("AAAAAAAAAAA");
        errors = userValidator.validate(user);
        assertEquals("le login doit avoir entre 5 et 10 caractères", errors.getFieldError("login", Locale.FRENCH));
        
        // set methods calls
        // first, call to findByLogin method
        User userToReturn = null;
        mockUserRepository.expectFindUserByLogin("AAAAAA", userToReturn);
        
        user.setLogin("AAAAAA");
        errors = userValidator.validate(user);
        assertFalse(errors.hasFieldErrors("login"));
         
        // then in english

        user.setLogin("AAAA");        
        errors = userValidator.validate(user);
        assertEquals("login must be between 5 to 10 character long", errors.getFieldError("login", Locale.ENGLISH));
        
        user.setLogin("AAAAAAAAAAA");
        errors = userValidator.validate(user);
        assertEquals("login must be between 5 to 10 character long", errors.getFieldError("login", Locale.ENGLISH));

        // set methods calls
        // first, call to findByLogin method
        mockUserRepository.expectFindUserByLogin("AAAAAA", userToReturn);

        
        user.setLogin("AAAAAA");
        errors = userValidator.validate(user);
        assertFalse(errors.hasFieldErrors("login"));
        
        MockCore.verify();
    
        
    }
    
    public final void testValidatePasswordPropertyLength() {
        
        // first in french
        user.setPassword("AAAA");
        
        Errors errors = userValidator.validate(user);
        assertEquals("le mot de passe doit avoir entre 5 et 10 caractères", errors.getFieldError("password", Locale.FRENCH));
        
        user.setPassword("AAAAAAAAAAA");
        errors = userValidator.validate(user);
        assertEquals("le mot de passe doit avoir entre 5 et 10 caractères", errors.getFieldError("password", Locale.FRENCH));
        
        user.setPassword("AAAAAA");
        errors = userValidator.validate(user);
        assertFalse(errors.hasFieldErrors("password"));
        
        // then in english

        user.setPassword("AAAA");        
        errors = userValidator.validate(user);
        assertEquals("password must be between 5 to 10 character long", errors.getFieldError("password", Locale.ENGLISH));
        
        user.setPassword("AAAAAAAAAAA");
        errors = userValidator.validate(user);
        assertEquals("password must be between 5 to 10 character long", errors.getFieldError("password", Locale.ENGLISH));
        
        user.setPassword("AAAAAA");
        errors = userValidator.validate(user);
        assertFalse(errors.hasFieldErrors("password"));
        
    }
    
    
    /**
     * 
     */
    public final void testValidateEmail() {
        
        // in French
        user.setEmail("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        Errors errors = userValidator.validate(user);
        
        assertEquals("l'adresse email est incorrecte", errors.getFieldError("email", Locale.FRENCH));
        
        // in english
        
        user.setEmail("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        errors = userValidator.validate(user);        
        assertEquals("email is incorrect", errors.getFieldError("email", Locale.ENGLISH));
        
        // Everything is OK
        user.setEmail("AAAAAAAAAAAAAAAAAAAAAAA@AAAAAAAAAAAAAAAAAAAAAAAAAAA.fr");
        errors = userValidator.validate(user);
        assertFalse(errors.hasFieldErrors("email"));
        
    }
    
    
    /*
     * Le login de l'utilisateur doit �tre unique
     */
    public final void testValidateUserLoginMustBeUnique() {
        
        // reset (for use in test suite)
        MockCore.reset();
        
        user.setLogin("batman");
        
        // create a new User
        User userToReturn = new UserImpl();
        // set a login
        userToReturn.setLogin("batman");
        
        // set methods calls
        // first, call to findByLogin method
        mockUserRepository.expectFindUserByLogin("batman", userToReturn);
        
        // In french
        Errors errors = userValidator.validate(user);
        assertEquals("un utilisateur possède déjà ce login", errors.getFieldError("login", Locale.FRENCH));
        
        
        // set methods calls
        // first, call to findByLogin method
        mockUserRepository.expectFindUserByLogin("batman", userToReturn);
        
        // In English
        errors = userValidator.validate(user);
        assertEquals("a user with this login already exists", errors.getFieldError("login", Locale.ENGLISH));

        // verify
        MockCore.verify();
        
    }
    
     
    public final void testValidateWhenUserIsOK() {
        
        // reset (for use in test suite)
        MockCore.reset();


        // create a new User
        User userToReturn = null;
        
        // set methods calls
        // first, call to findByLogin method
        mockUserRepository.expectFindUserByLogin("scooby", userToReturn);
        
        user.setEmail("scooby@doo.fr");
        user.setFirstName("scooby");
        user.setLastName("doo");
        user.setLogin("scooby");
        user.setPassword("doodoo");
      
        Errors errors = userValidator.validate(user);
        
        assertFalse(errors.hasErrors());
       
        // verify
        MockCore.verify();
        
    }

}