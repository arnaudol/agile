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
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.core.domain.user.company.CompanyRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

import org.easymock.EasyMock;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class UserServiceTest extends TestCase {
    
    private UserService userService;
    
    private UserRepository mockUserRepository;
    
    private Validator mockUserValidator;
    
    private CompanyRepository mockCompanyRepository;
    
    //private MockValidator mockcompanyValidator;
    
    private Errors mockUserErrors;
    
    private Errors mockCompanyErrors;
    
    private ProjectRepository mockBasicProjectRepository;


    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        mockUserRepository = EasyMock.createMock(UserRepository.class);
        
        mockUserValidator = EasyMock.createMock(Validator.class);
        
        mockCompanyRepository = EasyMock.createMock(CompanyRepository.class);
        
        // mockcompanyValidator = new MockValidator();

        mockBasicProjectRepository = EasyMock.createMock(ProjectRepository.class);
        
        userService = new UserServiceImpl(mockUserRepository, mockUserValidator, mockCompanyRepository, mockBasicProjectRepository);
        
        mockCompanyErrors = EasyMock.createMock(Errors.class);
        
        mockUserErrors = EasyMock.createMock(Errors.class);
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
    	
    	// reset mocks  
        EasyMock.reset(mockUserRepository);
        EasyMock.reset(mockUserValidator);
        EasyMock.reset(mockCompanyRepository);
        EasyMock.reset(mockBasicProjectRepository);
        EasyMock.reset(mockCompanyErrors);
        EasyMock.reset(mockUserErrors);
        
    	
        super.tearDown();
    }
    
    
    /**
     * test qu'il s'agit d'un singleton
     */
    public void testIsASingleton() {
        
        assertTrue(CoreObjectFactory.isSingleton("userService"));
    }
//    
//    
//    /**
//     * Ajoute un utilisateur appartenant � une entreprise
//     * la validation de l'utilisateur �choue
//     * - pas de validation de l'entreprise
//     * - pas d'enregistrement
//     * 
//     */
//    public void testAddWithCompanyIdAndUserValidationFailed() {
//        
//        mockUserValidator.acceptValidate(new Ignore(), mockUserErrors);
//        mockUserErrors.expectHasErrors(true);
//        
//        userService.addOrUpdate(0, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
//       
//        MockCore.verify();
//        
//        
//    }
//    
//    
//    /**
//     * Ajoute un utilisateur appartenant � une entreprise
//     * la validation de l'utilisateur
//     * - L'enregistrement peut avoir lieu
//     */
//    public void testAddWithCompanyIdAndUserValidationSucceed() {
//        
//        // Mock une erreur sur la validation de Company
//        mockUserValidator.acceptValidate(new Ignore(), mockUserErrors);
//        mockUserErrors.expectHasErrors(false);
//        mockUserRepository.acceptAddOrUpdate(new Ignore());
//        
//        userService.addOrUpdate(0, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
//        
//        MockCore.verify();
//
//    }
//
//    /**
//     * Ajoute un utilisateur sans appartenance � une entreprise
//     * la validation de l'utilisateur �choue
//     */
//    public void testAddWithoutCompanyIdAndUserValidationFailed() {
//        
//        // Mock une erreur sur la validation du user
//        mockUserValidator.acceptValidate(new Ignore(), mockUserErrors);
//        mockUserErrors.expectHasErrors(true);
//        
//        userService.addOrUpdate(0, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
//       
//        MockCore.verify();
//        
//
//        
//    }
//    
//    /**
//     * Ajoute un utilisateur sans appartenance � une entreprise
//     * la validation de l'utilisateur r�ussie
//     * L'enregistrement peut avoir lieu
//     */
//    public void testAddWithoutCompanyIdAndUserValidationSucceed() {
//        
//        mockUserValidator.acceptValidate(new Ignore(), mockUserErrors);
//        mockUserErrors.expectHasErrors(false);
//        mockUserRepository.acceptAddOrUpdate(new Ignore());
//        
//        userService.addOrUpdate(0, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 1);
//        
//        MockCore.verify();
//    }
//    
//    /**
//     * Mise � jour d'un utilisateur, mais la validation �choue
//     * - pas de mise � jour
//     */
//    public void testUpdateUserAndUserValidationFailed() {
//        
//    	User user = new UserImpl();
//    	
//    	// find the user in the repository
//    	mockUserRepository.expectFindUserById(1, user);
//    	
//        // Mock une erreur sur la validation du user
//        mockUserValidator.expectValidate(user, mockUserErrors);
//        mockUserErrors.expectHasErrors(true);
//        
//        userService.addOrUpdate(1, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
//       
//        MockCore.verify();
//        
//    }
//    
//    /**
//     * Mise � jour d'un utilisateur
//     * La validation r�ussie
//     * La mise � jour peut avoir lieu
//     */
//    public void testUpdateUserAndUserValidationSucceed() {
//
//    	User user = new UserImpl();
//    	
//    	// find the user in the repository
//    	mockUserRepository.expectFindUserById(1, user);
//
//    	
//        // Mock une erreur sur la validation du user
//        mockUserValidator.expectValidate(user, mockUserErrors);
//        mockUserErrors.expectHasErrors(false);
//        
//        mockUserRepository.acceptAddOrUpdate(user);
//        
//        userService.addOrUpdate(1, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
//       
//        MockCore.verify();
//        
//    }
//    
//    /**
//     * Test l'ajout d'un membre (utilisateur) � un projet.
//     * Pas de contr�les sp�cifiques � r�aliser. 
//     * N'importe qui peut �tre ajout� � n'importe quel projet. S'il appartient d�j� au projet, pas de message
//     * d'avertissement.
//     * Si le user ou le projet n'existent plus (concurrence d'acc�s) : pas de message d'avertissement non plus, mais pas d'enregistrement
//     * dans la repository
//     */
//    public void testAddUserToProject() {
//    	
//    	User user = new UserImpl();
//    	user.setProjects(new HashSet<Project>());
//    	Project basicProject = new ProjectImpl();
//    	
//    	// recherche du user
//    	mockUserRepository.expectFindUserById(1, user);
//    	// recherche du project
//    	mockBasicProjectRepository.expectFindByPersistanceId(2, basicProject);
//    	
//    	// ajout dans la repository
//    	mockUserRepository.expectAddOrUpdate(user);
//    	
//    	// appel du service
//    	userService.addUserToProject(1, 2);
//    	
//    	MockCore.verify();
//    	
//    }
//    
//    
//    /**
//     * Test l'ajout d'un membre (utilisateur) � un projet.
//     * Pas de contr�les sp�cifiques � r�aliser.
//     * Cas ou le user n'est pas trouv� dans la repository: pas de recherche du projet, pas d'enregsitrement
//     * dans la repository, pas d'erreurs remont�es 
//     */
//    public void testAddUserToProjectWhenRepositoryDoesNotFindUser() {
//    	
//    	User user = null;
//    	
//    	// recherche du user
//    	mockUserRepository.expectFindUserById(1, user);
//    	
//    	// appel du service
//    	userService.addUserToProject(1, 2);
//    	
//    	MockCore.verify();
//    	
//    }
//    
//    
//    /**
//     * Test l'ajout d'un membre (utilisateur) � un projet.
//     * Pas de contr�les sp�cifiques � r�aliser.
//     * Cas ou le project n'est pas trouv� dans la repository: pas d'enregistrement
//     * dans la repository, pas d'erreurs remont�es 
//     */
//    public void testAddUserToProjectWhenRepositoryDoesNotFindProject() {
//    	
//    	User user = new UserImpl();
//    	user.setProjects(new HashSet<Project>());
//    	
//    	Project basicProject = null;
//    	
//    	// recherche du user
//    	mockUserRepository.expectFindUserById(1, user);
//    	
//    	// recherche du project
//    	mockBasicProjectRepository.expectFindByPersistanceId(2, basicProject);
//    	
//    	// appel du service
//    	userService.addUserToProject(1, 2);
//
//    	
//    	MockCore.verify();
//    	
//    }
 
}