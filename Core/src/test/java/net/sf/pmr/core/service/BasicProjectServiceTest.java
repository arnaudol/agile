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
import net.sf.pmr.core.domain.basicProject.MockBasicProjectRepository;
import net.sf.pmr.core.domain.user.MockUserRepository;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.keopsframework.domain.validation.MockErrors;
import net.sf.pmr.keopsframework.domain.validation.MockValidator;
import de.abstrakt.mock.MockCore;
import de.abstrakt.mock.expectable.Ignore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)  
 */
public class BasicProjectServiceTest extends TestCase {
    
    private ProjectService basicProjectService;
    
    private MockValidator mockBasicProjectValidator; 
    
    private MockBasicProjectRepository mockBasicProjectRepository;
    
    private MockUserRepository mockUserRepository;
    
    private MockErrors mockBasicProjectErrors;
    

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();

        // mock
        mockBasicProjectValidator = new MockValidator();
        mockBasicProjectRepository = new MockBasicProjectRepository();
        mockUserRepository = new MockUserRepository();
        
        // basicProjectService
        basicProjectService = new ProjectServiceImpl(mockBasicProjectValidator, mockBasicProjectRepository, mockUserRepository);
        
        mockBasicProjectErrors = new MockErrors();
        
        MockCore.reset();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * test qu'il s'agit d'un singleton
     */
    public void testIsASingleton() {
        
        assertTrue(CoreObjectFactory.isSingleton("projectService"));
    }
    
    /**
     * Quand la validation échoue, 
     * pas d'appel à la repository
     */
    public void testAddWhenValidationFailed() {
        
        mockUserRepository.expectFindUserById(1, new UserImpl());
        mockBasicProjectValidator.acceptValidate(new Ignore(),mockBasicProjectErrors);
        mockBasicProjectErrors.setHasErrorsDummy(true);
        
        basicProjectService.add("c1", "name1", 1);
        
        MockCore.verify();
        
    }
    
    /**
     * Quand il n'y a pas d'erreur à la validation,
     * la repository peut être appell�e
     */
    public void testAddProjectWhenValidationSucceed() {
        
        mockUserRepository.expectFindUserById(1, new UserImpl());
        mockBasicProjectValidator.acceptValidate(new Ignore(),mockBasicProjectErrors);
        mockBasicProjectErrors.expectHasErrors(false);
        mockBasicProjectRepository.acceptAddOrUpdate(new Ignore());
        
        basicProjectService.add("c1", "name1", 1);
        
        MockCore.verify();
        
    }
    
    /**
     * Quand la validation échoue, 
     * pas d'appel à la repository
     */
    public void testUpdateWhenValidationFailed() {
        
        mockBasicProjectValidator.acceptValidate(new Ignore(),mockBasicProjectErrors);
        mockBasicProjectErrors.setHasErrorsDummy(true);
        
        basicProjectService.update(1, "c1", "name1", 1);
        
        MockCore.verify();
        
    }
    
    
    /**
     * Quand il n'y a pas d'erreur à la validation,
     * la repository peut être appellée
     */
    public void testUpdateProjectWhenValidationSucceed() {
        
        mockBasicProjectValidator.acceptValidate(new Ignore(),mockBasicProjectErrors);
        mockBasicProjectErrors.expectHasErrors(false);
        mockBasicProjectRepository.acceptAddOrUpdate(new Ignore());
        
        basicProjectService.update(1, "c1", "name1", 1);
        
        MockCore.verify();
    }       
   
}
