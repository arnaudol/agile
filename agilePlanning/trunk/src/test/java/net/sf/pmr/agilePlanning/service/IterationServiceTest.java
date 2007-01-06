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
package net.sf.pmr.agilePlanning.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.iteration.IterationImpl;
import net.sf.pmr.agilePlanning.domain.iteration.IterationRepository;
import net.sf.pmr.agilePlanning.domain.iteration.IterationValidator;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.agilePlanning.domain.story.StoryRepository;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.keopsframework.domain.validation.Errors;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class IterationServiceTest extends TestCase {

    private IterationValidator mockIterationValidator;

    private IterationRepository mockIterationRepository;

    //private MockReleaseRepository mockReleaseRepository;

    private IterationService iterationService;

    private StoryRepository mockStoryRepository;

//    private MockStoryValidator mockStoryValidator;
    
    private Iteration iterationToAddOrUpdate;
    
    private Project project;

    private Errors errors;
    
    private IMocksControl mocksControl;
    

    /* (non-Javadoc)
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
    
        // create mocks
        mocksControl = EasyMock.createStrictControl();
        
        // iteration to add or update
        iterationToAddOrUpdate = new IterationImpl();
        project = new ProjectImpl();
        iterationToAddOrUpdate.setProject(project);
        iterationToAddOrUpdate.setPersistanceId(1);

        mockIterationValidator = mocksControl.createMock(IterationValidator.class);
        
        mockIterationRepository = mocksControl.createMock(IterationRepository.class);

        //mockReleaseRepository = new MockReleaseRepository();
        
        mockStoryRepository = mocksControl.createMock(StoryRepository.class);

        errors = AgilePlanningObjectFactory.getErrors();

        //mockAgilePlanningObjectFactory = new MockAgilePlanningObjectFactory();

        iterationService = new IterationServiceImpl(mockIterationValidator, mockIterationRepository,
                mockStoryRepository);

    }

    /* (non-Javadoc)
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
    	
    	mocksControl.reset();
    	
        super.tearDown();
    }

    /**
     * test qu'il s'agit d'un singleton.
     */
    public void testIsASingleton() {
        assertTrue(AgilePlanningObjectFactory.isSingleton("iterationService"));
    }

    /**
     * Test le service d'ajout d'une itération quand tout est ok.<br>
     * Les étapes sont:
     * <ul>
     * <li>construction de l'objet à l'aide de la factory</li>
     * <li>Validation de l'iteration</li>
     * <li>Enregistrement de l'iteration<li>
     * </ul>
     */
    public void testAdd() {

        // TODO comment tester unitairement la construction de l'objet à l'aide de la factory ???

        // validation (sans erreurs)
    	EasyMock.expect(mockIterationValidator.validate(EasyMock.anyObject())).andReturn(AgilePlanningObjectFactory.getErrors());
        // ajout
        mockIterationRepository.addOrUpdate(EasyMock.isA(Iteration.class));
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        Errors errorsFromService = iterationService.add(1, new Date(), new Date());

        // aucune erreur n'est retournée
        assertFalse(errorsFromService.hasErrors());
        
        mocksControl.verify();

    }

    /**
     * Test le service d'ajout d'une iteration la validation renvoi des erreurs.<br>
     * Les étapes sont:
     * <ul>
     * <li>Validation de l'iteration</li>
     * <li>retours d'une erreur</li>
     * </ul>
     */
    public void testAddWhenValidationFails() {

        // validation (avec erreurs)

        Errors errors = AgilePlanningObjectFactory.getErrors();
        errors.reject("erreur");
        
        EasyMock.expect(mockIterationValidator.validate(EasyMock.isA(Iteration.class))).andReturn(errors);
        // set mock in replay mode
        mocksControl.replay();

        Errors errorsFromService = iterationService.add(1, new Date(), new Date());

        // Vérification des appels
        mocksControl.verify();

        // une erreur est retournée.
        assertTrue(errorsFromService.hasErrors());

    }

    /**
     * Test le service de modification d'une iteration quand tout est ok.<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de l'iteration dans la repository</li>
     * <li>mise à jour de l'iteration<li>
     * <li>validation de l'itération modifiée</li>
     * <li>Enregistrement de l'itération dans la repository<li>
     * </ul>
     */
    public void testUpdate() {

        Date start = new Date();
        Date end = new Date();
        int persistanceId = 2;
        int persistanceVersion = 3;


        // recherche de l'iteration
        EasyMock.expect(mockIterationRepository.findByPersistanceId(persistanceId)).andReturn(iterationToAddOrUpdate);
        
        // validation (sans erreurs)
        EasyMock.expect(mockIterationValidator.validate(EasyMock.isA(Iteration.class))).andReturn(AgilePlanningObjectFactory.getErrors());

        // enregistrement
        mockIterationRepository.addOrUpdate(iterationToAddOrUpdate);
        
        // set mock in replay mode
        mocksControl.replay();

        // appel au service
        Errors errorsFromService = iterationService.update(start, end, persistanceId, persistanceVersion);

        // contrôle que l'object est bien mis à jour
        assertEquals("basicProject", iterationToAddOrUpdate.getProject(), project);
        // TODO Comment tester les dates ??
        //        assertEquals("end", iterationToUpdate.getEnd(), end);
        assertEquals("persistanceId", iterationToAddOrUpdate.getPersistanceId(), persistanceId);
        assertEquals("persistanceVersion", iterationToAddOrUpdate.getPersistanceVersion(), persistanceVersion);
        //        assertEquals("start", iterationToUpdate.getStart(), start);

        // Vérifie les appels
        mocksControl.verify();
        
        // aucune erreur n'est retournée
        assertFalse(errorsFromService.hasErrors());

    }

    /**
     * Test le service de modification d'une iteration quand l'iteration à mettre à jour n'est pas trouvée. Aucn message d'erreur n'est envoyé. C'est un cas limite<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de l'iteration dans la repository</li>
     * </ul>
     */
    public void testUpdateWhenIterationIsNotFound() {

        Date start = new Date();
        Date end = new Date();
        int persistanceId = 2;
        int persistanceVersion = 3;

        Iteration iterationToUpdate = null;

        // recherche de l'iteration
        EasyMock.expect(mockIterationRepository.findByPersistanceId(persistanceId)).andReturn(iterationToUpdate);

        mocksControl.replay();
        
        // appel au service
        Errors errorsFromService = iterationService.update(start, end, persistanceId, persistanceVersion);

        assertFalse(errorsFromService.hasErrors());

        // Vérifie les appels
       mocksControl.verify();

        // aucune erreur n'est retournée
        assertFalse(errorsFromService.hasErrors());

    }


    /**
     * Test le service de modification d'une iteration la validation renvoi des erreurs<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de l'iteration dans la repository</li>
     * <li>mise à jour de l'iteration<li>
     * <li>validation de l'iteration modifiée</li>
     * </ul>
     */
    public void testUpdateWhenValidationFails() {

        int persistanceId = 2;

        Iteration iterationToUpdate = new IterationImpl();
        Project project = new ProjectImpl();
        iterationToUpdate.setProject(project);

        // recherche de l'iteration
        EasyMock.expect(mockIterationRepository.findByPersistanceId(persistanceId)).andReturn(iterationToUpdate);
        
        // mock de l'erreur
        Errors errors = AgilePlanningObjectFactory.getErrors();
        errors.reject("erreur");
        EasyMock.expect(mockIterationValidator.validate(EasyMock.isA(Iteration.class))).andReturn(errors);

        mocksControl.replay();
        
        Errors errorsFromService = iterationService.update(new Date(), new Date(), persistanceId, 3);

        // Vérifie les appels
        mocksControl.verify();

        // une erreur est retournée.
        assertTrue(errorsFromService.hasErrors());

    }

    /**
     * Test la recherche par persistance id quand une iteration est trouvée<br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retour de l'iteration trouvée</li>
     * </ul>
     */
    public void testFindByPersistanceIdWhenIterationIsFound() {

        int persistanceId = 1;
        Iteration iteration = new IterationImpl();

        EasyMock.expect(mockIterationRepository.findByPersistanceId(persistanceId)).andReturn(iteration);

        mocksControl.replay();
        
        Iteration iterationFromService = iterationService.findByPersistanceId(persistanceId);

        mocksControl.verify();

        assertEquals(iteration, iterationFromService);

    }

    /**
     * Test la recherche par persistance id quand une iteration n'est pas trouvée<br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne "null"</li>
     * </ul>
     */
    public void testFindByPersistanceIdWhenIterationIsNotFound() {

        int persistanceId = 1;
        Iteration iteration = null;

        EasyMock.expect(mockIterationRepository.findByPersistanceId(persistanceId)).andReturn(iteration);

        mocksControl.replay();
        
        Iteration iterationFromService = iterationService.findByPersistanceId(persistanceId);

        mocksControl.verify();

        assertNull(iterationFromService);

    }

    /**
     * Test la recherche des iterations d'un projet. Des iterations sont trouvées<br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne un "Set"</li>
     * </ul>
     */
    public void testFindByProjectPersistanceIdWhenIterationsAreFound() {

        int projetPersistanceId = 1;
        Set<Iteration> set = new HashSet<Iteration>();
        Iteration iteration = new IterationImpl();
        set.add(iteration);

        EasyMock.expect(mockIterationRepository.findByProjectPersistanceId(projetPersistanceId)).andReturn(set);

        mocksControl.replay();
        
        Set setFromService = iterationService.findByProjectPersistanceId(projetPersistanceId);

        mocksControl.verify();

        assertEquals(set, setFromService);

    }

    /**
     * Test la recherche des iterations d'un projet. Ancune iteration n'est trouvée<br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne un "Set"</li>
     * </ul>
     */
    public void testFindByProjectPersistanceIdWhenIterationsAreNotFound() {

        int projetPersistanceId = 1;
        Set set = new HashSet();

        EasyMock.expect(mockIterationRepository.findByProjectPersistanceId(projetPersistanceId)).andReturn(set);

        mocksControl.replay();

        Set setFromService = iterationService.findByProjectPersistanceId(projetPersistanceId);

        mocksControl.verify();

        assertEquals(set, setFromService);

    }

    /**
     * Test de l'ajout de plusieurs stories à une iteration quand la validation est ok. <br>
     * Cela est réalisé en plusieurs étapes
     * <ul>
     * <li>Recherche de l'iteration</li>
     * <li>Recherche de(s) stor(ies)</li>
     * <li>Ajout à la liste des story de l'iteration</li>
     * <li>Validation de l'iteration</li>
     * <li>Enregistrement dans la repository des stories<li>
     * <li>retour d'une structure d'erreur vide<li>
     * </ul> 
     */
    public void testAddStories() {

        Iteration iteration = new IterationImpl();
        int iterationPersistanceId = 1;
        long iterationPersistanceVersion = 2;
        
        iteration.setPersistanceVersion(3);
        iteration.setStories(new HashSet<Story>());

        Integer story1PersistanceId = new Integer(3);
        Integer story2PersistanceId = new Integer(4);

        Story story1 = new StoryImpl();
        story1.setPersistanceId(story1PersistanceId);
        story1.setShortDescription("scooby");
        Story story2 = new StoryImpl();
        story2.setPersistanceId(story2PersistanceId);
        story2.setShortDescription("doo");

        Set<Story> stories = new HashSet<Story>();
        stories.add(story1);
        stories.add(story2);

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(story1PersistanceId);
        storyIds.add(story2PersistanceId);

        // les appels peuvent être réalisés dans n'importe quel ordre
        //MockCore.startBlock();
        
        mocksControl.checkOrder(false);
        
        // recherche de l'itération
        EasyMock.expect(mockIterationRepository.findByPersistanceId(iterationPersistanceId)).andReturn(iteration);
        //mockIterationRepository.expectFindByPersistanceId(iterationPersistanceId, iteration);
        
        // Recherche des stories
        EasyMock.expect(mockStoryRepository.findByPersistanceId(story1PersistanceId)).andReturn(story1);
        //mockStoryRepository.expectFindByPersistanceId(story1PersistanceId, story1);
        EasyMock.expect(mockStoryRepository.findByPersistanceId(story2PersistanceId)).andReturn(story2);
        //mockStoryRepository.expectFindByPersistanceId(story2PersistanceId, story2);

        //MockCore.endBlock();
        
        // vérification que le numéro de version est mis à jour 
        
        // validation de l'iteration
        EasyMock.expect(mockIterationValidator.validate(iteration)).andReturn(errors);
        //mockIterationValidator.expectValidate(iteration, errors);
        
        // enregistrement
        mockIterationRepository.addOrUpdate(iteration);

        mocksControl.replay();
        
        // service
        Errors errors = iterationService.addStories(storyIds, iterationPersistanceId, iterationPersistanceVersion);
        
        mocksControl.verify();
        
        // vérification qu'aucune erreur n'est retournée
        assertFalse(errors.hasErrors());
        
        // vérification du bon ajout dans la liste des stories (avant la validation)
        assertTrue(iteration.getStories().contains(story1));
        assertTrue(iteration.getStories().contains(story2));

        // vérification que le numéro de version est mis à jour
        assertEquals(iterationPersistanceVersion, iteration.getPersistanceVersion());

    }

    /**
     * Test de l'ajout de plusieurs tories à une iteration mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de l'iteration</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que l'iteration n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testAddStoriesWhenIterationIsNotFound() {

        Integer story1PersistanceId = new Integer(3);
        Integer story2PersistanceId = new Integer(4);
    	
        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(story1PersistanceId);
        storyIds.add(story2PersistanceId);
        
        Iteration iteration = null;
    	
        // recherche de l'iteration
        EasyMock.expect(mockIterationRepository.findByPersistanceId(iterationToAddOrUpdate.getPersistanceId())).andReturn(iteration);

        mocksControl.replay();
        
        // Appel au service
        Errors errorsFromService = iterationService.addStories(storyIds, iterationToAddOrUpdate.getPersistanceId(), 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette iteration n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This iteration doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        mocksControl.verify();
    	
    }

    
    /**
     * Test de l'ajout de plusieurs stories à une iteration quand la validation échoue. <br>
     * Cela est réalisé en plusieurs étapes
     * <ul>
     * <li>Recherche de l'iteration</li>
     * <li>Recherche de(s) stor(ies)</li>
     * <li>Mise à jour des stories</li>
     * <li>validation des stories</li>
     * <li>retour d'une structure d'erreur contenant les erreurs</li>
     * </ul> 
     */
    public void testAddStoriesWhenValidationFails() {

    	// construction de l'iteration
        Iteration iteration = new IterationImpl();
        int iterationPersistanceId = 1;
        long iterationPersistanceVersion = 2;
        
        iteration.setPersistanceVersion(3);
        iteration.setStories(new HashSet<Story>());

        Integer story1PersistanceId = new Integer(3);
        Integer story2PersistanceId = new Integer(4);

        // construction des stories
        Story story1 = new StoryImpl();
        story1.setPersistanceId(story1PersistanceId);
        story1.setShortDescription("scooby");
        Story story2 = new StoryImpl();
        story2.setPersistanceId(story2PersistanceId);
        story2.setShortDescription("doo");

        Set<Story> stories = new HashSet<Story>();
        stories.add(story1);
        stories.add(story2);

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(story1PersistanceId);
        storyIds.add(story2PersistanceId);

        // les appels peuvent être réalisés dans n'importe quel ordre
        mocksControl.checkOrder(false);
        
        // recherche de l'itération
        EasyMock.expect(mockIterationRepository.findByPersistanceId(iterationPersistanceId)).andReturn(iteration);
        
        // Recherche des stories
        EasyMock.expect(mockStoryRepository.findByPersistanceId(story1PersistanceId)).andReturn(story1);
        EasyMock.expect(mockStoryRepository.findByPersistanceId(story2PersistanceId)).andReturn(story2);
        
        // vérification que le numéro de version est mis à jour 
        
        // validation de l'iteration, avec une erreur 
        errors.reject("erreur !!");
        EasyMock.expect(mockIterationValidator.validate(iteration)).andReturn(errors);
        
        // l'enregistrement n'est pas appellé
        mocksControl.replay();
        
        // service
        Errors errors = iterationService.addStories(storyIds, iterationPersistanceId, iterationPersistanceVersion);
        
        mocksControl.verify();
        
        // vérification que les erreurs sont retournées
        assertTrue(errors.hasErrors());
        
        // vérification du bon ajout dans la liste des stories (avant la validation)
        assertTrue(iteration.getStories().contains(story1));
        assertTrue(iteration.getStories().contains(story2));

        // vérification que le numéro de version est mis à jour
        assertEquals(iterationPersistanceVersion, iteration.getPersistanceVersion());

    }

    /**
     * Test de la suppression de plusieurs stories d'une iteration quand la validation est ok.<br>
     * Cela est réalisé en plusieurs étapes
     * <ul>
     * <li>Recherche de(s) stor(ies)</li>
     * <li>Mise à jour des stories</li>
     * <li>Validation</li>
     * <li>Enregistrement dans la repository des stories<li>
     * <li>Retoure de la structure d'erreur sans erreurs<li>
     * </ul> 
     */
    public void testRemoveStories() {
    	
        Iteration iteration = new IterationImpl();
        int iterationPersistanceId = 1;
        long iterationPersistanceVersion = 2;
        
        iteration.setPersistanceVersion(3);
        iteration.setStories(new HashSet<Story>());

        Integer story1PersistanceId = new Integer(3);
        Integer story2PersistanceId = new Integer(4);

        Story story1 = new StoryImpl();
        story1.setPersistanceId(story1PersistanceId);
        story1.setShortDescription("scooby");
        Story story2 = new StoryImpl();
        story2.setPersistanceId(story2PersistanceId);
        story2.setShortDescription("doo");

        Set<Story> stories = new HashSet<Story>();
        stories.add(story1);
        stories.add(story2);

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(story1PersistanceId);
        storyIds.add(story2PersistanceId);

        // les appels peuvent être réalisés dans n'importe quel ordre
        mocksControl.checkOrder(false);
        
        // recherche de l'itération
        EasyMock.expect(mockIterationRepository.findByPersistanceId(iterationPersistanceId)).andReturn(iteration);
        
        // Recherche des stories
        EasyMock.expect(mockStoryRepository.findByPersistanceId(story1PersistanceId)).andReturn(story1);
        EasyMock.expect(mockStoryRepository.findByPersistanceId(story2PersistanceId)).andReturn(story2);
        
        // vérification que le numéro de version est mis à jour 
        
        // validation de l'iteration
        EasyMock.expect(mockIterationValidator.validate(iteration)).andReturn(errors);
        
        // enregistrement
        mockIterationRepository.addOrUpdate(iteration);

        mocksControl.replay();
        
        // service
        Errors errors = iterationService.removeStories(storyIds, iterationPersistanceId, iterationPersistanceVersion);
        
        mocksControl.verify();
        
        // vérification qu'aucune erreur n'est retournée
        assertFalse(errors.hasErrors());
        
        // vérification de la bonne suppression dans la liste des stories (avant la validation)
        assertFalse(iteration.getStories().contains(story1));
        assertFalse(iteration.getStories().contains(story2));

        // vérification que le numéro de version est mis à jour
        assertEquals(iterationPersistanceVersion, iteration.getPersistanceVersion());

    }

    
    /**
     * Test de la suppression de plusieurs stories d'une iteration mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de l'iteration</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que l'iteration n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testRemoveStoriesWhenIterationIsNotFound() {

        Integer story1PersistanceId = new Integer(3);
        Integer story2PersistanceId = new Integer(4);
    	
        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(story1PersistanceId);
        storyIds.add(story2PersistanceId);
        
        Iteration iteration = null;
    	
        // recherche de l'iteration
        EasyMock.expect(mockIterationRepository.findByPersistanceId(iterationToAddOrUpdate.getPersistanceId())).andReturn(iteration);

        mocksControl.replay();
        
        // Appel au service
        Errors errorsFromService = iterationService.removeStories(storyIds, iterationToAddOrUpdate.getPersistanceId(), 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette iteration n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This iteration doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        mocksControl.verify();
    	
    }

    
    
    /**
     * Test de la suppression de plusieurs stories d'une iteration quand la validation échoue.<br>
     * Cela est réalisé en plusieurs étapes
     * <ul>
     * <li>Recherche de(s) stor(ies)</li>
     * <li>Mise à jour des stories</li>
     * <li>Validation</li>
     * <li>Retour de la strcuture d'erreur avec une erreur<li>
     * </ul> 
     */
    public void testRemoveStoriesWhenValidationFails() {

        Iteration iteration = new IterationImpl();
        int iterationPersistanceId = 1;
        long iterationPersistanceVersion = 2;
        
        iteration.setPersistanceVersion(3);
        iteration.setStories(new HashSet<Story>());

        Integer story1PersistanceId = new Integer(3);
        Integer story2PersistanceId = new Integer(4);

        Story story1 = new StoryImpl();
        story1.setPersistanceId(story1PersistanceId);
        story1.setShortDescription("scooby");
        Story story2 = new StoryImpl();
        story2.setPersistanceId(story2PersistanceId);
        story2.setShortDescription("doo");

        Set<Story> stories = new HashSet<Story>();
        stories.add(story1);
        stories.add(story2);

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(story1PersistanceId);
        storyIds.add(story2PersistanceId);

        // les appels peuvent être réalisés dans n'importe quel ordre
        //MockCore.startBlock();
        
        mocksControl.checkOrder(false);
        
        // recherche de l'itération
        EasyMock.expect(mockIterationRepository.findByPersistanceId(iterationPersistanceId)).andReturn(iteration);
        
        // Recherche des stories
        EasyMock.expect(mockStoryRepository.findByPersistanceId(story1PersistanceId)).andReturn(story1);
        EasyMock.expect(mockStoryRepository.findByPersistanceId(story2PersistanceId)).andReturn(story2);

        // vérification que le numéro de version est mis à jour 
        
        // validation de l'iteration
        errors.reject("une erreur");
        EasyMock.expect(mockIterationValidator.validate(iteration)).andReturn(errors);

        // pas d'enregistrement

        mocksControl.replay();
        
        // service
        Errors errors = iterationService.removeStories(storyIds, iterationPersistanceId, iterationPersistanceVersion);
        
        mocksControl.verify();
        
        // vérification qu'aucune erreur n'est retournée
        assertTrue(errors.hasErrors());
        
        // vérification de la bonne suppression dans la liste des stories (avant la validation)
        assertFalse(iteration.getStories().contains(story1));
        assertFalse(iteration.getStories().contains(story2));

        // vérification que le numéro de version est mis à jour
        assertEquals(iterationPersistanceVersion, iteration.getPersistanceVersion());

    }
}
