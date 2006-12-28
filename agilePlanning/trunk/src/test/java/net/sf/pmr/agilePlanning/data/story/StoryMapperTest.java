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

package net.sf.pmr.agilePlanning.data.story;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.MapperTestCase;
import net.sf.pmr.agilePlanning.domain.story.BusinessValue;
import net.sf.pmr.agilePlanning.domain.story.BusinessValueImpl;
import net.sf.pmr.agilePlanning.domain.story.RiskLevel;
import net.sf.pmr.agilePlanning.domain.story.RiskLevelImpl;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.TaskImpl;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.agilePlanning.domain.story.task.charge.ChargeImpl;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;

import org.dbunit.dataset.ITable;
import org.springframework.dao.ConcurrencyFailureException;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * $Header: /cvsroot/pmr/AgilePlanning/src/test/java/net/sf/pmr/agilePlanning/data/story/StoryMapperTest.java,v 1.1 2006/02/08 20:17:54 aprost Exp $
 */
public class StoryMapperTest extends MapperTestCase {

    private StoryMapper storyMapper;
    
    private Story storyToUpdate;
    
    private Story storyToAdd;
    
    private BusinessValue businessValue;
    
    private RiskLevel riskLevel;
    
    private Task task1ToUpdate;
    
    private Task task2ToUpdate;
    
    private Task task1ToAdd;
    
    private Task task2ToAdd;
    
    private Charge charge1ToUpdate;
    
    private Charge charge2ToUpdate;
    
    private User userForChargeToUpdate;
    
    private User userForChargeToAdd;

    private Charge charge1ToAdd;
    
    private Charge charge2ToAdd;
    
    private Project project;
    
    private static final String SELECT_STORY_TO_UPDATE  = "select * from STORY where id = 1";
    
    private static final String SELECT_STORY_TO_ADD  = "select * from STORY where description = 'statistiques'";
    
    private static final String SELECT_TASK1_TO_UPDATE  = "select * from TASK where id = 1";
    
    private static final String SELECT_TASK2_TO_UPDATE  = "select * from TASK where id = 2";
    
    private static final String SELECT_TASK1_TO_ADD  = "select * from TASK where shortDescription = 'première tâche ajoutée'";
    
    private static final String SELECT_TASK2_TO_ADD  = "select * from TASK where shortDescription = 'seconde tâche ajoutée'";
    
    private static final String SELECT_CHARGE1_TO_UPDATE  = "select * from CHARGE where id = 1";
    
    private static final String SELECT_CHARGE2_TO_UPDATE  = "select * from CHARGE where id = 2";

    private static final String SELECT_CHARGE1_TO_ADD  = "select * from CHARGE where daysneededtofinish = 98";
    
    private static final String SELECT_CHARGE2_TO_ADD  = "select * from CHARGE where daysneededtofinish = 99";
        
    private static final String SELECT_BASICPROJECT = "select * from PROJECT where id = 2";
    
    private static final String SELECT_BUSINESSVALUE = "select * from BUSINESSVALUE where id = 1";
    
    private static final String SELECT_RISKLEVEL = "select * from RISKLEVEL where id = 2";
    
    private static final String SELECT_USER1  = "select * from PMUSER where id = 1";
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        storyMapper = AgilePlanningObjectFactory.getStoryMapper();
        
        // build basic project
        project = new ProjectImpl();
        project.setCode("A");
        project.setName("Super A");
        project.setPersistanceId(2);
        project.setPersistanceVersion(3);
        
        // BusinessValue
        businessValue = new BusinessValueImpl();
        businessValue.setId(1);
        businessValue.setDescription("HIGH");
        
        // RiskLevel
        riskLevel = new RiskLevelImpl();
        riskLevel.setId(2);
        riskLevel.setDescription("MEDIUM");
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DAY_OF_MONTH, 27);
        
        // tasks to update
        task1ToUpdate = new TaskImpl();
        task1ToUpdate.setOwner(null);
        task1ToUpdate.setDaysEstimated(60);
        task1ToUpdate.setPersistanceId(1);
        task1ToUpdate.setPersistanceVersion(2);
        task1ToUpdate.setShortDescription("première tâche");
        
        task2ToUpdate = new TaskImpl();
        task2ToUpdate.setOwner(null);
        task2ToUpdate.setDaysEstimated(40);
        task2ToUpdate.setPersistanceId(2);
        task2ToUpdate.setPersistanceVersion(3);
        task2ToUpdate.setShortDescription("seconde tâche");

        // Set of task
        Set<Task> tasksToUpdate = new HashSet<Task>();
        tasksToUpdate.add(task1ToUpdate);
        tasksToUpdate.add(task2ToUpdate);
        
        // charge to update
        charge1ToUpdate = new ChargeImpl();

        calendar = Calendar.getInstance();
        
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 03);
        
        userForChargeToUpdate = new UserImpl();
        userForChargeToUpdate.setPersistanceId(2);
        userForChargeToUpdate.setPersistanceVersion(1);

        charge1ToUpdate.setPersistanceId(1);
        charge1ToUpdate.setDay(calendar.getTime());
        charge1ToUpdate.setTimeUsedToday(2);
        charge1ToUpdate.setDaysNeededToFinish(4);
        charge1ToUpdate.setUser(userForChargeToUpdate);
        charge1ToUpdate.setPersistanceVersion(2);
        
        charge2ToUpdate = new ChargeImpl();
        
        calendar = Calendar.getInstance();
        
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 04);
        
        charge2ToUpdate.setPersistanceId(2);
        charge2ToUpdate.setDay(calendar.getTime());
        charge2ToUpdate.setTimeUsedToday(1);
        charge2ToUpdate.setDaysNeededToFinish(2);
        charge2ToUpdate.setUser(userForChargeToUpdate);
        charge2ToUpdate.setPersistanceVersion(2);
        
        Set<Charge> chargesToUpdate = new HashSet<Charge>();
        chargesToUpdate.add(charge1ToUpdate);
        chargesToUpdate.add(charge2ToUpdate);
        
        // add the charges to task1
        task1ToUpdate.setCharges(chargesToUpdate);
        
        // Story to Update
        storyToUpdate = new StoryImpl();
        storyToUpdate.setProject(project);
        storyToUpdate.setDescription("faire un report d'avancement des tâches");
        storyToUpdate.setDaysEstimated(4);
        storyToUpdate.setPersistanceId(1);
        storyToUpdate.setPersistanceVersion(2);
        storyToUpdate.setShortDescription("avancement des tâches");
        storyToUpdate.setTasks(tasksToUpdate);
        storyToUpdate.setBusinessValue(businessValue);
        storyToUpdate.setRiskLevel(riskLevel);

        // tasks to add
        task1ToAdd = new TaskImpl();
        task1ToAdd.setOwner(null);
        task1ToAdd.setDaysEstimated(8);
        task1ToAdd.setPersistanceId(0);
        task1ToAdd.setPersistanceVersion(0);
        task1ToAdd.setShortDescription("première tâche ajoutée");
        
        task2ToAdd = new TaskImpl();
        task2ToAdd.setOwner(null);
        task2ToAdd.setDaysEstimated(9);
        task2ToAdd.setPersistanceId(0);
        task2ToAdd.setPersistanceVersion(0);
        task2ToAdd.setShortDescription("seconde tâche ajoutée");
        
        // Set of task
        Set<Task> setToAdd = new HashSet<Task>();
        setToAdd.add(task1ToAdd);
        setToAdd.add(task2ToAdd);
        
        // charge to add
        charge1ToAdd = new ChargeImpl();

        calendar = Calendar.getInstance();
        
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 03);
        
        userForChargeToAdd = new UserImpl();
        userForChargeToAdd.setPersistanceId(1);
        userForChargeToAdd.setPersistanceVersion(2);

        charge1ToAdd.setPersistanceId(0);
        charge1ToAdd.setDay(calendar.getTime());
        charge1ToAdd.setTimeUsedToday(1);
        charge1ToAdd.setDaysNeededToFinish(98);
        charge1ToAdd.setUser(userForChargeToAdd);
        charge1ToAdd.setPersistanceVersion(0);
        
        charge2ToAdd = new ChargeImpl();
        
        calendar = Calendar.getInstance();
        
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 04);
        
        charge2ToAdd.setPersistanceId(0);
        charge2ToAdd.setDay(calendar.getTime());
        charge2ToAdd.setTimeUsedToday(2);
        charge2ToAdd.setDaysNeededToFinish(99);
        charge2ToAdd.setUser(userForChargeToAdd);
        charge2ToAdd.setPersistanceVersion(0);
        
        Set<Charge> chargesToAdd = new HashSet<Charge>();
        chargesToAdd.add(charge1ToAdd);
        chargesToAdd.add(charge2ToAdd);
        
        // add the charges to task1
        task1ToAdd.setCharges(chargesToAdd);
                
        // Story to Add
        storyToAdd = new StoryImpl();
        storyToAdd.setProject(project);
        storyToAdd.setDescription("statistiques");
        storyToAdd.setDaysEstimated(5);
        storyToAdd.setPersistanceId(0);
        storyToAdd.setPersistanceVersion(0);
        storyToAdd.setShortDescription("statistiques d'avancement");
        storyToAdd.setTasks(setToAdd);
        storyToAdd.setBusinessValue(businessValue);
        storyToAdd.setRiskLevel(riskLevel);
        
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
        assertTrue(AgilePlanningObjectFactory.isSingleton("storyMapper"));
    }

    
    /**
     * Test de la mise à jour. Toutes les colonnes doivent être mises à jour pour:
     * <ul>
     * <li>la story</li>
     * <li>la ou les tâches associées</li>
     * <li>La ou les charges associées aux tâches</li>
     * </ul> 
     */
    public void testAddorUpdateWhenUpdating() throws Exception {
        
        long storyPersistanceVersion = storyToUpdate.getPersistanceVersion() + 1;
        long task1PersistanceVersion = task1ToUpdate.getPersistanceVersion() + 1;
        long task2PersistanceVersion = task2ToUpdate.getPersistanceVersion() + 1;
        
        long charge1PersistanceVersion = charge1ToUpdate.getPersistanceVersion() + 1;
        long charge2PersistanceVersion = charge2ToUpdate.getPersistanceVersion() + 1;
        
        // update
        storyMapper.addOrUpdate(storyToUpdate);
        
        // check story
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY_TO_UPDATE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(storyToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals("pro_id", new Integer(storyToUpdate.getProject().getPersistanceId()), (Integer) databaseData.getValue(0, "pro_id"));
		assertEquals("description", storyToUpdate.getDescription(), (String) databaseData.getValue(0, "description")); 
		assertEquals("daysestimated", new Double(storyToUpdate.getDaysEstimated()), new Double(databaseData.getValue(0, "daysestimated").toString()));
        assertEquals("bus_id", new Integer(storyToUpdate.getBusinessValue().getId()),  (Integer) databaseData.getValue(0, "bus_id"));
        assertEquals("ris_id", new Integer(storyToUpdate.getRiskLevel().getId()),  (Integer) databaseData.getValue(0, "ris_id"));
		assertEquals("shortdescription", storyToUpdate.getShortDescription(), (String) databaseData.getValue(0, "shortdescription"));
	    assertEquals("version", new Long(storyPersistanceVersion), (Long) databaseData.getValue(0, "version"));
	    
	    // chek tasks

	    // task1
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TASK1_TO_UPDATE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(task1ToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals("pmu_id", task1ToUpdate.getOwner(), databaseData.getValue(0, "pmu_id"));
		assertEquals("daysestimated", new Double(task1ToUpdate.getDaysEstimated()), new Double( databaseData.getValue(0, "daysestimated").toString()));
		assertEquals("shortdescription", task1ToUpdate.getShortDescription(), (String) databaseData.getValue(0, "shortdescription"));
		assertEquals("version", new Long(task1PersistanceVersion), (Long) databaseData.getValue(0, "version"));
		
	    // task2
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TASK2_TO_UPDATE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(task2ToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals("pmu_id", task2ToUpdate.getOwner(), databaseData.getValue(0, "pmu_id"));
		assertEquals("daysestimated", new Double(task2ToUpdate.getDaysEstimated()), new Double (databaseData.getValue(0, "daysestimated").toString()));
		assertEquals("shortdescription", task2ToUpdate.getShortDescription(), (String) databaseData.getValue(0, "shortdescription"));
		assertEquals("version", new Long(task2PersistanceVersion), (Long) databaseData.getValue(0, "version"));
		
		
		// charge 1
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_CHARGE1_TO_UPDATE);
		
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(charge1ToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals("tas_id", new Integer(task1ToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "tas_id"));
		assertEquals("pmu_id", new Integer(charge1ToUpdate.getUser().getPersistanceId()), (Integer) databaseData.getValue(0, "pmu_id"));
		assertEquals("day", charge1ToUpdate.getDay(), (Date) databaseData.getValue(0, "day"));
		assertEquals("timeused", new Double(charge1ToUpdate.getTimeUsedToday()), new Double (databaseData.getValue(0, "timeused").toString()));
		assertEquals("daysneededtofinish", new Double(charge1ToUpdate.getDaysNeededToFinish()), new Double (databaseData.getValue(0, "daysneededtofinish").toString()));
		assertEquals("version", new Long(charge1PersistanceVersion), (Long) databaseData.getValue(0, "version"));

		// charge 2
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_CHARGE2_TO_UPDATE);
		
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(charge2ToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals("tas_id", new Integer(task1ToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "tas_id"));
		assertEquals("pmu_id", new Integer(charge2ToUpdate.getUser().getPersistanceId()), (Integer) databaseData.getValue(0, "pmu_id"));
		assertEquals("day", charge2ToUpdate.getDay(), (Date) databaseData.getValue(0, "day"));
		assertEquals("timeused", new Double(charge2ToUpdate.getTimeUsedToday()), new Double (databaseData.getValue(0, "timeused").toString()));
		assertEquals("daysneededtofinish", new Double(charge2ToUpdate.getDaysNeededToFinish()), new Double (databaseData.getValue(0, "daysneededtofinish").toString()));
		assertEquals("version", new Long(charge2PersistanceVersion), (Long) databaseData.getValue(0, "version"));

        
    }
    
    
    /**
     * Test du bon fonctionnement de la concurrence d'acc�s lors de la mise �
     * jour sur la story
     */
    public void testAddorUpdateWhenUpdatingWithConcurrencyFailureExceptionOnStory()
            throws Exception {

        storyToUpdate.setPersistanceVersion(1);

        // update
        try {
            storyMapper.addOrUpdate(storyToUpdate);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException concurrencyFailureException) {

        }
    }
    
    
    /**
     * Test du bon fonctionnement de la concurrence d'acc�s lors de la mise �
     * jour sur les tasks
     */
    public void testAddorUpdateWhenUpdatingWithConcurrencyFailureExceptionOnTask()
            throws Exception {

        task1ToUpdate.setPersistanceVersion(1);

        // update
        try {
            storyMapper.addOrUpdate(storyToUpdate);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException concurrencyFailureException) {

        }
    }
    
    /**
     * Test du bon fonctionnement de la concurrence d'acc�s lors de la mise �
     * jour sur les charges
     */
    public void testAddorUpdateWhenUpdatingWithConcurrencyFailureExceptionOnCharge()
            throws Exception {

        charge1ToUpdate.setPersistanceVersion(1);

        // update
        try {
            storyMapper.addOrUpdate(storyToUpdate);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException concurrencyFailureException) {

        }
    }


    /**
     * Test lors d'une modification, que le projet li� n'est pas mis � jour.
     */
    public void testAddorUpdateWhenUpdatingDoesNotUpdateBasicProject()
            throws Exception {

        // modify BasicProjet
        storyToUpdate.getProject().setName("bordel!");
        
        // update
        storyMapper.addOrUpdate(storyToUpdate);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("name", "Super A", databaseData.getValue(0, "name"));

    }
    
    /**
     * Test lors d'une modification, que la business value n'est pas mise � jour
     */
    public void testAddorUpdateWhenUpdatingDoesNotUpdateBusinessValue()
            throws Exception {
        
        // modify BasicProjet
        storyToUpdate.getBusinessValue().setDescription("scooby");
        
        // update
        storyMapper.addOrUpdate(storyToUpdate);
        
        // check
        ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BUSINESSVALUE);
        
        assertEquals("number of row", 1, databaseData.getRowCount());
        
        assertEquals("description", "HIGH", databaseData.getValue(0, "description"));
    }
 
    
    /**
     * Test lors d'une modification, que le risk level n'est pas mis � jour
     */
    public void testAddorUpdateWhenUpdatingDoesNotUpdateRiskLevel()
            throws Exception {
        
        // modify BasicProjet
        storyToUpdate.getRiskLevel().setDescription("superman");
        
        // update
        storyMapper.addOrUpdate(storyToUpdate);
        
        // check
        ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_RISKLEVEL);
        
        assertEquals("number of row", 1, databaseData.getRowCount());
        
        assertEquals("description", "MEDIUM", databaseData.getValue(0, "description"));
    }
    
    
    /**
     * Test lors d'une modification, que le user de la charge n'est pas mis � jour
     */
    public void testAddorUpdateWhenUpdatingDoesNotUpdateChargeUser()
            throws Exception {
    	
        // modify charge user
    	userForChargeToUpdate.setFirstName("CROCODILE DUNDEE");
        
        // update
        storyMapper.addOrUpdate(storyToUpdate);
        
        // check
        ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_USER1);
        
        assertEquals("number of row", 1, databaseData.getRowCount());
        
        assertEquals("firstname", "Pon", databaseData.getValue(0, "firstname"));
    }

    
    
    /**
     * Test de l'ajout. Toutes les colonnes doivent �tre renseign�es
     */
    public void testAddOrUpdateWhenAdding() throws Exception {
        
        // update
        storyMapper.addOrUpdate(storyToAdd);
        
        // check story
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY_TO_ADD);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(storyToAdd.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals("pro_id", new Integer(storyToAdd.getProject().getPersistanceId()), (Integer) databaseData.getValue(0, "pro_id"));
		assertEquals("description", storyToAdd.getDescription(), (String) databaseData.getValue(0, "description")); 
		assertEquals("daysestimated", new Double(storyToAdd.getDaysEstimated()), new Double(databaseData.getValue(0, "daysestimated").toString()));
        assertEquals("bus_id", new Integer(storyToAdd.getBusinessValue().getId()),  (Integer) databaseData.getValue(0, "bus_id"));
        assertEquals("ris_id", new Integer(storyToAdd.getRiskLevel().getId()),  (Integer) databaseData.getValue(0, "ris_id"));
		assertEquals("shortdescription", storyToAdd.getShortDescription(), (String) databaseData.getValue(0, "shortdescription"));
	    assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));
	    
	    // chek tasks

	    // task1
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TASK1_TO_ADD);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("pmu_id", task1ToAdd.getOwner(), databaseData.getValue(0, "pmu_id"));
		assertEquals("daysestimated", new Double(task1ToAdd.getDaysEstimated()), new Double(databaseData.getValue(0, "daysestimated").toString()));
		assertEquals("shortdescription", task1ToAdd.getShortDescription(), (String) databaseData.getValue(0, "shortdescription"));
		assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));
		
	    // task2
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TASK2_TO_ADD);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("pmu_id", task2ToAdd.getOwner(), databaseData.getValue(0, "pmu_id"));
		assertEquals("daysestimated", new Double(task2ToAdd.getDaysEstimated()), new Double(databaseData.getValue(0, "daysestimated").toString()));
		assertEquals("shortdescription", task2ToAdd.getShortDescription(), (String) databaseData.getValue(0, "shortdescription"));
		assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));

		// check charge
		
		// charge 1
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_CHARGE1_TO_ADD);
		
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(charge1ToAdd.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		// TODO comment tester cela ?
		// assertEquals("tas_id", new Integer(task1ToAdd.getPersistanceId()), (Integer) databaseData.getValue(0, "tas_id"));
		assertEquals("pmu_id", new Integer(charge1ToAdd.getUser().getPersistanceId()), (Integer) databaseData.getValue(0, "pmu_id"));
		assertEquals("day", charge1ToAdd.getDay(), (Date) databaseData.getValue(0, "day"));
		assertEquals("timeused", new Double(charge1ToAdd.getTimeUsedToday()), new Double (databaseData.getValue(0, "timeused").toString()));
		assertEquals("daysneededtofinish", new Double(charge1ToAdd.getDaysNeededToFinish()), new Double (databaseData.getValue(0, "daysneededtofinish").toString()));
		assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));

		// charge 2
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_CHARGE2_TO_ADD);
		
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer(charge2ToAdd.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		// TODO comment tester cela ?
		//assertEquals("tas_id", new Integer(task1ToAdd.getPersistanceId()), (Integer) databaseData.getValue(0, "tas_id"));
		assertEquals("pmu_id", new Integer(charge2ToAdd.getUser().getPersistanceId()), (Integer) databaseData.getValue(0, "pmu_id"));
		assertEquals("day", charge2ToAdd.getDay(), (Date) databaseData.getValue(0, "day"));
		assertEquals("timeused", new Double(charge2ToAdd.getTimeUsedToday()), new Double (databaseData.getValue(0, "timeused").toString()));
		assertEquals("daysneededtofinish", new Double(charge2ToAdd.getDaysNeededToFinish()), new Double (databaseData.getValue(0, "daysneededtofinish").toString()));
		assertEquals("version", new Long(0), (Long) databaseData.getValue(0, "version"));


    }
    
    /**
     * Test du bon fonctionnement de la concurrence d'acc�s lors de l'ajout.
     */
    public void testAddorUpdateWhenAddingDoesNotThrowConcurrencyFailureException()
            throws Exception {

        storyToUpdate.setPersistanceId(0);
        storyToUpdate.setPersistanceVersion(0);

        // add
        try {
            storyMapper.addOrUpdate(storyToUpdate);
        } catch (ConcurrencyFailureException concurrencyFailureException) {
            fail("should not throw a concurrency failure exception");
        }
    }
    
    /**
     * Test lors d'un ajout, que le projet li� n'est pas mis � jour.
     */
    public void testAddorUpdateWhenAddingDoesNotUpdateBasicProject()
            throws Exception {

        // modify BasicProjet
        storyToAdd.getProject().setName("bordel!");
        
        // add
        storyMapper.addOrUpdate(storyToAdd);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("name", "Super A", databaseData.getValue(0, "name"));

    }
    
    /**
     * Test lors d'un ajout, que la business value n'est pas mise � jour
     */
    public void testAddorUpdateWhenAddingDoesNotUpdateBusinessValue()
            throws Exception {

        // modify BasicProjet
        storyToAdd.getBusinessValue().setDescription("doo");
        
        // add
        storyMapper.addOrUpdate(storyToAdd);
        
        // check
        ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BUSINESSVALUE);
        
        assertEquals("number of row", 1, databaseData.getRowCount());
        
        assertEquals("description", "HIGH", databaseData.getValue(0, "description"));

    }
    
    /**
     * Test lors d'un ajout, que le risk level n'est pas mis � jour
     */
    public void testAddorUpdateWhenAddingDoesNotUpdateRiskLevel()
            throws Exception {

        // modify BasicProjet
        storyToAdd.getRiskLevel().setDescription("spiderman");
        
        // add
        storyMapper.addOrUpdate(storyToAdd);
        
        // check
        ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_RISKLEVEL);
        
        assertEquals("number of row", 1, databaseData.getRowCount());
        
        assertEquals("description", "MEDIUM", databaseData.getValue(0, "description"));

    }
    
    /**
     * Test lors d'un ajout, que le user de la charge n'est pas mis � jour
     */
    public void testAddorUpdateWhenAddingDoesNotUpdateChargeUser()
            throws Exception {
    	
        // modify charge user
    	userForChargeToAdd.setFirstName("CROCODILE DUNDEE");
        
        // update
        storyMapper.addOrUpdate(storyToAdd);
        
        // check
        ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_USER1);
        
        assertEquals("number of row", 1, databaseData.getRowCount());
        
        assertEquals("firstname", "Pon", databaseData.getValue(0, "firstname"));
    }


    
    /**
     * Test le delete. la story doit �tre supprim� de la table, ainsi 
     * <ul>
     * <li>les t�ches</li>
     * <li>les charges</li>
     * </ul>
     */
    public void testDelete() throws Exception {
        
        // delete
        storyMapper.delete(storyToUpdate);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_STORY_TO_UPDATE);
        
		assertEquals("number of row", 0, databaseData.getRowCount());
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TASK1_TO_UPDATE);
        
		assertEquals("number of row", 0, databaseData.getRowCount());
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TASK2_TO_UPDATE);
        
		assertEquals("number of row", 0, databaseData.getRowCount());
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_CHARGE1_TO_UPDATE);
        
		assertEquals("number of row", 0, databaseData.getRowCount());
		
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_CHARGE2_TO_UPDATE);
        
		assertEquals("number of row", 0, databaseData.getRowCount());
		
		
        
    }
    
    /**
     * test le delete quand la story n'est pas en base: concurrence d'acc�s
     */
    public void testDeleteWhenStoryDoesNotExists() {
        
        //delete
        try {
            storyMapper.delete(storyToAdd);
            fail("should throw a concurrencyFailureException");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
        }
        
    }
    
    /**
     * test le delete quand la story a �t� modifi�e entre temps
     */
    public void testDeleteWhenStoryHaveBeenModified() {
        
        storyToUpdate.setPersistanceVersion(1);
        
        //delete
        try {
            storyMapper.delete(storyToUpdate);
            fail("should throw a concurrencyFailureException");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
        }
        
    }
    
    /**
     * test le delete quand la task a �t� modifi�e entre temps
     */
    public void testDeleteWhenTaskHaveBeenModified() {
        
        for (Iterator iterator = storyToUpdate.getTasks().iterator(); iterator.hasNext();) {
            Task task = (Task) iterator.next();
            
            task.setPersistanceVersion(1);
            
            break;
        }
        
        //delete
        try {
            storyMapper.delete(storyToUpdate);
            fail("should throw a concurrencyFailureException");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
        }
        
    }
    
    /**
     * test le delete quand la charge a �t� modifi�e entre temps
     */
    public void testDeleteWhenChargeHaveBeenModified() {
        
   		task1ToUpdate.setPersistanceVersion(1);
   		task2ToUpdate.setPersistanceVersion(1);    	
        
        //delete
        try {
            storyMapper.delete(storyToUpdate);
            fail("should throw a concurrencyFailureException");
        } catch (ConcurrencyFailureException concurrencyFailureException) {
        }
        
    }
    
    /**
     * test le delete ne supprime pas le projet
     */
    public void testDeleteDoesNotDeleteProject() throws Exception {
        
        storyMapper.delete(storyToUpdate);
        
        // check
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT);
        
		assertEquals("number of row", 1, databaseData.getRowCount());
        
    }
    
    
    /**
     * test le delete ne supprime pas la business value
     */
    public void testDeleteDoesNotDeleteBusinessValue() throws Exception {
        
        storyMapper.delete(storyToUpdate);
        
        // check
        ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BUSINESSVALUE);
        
        assertEquals("number of row", 1, databaseData.getRowCount());
        
    }
    
    /**
     * test le delete ne supprime pas le risklvel
     */
    public void testDeleteDoesNotDeleteRiskLevel() throws Exception {
        
        storyMapper.delete(storyToUpdate);
        
        // check
        ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_RISKLEVEL);
        
        assertEquals("number of row", 1, databaseData.getRowCount());
        
    }

    /**
     * Test de la recherche des stories qui ne sont pas dans une release.
     * Quand aucune story n'est trouvée : doit retourner une list vide.
     */
    public void testFindStoriesWhichAreNotInRelease() {
    	
    	Set<Story> stories = storyMapper.findStoriesWhichAreNotInARelease(2);
    	
    	// deux stories sont trouvées 
    	assertEquals(2, stories.size());
    	
        // Story to Update
        Story story1 = new StoryImpl();
        story1.setProject(project);
        story1.setDescription("faire un report d'avancement des tâches à modifier");
        story1.setDaysEstimated(10);
        story1.setPersistanceId(1);
        story1.setPersistanceVersion(2);
        story1.setShortDescription("avancement des tâches à modifier");
        story1.setBusinessValue(businessValue);
        story1.setRiskLevel(riskLevel);

        Story story2 = new StoryImpl();
        story2.setProject(project);
        story2.setDescription("faire une revue de code de l'iteration courant");
        story2.setDaysEstimated(1);
        story2.setPersistanceId(2);
        story2.setPersistanceVersion(2);
        story2.setShortDescription("revue de code");
        story2.setBusinessValue(businessValue);
        story2.setRiskLevel(riskLevel);
    	
    	// ... et sont dans la liste
    	assertTrue(stories.contains(story1));
        assertTrue(stories.contains(story2));
    	
    }
        
    /**
     * test quand la story est trouvée.
     */
    public void testFindByIdWhenStoryIsFound() {

    	// TODO : A faire
    	
//        Story story = (Story) storyMapper.findById(storyToUpdate.getPersistanceId());
//		
//		assertEquals("id", storyToUpdate.getPersistanceId(), story.getPersistanceId());
//		
//		// test du lazy loading sur le project
//		try {
//			story.getBasicProject().getCode();
//			fail("doit retourner une LazyInitializationException");
//		} catch (LazyInitializationException lazyInitializationException) {
//			// TODO: handle exception
//		} catch (Exception e) {
//			fail("doit retourner une LazyInitializationException");
//		}
//		
//		
//		assertEquals("description", "faire un report d'avancement des tâches à modifier", story.getDescription()); 
//		assertEquals("daysestimated", Double.valueOf("10.0") , story.getDaysEstimated());
//        assertEquals("businessValue", storyToUpdate.getBusinessValue().getId(),  story.getBusinessValue().getId());
//        assertEquals("riskLevel", storyToUpdate.getRiskLevel().getId(),  story.getRiskLevel().getId());
//		assertEquals("shortdescription", "avancement des tâches à modifier", story.getShortDescription());
//		assertEquals("number of tasks", storyToUpdate.getTasks().size(), story.getTasks().size());
//		
//		int numberOfCharge = 0;
//
//		for (Task task : story.getTasks()) {
//			numberOfCharge = numberOfCharge + task.getCharges().size();
//		}
//		
//		assertEquals("number of charges", task1ToUpdate.getCharges().size()  , numberOfCharge);
                
    }
    
    /**
     * test quand la story n'est pas trouvée.
     */
    public void testFindByIdWhenStoryIsNotFound(){
        
        Story story = (Story) storyMapper.findById(888);

        assertNull(story);
        
    }
    
    /**
     * test quand la story est trouvée 
     *
     */
    public void testFindByProjectPersistanceIdWhenStoryIsFound() {
        
        Set set = storyMapper.findByProjectPersistanceId(2);
        
        assertEquals(4, set.size());
            
        }
    
    
    /**
     * test quand la story n'est pas trouv�e
     */
    public void testFindByProjectPersistanceIdWhenStoryIsNotFound() {

        Set set = storyMapper.findByProjectPersistanceId(888);
        
        assertEquals(0, set.size());

    }
    
    
    /**
     * test quand la story est trouv�e 
     *
     */
    public void testFindByReleasePersistanceIdWhenStoriesFound() {
    	
    	// TODO testFindByReleasePersistanceIdWhenStoriesFound
            
        }
    
    
    /**
     * test quand la story n'est pas trouv�e
     */
    public void testFindByReleasePersistanceIdWhenStorieAreNotFound() {

//        Set set = storyMapper.findByProjectPersistanceId(888);
//        
//        assertEquals(0, set.size());
        
        // fail("A faire");
    	
    	// TODO
    }

    
    /**
     * test quand la story est trouv�e 
     *
     */
    public void testFindByIterationPersistanceIdWhenStoriesFound() {
        
//        Set set = storyMapper.findByProjectPersistanceId(2);
//        
//        assertEquals(1, set.size());
        
        // fail("A faire");
    	
    	// TODO
            
        }
    
    
    /**
     * test quand la story n'est pas trouv�e
     */
    public void testFindByIterationPersistanceIdWhenStorieAreNotFound() {

//        Set set = storyMapper.findByProjectPersistanceId(888);
//        
//        assertEquals(0, set.size());
        
      //  fail("A faire");
    	
    	// TODO
        
    }
    
    
    
    /**
     * test de la recherche des story disponibles pour ajouter à une iteration.
     * test quand la story est trouvée.
     */
    public void testFindAvailableStoriesToAddForAnIteration() {
        
       Set<Story> set = storyMapper.findAvailableStoriesToAddForAnIteration(2, 1);
        
       // une story doit être trouvée...
        assertEquals(1, set.size());
        
        //... la story 3
        for (Story story : set) {
        	if (story.getPersistanceId() != 3) {
        		fail();
        	}
		}
        
        
        }
    
    
    /**
     * test de la recherche des story disponibles pour ajouter à une iteration. 
     * test quand la story n'est pas trouvée.
     */
    public void testfindAvailableStoriesToAddForAnIterationWhenStoriesAreNotFound() {

        Set<Story> set = storyMapper.findAvailableStoriesToAddForAnIteration(2, 7);
        
        assertEquals(0, set.size());

    }


}
