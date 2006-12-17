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
import net.sf.pmr.core.domain.project.ProjectRepository;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

import org.easymock.EasyMock;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)  
 */
public class BasicProjectServiceTest extends TestCase {
    
    private ProjectService basicProjectService;
    
    private Validator mockBasicProjectValidator; 
    
    private ProjectRepository mockBasicProjectRepository;
    
    private UserRepository mockUserRepository;
    
    private Errors mockBasicProjectErrors;
    

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();

        // mock
        mockBasicProjectValidator = EasyMock.createMock(Validator.class);
        mockBasicProjectRepository = EasyMock.createMock(ProjectRepository.class);
        mockUserRepository = EasyMock.createMock(UserRepository.class);
        mockBasicProjectErrors = EasyMock.createMock(Errors.class);
        
        // basicProjectService
        basicProjectService = new ProjectServiceImpl(mockBasicProjectValidator, mockBasicProjectRepository, mockUserRepository);
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {

    	EasyMock.reset(mockBasicProjectValidator);
    	EasyMock.reset(mockBasicProjectRepository);
    	EasyMock.reset(mockUserRepository);
    	EasyMock.reset(mockBasicProjectErrors);
    	
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
        
        EasyMock.expect(mockUserRepository.findUserByPersistanceId(1)).andReturn(new UserImpl());
        EasyMock.expect(mockBasicProjectValidator.validate(EasyMock.anyObject())).andReturn(mockBasicProjectErrors);
        EasyMock.expect(mockBasicProjectErrors.hasErrors()).andReturn(true);
        
        basicProjectService.add("c1", "name1", 1);
        
        EasyMock.verify(mockUserRepository);
        EasyMock.verify(mockBasicProjectValidator);
        EasyMock.verify(mockBasicProjectErrors);
        
    }
    
    /**
     * Quand il n'y a pas d'erreur à la validation,
     * la repository peut être appellée
     */
    public void testAddProjectWhenValidationSucceed() {
        
        
        EasyMock.expect(mockUserRepository.findUserByPersistanceId(1)).andReturn(new UserImpl());
        EasyMock.expect(mockBasicProjectValidator.validate(EasyMock.anyObject())).andReturn(mockBasicProjectErrors);
        EasyMock.expect(mockBasicProjectErrors.hasErrors()).andReturn(false);
        //EasyMock.expect(mockBasicProjectRepository.addOrUpdate(EasyMock.anyObject()));
        
        basicProjectService.add("c1", "name1", 1);
        
        EasyMock.verify(mockUserRepository);
        EasyMock.verify(mockBasicProjectValidator);
        EasyMock.verify(mockBasicProjectErrors);
        EasyMock.verify(mockBasicProjectRepository);
        
        
    }
    
    /**
     * Quand la validation échoue, 
     * pas d'appel à la repository
     */
    public void testUpdateWhenValidationFailed() {
    	
        EasyMock.expect(mockBasicProjectValidator.validate(EasyMock.anyObject())).andReturn(mockBasicProjectErrors);
        EasyMock.expect(mockBasicProjectErrors.hasErrors()).andReturn(true);
        
        basicProjectService.update(1, "c1", "name1", 1);
        
        EasyMock.verify(mockBasicProjectValidator);
        EasyMock.verify(mockBasicProjectErrors);
        
    }
    
    
    /**
     * Quand il n'y a pas d'erreur à la validation,
     * la repository peut être appellée
     */
    public void testUpdateProjectWhenValidationSucceed() {
        
        EasyMock.expect(mockBasicProjectValidator.validate(EasyMock.anyObject())).andReturn(mockBasicProjectErrors);
        EasyMock.expect(mockBasicProjectErrors.hasErrors()).andReturn(false);
        //EasyMock.expect(mockBasicProjectRepository.addOrUpdate(EasyMock.anyObject()));
        
        basicProjectService.update(1, "c1", "name1", 1);
        
        EasyMock.verify(mockBasicProjectValidator);
        EasyMock.verify(mockBasicProjectErrors);
    }       
   
}
