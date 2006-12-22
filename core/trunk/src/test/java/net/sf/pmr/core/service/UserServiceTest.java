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

import java.util.HashSet;
import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.project.ProjectRepository;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.core.domain.user.company.CompanyRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;

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
    
    private IMocksControl mocksControl;
    
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // create mocks
        mocksControl = EasyMock.createStrictControl();
        
        mockUserRepository = mocksControl.createMock(UserRepository.class);
        
        mockUserValidator = mocksControl.createMock(Validator.class);
        
        mockCompanyRepository = mocksControl.createMock(CompanyRepository.class);
        
        // mockcompanyValidator = new MockValidator();
        
        mockBasicProjectRepository = mocksControl.createMock(ProjectRepository.class);
        
        userService = new UserServiceImpl(mockUserRepository, mockUserValidator, mockCompanyRepository, mockBasicProjectRepository);
        
        mockCompanyErrors = mocksControl.createMock(Errors.class);
        
        mockUserErrors = mocksControl.createMock(Errors.class);
        
    }
    
    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        
        // reset mocks
        mocksControl.reset();
        
        super.tearDown();
    }
    
    
    /**
     * test qu'il s'agit d'un singleton
     */
    public void testIsASingleton() {
        
        assertTrue(CoreObjectFactory.isSingleton("userService"));
    }
    
    
    /**
     * Ajoute un utilisateur appartenant � une entreprise
     * la validation de l'utilisateur �choue
     * - pas de validation de l'entreprise
     * - pas d'enregistrement
     *
     */
    public void testAddWithCompanyIdAndUserValidationFailed() {
        
        EasyMock.expect(mockUserValidator.validate(EasyMock.isA(User.class))).andReturn(mockUserErrors);
        EasyMock.expect(mockUserErrors.hasErrors()).andReturn(true);
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        userService.addOrUpdate(0, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
        
        mocksControl.verify();
        
    }
    
    
    /**
     * Ajoute un utilisateur appartenant � une entreprise
     * la validation de l'utilisateur
     * - L'enregistrement peut avoir lieu
     */
    public void testAddWithCompanyIdAndUserValidationSucceed() {
        
        // Mock une erreur sur la validation de Company
        EasyMock.expect(mockUserValidator.validate(EasyMock.isA(User.class))).andReturn(mockUserErrors);
        EasyMock.expect(mockUserErrors.hasErrors()).andReturn(false);
        mockUserRepository.addOrUpdate(EasyMock.isA(User.class));
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        userService.addOrUpdate(0, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
        
        mocksControl.verify();
        
    }
    
    /**
     * Ajoute un utilisateur sans appartenance � une entreprise
     * la validation de l'utilisateur échoue
     */
    public void testAddWithoutCompanyIdAndUserValidationFailed() {
        
        // Mock une erreur sur la validation du user
        EasyMock.expect(mockUserValidator.validate(EasyMock.isA(User.class))).andReturn(mockUserErrors);
        EasyMock.expect(mockUserErrors.hasErrors()).andReturn(true);
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        userService.addOrUpdate(0, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
        
        mocksControl.verify();
        
    }
    
    /**
     * Ajoute un utilisateur sans appartenance � une entreprise
     * la validation de l'utilisateur réussie
     * L'enregistrement peut avoir lieu
     */
    public void testAddWithoutCompanyIdAndUserValidationSucceed() {
        
        EasyMock.expect(mockUserValidator.validate(EasyMock.isA(User.class))).andReturn(mockUserErrors);
        EasyMock.expect(mockUserErrors.hasErrors()).andReturn(false);
        mockUserRepository.addOrUpdate(EasyMock.isA(User.class));
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        userService.addOrUpdate(0, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 1);
        
        mocksControl.verify();
    }
    
    /**
     * Mise à jour d'un utilisateur, mais la validation échoue
     * - pas de mise à jour
     */
    public void testUpdateUserAndUserValidationFailed() {
        
        User user = new UserImpl();
        
        // find the user in the repository
        EasyMock.expect(mockUserRepository.findUserByPersistanceId(1)).andReturn(user);
        
        // Mock une erreur sur la validation du user
        EasyMock.expect(mockUserValidator.validate(user)).andReturn(mockUserErrors);
        EasyMock.expect(mockUserErrors.hasErrors()).andReturn(true);
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        userService.addOrUpdate(1, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
        
        mocksControl.verify();
        
    }
    
    /**
     * Mise à jour d'un utilisateur
     * La validation réussie
     * La mise à jour peut avoir lieu
     */
    public void testUpdateUserAndUserValidationSucceed() {
        
        User user = new UserImpl();
        
        // find the user in the repository
        EasyMock.expect(mockUserRepository.findUserByPersistanceId(1)).andReturn(user);
        
        // Mock une erreur sur la validation du user
        EasyMock.expect(mockUserValidator.validate(user)).andReturn(mockUserErrors);
        EasyMock.expect(mockUserErrors.hasErrors()).andReturn(false);
        mockUserRepository.addOrUpdate(user);
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        userService.addOrUpdate(1, "scooby", "doo", "scoobydoo", "dog", "scooby@dog.com", 0);
        
        mocksControl.verify();
        
    }
    
    /**
     * Test l'ajout d'un membre (utilisateur) � un projet.
     * Pas de contrôles spécifiques à réaliser.
     * N'importe qui peut être ajouté à n'importe quel projet. S'il appartient déjà au projet, pas de message
     * d'avertissement.
     * Si le user ou le projet n'existent plus (concurrence d'accès) : pas de message d'avertissement non plus, mais pas d'enregistrement
     * dans la repository
     */
    public void testAddUserToProject() {
        
        User user = new UserImpl();
        user.setProjects(new HashSet<Project>());
        Project basicProject = new ProjectImpl();
        
        // recherche du user
        EasyMock.expect(mockUserRepository.findUserByPersistanceId(1)).andReturn(user);
        // recherche du project
        EasyMock.expect(mockBasicProjectRepository.findByPersistanceId(2)).andReturn(basicProject);
        // ajout dans la repository
        mockUserRepository.addOrUpdate(user);
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        // appel du service
        userService.addUserToProject(1, 2);
        
        mocksControl.verify();
        
    }
    
    
    /**
     * Test l'ajout d'un membre (utilisateur) � un projet.
     * Pas de contrôles spécifiques à réaliser.
     * Cas ou le user n'est pas trouvé dans la repository: pas de recherche du projet, pas d'enregsitrement
     * dans la repository, pas d'erreurs remont�es
     */
    public void testAddUserToProjectWhenRepositoryDoesNotFindUser() {
        
        User user = null;
        
        // recherche du user
        EasyMock.expect(mockUserRepository.findUserByPersistanceId(1)).andReturn(user);
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        // appel du service
        userService.addUserToProject(1, 2);
        
        mocksControl.verify();
        
    }
    
    
    /**
     * Test l'ajout d'un membre (utilisateur) � un projet.
     * Pas de contrôles spécifiques à réaliser.
     * Cas ou le project n'est pas trouvé dans la repository: pas d'enregistrement
     * dans la repository, pas d'erreurs remontées
     */
    public void testAddUserToProjectWhenRepositoryDoesNotFindProject() {
        
        User user = new UserImpl();
        user.setProjects(new HashSet<Project>());
        
        Project basicProject = null;
        
        // recherche du user
        EasyMock.expect(mockUserRepository.findUserByPersistanceId(1)).andReturn(user);
        
        // recherche du project
        EasyMock.expect(mockBasicProjectRepository.findByPersistanceId(2)).andReturn(basicProject);
        
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        // appel du service
        userService.addUserToProject(1, 2);
        
        
        mocksControl.verify();
        
    }
    
}