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

package net.sf.pmr.core.service;

import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.user.MockUser;
import net.sf.pmr.core.domain.user.MockUserRepository;
import net.sf.pmr.core.domain.user.User;
import de.abstrakt.mock.MockCore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class SecurityServiceTest extends TestCase {
  
    private MockUserRepository mockUserRepository ;
    
    private MockUser mockUser; 
    
	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		mockUserRepository = new MockUserRepository();
	    // Mock the user
	    mockUser = new MockUser(); 
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	/**
     * test if object is not a singleton
     *
     */
    public final void testSingleton() {
        
        assertTrue("singleton", CoreObjectFactory.isSingleton("securityService"));

    }
	

	/**
	 * L'utilisateur est connu et le mot de passe est correct
	 */
	public final void testLoginWithoutUserFound() {
	    
	  
	    
	    // simulate no user found
	    User user = null;
	    mockUserRepository.setFindUserByLoginDummy(user);
	    
	    //get a security service
	    SecurityService securityService = new SecurityServiceImpl(mockUserRepository);

	    assertEquals("login with user not found", null, securityService.login("", ""));

	}
	
	
	/**
	 * L'utilisateur est connu et le mot de passe est correct
	 */
	public final void testLoginWithUserFoundAndCorrectPassword() {
	    
	 
	    // simulate user found
	    
	    mockUserRepository.expectFindUserByLogin("", mockUser);
	    mockUser.setGetPasswordDummy("scooby");
	    mockUser.expectSetPassword("password not show for security reason");    
	    
	    //get a security service
	    SecurityService securityService = new SecurityServiceImpl(mockUserRepository);

	    assertTrue("login with user found", securityService.login("", "scooby") instanceof User);   

	}
	
	
	/**
	 * L'utilisateur est connu et le mot de passe est correct
	 */
	public final void testLoginWithUserFoundAndIncorrectPassword() {
	    
	     MockCore.reset();
	    
	    // simulate user found
	    mockUserRepository.expectFindUserByLogin("", mockUser);
	    mockUser.setGetPasswordDummy("doo");
	    mockUser.expectSetPassword("password not show for security reason");    
	    
	    //get a security service
	    SecurityService securityService = new SecurityServiceImpl(mockUserRepository);

	    assertEquals("login with user found and incorrect password", null, securityService.login("", "scooby"));   

	}
	
	
	/**
	 * L'utilisateur est connu et le mot de passe est correct mais ne respect pas la casse
	 * (le mot de passe est case sensitive)
	 */
	public final void testLoginWithUserFoundAndCorrectPasswordButBadCase() {
	
	    // TODO trouver pourquoi avoir besoin de faire un reset !!
	    
	    // reset (for use in test suite)
        MockCore.reset();
	    
	    //	  simulate user found
	    
	    mockUserRepository.expectFindUserByLogin("", mockUser);
	    mockUser.setGetPasswordDummy("scOobY");
	    mockUser.expectSetPassword("password not show for security reason");    
	    
	    //get a security service
	    SecurityService securityService = new SecurityServiceImpl(mockUserRepository);

	    assertEquals("login with user found and correct password but bad case", null, securityService.login("", "scooby"));  

	}
	
	
	 /**
     * test the construction of the object in the ApplicationContext
     *
     */
    public final void testObjectConstruction() {
        
        // get a member from the application context
        SecurityService securityService = CoreObjectFactory.getSecurityService();

        // the user repository should have been injected
        try {
            securityService.login("","");
        } catch (NullPointerException e) {
            fail("should not throw null pointer exception");
        }
        
    }
	

}