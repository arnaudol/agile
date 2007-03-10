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

package net.sf.pmr.agilePlanning.data.release;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.MapperTestCase;
import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.release.ReleaseImpl;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;

import org.dbunit.dataset.ITable;
import org.springframework.dao.ConcurrencyFailureException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate3.HibernateJdbcException;
import org.springframework.orm.hibernate3.HibernateOptimisticLockingFailureException;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ReleaseMapperTest extends MapperTestCase {

    private ReleaseMapper releaseMapper;
    
    private Release release;
    
    private Release releaseToDelete;
    
    private Project project;
    
    private String number;
    
    private Date date;
    
    private int persistanceId;
    
    private long persistanceVersion;
    
    private Story story1;
    
    private Story story2;
    
    
    private final static String SELECT_FOR_UPDATE = "select * from PMRELEASE where number = '1A'";
    
    private final static String SELECT_FOR_DELETE = "select * from PMRELEASE where id = '4'";
    
    private final static String SELECT_FOR_ADD = "select * from PMRELEASE where number = '2B'";
    
    private final static String SELECT_BASICPROJECT= "select * from PROJECT where id = 2";
    
    private final static String SELECT_STORY1 = "select * from STORY where id = '1'";
    
    private final static String SELECT_STORY2 = "select * from STORY where id = '2'";
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // getBasicProjectMapper        
        releaseMapper = AgilePlanningObjectFactory.getReleaseMapper();
        
        // buid BasicProject
        project = new ProjectImpl();
        project.setPersistanceId(2);
        project.setPersistanceVersion(3);
        project.setCode("A");
        project.setName("Super A");
        
        // build release
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR, 1);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        
        date = calendar.getTime();
        
        number = "1A";
        persistanceId = 3;
        persistanceVersion = 4;

        release = new ReleaseImpl();
        
        release.setDate(date);
        release.setProject(project);
        release.setNumber(number);
        release.setPersistanceId(persistanceId);
        release.setPersistanceVersion(persistanceVersion);
        
        releaseToDelete = new ReleaseImpl();
        
        releaseToDelete.setDate(date);
        releaseToDelete.setProject(project);
        releaseToDelete.setNumber(number);
        releaseToDelete.setPersistanceId(4);
        releaseToDelete.setPersistanceVersion(5);
        
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
        assertTrue(AgilePlanningObjectFactory.isSingleton("releaseMapper"));
    }


    /**
     * Test de la mise à jour. Tout est ok.
     */
    public void testAddorUpdateWhenUpdatingWithoutStory() throws Exception{
        
        // update
        releaseMapper.addOrUpdate(release);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_FOR_UPDATE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("pro_id", new Integer(2), (Integer) databaseData.getValue(0, "pro_id"));
		assertEquals("number", number, databaseData.getValue(0, "number"));
		// TODO Comment comparer les dates ??		
		// assertEquals("date", date, (Date)databaseData.getValue(0, "date") );
		assertEquals("version", new Long(persistanceVersion + 1), (Long) databaseData.getValue(0, "version"));
        
    }
    
    /**
     * Test de l'ajout avec des stories. Tout est ok.
     */
    public void testAddOrUpdateWhenUpdatingWithStories() throws Exception {
        
    	release.setStories(new HashSet<Story>());
        release.getStories().add(story1);
        release.getStories().add(story2);
        
        // add
        releaseMapper.addOrUpdate(release);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_FOR_UPDATE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("pro_id", new Integer(2), (Integer) databaseData.getValue(0, "pro_id"));
		assertEquals("number", number, databaseData.getValue(0, "number"));
		// TODO Comment comparer les dates ??		
		// assertEquals("date", date, (Date)databaseData.getValue(0, "date") );
		assertEquals("version", new Long(persistanceVersion + 1), (Long) databaseData.getValue(0, "version"));
		
		// check the stories
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0, "id"));
		assertEquals("rel_id", new Integer(release.getPersistanceId()), (Integer) databaseData.getValue(0, "rel_id"));
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("id", new Integer(2), (Integer) databaseData.getValue(0, "id"));
		assertEquals("rel_id", new Integer(release.getPersistanceId()), (Integer) databaseData.getValue(0, "rel_id"));
        
    }

    
    /**
     * Test que la mise à jour d'une release ne met pas à jour les stories.
     */
    public void testAddOrUpdateDoesntUpdateStoriesWhenUpdating() throws Exception {

    	
    	release.setStories(new HashSet<Story>());
    	
    	// update stories
    	story1.setDescription("story1");
    	story2.setDescription("story2");
    	
    	// add stories to release
        release.getStories().add(story1);
        release.getStories().add(story2);
        
        releaseMapper.addOrUpdate(release);
        
		// check the stories
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0, "id"));
		assertEquals("description", "faire un report d'avancement des tâches à modifier", (String) databaseData.getValue(0, "description"));
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("id", new Integer(2), (Integer) databaseData.getValue(0, "id"));
		assertEquals("description", "faire une revue de code de l'iteration courant", (String) databaseData.getValue(0, "description"));
        
    }
    
    /**
     * Test que la mise à jour d'une release ne met pas à jour le projet.
     */
    public void testAddOrUpdateDoesntUpdateProjectWhenUpdating() throws Exception {
        
        // update
        release.getProject().setName("super B");
        
        releaseMapper.addOrUpdate(release);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);        
		assertEquals("number of row", 1, databaseData.getRowCount());
		assertEquals("name", "Super A", databaseData.getValue(0, "name"));
        
    }
   
    
    /**
     * Test de l'ajout sans story. Tout est ok.
     */
    public void testAddOrUpdateWhenAddingWithoutStory() throws Exception {
        
        release.setPersistanceId(0);
        release.setPersistanceVersion(0);
        release.setDate(new Date());
        release.setNumber("2B");
        
        // add
        releaseMapper.addOrUpdate(release);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_FOR_ADD);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("pro_id", new Integer(2), (Integer) databaseData.getValue(0, "pro_id"));
		assertEquals("number", "2B", databaseData.getValue(0, "number"));
		// TODO Comment tester les dates ???
		//assertEquals("date", date, (Date)databaseData.getValue(0, "date") );
		assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));
        
    }


    /**
     * Test de l'ajout avec des stories. Tout est ok.
     */
    public void testAddOrUpdateWhenAddingWithStories() throws Exception {
        
        release.setPersistanceId(0);
        release.setPersistanceVersion(0);
        release.setDate(new Date());
        release.setNumber("2B");
        release.setStories(new HashSet<Story>());
        
        release.getStories().add(story1);
        release.getStories().add(story2);
        
        // add
        releaseMapper.addOrUpdate(release);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_FOR_ADD);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("pro_id", new Integer(2), (Integer) databaseData.getValue(0, "pro_id"));
		assertEquals("number", "2B", databaseData.getValue(0, "number"));
		// TODO Comment tester les dates ???
		//assertEquals("date", date, (Date)databaseData.getValue(0, "date") );
		assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));
		
		// récupération des id pour tester que les stories ont bien cette nouvelle release
		Integer releasePersistanceId = (Integer) databaseData.getValue(0, "id");
		
		// check the stories
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0, "id"));
		assertEquals("rel_id", releasePersistanceId, (Integer) databaseData.getValue(0, "rel_id"));
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("id", new Integer(2), (Integer) databaseData.getValue(0, "id"));
		assertEquals("rel_id", releasePersistanceId, (Integer) databaseData.getValue(0, "rel_id"));
        
    }    
 
    
    /**
     * Test que l'ajout d'une release ne met pas à jour le projet.
     */
    public void testAddOrUpdateDoesntUpdateProjectWhenAdding() throws Exception {
        
        release.setPersistanceId(0);
        release.setPersistanceVersion(0);
        release.setNumber("2B");
        
        // update
        release.getProject().setName("super B");
        
        releaseMapper.addOrUpdate(release);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);        
		assertEquals("number of row", 1, databaseData.getRowCount());
		assertEquals("name", "Super A", databaseData.getValue(0, "name"));
        
        
    }

    
    /**
     * Test que l'ajout d'une relese ne met pas à jour les stories.
     */
    public void testAddOrUpdateDoesntUpdateStoriesWhenAdding() throws Exception {

        release.setPersistanceId(0);
        release.setPersistanceVersion(0);
        release.setNumber("2B");
    	
    	release.setStories(new HashSet<Story>());
    	
    	// update stories
    	story1.setDescription("story1");
    	story2.setDescription("story2");
    	
    	// add stories to release
        release.getStories().add(story1);
        release.getStories().add(story2);
        
        releaseMapper.addOrUpdate(release);
        
		// check the stories
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY1);
		assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0, "id"));
		assertEquals("description", "faire un report d'avancement des tâches à modifier", (String) databaseData.getValue(0, "description"));
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY2);
		assertEquals("id", new Integer(2), (Integer) databaseData.getValue(0, "id"));
		assertEquals("description", "faire une revue de code de l'iteration courant", (String) databaseData.getValue(0, "description"));
        
    }

    
    /**
     * Test quand le projet auquel on ajoute ou crée la release n'existe plus.
     */
    public void testAddOrUpdateWhenProjectDoesNotExists() {
        
        Project project = new ProjectImpl();
        project.setPersistanceId(999);
        project.setPersistanceVersion(888);
        release.setProject(project);
        
        //update
        try {
            releaseMapper.addOrUpdate(release);
            fail("should throw a DataIntegrityViolationException ");
        } catch (DataIntegrityViolationException  dataIntegrityViolationException) {
           
        }
        
    }
    
    /**
     * Test quand le projet auquel on ajoute ou crée la release est null
     */    
    public void testAddOrUpdateWhenProjectIsNull() {

        release.setProject(null);
        
        //update
        try {
            releaseMapper.addOrUpdate(release);
            fail("should throw a DataIntegrityViolationException");
        } catch (HibernateJdbcException hibernateJdbcException) {
           
        }
        
    }
    
    /**
     * Test quand une story que l'on ajoute à la release n'existe pas.
     */
    public void testAddOrUpdateWhenStoryDoesNotExists() {
        
    	release.setStories(new HashSet<Story>());
    	
    	// update stories
		story2.setPersistanceId(999);
		story2.setPersistanceVersion(100);
		story2.setShortDescription("story2");
		story2.setDescription("story2");
    	
    	// add stories to release
        release.getStories().add(story1);
        release.getStories().add(story2);
        
        
        //update
        try {
            releaseMapper.addOrUpdate(release);
            fail("should throw a hibernateOptimisticLockingFailureException");
        } catch (HibernateOptimisticLockingFailureException  hibernateOptimisticLockingFailureException) {

        } catch (Exception e) {
        	fail("should throw a hibernateOptimisticLockingFailureException");
		}
        
    }

    /**
     * Test quand une story que l'on ajoute à la release est null.
     */
    public void testAddOrUpdateWhenStoryIsNull() {
        
    	release.setStories(new HashSet<Story>());
    	
    	// update stories
		story2 = null;
    	
    	// add stories to release
        release.getStories().add(story1);
        release.getStories().add(story2);
        
        
        //update
        try {
            releaseMapper.addOrUpdate(release);
            fail("should throw a HibernateOptimisticLockingFailureException");
        } catch (HibernateOptimisticLockingFailureException  hibernateOptimisticLockingFailureException) {

        } catch (Exception e) {
            fail("should throw a HibernateOptimisticLockingFailureException");
		}
        
    }

    
    /**
     * test que la concurrence d'accès fonctionnne.
     */
    public void testAddOrUpdateWithConcurrencyFailureException() {

        release.setPersistanceVersion(1);
        
        // update
        try {
            releaseMapper.addOrUpdate(release);
            fail("should throw a ConcurrencyFailureException");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
           
        }
        
    }
    

    /**
     * test le delete.
     */
    public void testDeleteWhenReleaseExists() throws Exception {
        
        releaseMapper.delete(releaseToDelete);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_FOR_DELETE);        
		assertEquals("number of row", 0, databaseData.getRowCount());
        
    }
    
    /**
     * test le delete sur une release qui n'existe pas
     */
    public void testDeleteWhenReleaseDoesNotExists() {
        
        release.setPersistanceId(999);
        release.setPersistanceVersion(888);
        release.setNumber("3C");
        
        try {
            releaseMapper.delete(release);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
        }
  
    }
        
     /**
      * test le delete
      */
    public void testDeleteWhenReleaseHaveBeenUpdated() {
        
        releaseToDelete.setPersistanceVersion(1);
        
        try {
            releaseMapper.delete(releaseToDelete);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
        }
  
    }

    
    /**
     * test le delete ne supprime pas le projet
     */
    public void testDeleteDoesNotDeleteProjet() throws Exception {
        
        releaseMapper.delete(releaseToDelete);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);        
		assertEquals("number of row", 1, databaseData.getRowCount());
        
    }
    
    /**
     * test le delete ne supprime pas les stories.
     */
    public void testDeleteDoesNotDeleteStories() throws Exception {
        
    	// TODO ce test ne fonctionne pas !!
    	
    	release.setStories(new HashSet<Story>());
    	
    	release.getStories().add(story1);
    	release.getStories().add(story2);
        
        // TODO voir comment supprimer le lien (et pas d'exception)
    	
        try {
        	releaseMapper.delete(release);
            fail("should throw a dataIntegrityViolationException");
        } catch (DataIntegrityViolationException dataIntegrityViolationException) {
        }
        
        
    }

    /**
     * test quand l'itération est trouvée.
     */
    public void testFindByIdWhenReleaseIsFound() {
        
        Release release = (Release) releaseMapper.findById(3);
        
        assertEquals("1", release.getNumber());
        //TODO Comment tester les dates ??
//        assertEquals(date, release.getDate());
        assertEquals(persistanceId, release.getPersistanceId());
        assertEquals(persistanceVersion, release.getPersistanceVersion());
        
    }
    
    
    /**
     * test quand l'itération n'est pas trouvée.
     */
    public void testFindByIdWhenReleaseIsNotFound(){
        
        Release release = (Release) releaseMapper.findById(555);
        
        assertNull(release);
        
    }

    /**
     * test que le findById ne ramène pas le BasicProjet
     */
    // TODO Comment le tester ??
//    public void testFindByIdDoesNotSelectBasicProject(){
//        
//    }

    /**
     * test quand la release est trouvée. 
     */
    public void testFindByProjectPersistanceIdWhenReleaseIsFound() {

        Set set = releaseMapper.findByProjectPersistanceId(1);
        
        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            Release release = (Release) iterator.next();
        
            assertEquals("RA", release.getNumber());
            // TODO Comment tester ???
            
//            assertEquals(date, release.getDate());
            assertEquals(persistanceId, release.getPersistanceId());
            assertEquals(persistanceVersion, release.getPersistanceVersion());

            break;
            
        }
        
    }
    
    /**
     * test quand la release n'est pas trouvée.
     */
    public void testFindByProjectPersistanceIdWhenReleaseIsNotFound() {

        Set set = releaseMapper.findByProjectPersistanceId(999);
        
        assertEquals(0, set.size());
        
    }


    /**
     * test que la méthode ne ramène pas le BasicProject
     */
    // TODO Comment le tester ??
//    public void testFindByProjectPersistanceIdDoesNotSelectBasicProject() {
//        
//    }

    
    /**
     * Test de la recherche de la release d'une iteration (on prend la prochaine release par rapport à la date de fin de l'itération)
     * test quand l'itération est trouvée.
     */
    public void testFindByIterationIdWhenReleaseIsFound() {
        
    	// cherche de la release pour l'iteration 1
        Release release = (Release) releaseMapper.findByIterationPersistanceId(2, 1);
        
        // l'iteration est trouvée
        assertEquals(3, release.getPersistanceId());
        assertEquals("1", release.getNumber());
        assertEquals(4, release.getPersistanceVersion());
        
    }
    
    
    /**
     * Test de la recherche de la release d'une iteration (on prend la prochaine release par rapport à la date de fin de l'itération) 
     * test quand l'itération n'est pas trouvée.
     */
    public void testFindByIterationIdWhenReleaseIsNotFound(){
        
        Release release = (Release) releaseMapper.findByIterationPersistanceId(2, 2);
        
        assertNull(release);
        
    }
    
    
}
