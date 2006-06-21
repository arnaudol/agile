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

package net.sf.pmr.agilePlanning.domain.story;

import java.util.HashSet;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.agilePlanning.domain.story.task.MockTask;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import de.abstrakt.mock.MockCore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class StoryTest extends TestCase {

    private Story story;
    
    private MockTask mockTask1;
    
    private MockTask mockTask2;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        story = new StoryImpl();

        mockTask1 = new MockTask();
        mockTask2 = new MockTask();
        
        // reset Mock
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
    public void testIsNotASingleton() {
        
        assertFalse(AgilePlanningObjectFactory.isSingleton("story"));
    }
    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>l'iteration<li>
     * <li>le project</li>
     * </ul>
     * 
     * Test avec des descriptions diff�rentes
     */
    public void testIsEqualsAndHashcodeWithDifferentShortDescriptions() {
        
        Story story1 = new StoryImpl();
        Story story2 = new StoryImpl();
        
        BasicProject basicProject1 = new BasicProjectImpl();
        BasicProject basicProject2 = new BasicProjectImpl();
        
        // les descriptions sont diff�rentes
        story1.setShortDescription("aa");
        story1.setDescription("super");
        story1.setDaysEstimated(3);
        story1.setPersistanceVersion(0);
        story1.setBasicProject(basicProject1);
        
        story2.setShortDescription("bb");
        story2.setDescription("super good");
        story2.setDaysEstimated(4);
        story2.setPersistanceVersion(10); 
        story2.setBasicProject(basicProject2);

        
        assertFalse(story1.equals(story2));
        assertFalse(story1.hashCode() == story2.hashCode());
        
    }
    
    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>le project</li> 
     * </ul>
     * 
     * Test avec des descriptions identiques et des itérations différentes
     */
    public void testIsEqualsAndHashcodeWithTheSameShortDescriptionButDifferentBasicProjec() {

        Story story1 = new StoryImpl();
        Story story2 = new StoryImpl();

        BasicProject basicProject1 = new BasicProjectImpl();
        basicProject1.setName("toto");
        BasicProject basicProject2 = new BasicProjectImpl();
        basicProject1.setName("titi");

        // les descriptions sont identiques mais pas les iterations
        story1.setShortDescription("aa");
        story1.setDescription("super");
        story1.setDaysEstimated(3);
        story1.setPersistanceVersion(0);
        story1.setBasicProject(basicProject1);

        story2.setShortDescription("aa");
        story2.setDescription("super good");
        story2.setDaysEstimated(4);
        story2.setPersistanceVersion(10);
        story2.setBasicProject(basicProject2);

        assertFalse(story1.equals(story2));
        assertFalse(story1.hashCode() == story2.hashCode());
    }


        /**
         * l'égalité de l'object est faite sur :
         * <ul>
         * <li>la description courte (short description)</li>
         * <li>le project</li>
         * </ul>
         *
         * Test avec des descriptions identiques et des it�rations identiques
         */
        public void testIsEqualsAndHashcodeWithTheSameShortDescriptionAndTheSameBasicProject() {

        Story story1 = new StoryImpl();
        Story story2 = new StoryImpl();

        BasicProject basicProject1 = new BasicProjectImpl();
        BasicProject basicProject2 = new BasicProjectImpl();

        // les descriptions et it�rations sont identiques
        story1.setShortDescription("aa");
        story1.setDescription("super");
        story1.setDaysEstimated(3);
        story1.setPersistanceVersion(0);
        story1.setBasicProject(basicProject1);


        story2.setShortDescription("aa");
        story2.setDescription("super good");
        story2.setDaysEstimated(4);
        story2.setPersistanceVersion(10);
        story2.setBasicProject(basicProject2);

        assertTrue(story1.equals(story2));
        assertTrue(story1.hashCode() == story2.hashCode());

    }

        
    /**
     * nombre de jour consomm�
     * 
     * Test quand il y a des tasks
     */    
    public void testDaysCompleted() {
        
        // l'ordre d'appel n'est pas important
        MockCore.startBlock();
        mockTask1.expectDaysCompleted(0.25);
        mockTask2.expectDaysCompleted(0.25);
        MockCore.endBlock();
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(0.5, story.daysCompleted());
        
    }
    
    /**
     * nombre de jour consomm�s
     * 
     * Test quand la liste des t�che est vide. doit retourner 0.
     */    
    public void testDaysCompletedWhenTaskSetIsEmpty() {
        
        story.setTasks(new HashSet<Task>());
        
        assertEquals(0.0, story.daysCompleted());
        
    }
    
    
    /**
     * nombre de jour consomm�
     * 
     * Test quand la liste des t�che est null. doit retourner 0.
     */    
    public void testDaysCompletedWhenTaskSetIsNull() {
        
        story.setTasks(null);
        
        assertEquals(0.0, story.daysCompleted());
        
    }
    
    
    /**
     * Test de l'�tat de la story quand elle n'a pas d�marr� car aucun jour de r�alis�.
     * <ul> 
     * <li>isInProgress doit retourner false</li>
     * <li>isCompleted doit retourner false</li>
     * <li>isLeft doit retourner true</li>
     * </ul>
     */
    public void testWhenWorkOnStoryHaventStart() {
    	
    	// t�ches mise � nulles pour que daysCompleted renvoit 0
    	story.setTasks(null);
    	
    	assertEquals(false, story.isInProgress());
    	assertEquals(false, story.isCompleted());
    	assertEquals(true, story.isLeft());

    	
    }

    /**
     * Test de l'�tat de la story quand elle est termin�e. Les jours compl�t�s sont > � 0 et aucun jours restant.
     * <ul> 
     * <li>isInProgress doit retourner false</li>
     * <li>isCompleted doit retourner true</li>
     * <li>isLeft doit retourner false</li>
     * </ul>
     */
    public void testWhenWorkOnStoryIsCompleted() {
    	
        mockTask1.setDaysCompletedDummy(0.25);
        mockTask1.setDaysRemainingDummy(0);
        mockTask2.setDaysCompletedDummy(0.25);
        mockTask2.setDaysRemainingDummy(0);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
    	
    	assertEquals(false, story.isInProgress());
    	assertEquals(true, story.isCompleted());
    	assertEquals(false, story.isLeft());
    	
    }

    
    /**
     * Test de l'�tat de la story quand elle est en cours de r�alisation. Les jours compl�t�s sont > � 0 et des jours sont restant.
     * <ul> 
     * <li>isInProgress doit retourner true</li>
     * <li>isCompleted doit retourner false</li>
     * <li>isLeft doit retourner false</li> 
     * </ul>
     */
    public void testWhenWorkOnStoryIsInProgress() {
    	
        mockTask1.setDaysCompletedDummy(0.25);
        mockTask1.setDaysRemainingDummy(0);
        mockTask2.setDaysCompletedDummy(0.25);
        mockTask2.setDaysRemainingDummy(1);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
    	
    	assertEquals(true, story.isInProgress());
    	assertEquals(false, story.isCompleted());
    	assertEquals(false, story.isLeft());
    	
    }
    
    /**
     * nombre de jour restant
     * 
     * Test quand il y a des t�ches
     */    
    public void testDaysRemaining() {
        
        // l'ordre d'appel n'est pas important
        MockCore.startBlock();
        mockTask1.expectDaysRemaining(0.5);
        mockTask2.expectDaysRemaining(0.5);
        MockCore.endBlock();
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(1.0, story.daysRemaining());
        
    }
    
    /**
     * nombre de jour restant
     * 
     * Test quand la liste des t�che est vide. doit retourner l'estimation de la t�che.
     */    
    public void testDaysRemainingWhenTaskSetIsEmpty() {
        
        story.setTasks(new HashSet<Task>());
        story.setDaysEstimated(4.5);
        
        assertEquals(4.5, story.daysRemaining());
        
    }
    
    
    /**
     * nombre de jours restant
     * 
     * Test quand la liste des t�che est null. doit retourner l'estimation de la t�che.
     */    
    public void testDaysRemainingWhenTaskSetIsNull() {
    	
        story.setTasks(null);
        story.setDaysEstimated(2.5);
        
        assertEquals(2.5, story.daysRemaining());
        
    }
    
    /**
     * pourcentage de jours consomm�s 
     */    
    public void testPercentCompleted() {
        
        // l'ordre d'appel n'est pas important
        
        mockTask1.setDaysCompletedDummy(0.25);
        mockTask1.setDaysRemainingDummy(1);
        mockTask2.setDaysCompletedDummy(0.25);
        mockTask2.setDaysRemainingDummy(1);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(20.0, story.percentCompleted());

    }
    
    /**
     * pourcentage de jours consomm�s
     * 
     * Test quand la liste des t�che est vide. doit retourner 0.
     */    
    public void testPercentCompletedWhenTaskSetIsEmpty() {
        
        story.setTasks(new HashSet<Task>());
        
        assertEquals(0.0, story.percentCompleted());
        
    }
    
    
    /**
     * pourcentage de jours consomm�s
     * 
     * Test quand la liste des t�che est null. doit retourner 0.
     */    
    public void testPercentCompletedWhenTaskSetIsNull() {
        
        story.setTasks(null);
        
        assertEquals(0.0, story.percentCompleted());
        
    }

    
    /**
     * pourcentage de nombre de jour restant 
     */    
    public void testPercentRemaining() {
        
        mockTask1.setDaysCompletedDummy(0.25);
        mockTask1.setDaysRemainingDummy(1);
        mockTask2.setDaysCompletedDummy(0.25);
        mockTask2.setDaysRemainingDummy(1);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(80.0, story.percentRemaining());
        
        
    }
    
    /**
     * pourcentage de jours restant
     * 
     * Test quand la liste des t�che est vide. doit retourner 0.
     */    
    public void testPercentRemainingWhenTaskSetIsEmpty() {
        
        story.setTasks(new HashSet<Task>());
        
        assertEquals(100.0, story.percentRemaining());
        
    }
    
    
    /**
     * pourcentage de jours restant
     * 
     * Test quand la liste des t�che est null. doit retourner 0.
     */    
    public void testPercentRemainingWhenTaskSetIsNull() {
        
        story.setTasks(null);
        
        assertEquals(100.0, story.percentRemaining());
        
    }


    /**
     * Test le calcul de diff�rence entre l'estimation de la story et les charges
     * 
     * Test quand la diff�rence est positive
     */
    public void testDifferenceOfDaysBetweenEstimateAndTaskChargeWhenDifferenceIsPositive() {
        
        story.setDaysEstimated(1);
        
        mockTask1.setDaysCompletedDummy(0.25);
        mockTask1.setDaysRemainingDummy(1);
        mockTask2.setDaysCompletedDummy(0.25);
        mockTask2.setDaysRemainingDummy(1);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(1.5, story.differenceOfDaysBetweenEstimateAndTaskCharge());
        
    }
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et les charges
     * 
     * Test quand la diff�rence est n�gative
     */
    public void testDifferenceOfDaysBetweenEstimateAndTaskChargeWhenDifferenceIsNegative() {
        
        story.setDaysEstimated(3);
        
        mockTask1.setDaysCompletedDummy(0.25);
        mockTask1.setDaysRemainingDummy(1);
        mockTask2.setDaysCompletedDummy(0.25);
        mockTask2.setDaysRemainingDummy(1);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(-0.5, story.differenceOfDaysBetweenEstimateAndTaskCharge());
        
    }
    
    
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et les charges
     * 
     * Test quand la liste des t�che est vide. doit retourner 0.
     */    
    public void testDifferenceOfDaysBetweenEstimateAndTaskChargeWhenTaskSetIsEmpty() {
        
        story.setTasks(new HashSet<Task>());
        
        assertEquals(0.0, story.differenceOfDaysBetweenEstimateAndTaskCharge());
        
    }
    
    
    /**
     * pourcentage de jours restant
     * 
     * Test quand la liste des t�che est null. doit retourner 0.
     */    
    public void testDifferenceOfDaysBetweenEstimateAndTaskChargeWhenTaskSetIsNull() {
        
        story.setTasks(null);
        
        assertEquals(0.0, story.differenceOfDaysBetweenEstimateAndTaskCharge());
        
    }
    

    /**
     * Test le calcul de diff�rence entre l'estimation de la story et les charges en pourcentage
     * 
     * Test quand la diff�rence est positive
     */
    public void testDifferenceInPercentBetweenEstimateAndTaskChargeWhenDifferenceIsPositive() {
        
        story.setDaysEstimated(1);
        
        mockTask1.setDaysCompletedDummy(0.25);
        mockTask1.setDaysRemainingDummy(1);
        mockTask2.setDaysCompletedDummy(0.25);
        mockTask2.setDaysRemainingDummy(1);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(40.0, story.differenceInPercentBetweenEstimateAndTaskCharge());

        
    }
    
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et les charges en pourcentage
     * 
     * Test quand la diff�rence est n�gative
     */
    public void testDifferenceInPercentBetweenEstimateAndTaskChargeWhenDifferenceIsNegative() {
        
        story.setDaysEstimated(3);
        
        mockTask1.setDaysCompletedDummy(0.25);
        mockTask1.setDaysRemainingDummy(1);
        mockTask2.setDaysCompletedDummy(0.25);
        mockTask2.setDaysRemainingDummy(1);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(120.0, story.differenceInPercentBetweenEstimateAndTaskCharge());

        
    }
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et les charges en pourcentage
     * 
     * Test quand la liste des t�che est vide. doit retourner 0.
     */    
    public void testDifferenceInPercentBetweenEstimateAndTaskChargeWhenTaskSetIsEmpty() {
        
        story.setTasks(new HashSet<Task>());
        
        assertEquals(0.0, story.differenceInPercentBetweenEstimateAndTaskCharge());
        
    }
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et les charges en pourcentage
     * 
     * Test quand la liste des t�che est null. doit retourner 0.
     */    
    public void testDifferenceInPercentBetweenEstimateAndTaskChargeWhenTaskSetIsNull() {
        
        story.setTasks(null);
        
        assertEquals(0.0, story.differenceInPercentBetweenEstimateAndTaskCharge());
        
    }

    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la diff�rence est positive
     */    
    public void testDifferenceOfDaysBetweenEstimateAndTaskEstimateWhenDifferenceIsPositive() {
        
        story.setDaysEstimated(2);
        
        mockTask1.setGetDaysEstimatedDummy(1.25);
        mockTask2.setGetDaysEstimatedDummy(1.25);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(0.5, story.differenceOfDaysBetweenEstimateAndTaskEstimate());

    }
    
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la diff�rence est n�gative
     */    
    public void testDifferenceOfDaysBetweenEstimateAndTaskEstimateWhenDifferenceIsNegative() {
        
        story.setDaysEstimated(4);
        
        mockTask1.setGetDaysEstimatedDummy(1.25);
        mockTask2.setGetDaysEstimatedDummy(1.25);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(-1.5, story.differenceOfDaysBetweenEstimateAndTaskEstimate());

    }

    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la liste des t�che est vide. doit retourner 0.
     */    
    public void testDifferenceOfDaysBetweenEstimateAndTaskEstimateWhenTaskSetIsEmpty() {
        
        story.setDaysEstimated(4);
        
        story.setTasks(new HashSet<Task>());
        
        assertEquals(0.0, story.differenceOfDaysBetweenEstimateAndTaskEstimate());
        
    }
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la liste des t�che est null. doit retourner 0.
     */    
    public void testDifferenceOfDaysBetweenEstimateAndTaskEstimateWhenTaskSetIsNull() {
        
        story.setDaysEstimated(4);
        
        story.setTasks(null);
        
        assertEquals(0.0, story.differenceOfDaysBetweenEstimateAndTaskEstimate());
        
    }

    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la diff�rence est positive
     */
    public void testDifferenceInPercentBetweenEstimateAndTaskEstimateWhenDifferenceIsPositive() {
        
        story.setDaysEstimated(2);
        
        mockTask1.setGetDaysEstimatedDummy(1.25);
        mockTask2.setGetDaysEstimatedDummy(1.25);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(125.0, story.differenceInPercentBetweenEstimateAndTaskEstimate());
        
    }
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la diff�rence est n�gative
     */
    public void testDifferenceInPercentBetweenEstimateAndTaskEstimateWhenDifferenceIsNegative() {
        
        story.setDaysEstimated(4);
        
        mockTask1.setGetDaysEstimatedDummy(1.25);
        mockTask2.setGetDaysEstimatedDummy(1.25);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(62.5, story.differenceInPercentBetweenEstimateAndTaskEstimate());
        
    }


    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la liste des t�che est vide. doit retourner 0.
     */    
    public void testDifferenceInPercentBetweenEstimateAndTaskEstimateWhenTaskSetIsEmpty() {
        
        story.setTasks(new HashSet<Task>());
        
        assertEquals(0.0, story.differenceInPercentBetweenEstimateAndTaskEstimate());
        
    }
    
    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la liste des t�che est null. doit retourner 0.
     */    
    public void testDifferenceInPercentBetweenEstimateAndTaskEstimateWhenTaskSetIsNull() {
        
        story.setTasks(null);
        
        assertEquals(0.0, story.differenceInPercentBetweenEstimateAndTaskEstimate());
        
    }

    /**
     * Test le calcul de diff�rence entre l'estimation de la story et l'estimation des tasks.
     * 
     * Test quand la liste l'estimation de la story est � 0;
     */    
    public void testDifferenceInPercentBetweenEstimateAndTaskEstimateWhenStoryEstimateIsZero() {
        
        story.setDaysEstimated(0);
        
        mockTask1.setGetDaysEstimatedDummy(1.25);
        mockTask2.setGetDaysEstimatedDummy(1.25);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertEquals(0.0, story.differenceInPercentBetweenEstimateAndTaskEstimate());
        
    }
    
    /**
     * Test le warning quand tout est ok.
     * la méthode doit retourner false
     */
    public void testWarning() {
    	
    	assertFalse(story.warning());
    	
    }
    
    /**
     * Test le warning quand la somme des estimations des tâches est supérieure à celle de la story.
     * la méthode doit retourner true.
     */
    public void testWarningWhenDifferenceBetweenEstimateAndTaskEstimateIsPositive() {
    	
    	   
        story.setDaysEstimated(2);
        
        mockTask1.setGetDaysEstimatedDummy(1.25);
        mockTask2.setGetDaysEstimatedDummy(1.25);
        
        story.setTasks(new HashSet<Task>());
        
        story.getTasks().add(mockTask1);
        story.getTasks().add(mockTask2);
        
        assertTrue(story.warning());
     	
    }
    
    /**
     * Test le warning quand la somme des charges des la tâche est supérieure à celle de la story.
     * la méthode doit retourner false
     */
    public void testWarningWhenDifferenceBetweenEstimateAndTaskChargeIsPositive() {
    	
    	   story.setDaysEstimated(1);
           
           mockTask1.setDaysCompletedDummy(0.25);
           mockTask1.setDaysRemainingDummy(1);
           mockTask1.setGetDaysEstimatedDummy(1.25);
           
           mockTask2.setDaysCompletedDummy(0.25);
           mockTask2.setDaysRemainingDummy(1);
           mockTask2.setGetDaysEstimatedDummy(1.25);
           
           story.setTasks(new HashSet<Task>());
           
           story.getTasks().add(mockTask1);
           story.getTasks().add(mockTask2);
           
           assertTrue(story.warning());
    	
    }
    
    
}