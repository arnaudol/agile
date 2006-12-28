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

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.BusinessValue;
import net.sf.pmr.agilePlanning.domain.story.BusinessValueImpl;
import net.sf.pmr.agilePlanning.domain.story.MockBusinessValueRepository;
import net.sf.pmr.agilePlanning.domain.story.MockRiskLevelRepository;
import net.sf.pmr.agilePlanning.domain.story.MockStoryRepository;
import net.sf.pmr.agilePlanning.domain.story.MockStoryValidator;
import net.sf.pmr.agilePlanning.domain.story.RiskLevel;
import net.sf.pmr.agilePlanning.domain.story.RiskLevelImpl;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.TaskImpl;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.agilePlanning.domain.story.task.charge.ChargeImpl;
import net.sf.pmr.core.domain.project.MockProjectRepository;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.user.MockUserRepository;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import de.abstrakt.mock.MockCore;
import de.abstrakt.mock.expectable.Ignore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 * 
 * $Header
 */
public class StoryServiceTest extends TestCase {

    private MockTaskValidator mockTaskValidator;

    private MockStoryRepository mockStoryRepository;

    private StoryService storyService;
    
    private MockStoryValidator mockStoryValidator;
    
    private MockBusinessValueRepository mockBusinessValueRepository;
    
    private MockRiskLevelRepository mockRiskLevelRepository;
    
    private MockProjectRepository mockProjectRepository;
    
    private MockUserRepository mockUserRepository; 
    
    private Errors errors;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();

        mockTaskValidator = new MockTaskValidator();

        mockStoryRepository = new MockStoryRepository();
        
        mockStoryValidator = new MockStoryValidator();
        
        mockBusinessValueRepository = new MockBusinessValueRepository();
        
        mockRiskLevelRepository = new MockRiskLevelRepository();
        
        mockProjectRepository = new MockProjectRepository();
        
        mockUserRepository = new MockUserRepository();
        
        errors = AgilePlanningObjectFactory.getErrors();

        storyService = new StoryServiceImpl(mockTaskValidator, mockStoryRepository, mockStoryValidator, mockProjectRepository, mockBusinessValueRepository, mockRiskLevelRepository, mockUserRepository);

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
        assertTrue(AgilePlanningObjectFactory.isSingleton("storyService"));
    }

    /**
     * Test le service d'ajout d'une story quand tout est ok <br>
     * Les étapes sont:
     * <ul>
     * <li>construction de l'objet à l'aide de la factory</li>
     * <li>recherche du basicProject, BusinessValue et RiskLevel<li>
     * <li>validation</li>
     * <li>Enregistrement</li>
     * </ul>
     */
    public void testAdd() {

        // Comment tester la construction � l'aide de la factory ??
        // et la construction de l'objet
        
        Story story = new StoryImpl();
        
        BusinessValue businessValue = new BusinessValueImpl();
        businessValue.setId(1);
        
        RiskLevel riskLevel = new RiskLevelImpl();
        riskLevel.setId(2);

        story.setPersistanceId(1);
        story.setBusinessValue(businessValue);
        story.setRiskLevel(riskLevel);
        
        Project project = new ProjectImpl();
        project.setPersistanceId(5);
        story.setProject(project);
        
        story.setShortDescription("titi");
        story.setDescription("toto");
        story.setDaysEstimated(2);
        
        MockCore.startBlock();
        
        // recherche bu basicProject
        mockProjectRepository.expectFindByPersistanceId(story.getProject().getPersistanceId(), project);
        
        // recherche des business value et risk level
        mockBusinessValueRepository.expectFindById(story.getBusinessValue().getId(), businessValue);
        
        mockRiskLevelRepository.expectFindById(story.getRiskLevel().getId(), riskLevel);
        
       
        MockCore.endBlock();
        
        // validation
        mockStoryValidator.acceptValidate(new Ignore(), errors);

        // ajout
        mockStoryRepository.acceptAddOrUpdate_Story(new Ignore());
        
        storyService.add(story.getProject().getPersistanceId(), story.getShortDescription(), story.getDescription(), story.getDaysEstimated(), story.getBusinessValue().getId(), story.getRiskLevel().getId());

        // V�rifie les appels
        MockCore.verify();

    }
    
    
    /**
     * Test le service d'ajout d'une story quand la validation échoue <br>
     * Les étapes sont:
     * <ul>
     * <li>construction de l'objet à l'aide de la factory</li>
     * <li>recherche du basicProject, BusinessValue et RiskLevel<li>
     * <li>Validation</li>
     * </ul>
     */
    public void testAddWhenValidationFails() {

        // TODO comment tester unitairement la construction de l'objet à l'aide de la factory ???
        
        // Comment tester la construction à l'aide de la factory ??
        // et la construction de l'objet
        
        Story story = new StoryImpl();
        
        BusinessValue businessValue = new BusinessValueImpl();
        businessValue.setId(1);
        
        RiskLevel riskLevel = new RiskLevelImpl();
        riskLevel.setId(2);

        story.setPersistanceId(1);
        story.setBusinessValue(businessValue);
        story.setRiskLevel(riskLevel);
        
        Project project = new ProjectImpl();
        project.setPersistanceId(5);
        story.setProject(project);
        
        story.setShortDescription("titi");
        story.setDescription("toto");
        story.setDaysEstimated(2);
        
        MockCore.startBlock();
        
        // recherche bu basicProject
        mockProjectRepository.expectFindByPersistanceId(story.getProject().getPersistanceId(), project);
        
        // recherche des business value et risk level
        mockBusinessValueRepository.expectFindById(story.getBusinessValue().getId(), businessValue);
        
        mockRiskLevelRepository.expectFindById(story.getRiskLevel().getId(), riskLevel);
       
        MockCore.endBlock();

        // validation
        errors.reject("code");
        mockStoryValidator.expectValidate(new Ignore(), errors);

        Errors errorsFromService = storyService.add(story.getProject().getPersistanceId(), story.getShortDescription(), story.getDescription(), story.getDaysEstimated(), story.getBusinessValue().getId(), story.getRiskLevel().getId());

        // V�rifie les appels
        MockCore.verify();
        
        // les erreurs sont retourn�es
        assertTrue(errorsFromService.hasGlobalErrors());

    }
    
    
    /**
     * Test le service d'ajout d'une task quand tout est ok <br>
     * Les étapes sont:
     * <ul>
     * <li>construction de l'objet à l'aide de la factory</li>
     * <li>Validation</li>
     * <li>recherche de la story</li>
     * <li>ajout de la liste des tâches de la story<li> 
     * <li>Enregistrement</li>
     * </ul>
     * 
     */
    public void testAddTask() {

        // TODO comment tester unitairement la construction de l'objet à l'aide de la factory ???

        // recherche de la story
        Story story =  new StoryImpl();
        story.setTasks(new HashSet<Task>());
        mockStoryRepository.expectFindByPersistanceId(1, story);
    	
        // validation (sans erreurs)
        mockTaskValidator.expectValidate(new Ignore(), AgilePlanningObjectFactory.getErrors());
        
        
        // ajout
        mockStoryRepository.acceptAddOrUpdate_Story(story);

        Errors errorsFromService = storyService.addTask(1, 2, "toto", 2);

        // Vérifie les appels
        MockCore.verify();

        // aucune erreur n'est retournée (car pas de validation)
        assertFalse(errorsFromService.hasErrors());
        
        // test de l'ajout de la tâche dans le liste de la story
        for (Iterator iterator = story.getTasks().iterator(); iterator.hasNext();) {
            Task task = (Task) iterator.next();
            
            assertEquals("toto", task.getShortDescription());
            assertEquals(2.0, task.getDaysEstimated());
            
            // une seule tâche dans la liste
            break;
            
        }

    }
    
    
    /**
     * Test de l'ajout d'une tâche à une story mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la story</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que l'iteration n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testAddTaskWhenStoryIsNotFound() {
    	
        // recherche de la story
        Story story =  null;
        mockStoryRepository.expectFindByPersistanceId(1, story);
        
        // Appel au service
        Errors errorsFromService = storyService.addTask(1, 2, "toto", 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette story n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This story doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

    
    
    /**
     * Test le service d'ajout d'une task. La validation renvoi des erreurs<br>
     * Les étapes sont:
     * <ul>
     * <li>Validation</li>
     * <li>retour d'une erreur</li>
     * </ul>
     */
    public void testAddTaskWhenValidationFails() {

        // recherche de la story
        Story story =  new StoryImpl();
        story.setTasks(new HashSet<Task>());
        mockStoryRepository.expectFindByPersistanceId(1, story);

    	
        // validation (avec erreurs)
        Errors errors = AgilePlanningObjectFactory.getErrors();
        errors.reject("erreur");
        mockTaskValidator.expectValidate(new Ignore(), errors);        
        
        Errors errorsFromService = storyService.addTask(1, 2, "toto", 2);
        
        // Vérifie les appels
        MockCore.verify();
        
        // une erreur est retourn�e.
        assertTrue(errorsFromService.hasErrors());        
        
    }
    

    /**
     * Test le service de modification d'une story quand tout est ok <br>
     * Les �tapes sont:
     * <ul>
     * <li>recherche de la story dans la repository</li>
     * <li>mise � jour de cette story avec les informations pass�es en param�tre</li>
     * <li>Validation</li>
     * <li>enregistrement de la story dans la repository</li>
     * </ul>
     */
    // TODO faire un meilleur test.... (construction de la story et de l'iteration)
    public void testUpdate() {

        Story storyToUpdate = new StoryImpl();
        String shortDescription = "scooby";
        String description = "doo";
        double daysestimated = 2;
        int persistanceId = 1;
        int persistanceVersion = 5;

        // recherche de la story dans la repository
        mockStoryRepository.expectFindByPersistanceId(persistanceId, storyToUpdate);

        
        MockCore.startBlock();
        
        // recherche des business value et risk level
        BusinessValue businessValueOfTheStory = new BusinessValueImpl();
        businessValueOfTheStory.setId(1);
        mockBusinessValueRepository.expectFindById(1, businessValueOfTheStory);

        RiskLevel riskLevelOfTheStory = new RiskLevelImpl();
        riskLevelOfTheStory.setId(2);
        mockRiskLevelRepository.expectFindById(2, riskLevelOfTheStory);       
        MockCore.endBlock();
        
        storyToUpdate.setBusinessValue(businessValueOfTheStory);
        storyToUpdate.setRiskLevel(riskLevelOfTheStory);
        

        // validation
        mockStoryValidator.expectValidate(new Ignore(), errors);

        // enregistrement de la story dans la repository
        mockStoryRepository.expectAddOrUpdate(storyToUpdate);

        // appel de la m�thode de mise � jour
        Errors errorsFromService = storyService.update(shortDescription, description, daysestimated, businessValueOfTheStory.getId(), riskLevelOfTheStory.getId(),persistanceId, persistanceVersion);

        // V�rifie les appels
        MockCore.verify();

        // aucune erreur n'est retourn�e (car pas de validation)
        assertFalse(errorsFromService.hasErrors());
        
        // v�rification des mise � jour de cette story avec les informations pass�es en param�tre
        assertEquals("shorDescription", shortDescription, storyToUpdate.getShortDescription());
        assertEquals("description", description, storyToUpdate.getDescription());
        assertEquals("daysestimates", daysestimated, storyToUpdate.getDaysEstimated());
        assertEquals("businessValue", businessValueOfTheStory, storyToUpdate.getBusinessValue());
        assertEquals("riskLevel", riskLevelOfTheStory, storyToUpdate.getRiskLevel());
        assertEquals("persistanceId", persistanceId, storyToUpdate.getPersistanceId());
        assertEquals("persistanceVersion", persistanceVersion, storyToUpdate.getPersistanceVersion());

    }

    
    /**
     * Test de la mise à jout d'une story mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la story</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que l'iteration n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testUpdateWhenStoryIsNotFound() {

        Story storyToUpdate = new StoryImpl();
        String shortDescription = "scooby";
        String description = "doo";
        double daysestimated = 2;
        int persistanceId = 1;
        int persistanceVersion = 5;

        BusinessValue businessValueOfTheStory = new BusinessValueImpl();
        businessValueOfTheStory.setId(1);

        RiskLevel riskLevelOfTheStory = new RiskLevelImpl();
        riskLevelOfTheStory.setId(2);

    	
        // recherche de la story
        Story story =  null;
        mockStoryRepository.expectFindByPersistanceId(1, story);
        
        // Appel au service
        Errors errorsFromService = storyService.update(shortDescription, description, daysestimated, businessValueOfTheStory.getId(), riskLevelOfTheStory.getId(),persistanceId, persistanceVersion);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette story n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This story doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

    
    /**
     * Test le service de modification d'une story quand la validation echoue <br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la story dans la repository</li>
     * <li>mise à jour de cette story avec les informations passées en paramêtre</li>
     * <li>Validation</li>
     * </ul>
     */
    public void testUpdateWhenValidationFails() {

        Story storyToUpdate = new StoryImpl();
        String shortDescription = "scooby";
        String description = "doo";
        int estimate = 2;
        int persistanceId = 1;
        int persistanceVersion = 5;

        MockCore.startBlock();
        
        // recherche de la story dans la repository
        mockStoryRepository.expectFindByPersistanceId(persistanceId, storyToUpdate);        
        
        // recherche des business value et risk level
        BusinessValue businessValueOfTheStory = new BusinessValueImpl();
        businessValueOfTheStory.setId(1);
        mockBusinessValueRepository.expectFindById(1, businessValueOfTheStory);

        RiskLevel riskLevelOfTheStory = new RiskLevelImpl();
        riskLevelOfTheStory.setId(2);
        mockRiskLevelRepository.expectFindById(2, riskLevelOfTheStory);       
        MockCore.endBlock();


        // validation
        errors.reject("code");
        mockStoryValidator.expectValidate(new Ignore(), errors);

        // appel de la m�thode de mise � jour
        Errors errorsFromService = storyService.update(shortDescription, description, estimate, businessValueOfTheStory.getId(), riskLevelOfTheStory.getId(), persistanceId, persistanceVersion);

        // V�rifie les appels
        MockCore.verify();

        // aucune erreur n'est retourn�e (car pas de validation)
        assertFalse(errorsFromService.hasGlobalErrors());

    }

    
    /**
     * Test le service de modification d'une task quand tout est ok <br>
     * Les étapes sont:
     * <ul>
     * <li>Validation</li>
     * <li>recherche de la story<li>
     * <li>mise à jour de la tâche dans la liste des tâches de la story</li>
     * <li>Enregistrement<li>
     * </ul>
     */
    public void testUpdateTask() {

        // recherche de la story
        Story story = new StoryImpl();
        story.setTasks(new HashSet<Task>());
        Task task = new TaskImpl();
        task.setDaysEstimated(2);
        task.setShortDescription("scooby");
        task.setPersistanceId(1);
        task.setPersistanceVersion(3);
        story.getTasks().add(task);
        
        mockStoryRepository.expectFindByPersistanceId(1, story);
    	
        // validation (sans erreurs)
        mockTaskValidator.expectValidate(new Ignore(), AgilePlanningObjectFactory.getErrors());
        
        // modification
        mockStoryRepository.acceptAddOrUpdate_Story(story);
        
        Errors errorsFromService = storyService.updateTask(1,5,"doo", 4, 1, 7);
        
        // V�rifie les appels
        MockCore.verify();
        
        // aucune erreur n'est retourn�e
        assertFalse(errorsFromService.hasErrors());
        
        // test de l'ajout de la t�che dans le liste de la story
        for (Iterator iterator = story.getTasks().iterator(); iterator.hasNext();) {
            Task taskUpdated = (Task) iterator.next();
            
            assertEquals("doo", taskUpdated.getShortDescription());
            assertEquals(5.0, taskUpdated.getDaysEstimated());
            assertEquals(1, taskUpdated.getPersistanceId());
            assertEquals(7, taskUpdated.getPersistanceVersion());
            
            // une seule t�che dans la liste
            break;
            
        }
        
    }
    
    
    /**
     * Test de la mise à jour d'une tâche d'une story mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la story</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que la story n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testUpdateTaskWhenStoryIsNotFound() {

        // recherche de la story
        Story story =  null;
        mockStoryRepository.expectFindByPersistanceId(1, story);
        
        // Appel au service
        Errors errorsFromService = storyService.updateTask(1,5,"doo", 4, 1, 7);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette story n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This story doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

    
    /**
     * Test le service de modification d'une task. La validation renvoi des erreurs<br>
     * Les étapes sont:
     * <ul>
     * <li>Validation</li>
     * <li>retour d'une erreur</li>
     * </ul>
     */
    public void testUpdateTaskWhenValidationFails() {

        // validation (avec erreurs)
    	
        Story storyToUpdate = new StoryImpl();
        int persistanceId = 1;

        MockCore.startBlock();
        
        // recherche de la story dans la repository
        mockStoryRepository.expectFindByPersistanceId(persistanceId, storyToUpdate);        
        
        Errors errors = AgilePlanningObjectFactory.getErrors();
        errors.reject("erreur");
        
        mockTaskValidator.expectValidate(new Ignore(), errors);        
        
        Errors errorsFromService = storyService.updateTask(1,2,"scooby", 3, 1, 3);
        
        // Vérifie les appels
        MockCore.verify();
        
        // une erreur est retournée.
        assertTrue(errorsFromService.hasErrors());        
        
    }
    

    
    
    /**
     * Test le service de suppression d'une task quand tout est ok<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la story<li>
     * <li>mise à jour du numéro de version de la task (concurrence d'accès)<li>  
     * <li>Validationde la tâche pour suppression</li>
     * <li>suppression de la tâche dans la liste des tâches de la story</li>
     * <li>Enregistrement de la story<li>
     * </ul>
     */
    public void testDeleteTask() {

    	int storyPersistanceId = 1;
    	int persistanceId = 1;
    	long persistanceVersion = 2;
    	
        // recherche de la story
        Story story = new StoryImpl();
        story.setPersistanceId(storyPersistanceId);
        story.setPersistanceVersion(2);
        story.setTasks(new HashSet<Task>());
        
        Task task = new TaskImpl();
        task.setDaysEstimated(2);
        task.setShortDescription("scooby");
        task.setPersistanceId(persistanceId);
        task.setPersistanceVersion(3);
        story.getTasks().add(task);
        
        Task task2 = new TaskImpl();
        task2.setDaysEstimated(3);
        task2.setShortDescription("doo");
        task2.setPersistanceId(2);
        task2.setPersistanceVersion(4);
        story.getTasks().add(task2);
        
        mockStoryRepository.expectFindByPersistanceId(storyPersistanceId, story);
    	
        // validation (sans erreurs)
        mockTaskValidator.expectValidateForDelete(task, AgilePlanningObjectFactory.getErrors());
        
        // suppression
        mockStoryRepository.expectAddOrUpdate(story);
        
        Errors errorsFromService = storyService.deleteTask(storyPersistanceId, persistanceId, persistanceVersion);
        
        // Vérification les appels
        MockCore.verify();
        
        // aucune erreur n'est retournée
        assertFalse(errorsFromService.hasErrors());
        
        // test de l'ajout de la mise à jour du numéro de version de la tâche 
        assertEquals(persistanceVersion, task.getPersistanceVersion());
        
    }
    
    
    /**
     * Test de la suppression d'une tâche d'une story mais la story n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la story</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que la story n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testDeleteTaskWhenStoryIsNotFound() {

        // recherche de la story
        Story story =  null;
        mockStoryRepository.expectFindByPersistanceId(1, story);
        
        // Appel au service
        Errors errorsFromService = storyService.deleteTask(1, 2, 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette story n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This story doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
        
        
    	
    }

    /**
     * Test de la suppression d'une tâche d'une story mais la tâche n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la story</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que la story n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testDeleteTaskWhenTaskIsNotFound() {

    	int storyPersistanceId = 1;
    	int persistanceId = 1;
    	long persistanceVersion = 2;
    	
        // recherche de la story
        Story story = new StoryImpl();
        story.setPersistanceId(storyPersistanceId);
        story.setPersistanceVersion(2);
        story.setTasks(new HashSet<Task>());
                
        Task task = new TaskImpl();
        task.setDaysEstimated(3);
        task.setShortDescription("doo");
        task.setPersistanceId(2);
        task.setPersistanceVersion(3);
        story.getTasks().add(task);

        mockStoryRepository.expectFindByPersistanceId(storyPersistanceId, story);
        
        // Appel au service
        Errors errorsFromService = storyService.deleteTask(storyPersistanceId, persistanceId, persistanceVersion);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette charge n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This task doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

    
    /**
     * Test le service de suppression d'une task. La validation renvoi des erreurs<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la story<li>     
     * <li>mise à jour du numéro de version de la task (concurrence d'accès)<li>   
     * <li>Validation</li>
     * <li>retour d'une erreur</li>
     * </ul>
     */
    public void testDeleteTaskWhenValidationFails() {

    	int storyPersistanceId = 1;
    	int persistanceId = 1;
    	long persistanceVersion = 2;
    	
        // recherche de la story
        Story story = new StoryImpl();
        story.setPersistanceId(storyPersistanceId);
        story.setPersistanceVersion(2);
        story.setTasks(new HashSet<Task>());
        
        Task task = new TaskImpl();
        task.setDaysEstimated(2);
        task.setShortDescription("scooby");
        task.setPersistanceId(persistanceId);
        task.setPersistanceVersion(3);
        story.getTasks().add(task);
        
        Task task2 = new TaskImpl();
        task2.setDaysEstimated(3);
        task2.setShortDescription("doo");
        task2.setPersistanceId(2);
        task2.setPersistanceVersion(4);
        story.getTasks().add(task2);

        MockCore.startBlock();
        
        // recherche de la story dans la repository
        mockStoryRepository.expectFindByPersistanceId(storyPersistanceId, story);        
        
        Errors errors = AgilePlanningObjectFactory.getErrors();
        errors.reject("erreur");
        
        mockTaskValidator.expectValidateForDelete(task, errors);        
        
        Errors errorsFromService = storyService.deleteTask(storyPersistanceId, persistanceId, persistanceVersion);
        
        // Vérifie les appels
        MockCore.verify();
        
        // une erreur est retournée.
        assertTrue(errorsFromService.hasErrors());
        
        // test de pas de mise à jour du numéro de version
        assertFalse(persistanceVersion == task.getPersistanceVersion());
        
    }
    
    
    /**
     * Test la recherche par persistance id quand une story est trouvée <br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retour de la story trouvée</li>
     * </ul>
     */
    public void testFindByPersistanceIdWhenStoryIsFound() {

        int persistanceId = 1;
        Story story = new StoryImpl();

        mockStoryRepository.expectFindByPersistanceId(persistanceId, story);

        Story storyFromService = storyService.findByPersistanceId(persistanceId);

        MockCore.verify();

        assertEquals(story, storyFromService);

    }
    
    
    
    /**
     * Test la recherche par persistance id quand une task est trouvée <br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retour de la task trouvée</li>
     * </ul>
     */
    public void testFindTaskByPersistanceIdWhenTaskIsFound() {

        int persistanceId = 1;
        Task task = new TaskImpl();

        mockStoryRepository.expectFindTaskByPersistanceId(persistanceId, task);

        Task taskFromService = storyService.findTaskByPersistanceId(persistanceId);

        MockCore.verify();

        assertEquals(task, taskFromService);

    }
    
    
    /**
     * Test la recherche par persistance id quand une task n'est pas trouvée <br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne "null"</li>
     * </ul>
     */
    public void testFindTaskByPersistanceIdWhenStoryIsNotFound() {

        int persistanceId = 1;
        Task task = null;

        mockStoryRepository.expectFindTaskByPersistanceId(persistanceId, task);

        Task taskFromService = storyService.findTaskByPersistanceId(persistanceId);

        MockCore.verify();

        assertNull(taskFromService);

    }


    /**
     * Test la recherche par persistance id quand une story n'est pas trouvée <br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne "null"</li>
     * </ul>
     */
    public void testFindByPersistanceIdWhenStoryIsNotFound() {

        int persistanceId = 1;
        Story story = null;

        mockStoryRepository.expectFindByPersistanceId(persistanceId, story);

        Story storyFromService = storyService.findByPersistanceId(persistanceId);

        MockCore.verify();

        assertNull(storyFromService);

    }
    
    
    /**
     * Test la recherche des story d'un projet. Des story sont trouvées <br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne un "Set"</li>
     * </ul>
     */
    public void testFindByProjectPersistanceIdWhenStoriesAreFound() {

        int projetPersistanceId = 1;
        Set set = new HashSet();
        Story story = new StoryImpl();
        set.add(story);

        mockStoryRepository.expectFindByProjectPersistanceId(projetPersistanceId, set);

        Set setFromService = storyService.findByProjectPersistanceId(projetPersistanceId);

        MockCore.verify();

        assertEquals(set, setFromService);

    }

    /**
     * Test la recherche des stories d'un projet. Ancune story n'est trouvée <br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne un "Set"</li>
     * </ul>
     */
    public void testFindByProjectPersistanceIdWhenStoriesAreNotFound() {

        int projetPersistanceId = 1;
        Set set = new HashSet();

        mockStoryRepository.expectFindByProjectPersistanceId(projetPersistanceId, set);

        Set setFromService = storyService.findByProjectPersistanceId(projetPersistanceId);

        MockCore.verify();

        assertEquals(set, setFromService);

    }
    
    /**
     * Test le service d'ajout d'une charge quand tout est ok <br>
     * Les étapes sont:
     * <ul>
     * <li>construction de l'objet à l'aide de la factory</li>
     * <li>recherche de la story et du user</li>
     * <li>ajout à la liste des charges de la task<li> 
     * <li>Enregistrement</li>
     * </ul>
     * 
     */
    public void testAddCharge() {

        // recherche de la story
        Story story =  new StoryImpl();
        story.setPersistanceId(1);
        story.setTasks(new HashSet<Task>());
        
        // Ajout d'une tâche
        Task task = new TaskImpl();
        task.setPersistanceId(1);
        story.getTasks().add(task);

        User user = new UserImpl();
        user.setPersistanceId(1);
        
        // appel de la recherche de la story
        mockStoryRepository.expectFindByPersistanceId(1, story);
        
        // appel de la recherche du user
        mockUserRepository.expectFindUserById(1, user);
        
        // appel de la mise à jour de la story
        mockStoryRepository.expectAddOrUpdate(story);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, 12);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        calendar.set(Calendar.HOUR, 2);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date day = calendar.getTime();
        
        // appel du service
        storyService.addCharge(1, 1, 1, day, 1, 3);

        // Vérifie les appels
        MockCore.verify();
        
        // test de l'ajout de la charge dans la liste
        
        boolean chargeFound = false;
        
        for (Task taskToFind : story.getTasks()) {
			
        	if (taskToFind.getPersistanceId() == 1)  {
        		
        		
        		for (Charge chargeTofind : taskToFind.getCharges()) {
					        				
        				chargeFound = true;
        				
        				assertEquals(chargeTofind.getDaysNeededToFinish(), 3.0);
        				assertEquals(chargeTofind.getTimeUsedToday(), 1.0);
        				assertSame(chargeTofind.getUser(), user);
        				
        				// contrôle de la date
        				// attention dans l'oject charge la date est tronquée pour le pas prendre en compte
        				// les heures/minutes/secondes
        				Calendar calendarToCheck = Calendar.getInstance();
        				calendarToCheck.setTime(chargeTofind.getDay());
        				
        				assertEquals(calendar.YEAR , calendarToCheck.YEAR);
        				assertEquals(calendar.MONTH , calendarToCheck.MONTH);
        				assertEquals(calendar.DAY_OF_MONTH , calendarToCheck.DAY_OF_MONTH);
        			
				}
        		
        	}
        	
		}
        
        if (chargeFound == false ) {
        	fail("charge not found");
        }

    }

    /**
     * Test de l'ajout d'une tâche d'une story mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la story</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que l'iteration n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testAddChargeWhenStoryIsNotFound() {

        // recherche de la story
        Story story =  null;
        mockStoryRepository.expectFindByPersistanceId(1, story);
        
        // Appel au service
        Errors errorsFromService = storyService.addCharge(1, 1, 1, Calendar.getInstance().getTime(), 1, 3);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette story n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This story doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

    
    /**
     * Test le service de modification d'une charge quand tout est ok <br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la story</li>
     * <li>mise à jour des propriétés de la charge</li> 
     * <li>Enregistrement</li>
     * </ul>
     * 
     */
    public void testUpdateCharge() {

        // recherche de la story
        Story story =  new StoryImpl();
        story.setPersistanceId(1);
        story.setTasks(new HashSet<Task>());
        
        // Ajout d'une tâche
        Task task = new TaskImpl();
        task.setPersistanceId(1);
        task.setCharges(new HashSet<Charge>());
        story.getTasks().add(task);
        
        // Charge
        Charge charge = new ChargeImpl();
        Date chargeDate = new Date();
        charge.setDay(chargeDate);
        charge.setDaysNeededToFinish(2);
        charge.setPersistanceId(1);
        charge.setPersistanceVersion(5);
        charge.setTimeUsedToday(0.5);
        User chargeUser = new UserImpl();
        charge.setUser(chargeUser);
        
        task.getCharges().add(charge);
        
        // appel de la recherche de la story
        mockStoryRepository.expectFindByPersistanceId(1, story);
        
        // appel de la mise � jour de la story
        mockStoryRepository.expectAddOrUpdate(story);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, 12);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        calendar.set(Calendar.HOUR, 2);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date day = calendar.getTime();
        
        // appel du service
        storyService.updateCharge(day, 1, 3,1, 1, 1, 2);
        

        // V�rifie les appels
        MockCore.verify();
        
        // test de l'ajout de la charge dans la liste
        
        boolean chargeFound = false;
        
        for (Task taskToFind : story.getTasks()) {
			
        	if (taskToFind.getPersistanceId() == 1)  {
        		
        		
        		for (Charge chargeTofind : taskToFind.getCharges()) {
					        				
        				chargeFound = true;
        				
        				assertEquals(chargeTofind.getPersistanceId(), 1);
        				assertEquals(chargeTofind.getPersistanceVersion(), 2);
        				assertEquals(chargeTofind.getDaysNeededToFinish(), 3.0);
        				assertEquals(chargeTofind.getTimeUsedToday(), 1.0);
        				assertSame(chargeTofind.getUser(), chargeUser);
        				
        				// contrôle de la date
        				// attention dans l'oject charge la date est tronquée pour le pas prendre en compte
        				// les heures/minutes/secondes
        				Calendar calendarToCheck = Calendar.getInstance();
        				calendarToCheck.setTime(chargeTofind.getDay());
        				
        				assertEquals(calendar.YEAR , calendarToCheck.YEAR);
        				assertEquals(calendar.MONTH , calendarToCheck.MONTH);
        				assertEquals(calendar.DAY_OF_MONTH , calendarToCheck.DAY_OF_MONTH);

        			
				}
      	
        		
        	}
        	
		}
        
        if (chargeFound == false ) {
        	fail("charge not found");
        }

    }

    /**
     * Test de la mise à jour d'une tâche d'une story mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la story</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que l'iteration n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testUpdateChargeWhenStoryIsNotFound() {

        // recherche de la story
        Story story =  null;
        mockStoryRepository.expectFindByPersistanceId(1, story);
        
        // Appel au service
        Errors errorsFromService = storyService.updateCharge(Calendar.getInstance().getTime(), 1, 3,1, 1, 1, 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette story n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This story doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }


    /**
     * Test le service de suppression d'une story quand tout est ok <br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la story dans la repository</li>
     * <li>mise à jour du numéro de version (gestion de la concurrence d'accès)</li>
     * <li>Validation de la story pour suppression</li>
     * <li>suppression de la story dans la repository</li>
     * </ul>
     */
    public void testDelete() {
    	

        Story storyToDelete = new StoryImpl();
        storyToDelete.setPersistanceVersion(1);
        storyToDelete.setPersistanceVersion(5);
        
        int persistanceId = 1;
        long persistanceVersion = 4;

        // recherche de la story dans la repository
        mockStoryRepository.expectFindByPersistanceId(persistanceId, storyToDelete);
        
        // validation
        mockStoryValidator.expectValidateForDelete(storyToDelete, errors);

        // enregistrement de la story dans la repository
        mockStoryRepository.expectDelete(storyToDelete);

        // appel de la méthode de mise à jour
        Errors errorsFromService = storyService.delete(persistanceId, persistanceVersion);

        // Vérification les appels
        MockCore.verify();

        // aucune erreur n'est retournée car pas d'erreur de validation
        assertFalse(errorsFromService.hasErrors());
        
        // vérification de la mise à jour de  de la version de cette story pour la gestion de la concurrence d'accès
        assertEquals("persistanceVersion", persistanceVersion, storyToDelete.getPersistanceVersion());
    	
    }
    
    
    /**
     * Test le service de suppression d'une story quand la validation échoue<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la story dans la repository</li>
     * <li>mise à jour du numéro de version (gestion de la concurrence d'accès)</li>
     * <li>Validation de la story pour suppression</li>
     * <li>retour d'une erreur</li>
     * </ul>
     */
    public void testDeleteWhenValidationFails() {

        Story storyToDelete = new StoryImpl();
        storyToDelete.setPersistanceVersion(1);
        storyToDelete.setPersistanceVersion(5);
        
        int persistanceId = 1;
        long persistanceVersion = 4;

        // recherche de la story dans la repository
        mockStoryRepository.expectFindByPersistanceId(persistanceId, storyToDelete);
        
        // validation
        errors.reject("code");
        mockStoryValidator.expectValidateForDelete(storyToDelete, errors);

        // appel de la méthode de mise à jour
        Errors errorsFromService = storyService.delete(persistanceId, persistanceVersion);

        // Vérification les appels
        MockCore.verify();

        // une erreur est retournée
        assertTrue(errorsFromService.hasErrors());
        
        // vérification de la mise à jour de  de la version de cette story pour la gestion de la concurrence d'accès
        assertEquals("persistanceVersion", persistanceVersion, storyToDelete.getPersistanceVersion());
    	
    }
    
}
