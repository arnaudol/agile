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

package net.sf.pmr.agilePlanning.data.iteration;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.MapperTestCase;
import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.iteration.IterationImpl;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;

import org.dbunit.dataset.ITable;
import org.springframework.dao.ConcurrencyFailureException;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class IterationMapperTest extends MapperTestCase {

    private IterationMapper iterationMapper;
    
    private Iteration iterationToAdd;
    
    private Iteration iterationToUpdate;
    
    private Iteration iterationToDelete;
    
    private Story story1;
    
    private Story story2;
    
    private static final String SELECT_ITERATION_FOR_UPDATE= "select * from ITERATION where id = 1";
    
    private static final String SELECT_ITERATION_FOR_DELETE= "select * from ITERATION where id = 2";
    
    private static final String SELECT_ITERATION_FOR_ADD= "select * from ITERATION where id > 2";
    
    private static final String SELECT_BASICPROJECT= "select * from PROJECT where id = 2";
    
    private static final String SELECT_RELEASE= "select * from PMRELEASE where id = 3";
    
    private final static String SELECT_STORY1 = "select * from STORY where id = '1'";
    
    private final static String SELECT_STORY2 = "select * from STORY where id = '2'";

    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // getBasicProjectMapper        
        iterationMapper = AgilePlanningObjectFactory.getIterationMapper();
        
        // build basic project
        Project project = new ProjectImpl();
        project.setCode("A");
        project.setName("Super A");
        project.setPersistanceId(2);
        project.setPersistanceVersion(3);
        
        // Build iteration to Add
        iterationToAdd = new IterationImpl();
        iterationToAdd.setProject(project);
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        
        iterationToAdd.setEnd(calendar.getTime());
        iterationToAdd.setPersistanceId(0);
        iterationToAdd.setPersistanceVersion(0);
        
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        
        iterationToAdd.setStart(calendar.getTime());
        
        

        // Build iteration to Update
        iterationToUpdate = new IterationImpl();
        iterationToUpdate.setProject(project);

        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 12);
        
        iterationToUpdate.setEnd(calendar.getTime());
        iterationToUpdate.setPersistanceId(1);
        iterationToUpdate.setPersistanceVersion(2);
        
        calendar.set(Calendar.DAY_OF_MONTH, 26);
        
        iterationToUpdate.setStart(calendar.getTime());
        
        // Build IterationToDelete
        iterationToDelete = new IterationImpl();
        
        iterationToDelete.setProject(project);

        calendar.set(Calendar.YEAR, 2004);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        
        iterationToDelete.setEnd(calendar.getTime());
        iterationToDelete.setPersistanceId(2);
        iterationToDelete.setPersistanceVersion(2);
        
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        
        iterationToDelete.setStart(calendar.getTime());
        
        
        story1 = new StoryImpl();
        story1.setPersistanceId(1);
        story1.setPersistanceVersion(2);
        story1.setShortDescription("avancement des tâches à modifier");
        story1.setDescription("faire un report d'avancement des tâches à modifier");
        story1.setProject(project);
        
        story2 = new StoryImpl();
        story2.setPersistanceId(2);
        story2.setPersistanceVersion(3);
        story2.setShortDescription("revue de code");
        story2.setDescription("faire une revue de code de l'iteration courant");
        story2.setProject(project);

        
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
        assertTrue(AgilePlanningObjectFactory.isSingleton("iterationMapper"));
    }


    /**
     * Test de la mise à jour. Toutes les colonnes doivent être mises à jour.
     */
    public void testAddorUpdateWhenUpdatingWithoutStory() throws Exception {
        
        long persistanceVersion = iterationToUpdate.getPersistanceVersion() + 1;
        
        // update
        iterationMapper.addOrUpdate(iterationToUpdate);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_ITERATION_FOR_UPDATE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(iterationToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals("rel_id", new Integer(3) , (Integer) databaseData.getValue(0, "rel_id"));
		assertEquals("pro_id", new Integer(iterationToUpdate.getProject().getPersistanceId()), (Integer) databaseData.getValue(0, "pro_id"));
		// TODO comment tester les dates ??
//	    assertEquals("start", iterationToUpdate.getStart(), (Date) databaseData.getValue(0, "start") );
//	    assertEquals("end", iterationToUpdate.getStart(), (Date) databaseData.getValue(0, "end") );
	    assertEquals("version", new Long(persistanceVersion), (Long) databaseData.getValue(0, "version"));
        
    }

    
    /**
     * Test de la mise à jour avec des stories.
     */
    public void testAddorUpdateWhenUpdatingWithStories() throws Exception {
        
    	iterationToUpdate.setStories(new HashSet<Story>());
    	iterationToUpdate.getStories().add(story1);
    	iterationToUpdate.getStories().add(story2);
    	
        long persistanceVersion = iterationToUpdate.getPersistanceVersion() + 1;
        
        // update
        iterationMapper.addOrUpdate(iterationToUpdate);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_ITERATION_FOR_UPDATE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(iterationToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals("rel_id", new Integer(3) , (Integer) databaseData.getValue(0, "rel_id"));
		assertEquals("pro_id", new Integer(iterationToUpdate.getProject().getPersistanceId()), (Integer) databaseData.getValue(0, "pro_id"));
		// TODO comment tester les dates ??
//	    assertEquals("start", iterationToUpdate.getStart(), (Date) databaseData.getValue(0, "start") );
//	    assertEquals("end", iterationToUpdate.getStart(), (Date) databaseData.getValue(0, "end") );
	    assertEquals("version", new Long(persistanceVersion), (Long) databaseData.getValue(0, "version"));
	    
		// check the stories
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0, "id"));
		assertEquals("ite_id", new Integer(iterationToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "ite_id"));
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("id", new Integer(2), (Integer) databaseData.getValue(0, "id"));
		assertEquals("ite_id", new Integer(iterationToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "ite_id"));
        
    }
    
    
    /**
     * Test du bon fonctionnement de la concurrence d'acc�s lors de la mise �
     * jour.
     */
    public void testAddorUpdateWhenUpdatingWithConcurrencyFailureException()
            throws Exception {

        iterationToUpdate.setPersistanceVersion(1);

        // update
        try {
            iterationMapper.addOrUpdate(iterationToUpdate);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException concurrencyFailureException) {

        }
    }
    
    /**
     * Test lors d'une modification, que le projet lié n'est pas mis à jour.
     */
    public void testAddorUpdateWhenUpdatingDoesNotUpdateBasicProject()
            throws Exception {

        // modify BasicProjet
        iterationToUpdate.getProject().setName("bordel!");
        
        // update
        iterationMapper.addOrUpdate(iterationToUpdate);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("name", "Super A", databaseData.getValue(0, "name"));

    }
    
    
    /**
     * Test lors d'un ajout, que les stories ne sont pas mises à jour.
     */
    public void testAddorUpdateWhenupdatingDoesNotUpdateStories() throws Exception {

    	iterationToUpdate.setStories(new HashSet<Story>());
    	
    	// update stories
    	story1.setDescription("story1");
    	story2.setDescription("story2");
    	
    	// add stories to release
    	iterationToUpdate.setStories(new HashSet<Story>());
    	iterationToUpdate.getStories().add(story1);
    	iterationToUpdate.getStories().add(story2);
                
        // add
        iterationMapper.addOrUpdate(iterationToUpdate);
        
		// check the stories
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0, "id"));
		assertEquals("description", "faire un report d'avancement des tâches à modifier", (String) databaseData.getValue(0, "description"));
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("id", new Integer(2), (Integer) databaseData.getValue(0, "id"));
		assertEquals("description", "faire une revue de code de l'iteration courant", (String) databaseData.getValue(0, "description"));

    }


    
    /**
     * Test de l'ajout. Toutes les colonnes doivent être renseignées
     */
    public void testAddOrUpdateWhenAddingWithoutStory() throws Exception {
        
        // update
        iterationMapper.addOrUpdate(iterationToAdd);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_ITERATION_FOR_ADD);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertTrue("id", new Integer(iterationToAdd.getPersistanceId()) != (Integer) databaseData.getValue(0, "id"));
		assertEquals("rel_id", null , (Integer) databaseData.getValue(0, "rel_id"));
		assertEquals("pro_id", new Integer(iterationToAdd.getProject().getPersistanceId()), (Integer) databaseData.getValue(0, "pro_id"));
		// TODO comment tester les dates ??
//	    assertEquals("start", iterationToAdd.getStart(), (Date) databaseData.getValue(0, "start") );
//	    assertEquals("end", iterationToAdd.getStart(), (Date) databaseData.getValue(0, "end") );
	    assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));
        
    }

    
    /**
     * Test de l'ajout avec des stories.
     */
    public void testAddorUpdateWhenAddWithStories() throws Exception {
        
    	iterationToAdd.setStories(new HashSet<Story>());
    	iterationToAdd.getStories().add(story1);
    	iterationToAdd.getStories().add(story2);
    	
    	// update
        iterationMapper.addOrUpdate(iterationToAdd);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_ITERATION_FOR_ADD);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertTrue("id", new Integer(iterationToAdd.getPersistanceId()) != (Integer) databaseData.getValue(0, "id"));
		assertEquals("rel_id", null , (Integer) databaseData.getValue(0, "rel_id"));
		assertEquals("pro_id", new Integer(iterationToAdd.getProject().getPersistanceId()), (Integer) databaseData.getValue(0, "pro_id"));
		// TODO comment tester les dates ??
//	    assertEquals("start", iterationToAdd.getStart(), (Date) databaseData.getValue(0, "start") );
//	    assertEquals("end", iterationToAdd.getStart(), (Date) databaseData.getValue(0, "end") );
	    assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));
	    
		// check the stories
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0, "id"));
		assertEquals("ite_id", new Integer(iterationToAdd.getPersistanceId()), (Integer) databaseData.getValue(0, "ite_id"));
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("id", new Integer(2), (Integer) databaseData.getValue(0, "id"));
		assertEquals("ite_id", new Integer(iterationToAdd.getPersistanceId()), (Integer) databaseData.getValue(0, "ite_id"));

        
    }


    /**
     * Test du bon fonctionnement de la concurrence d'accès lors de l'ajout.
     */
    public void testAddorUpdateWhenAddingDoesNotThrowConcurrencyFailureException()
            throws Exception {

        iterationToUpdate.setPersistanceId(0);
        iterationToUpdate.setPersistanceVersion(0);

        // add
        try {
            iterationMapper.addOrUpdate(iterationToUpdate);
        } catch (ConcurrencyFailureException concurrencyFailureException) {
            fail("should not throw a concurrency failure exception");
        }
    }

    /**
     * Test lors d'un ajout, que le projet lié n'est pas mis à jour.
     */
    public void testAddorUpdateWhenAddingDoesNotUpdateBasicProject()
            throws Exception {

        // modify BasicProjet
        iterationToAdd.getProject().setName("bordel!");
        
        // add
        iterationMapper.addOrUpdate(iterationToAdd);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("name", "Super A", databaseData.getValue(0, "name"));

    }
    
    
    /**
     * Test lors d'un ajout, que les stories ne sont pas mises à jour.
     */
    public void testAddorUpdateWhenAddingDoesNotUpdateStories()
            throws Exception {

    	iterationToAdd.setStories(new HashSet<Story>());
    	
    	// update stories
    	story1.setDescription("story1");
    	story2.setDescription("story2");
    	
    	// add stories to release
    	iterationToAdd.setStories(new HashSet<Story>());
    	iterationToAdd.getStories().add(story1);
    	iterationToAdd.getStories().add(story2);
                
        // add
        iterationMapper.addOrUpdate(iterationToAdd);
        
		// check the stories
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0, "id"));
		assertEquals("description", "faire un report d'avancement des tâches à modifier", (String) databaseData.getValue(0, "description"));
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("id", new Integer(2), (Integer) databaseData.getValue(0, "id"));
		assertEquals("description", "faire une revue de code de l'iteration courant", (String) databaseData.getValue(0, "description"));

    }

    
    
    /**
     * Test le delete. la ligne doit être supprimée de la table
     */
    public void testDelete() throws Exception {
        
        // delete
        iterationMapper.delete(iterationToDelete);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_ITERATION_FOR_DELETE);
        
		assertEquals("number of row", 0, databaseData.getRowCount());
        
    }
    

    /**
     * test le delete quand l'iteration n'est pas en base: concurrence d'acc�s
     */
    public void testDeleteWhenIterationDoesNotExists() {
        
        //delete
        try {
            iterationMapper.delete(iterationToAdd);
            fail("should throw a concurrencyFailureException");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
        }
        
    }


    /**
     * test le delete quand l'iteration a été modifiée entre temps.
     */
    public void testDeleteWhenIterationHaveBeenModified() {
        
        iterationToDelete.setPersistanceVersion(1);
        
        //delete
        try {
            iterationMapper.delete(iterationToDelete);
            fail("should throw a concurrencyFailureException");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
        }
        
    }

    /**
     * test le delete ne supprime pas le projet.
     */
    public void testDeleteDoesNotDeleteProject() throws Exception {
        
        iterationMapper.delete(iterationToDelete);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
        
    }
    
    
    /**
     * test le delete ne supprime pas les stories.
     */
    public void testDeleteDoesNotDeleteStories() throws Exception {

    	// TODO ce test ne fonctionne pas !!
    	
    	iterationToDelete.setStories(new HashSet<Story>());
    	
    	iterationToDelete.getStories().add(story1);
    	iterationToDelete.getStories().add(story2);
    	
        iterationMapper.delete(iterationToDelete);
        
        // check
		// check the stories
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("number of row", 1, databaseData.getRowCount());
        
    }

    
    /**
     * test le delete ne supprime pas la release.
     */
    public void testDeleteDoesNotDeleteRelease() throws Exception {
        
        iterationMapper.delete(iterationToDelete);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_RELEASE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());

        
    }


    /**
     * test quand l'itération est trouvée
     */
    public void testFindByIdWhenIterationIsFound() {
        
        Iteration iteration = (Iteration) iterationMapper.findById(iterationToUpdate.getPersistanceId());

		assertEquals("id", iteration.getPersistanceId(), iterationToUpdate.getPersistanceId());
		// TODO comment tester les dates ??
//	    assertEquals("start", iteration.getStart(), iterationToUpdate.getStart());
//	    assertEquals("end", iteration.getEnd(), iterationToUpdate.getStart());
	    assertEquals("version", iteration.getPersistanceVersion(), iterationToUpdate.getPersistanceVersion());
        
    }
    
    
    /**
     * test quand l'itération n'est pas trouvée
     */
    public void testFindByIdWhenIterationIsNotFound(){
        
        Iteration iteration = (Iteration) iterationMapper.findById(888);

        assertNull(iteration);
        
    }

//    /**
//     * test que le findById ne ram�ne pas le BasicProjet
//     */
//    // TODO Comment le tester ??
//    public void testFindByIdDoesNotSelectBasicProject(){
//        
//    }

    /**
     * test quand l'iteration est trouvée.
     */
    public void testFindByProjectPersistanceIdWhenIterationIsFound() {
        
        Set set = iterationMapper.findByProjectPersistanceId(2);
        
        assertEquals(2, set.size());
        
    }
    
    /**
     * test quand l'iteration n'est pas trouvée.
     */
    public void testFindByProjectPersistanceIdWhenIterationIsNotFound() {

        Set set = iterationMapper.findByProjectPersistanceId(888);
        
        assertEquals(0, set.size());

    }
    
    
    /**
     * Test quand la date est la m�me que la date de d�but.
     * L'it�ration doit �tre trouv�e.
     */
    public void testfindByProjectPersistanceIdAndByDateWhenDateIsEqualsToTheStartDate() {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        
        Iteration iteration = iterationMapper.findByProjectPersistanceIdAndByDate(iterationToUpdate.getProject().getPersistanceId(), calendar.getTime());
    
        // test que l'iteration est trouv�e
        assertNotNull(iteration);
		assertEquals("id", iteration.getPersistanceId(), iterationToUpdate.getPersistanceId());
        
    }
    
    
    /**
     * Test quand la date est la même que la date de fin.
     * L'itération doit être trouvée.
     */
    public void testfindByProjectPersistanceIdAndByDateWhenDateIsEqualsToTheEndDate() {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 27);

        
        Iteration iteration = iterationMapper.findByProjectPersistanceIdAndByDate
        				(iterationToUpdate.getProject().getPersistanceId(), calendar.getTime());
    
        // test que l'iteration est trouvée
        
       // TODO A faire
        
      //  assertNotNull("itération trouvée", iteration);
	  // assertEquals("id", iteration.getPersistanceId(), iterationToUpdate.getPersistanceId());
        
    }    
    
    /**
     * Test quand la date est entre la date de début et la date de fin.
     * L'iteration doit être trouvée.
     */
    public void testfindByProjectPersistanceIdAndByDateWhenDateIsBetweenTheStartAndTheEndDate() {
        
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(true);
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        
        Iteration iteration = iterationMapper.findByProjectPersistanceIdAndByDate(iterationToUpdate.getProject().getPersistanceId(), calendar.getTime());
    
        // test que l'iteration est trouv�e
        assertNotNull(iteration);
		assertEquals("id", iteration.getPersistanceId(), iterationToUpdate.getPersistanceId());
        
    }


    /**
     * Test quand la date est avant la date de d�but.
     * L'iteration n'est pas trouv�e
     */
    public void testfindByProjectPersistanceIdAndByDateWhenDateIsBeforeTheStartDate() {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        
        Iteration iteration = iterationMapper.findByProjectPersistanceIdAndByDate(iterationToUpdate.getProject().getPersistanceId(), calendar.getTime());
    
		assertNull(iteration);
        
    }
    
    /**
     * Test quand la date est apr�s la date de fin.
     * L'iteration n'est pas trouv�e
     */
    public void testfindByProjectPersistanceIdAndByDateWhenDateIsAfterTheEndDate() {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        
        Iteration iteration = iterationMapper.findByProjectPersistanceIdAndByDate(iterationToUpdate.getProject().getPersistanceId(), calendar.getTime());
    
		assertNull(iteration);
        
    }


    /**
     * Test quand l'id du projet n'est pas en base
     * L'iteration n'est pas trouv�e
     */
    public void testfindByProjectPersistanceIdAndByDateWhenProjectPersistanceIdIsUnknown() {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        
        Iteration iteration = iterationMapper.findByProjectPersistanceIdAndByDate(999, calendar.getTime());
    
		assertNull(iteration);
        
    }
    
    
    /**
     * Quand l'iteration est null, elle doit rester null
     */
    public void testAddOrUpdateWhenIterationIsNull() {
        
    }
    
    /**
     * Quand l'iterationId est �qual � z�ro, elle est positionn�e � null
     * Pour indiquer � hibernate qu'il n'y a pas d'association avec l'iteration
     */
    public void testAddOrUpdateWhenIterationIdEqualZero() {
        
    }
    
    /**
     * Pas de modification de l'iteration.
     */
    public void testAddOrUpdateWhenIterationIdSuperiorToZero() {
        
    }



//    /**
//     * test que la m�thode ne ram�ne pas le BasicProject
//     */
//    // TODO Comment le tester ??
//    public void testFindByProjectPersistanceIdDoesNotSelectBasicProject() {
//        
//    }

    
}
