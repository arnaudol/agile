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
import net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository;
import net.sf.pmr.agilePlanning.domain.release.MockReleaseValidator;
import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.release.ReleaseImpl;
import net.sf.pmr.agilePlanning.domain.story.MockStoryRepository;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import de.abstrakt.mock.MockCore;
import de.abstrakt.mock.expectable.Ignore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ReleaseServiceTest extends TestCase {

    private MockReleaseValidator mockReleaseValidator;

    private MockReleaseRepository mockReleaseRepository;
    
    private MockStoryRepository mockStoryRepository;

    private Errors errors;

    private ReleaseService releaseService;
    
    private Release releaseToAddOrUpdate;
    
    private Release releaseToDelete;
    
    private Integer storyToAdd1PersistanceId;
    
    private Integer storyToAdd2PersistanceId;
    
    private Integer existingStoryPersistanceId;
    
    private Story storyToAdd1;
    
    private Story storyToAdd2;
    
    private Story existingStory;
    
    private Set<Story> storiesToAdd;

    /* (non-Javadoc)
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();

        mockReleaseValidator = new MockReleaseValidator();

        mockReleaseRepository = new MockReleaseRepository();
        
        mockStoryRepository = new MockStoryRepository();

        errors = AgilePlanningObjectFactory.getErrors();

        releaseService = new ReleaseServiceImpl(mockReleaseValidator, mockReleaseRepository, mockStoryRepository);
        
        releaseToAddOrUpdate = new ReleaseImpl();

        storyToAdd1PersistanceId = new Integer(3);
        storyToAdd2PersistanceId = new Integer(4);
        existingStoryPersistanceId = new Integer(5);

        // Story à ajouter
        storyToAdd1 = new StoryImpl();
        storyToAdd1.setShortDescription("1");
        storyToAdd1.setPersistanceId(storyToAdd1PersistanceId);
        storyToAdd2 = new StoryImpl();
        storyToAdd2.setShortDescription("2");
        storyToAdd2.setPersistanceId(storyToAdd2PersistanceId);
        
        // story existance dans la release
        existingStory = new StoryImpl();
        existingStory.setShortDescription("3");
        existingStory.setPersistanceId(existingStoryPersistanceId);
        
        // la release a déjà une story
        releaseToAddOrUpdate.setStories(new HashSet<Story>());
        releaseToAddOrUpdate.getStories().add(existingStory);
        releaseToAddOrUpdate.setPersistanceId(1);
        releaseToAddOrUpdate.setPersistanceVersion(3);
        
        storiesToAdd = new HashSet<Story>();
        storiesToAdd.add(storyToAdd1);
        storiesToAdd.add(storyToAdd2);
        
        releaseToDelete = new ReleaseImpl();
        releaseToDelete.setPersistanceVersion(1);
        releaseToDelete.setPersistanceVersion(5);

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
        assertTrue(AgilePlanningObjectFactory.isSingleton("releaseService"));
    }

    /**
     * Test le service d'ajout d'une release quand tout est ok.<br>
     * Les étapes sont:
     * <ul>
     * <li>construction de l'objet à l'aide de la factory</li>
     * <li>Validation</li>
     * <li>Enregistrement<li>
     * <li>Retours d'une structure d'erreur vide</li>
     * </ul>
     */
    public void testAdd() {

        // validation (sans erreurs)
        mockReleaseValidator.expectValidate(new Ignore(), errors);

        // ajout
        mockReleaseRepository.acceptAddOrUpdate(new Ignore());

        Errors errorsFromService = releaseService.add(1, "1", new Date());

        // Vérifie les appels
        MockCore.verify();

        // aucune erreur n'est retournée
        assertFalse(errorsFromService.hasErrors());

    }

    /**
     * Test le service d'ajout d'une release quand la validation renvoie des erreurs.<br>
     * Les étapes sont:
     * <ul>
     * <li>Validation</li>
     * <li>retour d'une erreur dans la structure d'erreur</li>
     * </ul>
     */
    public void testAddWhenValidationFails() {

        // validation (avec erreurs)

        errors.reject("erreur");
        mockReleaseValidator.expectValidate(new Ignore(), errors);

        Errors errorsFromService = releaseService.add(1, "1", new Date());

        // Vérifie les appels
        MockCore.verify();

        // une erreur est retournée.
        assertTrue(errorsFromService.hasErrors());

    }

    /**
     * Test le service de modification d'une release quand tout est ok.<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la release à mettre à jour<li>
     * <li>mise à jour de la release<li>
     * <li>Validation</li>
     * <li>Enregistrement<li>
     * <li>Retours d'une structure d'erreur vide</li>
     * </ul>
     */
    public void testUpdate() {

        Release release = new ReleaseImpl();

        Project project = new ProjectImpl();
        Date date = new Date();
        String number = "2";
        int persistanceId = 1;
        long persistanceVersion = 3;
        release.setProject(project);

        // recherche
        mockReleaseRepository.expectFindByPersistanceId(persistanceId, release);

        // validation (sans erreurs)
        mockReleaseValidator.expectValidate(release, AgilePlanningObjectFactory.getErrors());

        // modification
        mockReleaseRepository.acceptAddOrUpdate(release);

        Errors errorsFromService = releaseService.update(number, date, persistanceId, persistanceVersion);

        // Vérifie les appels
        MockCore.verify();

        // aucune erreur n'est retournée
        assertFalse(errorsFromService.hasErrors());

        // vérifie la mise à jour
        assertEquals(release.getNumber(), number);
        assertSame(release.getProject(), project);
        assertEquals(release.getDate(), date);
        assertEquals(release.getPersistanceId(), persistanceId);
        assertEquals(release.getPersistanceVersion(), persistanceVersion);

    }

    /**
     * Test le service de modification d'une release quand la validation renvoi des erreurs.<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la release à mettre à jour<li>
     * <li>mise à jour de la release<li>
     * <li>Validation</li>
     * <li>retour d'une erreur dans la structure d'erreur</li>
     * </ul>
     */
    public void testUpdateWhenValidationFails() {

        Release release = new ReleaseImpl();

        Project project = new ProjectImpl();
        Date date = new Date();
        String number = "2";
        int persistanceId = 1;
        long persistanceVersion = 3;
        release.setProject(project);

        errors.reject("erreur");

        // recherche
        mockReleaseRepository.expectFindByPersistanceId(persistanceId, release);

        // validation
        mockReleaseValidator.expectValidate(release, errors);

        Errors errorsFromService = releaseService.update(number, date, persistanceId, persistanceVersion);

        // Vérifie les appels
        MockCore.verify();

        // une erreur est retournée.
        assertTrue(errorsFromService.hasErrors());

        // vérifie la mise à jour
        assertEquals(release.getNumber(), number);
        assertSame(release.getProject(), project);
        assertEquals(release.getDate(), date);
        assertEquals(release.getPersistanceId(), persistanceId);
        assertEquals(release.getPersistanceVersion(), persistanceVersion);

    }

    
    /**
     * Test de la mise à jour d'une release mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la release</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que la release n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testUpdateWhenIterationIsNotFound() {

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(storyToAdd1PersistanceId);
        storyIds.add(storyToAdd2PersistanceId);
        
        Release release = null;
    	
        // recherche de la release
        mockReleaseRepository.expectFindByPersistanceId(releaseToAddOrUpdate.getPersistanceId(), release);
        
        // Appel au service
        Errors errorsFromService = releaseService.update(releaseToAddOrUpdate.getNumber(), releaseToAddOrUpdate.getDate(), releaseToAddOrUpdate.getPersistanceId(), 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette release n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This release doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

    
    /**
     * Test la recherche par persistance id quand une release est trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retour de la release trouvée</li>
     * </ul>
     */
    public void testFindByPersistanceIdWhenIterationIsFound() {

        int persistanceId = 1;
        Release release = new ReleaseImpl();

        mockReleaseRepository.expectFindByPersistanceId(persistanceId, release);

        Release releaseFromService = releaseService.findByPersistanceId(persistanceId);

        MockCore.verify();

        assertEquals(release, releaseFromService);

    }

    /**
     * Test la recherche par persistance id quand une release n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne "null"</li>
     * </ul>
     */
    public void testFindByPersistanceIdWhenIterationIsNotFound() {

        int persistanceId = 1;
        Release release = null;

        mockReleaseRepository.expectFindByPersistanceId(persistanceId, release);

        Release releaseFromService = releaseService.findByPersistanceId(persistanceId);

        MockCore.verify();

        assertNull(releaseFromService);

    }

    /**
     * Test la recherche des release d'un projet. Des release sont trouvées.<br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne un "Set"</li>
     * </ul>
     */
    public void testFindByProjectPersistanceIdWhenIterationsAreFound() {

        int projetPersistanceId = 1;
        Set<Release> set = new HashSet<Release>();
        Release release = new ReleaseImpl();
        set.add(release);

        mockReleaseRepository.expectFindByProjectPersistanceId(projetPersistanceId, set);

        Set setFromService = releaseService.findByProjectPersistanceId(projetPersistanceId);

        MockCore.verify();

        assertEquals(set, setFromService);

    }

    /**
     * Test la recherche des release d'un projet. Ancune release n'est trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>appel au repository</li>
     * <li>retourne un "Set"</li>
     * </ul>
     */
    public void testFindByProjectPersistanceIdWhenIterationsAreNotFound() {

        int projetPersistanceId = 1;
        Set set = new HashSet();

        mockReleaseRepository.expectFindByProjectPersistanceId(projetPersistanceId, set);

        Set setFromService = releaseService.findByProjectPersistanceId(projetPersistanceId);

        MockCore.verify();

        assertEquals(set, setFromService);

    }

    /**
     * Test de l'ajout de plusieurs stories à une release la validation est ok.<br>
     * Cela est réalisé en plusieurs étapes
     * <ul>
     * <li>Recherche de la release</li>
     * <li>Recherche de(s) stor(ies)</li>
     * <li>Mise à jour de la release</li>
     * <li>Validation</li>
     * <li>Enregistrement dans la repository des releases<li>
     * </ul> 
     */
    public void testAddStories() {

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(storyToAdd1PersistanceId);
        storyIds.add(storyToAdd2PersistanceId);

        // les appels peuvent être réalisés dans n'importe quel ordre
        MockCore.startBlock();

        // recherche de la release
        mockReleaseRepository.expectFindByPersistanceId(releaseToAddOrUpdate.getPersistanceId(), releaseToAddOrUpdate);

        // Recherche des story
        mockStoryRepository.expectFindByPersistanceId(storyToAdd1PersistanceId, storyToAdd1);
        mockStoryRepository.expectFindByPersistanceId(storyToAdd2PersistanceId, storyToAdd2);

        MockCore.endBlock();

        // validation de la release 
        mockReleaseValidator.expectValidate(releaseToAddOrUpdate, errors);

        // enregistrement
        mockReleaseRepository.expectAddOrUpdate(releaseToAddOrUpdate);

        // Appel au service
        long releasePersistanceVersion = 2;
        Errors errorsFromService = releaseService.addStories(storyIds, releaseToAddOrUpdate.getPersistanceId(), releasePersistanceVersion);

        // contrôle qu'il n'y a pas d'erreur retournées
        assertFalse(errorsFromService.hasErrors());

        // verification que les story ont bien été ajouté à la release
        assertTrue(releaseToAddOrUpdate.getStories().contains(storyToAdd1));
        assertTrue(releaseToAddOrUpdate.getStories().contains(storyToAdd2));
        // vérification que la release existance est toujours là
        assertTrue(releaseToAddOrUpdate.getStories().contains(existingStory));
        // vérification que le numéro de version a été mis à jour
        assertEquals(releaseToAddOrUpdate.getPersistanceVersion(), releasePersistanceVersion);
        
        // contrôle des appels
        MockCore.verify();

    }

    /**
     * Test de l'ajout de plusieurs stories à une release quand la validation échoue.<br>
     * Cela est réalisé en plusieurs étapes
     * <ul>
     * <li>Recherche de la release</li>
     * <li>Recherche de(s) stor(ies)</li>
     * <li>Mise à jour de la release</li>
     * <li>Validation</li>
     * </ul> 
     */
    public void testAddStoriesWhenValidationFails() {

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(storyToAdd1PersistanceId);
        storyIds.add(storyToAdd2PersistanceId);

        // les appels peuvent être réalisés dans n'importe quel ordre
        MockCore.startBlock();

        // recherche de la release
        mockReleaseRepository.expectFindByPersistanceId(releaseToAddOrUpdate.getPersistanceId(), releaseToAddOrUpdate);

        // Recherche des story
        mockStoryRepository.expectFindByPersistanceId(storyToAdd1PersistanceId, storyToAdd1);
        mockStoryRepository.expectFindByPersistanceId(storyToAdd2PersistanceId, storyToAdd2);

        MockCore.endBlock();

        // validation de la release
        errors.reject("belle erreur");
        mockReleaseValidator.expectValidate(releaseToAddOrUpdate, errors);

        // Appel au service
        long releasePersistanceVersion = 2;
        Errors errorsFromService = releaseService.addStories(storyIds, releaseToAddOrUpdate.getPersistanceId(), releasePersistanceVersion);

        // contrôle qu'il n'y a une erreur de retournée
        assertTrue(errorsFromService.hasErrors());

        // verification que les story ont bien été ajouté à la release
        assertTrue(releaseToAddOrUpdate.getStories().contains(storyToAdd1));
        assertTrue(releaseToAddOrUpdate.getStories().contains(storyToAdd2));
        // vérification que la release existance est toujours là
        assertTrue(releaseToAddOrUpdate.getStories().contains(existingStory));
        // vérification que le numéro de version a été mis à jour
        assertEquals(releaseToAddOrUpdate.getPersistanceVersion(), releasePersistanceVersion);
        
        // contrôle des appels
        MockCore.verify();


    }

    /**
     * Test de l'ajout de plusieurs stories à une release mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la release</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que la release n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testAddStoriesWhenIterationIsNotFound() {

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(storyToAdd1PersistanceId);
        storyIds.add(storyToAdd2PersistanceId);
        
        Release release = null;
    	
        // recherche de la release
        mockReleaseRepository.expectFindByPersistanceId(releaseToAddOrUpdate.getPersistanceId(), release);
        
        // Appel au service
        Errors errorsFromService = releaseService.addStories(storyIds, releaseToAddOrUpdate.getPersistanceId(), 2);

        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette release n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This release doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

    
    /**
     * Test de la suppression de plusieurs stories d'une release quand la validation est ok.<br>
     * Cela est réalisé en plusieurs étapes
     * <ul>
     * <li>recherche de la release</li>
     * <li>mise à jour de la release (suppresion des story de la liste)</li>
     * <li>validation</li>
     * <li>enregistrement dans la repository des releases<li>
     * </ul> 
     */
    public void testRemoveStories() {
    	
        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(existingStoryPersistanceId);

        // les appels peuvent être réalisés dans n'importe quel ordre
        MockCore.startBlock();

        // recherche de la release
        mockReleaseRepository.expectFindByPersistanceId(releaseToAddOrUpdate.getPersistanceId(), releaseToAddOrUpdate);

        // Recherche des story
        mockStoryRepository.expectFindByPersistanceId(existingStoryPersistanceId, existingStory);

        MockCore.endBlock();

        // validation de la release 
        mockReleaseValidator.expectValidate(releaseToAddOrUpdate, errors);

        // enregistrement
        mockReleaseRepository.expectAddOrUpdate(releaseToAddOrUpdate);

        // Appel au service
        long releasePersistanceVersion = 2;
        Errors errorsFromService = releaseService.removeStories(storyIds, releaseToAddOrUpdate.getPersistanceId(), releasePersistanceVersion);

        // contrôle qu'il n'y a pas d'erreur retournées
        assertFalse(errorsFromService.hasErrors());

        // vérification que la story a bien été supprimé
        assertFalse(releaseToAddOrUpdate.getStories().contains(existingStory));
        
        // vérification que le numéro de version de la release a été mis à jour
        assertEquals(releaseToAddOrUpdate.getPersistanceVersion(), releasePersistanceVersion);

        
        // contrôle des appels
        MockCore.verify();

    }
    
    /**
     * Test de la suppression de plusieurs stories d'une release mais celle-ci n'est pas trouvée.<br>
     * Les étapes sont:
     * <ul>
     * <li>Recherche de la release</li>
     * <li>retours d'une structure d'erreur vide contenant un message indiquant que la release n'a pas été trouvée</li> 
     * </ul> 
     */
    public void testRemoveStoriesWhenIterationIsNotFound() {

        Set<Integer> storyIds = new HashSet<Integer>();
        storyIds.add(storyToAdd1PersistanceId);
        storyIds.add(storyToAdd2PersistanceId);
        
        Release release = null;
    	
        // recherche de la release
        mockReleaseRepository.expectFindByPersistanceId(releaseToAddOrUpdate.getPersistanceId(), release);
        
        // Appel au service
        Errors errorsFromService = releaseService.removeStories(storyIds, releaseToAddOrUpdate.getPersistanceId(), 2);
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette release n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This release doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

    /**
     * Test le service de suppression d'une release quand tout est ok <br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la release dans la repository</li>
     * <li>mise à jour du numéro de version (gestion de la concurrence d'accès)</li>
     * <li>Validation de la release pour suppression</li>
     * <li>suppression de la release dans la repository</li>
     * </ul>
     */
    public void testDelete() {
        
        int persistanceId = 1;
        long persistanceVersion = 4;

        // recherche de la release dans la repository
        mockReleaseRepository.expectFindByPersistanceId(persistanceId, releaseToDelete);
        
        // validation
        mockReleaseValidator.expectValidateForDelete(releaseToDelete, errors);

        // suppression de la story dans la repository
        mockReleaseRepository.expectDelete(releaseToDelete);

        // appel de la méthode de suppression
        Errors errorsFromService = releaseService.delete(persistanceId, persistanceVersion);

        // Vérification les appels
        MockCore.verify();

        // aucune erreur n'est retournée car pas d'erreur de validation
        assertFalse(errorsFromService.hasErrors());
        
        // vérification de la mise à jour de  de la version de cette release pour la gestion de la concurrence d'accès
        assertEquals("persistanceVersion", persistanceVersion, releaseToDelete.getPersistanceVersion());
    	
    }
    
    
    /**
     * Test le service de suppression d'une release quand la validation échoue<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la release dans la repository</li>
     * <li>mise à jour du numéro de version (gestion de la concurrence d'accès)</li>
     * <li>Validation de la release pour suppression</li>
     * <li>retour d'une erreur</li>
     * </ul>
     */
    public void testDeleteWhenValidationFails() {

        int persistanceId = 1;
        long persistanceVersion = 4;

        // recherche de la release dans la repository
        mockReleaseRepository.expectFindByPersistanceId(persistanceId, releaseToDelete);
        
        // validation
        errors.reject("code");
        mockReleaseValidator.expectValidateForDelete(releaseToDelete, errors);

        // appel de la méthode de mise à jour
        Errors errorsFromService = releaseService.delete(persistanceId, persistanceVersion);

        // Vérification les appels
        MockCore.verify();

        // une erreur est retournée
        assertTrue(errorsFromService.hasErrors());
        
        // vérification de la mise à jour de  de la version de cette release pour la gestion de la concurrence d'accès
        assertEquals("persistanceVersion", persistanceVersion, releaseToDelete.getPersistanceVersion());
    	
    }

    /**
     * Test le service de suppression d'une release quand elle n'est pas trouvée dans la repository<br>
     * Les étapes sont:
     * <ul>
     * <li>recherche de la release dans la repository</li>
     * <li>retour d'une erreur</li>
     * </ul>
     */
    public void testDeleteWhenReleaseIsNotFound() {

    	releaseToDelete = null;
    	
        int persistanceId = 1;
        long persistanceVersion = 4;

        // recherche de la release dans la repository
        mockReleaseRepository.expectFindByPersistanceId(persistanceId, releaseToDelete);

        // appel de la méthode de mise à jour
        Errors errorsFromService = releaseService.delete(persistanceId, persistanceVersion);

        // Vérification les appels
        MockCore.verify();
        
        // contrôle de l'erreur retournée
        assertTrue(errorsFromService.hasGlobalErrors());
        // message en Français
        assertEquals("Cette release n'existe pas en base de données", errorsFromService.getGlobalError(Locale.FRENCH));
        // message en anglais
        assertEquals("This release doesn't exists in database", errorsFromService.getGlobalError(Locale.ENGLISH));

        // contrôle des appels
        MockCore.verify();
    	
    }

}
