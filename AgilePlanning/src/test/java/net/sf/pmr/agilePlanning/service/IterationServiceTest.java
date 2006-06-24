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
import net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository;
import net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator;
import net.sf.pmr.agilePlanning.domain.story.MockStoryRepository;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.agilePlanning.service.IterationService;
import net.sf.pmr.agilePlanning.service.IterationServiceImpl;
import net.sf.pmr.core.domain.project.BasicProject;
import net.sf.pmr.core.domain.project.BasicProjectImpl;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import de.abstrakt.mock.MockCore;
import de.abstrakt.mock.expectable.Ignore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class IterationServiceTest extends TestCase {

    private MockIterationValidator mockIterationValidator;

    private MockIterationRepository mockIterationRepository;

    //private MockReleaseRepository mockReleaseRepository;

    private IterationService iterationService;

    private MockStoryRepository mockStoryRepository;

//    private MockStoryValidator mockStoryValidator;
    
    private Iteration iterationToAddOrUpdate;
    
    private BasicProject basicProject;

    private Errors errors;

    /* (non-Javadoc)
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // iteration to add or update
        iterationToAddOrUpdate = new IterationImpl();
        basicProject = new BasicProjectImpl();
        iterationToAddOrUpdate.setProject(basicProject);
        iterationToAddOrUpdate.setPersistanceId(1);

        mockIterationValidator = new MockIterationValidator();

        mockIterationRepository = new MockIterationRepository();

        //mockReleaseRepository = new MockReleaseRepository();
        
        mockStoryRepository = new MockStoryRepository();

        errors = AgilePlanningObjectFactory.getErrors();

        //mockAgilePlanningObjectFactory = new MockAgilePlanningObjectFactory();

        iterationService = new IterationServiceImpl(mockIterationValidator, mockIterationRepository,
                mockStoryRepository);

        MockCore.reset();

    }

    /* (non-Javadoc)
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
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
        mockIterationValidator.expectValidate(new Ignore(), AgilePlanningObjectFactory.getErrors());
        // ajout
        mockIterationRepository.acceptAddOrUpdate(new Ignore());

        Errors errorsFromService = iterationService.add(1, new Date(), new Date());

        // Vérifie les appels
        MockCore.verify();

        // aucune erreur n'est retourn�e
        assertFalse(errorsFromService.hasErrors());

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
        mockIterationValidator.expectValidate(new Ignore(), errors);

        Errors errorsFromService = iterationService.add(1, new Date(), new Date());

        // Vérification des appels
        MockCore.verify();

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
        mockIterationRepository.expectFindByPersistanceId(persistanceId, iterationToAddOrUpdate);

        // validation (sans erreurs)
        mockIterationValidator.expectValidate(new Ignore(), AgilePlanningObjectFactory.getErrors());

        // enregistrement
        mockIterationRepository.expectAddOrUpdate(iterationToAddOrUpdate);

        // appel au service
        Errors errorsFromService = iterationService.update(start, end, persistanceId, persistanceVersion);

        // contrôle que l'object est bien mis à jour
        assertEquals("basicProject", iterationToAddOrUpdate.getProject(), basicProject);
        // TODO Comment tester les dates ??
        //        assertEquals("end", iterationToUpdate.getEnd(), end);
        assertEquals("persistanceId", iterationToAddOrUpdate.getPersistanceId(), persistanceId);
        assertEquals("persistanceVersion", iterationToAddOrUpdate.getPersistanceVersion(), persistanceVersion);
        //        assertEquals("start", iterationToUpdate.getStart(), start);

        // Vérifie les appels
        MockCore.verify();

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
        int releasePersistanceId = 4;

        Iteration iterationToUpdate = null;

        // recherche de l'iteration
        mockIterationRepository.expectFindByPersistanceId(persistanceId, iterationToUpdate);

        // appel au service
        Errors errorsFromService = iterationService.update(start, end, persistanceId, persistanceVersion);

        assertFalse(errorsFromService.hasErrors());

        // Vérifie les appels
        MockCore.verify();

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
        BasicProject basicProject = new BasicProjectImpl();
        iterationToUpdate.setProject(basicProject);

        // recherche de l'iteration
        mockIterationRepository.expectFindByPersistanceId(persistanceId, iterationToUpdate);

        // mock de l'erreur
        Errors errors = AgilePlanningObjectFactory.getErrors();
        errors.reject("erreur");
        mockIterationValidator.expectValidate(new Ignore(), errors);

        Errors errorsFromService = iterationService.update(new Date(), new Date(), persistanceId, 3);

        // Vérifie les appels
        MockCore.verify();

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

        mockIterationRepository.expectFindByPersistanceId(persistanceId, iteration);

        Iteration iterationFromService = iterationService.findByPersistanceId(persistanceId);

        MockCore.verify();

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

        mockIterationRepository.expectFindByPersistanceId(persistanceId, iteration);

        Iteration iterationFromService = iterationService.findByPersistanceId(persistanceId);

        MockCore.verify();

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

        mockIterationRepository.expectFindByProjectPersistanceId(projetPersistanceId, set);

        Set setFromService = iterationService.findByProjectPersistanceId(projetPersistanceId);

        MockCore.verify();

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

        mockIterationRepository.expectFindByProjectPersistanceId(projetPersistanceId, set);

        Set setFromService = iterationService.findByProjectPersistanceId(projetPersistanceId);

        MockCore.verify();

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
        MockCore.startBlock();
        
        // recherche de l'itération
        mockIterationRepository.expectFindByPersistanceId(iterationPersistanceId, iteration);
        
        // Recherche des stories
        mockStoryRepository.expectFindByPersistanceId(story1PersistanceId, story1);
        mockStoryRepository.expectFindByPersistanceId(story2PersistanceId, story2);

        MockCore.endBlock();
        
        // vérification que le numéro de version est mis à jour 
        
        // validation de l'iteration
        mockIterationValidator.expectValidate(iteration, errors);
        
        // enregistrement
        mockIterationRepository.expectAddOrUpdate(iteration);

        // service
        Errors errors = iterationService.addStories(storyIds, iterationPersistanceId, iterationPersistanceVersion);
        
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
        mockIterationRepository.expectFindByPersistanceId(iterationToAddOrUpdate.getPersistanceId(), iteration);
        
        // Appel au service
        Errors errorsFromService = iterationService.addStories(storyIds, iterationToAddOrUpdate.getPersistanceId(), 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette iteration n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This iteration doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
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
        MockCore.startBlock();
        
        // recherche de l'itération
        mockIterationRepository.expectFindByPersistanceId(iterationPersistanceId, iteration);
        
        // Recherche des stories
        mockStoryRepository.expectFindByPersistanceId(story1PersistanceId, story1);
        mockStoryRepository.expectFindByPersistanceId(story2PersistanceId, story2);

        MockCore.endBlock();
        
        // vérification que le numéro de version est mis à jour 
        
        // validation de l'iteration, avec une erreur 
        errors.reject("erreur !!");
        mockIterationValidator.expectValidate(iteration, errors);
        
        // l'enregistrement n'est pas appellé
        
        // service
        Errors errors = iterationService.addStories(storyIds, iterationPersistanceId, iterationPersistanceVersion);
        
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
        MockCore.startBlock();
        
        // recherche de l'itération
        mockIterationRepository.expectFindByPersistanceId(iterationPersistanceId, iteration);
        
        // Recherche des stories
        mockStoryRepository.expectFindByPersistanceId(story1PersistanceId, story1);
        mockStoryRepository.expectFindByPersistanceId(story2PersistanceId, story2);

        MockCore.endBlock();
        
        // vérification que le numéro de version est mis à jour 
        
        // validation de l'iteration
        mockIterationValidator.expectValidate(iteration, errors);
        
        // enregistrement
        mockIterationRepository.expectAddOrUpdate(iteration);

        // service
        Errors errors = iterationService.removeStories(storyIds, iterationPersistanceId, iterationPersistanceVersion);
        
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
        mockIterationRepository.expectFindByPersistanceId(iterationToAddOrUpdate.getPersistanceId(), iteration);
        
        // Appel au service
        Errors errorsFromService = iterationService.removeStories(storyIds, iterationToAddOrUpdate.getPersistanceId(), 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette iteration n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This iteration doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
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
        MockCore.startBlock();
        
        // recherche de l'itération
        mockIterationRepository.expectFindByPersistanceId(iterationPersistanceId, iteration);
        
        // Recherche des stories
        mockStoryRepository.expectFindByPersistanceId(story1PersistanceId, story1);
        mockStoryRepository.expectFindByPersistanceId(story2PersistanceId, story2);

        MockCore.endBlock();
        
        // vérification que le numéro de version est mis à jour 
        
        // validation de l'iteration
        errors.reject("une erreur");
        mockIterationValidator.expectValidate(iteration, errors);
        
        // enregistrement
        mockIterationRepository.expectAddOrUpdate(iteration);

        // service
        Errors errors = iterationService.removeStories(storyIds, iterationPersistanceId, iterationPersistanceVersion);
        
        // vérification qu'aucune erreur n'est retournée
        assertTrue(errors.hasErrors());
        
        // vérification de la bonne suppression dans la liste des stories (avant la validation)
        assertFalse(iteration.getStories().contains(story1));
        assertFalse(iteration.getStories().contains(story2));

        // vérification que le numéro de version est mis à jour
        assertEquals(iterationPersistanceVersion, iteration.getPersistanceVersion());

    }
}
