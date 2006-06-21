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
package net.sf.pmr.agilePlanning.domain.iteration;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.iteration.IterationImpl;
import net.sf.pmr.agilePlanning.domain.story.MockStory;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import de.abstrakt.mock.MockCore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class IterationTest extends TestCase {

	/*
	 * Iteration avec le set des stories à null.
	 */
	private Iteration iterationWithNullStories;
	
	/*
	 * Iteration avec un set de storie vide.
	 */
	private Iteration iterationWithEmptyStories;
	
	
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        iterationWithNullStories = new IterationImpl();
        iterationWithNullStories.setStories(null);
        
        iterationWithEmptyStories = new IterationImpl();
        iterationWithEmptyStories.setStories(new HashSet<Story>());
        
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

        assertFalse(AgilePlanningObjectFactory.isSingleton("iteration"));
    }

    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>le projet</li>
     * <li>la date de début (start)</li>
     * <li>la date de fin (end)</li>
     * </ul>
     * L'égalité ne prend  en compte que le jour/mois/année (pas les heures, minutes...)<br> 
     * Test avec des dates de début différentes (et des dates de fin identiques). Le projet est le même.
     * 
     */
    public void testIsEqualsAndHashcodeWithDifferentStartDatesButSameEndDate() {

        Iteration iteration1 = new IterationImpl();
        Iteration iteration2 = new IterationImpl();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_YEAR, calendar1.get(Calendar.MONTH) - 1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DAY_OF_YEAR, calendar2.get(Calendar.MONTH) - 2);

        Calendar calendar3 = Calendar.getInstance();

        BasicProject basicProject = new BasicProjectImpl();

        iteration1.setBasicProject(basicProject);
        iteration1.setStartDate(calendar1.getTime());
        iteration1.setEndDate(calendar3.getTime());
        iteration1.setPersistanceVersion(1);
        iteration1.setPersistanceId(1);

        iteration2.setBasicProject(basicProject);
        iteration2.setStartDate(calendar2.getTime());
        iteration2.setEndDate(calendar3.getTime());
        iteration2.setPersistanceVersion(2);
        iteration2.setPersistanceId(2);

        assertFalse(iteration1.equals(iteration2));
        assertFalse(iteration1.hashCode() == iteration2.hashCode());

    }

    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>le projet</li> 
     * <li>la date de début (start)</li>
     * <li>la date de fin (end)</li>
     * </ul>
     * L'égalité de prend  en compte que le jour/mois/année (pas les heures, minutes...) <br>
     * Test avec des dates de début identiques et des dates de fin différentes. Le projet est le même.
     * 
     */
    public void testIsEqualsAndHashcodeWithSameStartDatesButDifferentEndDates() {

        Iteration iteration1 = new IterationImpl();
        Iteration iteration2 = new IterationImpl();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_YEAR, calendar1.get(Calendar.DAY_OF_YEAR) - 1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DAY_OF_YEAR, calendar2.get(Calendar.DAY_OF_YEAR) - 2);

        Calendar calendar3 = Calendar.getInstance();

        BasicProject basicProject = new BasicProjectImpl();

        iteration1.setBasicProject(basicProject);
        iteration1.setStartDate(calendar3.getTime());
        iteration1.setEndDate(calendar1.getTime());
        iteration1.setPersistanceVersion(1);
        iteration1.setPersistanceId(1);

        iteration2.setBasicProject(basicProject);
        iteration2.setStartDate(calendar3.getTime());
        iteration2.setEndDate(calendar2.getTime());
        iteration2.setPersistanceVersion(2);
        iteration2.setPersistanceId(2);

        assertFalse(iteration1.equals(iteration2));
        assertFalse(iteration1.hashCode() == iteration2.hashCode());

    }

    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>le projet</li>
     * <li>la date de début (start)</li>
     * <li>la date de fin (end)</li>
     * </ul>
     * L'égalité de prend  en compte que le jour/mois/année (pas les heures, minutes...)<br>  
     * Test avec des dates de début identiques et des dates de fin identiques mais des projets différents 
     */
    public void testIsEqualsAndHashcodeWithSameStartDatesAndSameEndDateButDifferentProject() {

        Iteration iteration1 = new IterationImpl();
        Iteration iteration2 = new IterationImpl();

        BasicProject basicProject1 = new BasicProjectImpl();
        basicProject1.setCode("A");
        basicProject1.setName("AA");
        basicProject1.setPersistanceId(1);
        basicProject1.setPersistanceVersion(1);
        BasicProject basicProject2 = new BasicProjectImpl();
        basicProject2.setCode("B");
        basicProject2.setName("BB");
        basicProject2.setPersistanceId(2);
        basicProject2.setPersistanceVersion(2);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        iteration1.setBasicProject(basicProject1);
        iteration1.setStartDate(calendar1.getTime());
        iteration1.setEndDate(calendar2.getTime());
        iteration1.setPersistanceVersion(1);
        iteration1.setPersistanceId(1);

        iteration2.setBasicProject(basicProject2);
        iteration2.setStartDate(calendar1.getTime());
        iteration2.setEndDate(calendar2.getTime());
        iteration2.setPersistanceVersion(2);
        iteration2.setPersistanceId(2);

        assertFalse(iteration1.equals(iteration2));
        assertFalse(iteration1.hashCode() == iteration2.hashCode());

    }

    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>le projet</li>
     * <li>la date de début (start)</li>
     * <li>la date de fin (end)</li>
     * </ul>
     * L'égalité ne prend  en compte que le jour/mois/année (pas les heures, minutes...)<br>  
     * Test avec des dates de début identiques et des dates de fin identiques et le même projet. 
     */
    public void testIsEqualsAndHashcodeWithSameStartDatesAndSameEndDateAndSameProject() {

        Iteration iteration1 = new IterationImpl();
        Iteration iteration2 = new IterationImpl();

        BasicProject basicProject1 = new BasicProjectImpl();
        basicProject1.setCode("A");
        basicProject1.setName("AA");
        basicProject1.setPersistanceId(1);
        basicProject1.setPersistanceVersion(1);
        BasicProject basicProject2 = new BasicProjectImpl();
        basicProject2.setCode("A");
        basicProject2.setName("AA");
        basicProject2.setPersistanceId(1);
        basicProject2.setPersistanceVersion(1);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        iteration1.setBasicProject(basicProject1);
        iteration1.setStartDate(calendar1.getTime());
        iteration1.setEndDate(calendar2.getTime());
        iteration1.setPersistanceVersion(1);
        iteration1.setPersistanceId(1);

        iteration2.setBasicProject(basicProject2);
        iteration2.setStartDate(calendar1.getTime());
        iteration2.setEndDate(calendar2.getTime());
        iteration2.setPersistanceVersion(2);
        iteration2.setPersistanceId(2);

        assertTrue(iteration1.equals(iteration2));
        assertTrue(iteration1.hashCode() == iteration2.hashCode());

    }

    /**
     * Test que la date de début est bien tronquée au jour près
     * quand la date donnée n'est pas null
     */
    public void testSetStartTruncateDateWhenArgumentIsNotNull() {

        Iteration iteration = new IterationImpl();

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR, 1);
        calendar.set(Calendar.MINUTE, 1);
        calendar.set(Calendar.SECOND, 1);
        calendar.set(Calendar.MILLISECOND, 1);

        iteration.setStartDate(calendar.getTime());

        Date returnedStart = iteration.getStartDate();

        Calendar returnedCalendar = Calendar.getInstance();
        returnedCalendar.setTime(returnedStart);

        assertEquals(calendar.get(Calendar.DAY_OF_YEAR), returnedCalendar.get(Calendar.DAY_OF_YEAR));
        assertEquals(calendar.get(Calendar.MONTH), returnedCalendar.get(Calendar.MONTH));
        assertEquals(calendar.get(Calendar.YEAR), returnedCalendar.get(Calendar.YEAR));
        assertEquals(0, returnedCalendar.get(Calendar.HOUR));
        assertEquals(0, returnedCalendar.get(Calendar.MINUTE));
        assertEquals(0, returnedCalendar.get(Calendar.SECOND));
        assertEquals(1, returnedCalendar.get(Calendar.MILLISECOND));

    }

    /**
     * Test quand la date est null
     */
    public void testSetStartTruncateDateWhenArgumentIsNull() {

        Iteration iteration = new IterationImpl();

        iteration.setStartDate(null);

        assertNull(iteration.getStartDate());

    }

    /**
     * Test que la date de début est bien tronquée au jour près
     * quand la date donnée n'est pas null
     */
    public void testSetEndTruncateDateWhenArgumentIsNotNull() {

        Iteration iteration = new IterationImpl();

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR, 1);
        calendar.set(Calendar.MINUTE, 1);
        calendar.set(Calendar.SECOND, 1);
        calendar.set(Calendar.MILLISECOND, 1);

        iteration.setEndDate(calendar.getTime());

        Date returnedStart = iteration.getEndDate();

        Calendar returnedCalendar = Calendar.getInstance();
        returnedCalendar.setTime(returnedStart);

        assertEquals(calendar.get(Calendar.DAY_OF_YEAR), returnedCalendar.get(Calendar.DAY_OF_YEAR));
        assertEquals(calendar.get(Calendar.MONTH), returnedCalendar.get(Calendar.MONTH));
        assertEquals(calendar.get(Calendar.YEAR), returnedCalendar.get(Calendar.YEAR));
        assertEquals(0, returnedCalendar.get(Calendar.HOUR));
        assertEquals(0, returnedCalendar.get(Calendar.MINUTE));
        assertEquals(0, returnedCalendar.get(Calendar.SECOND));
        assertEquals(1, returnedCalendar.get(Calendar.MILLISECOND));

    }

    /**
     * Test quand la date est null
     */
    public void testSetEndTruncateDateWhenArgumentIsNull() {

        Iteration iteration = new IterationImpl();

        iteration.setEndDate(null);

        assertNull(iteration.getEndDate());

    }
    
    /**
     * Test le nombre de jours consommé quand le set des story est null.
     * La méthode doit retourner 0
     */
    public void testDaysCompletedWhenStoriesIsNull() {
    	
    	assertEquals(0.0, iterationWithNullStories.daysCompleted());
    	
    }
    
    
    /**
     * Test le nombre de jours consommé quand le set des story est vide
     * La méthode doit retourner 0
     */
    public void testDaysCompletedWhenStoriesIsEmpty() {
    
    	assertEquals(0.0, iterationWithEmptyStories.daysCompleted());
    	
    }
    
    
    /**
     * Test le nombre de jours consommé quand le set des story contient des story
     * La méthode doit retourner 5.0
     */
    public void testDaysCompletedWhenStoriesIsNotEmpty() {
    
    	MockCore.reset();
    	
    	Iteration iteration = new IterationImpl();
    	
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	
    	// l'ordre d'appel n'est pas important
    	MockCore.startBlock();
    	
    	mockStory1.expectDaysCompleted(2);
    	iteration.getStories().add(mockStory1);
    	mockStory2.expectDaysCompleted(3);
    	iteration.getStories().add(mockStory2);
    	
    	MockCore.endBlock();
    	
    	// appel de la méthode
    	double daysCompleted = iteration.daysCompleted();
    	
    	// et contrôle du résultat
    	assertEquals(5.0, daysCompleted);
    	
    	// puis contrôle des appels
    	MockCore.verify();
    	
    }


    /**
     * Test le nombre de jours restant quand le set des story est null.
     * La méthode doit retourner 0
     */
    public void testDaysRemainingWhenStoriesIsNull() {
    
    	assertEquals(0.0, iterationWithNullStories.daysRemaining());
    	
    }

    
    /**
     * Test le nombre de jours restant quand le set des story est vide
     * La méthode doit retourner 0
     */
    public void testDaysRemainingWhenStoriesIsEmpty() {
    	
    	assertEquals(0.0, iterationWithEmptyStories.daysRemaining());
    	
    }

    /**
     * Test le nombre de jours consommé quand le set des story contient des story
     * La méthode doit retourner 3.0
     */
    public void testDaysRemainingWhenStoriesIsNotEmpty() {
    
    	MockCore.reset();
    	
    	Iteration iteration = new IterationImpl();
    	
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	
    	// l'ordre d'appel n'est pas important
    	MockCore.startBlock();
    	
    	mockStory1.expectDaysRemaining(1);
    	iteration.getStories().add(mockStory1);
    	mockStory2.expectDaysRemaining(2);
    	iteration.getStories().add(mockStory2);
    	
    	MockCore.endBlock();
    	
    	// appel de la méthode
    	double daysRemaining = iteration.daysRemaining();
    	
    	// et contrôle du résultat
    	assertEquals(3.0, daysRemaining);
    	
    	// puis contrôle des appels
    	MockCore.verify();
    	
    }

    
    /**
     * Test le pourcentage réalisé de l'iteration quand le set des story est null
     * La méthode doit retourner 0
     */
    public void testPercentCompletedWhenStoriesIsNull() {
    	
    	assertEquals(0.0, iterationWithNullStories.percentCompleted());
    	
    }

    
    /**
     * Test le pourcentage réalisé de l'iteration quand le set des story est vide
     * La méthode doit retourner 0
     */
    public void testPercentCompletedWhenStoriesIsEmpty() {
    
    	assertEquals(0.0, iterationWithEmptyStories.percentCompleted());
    	
    }


    /**
     * Test le pourcentage réalisé de l'iteration quand le set des story contient des story
     * La méthode doit retourner 0
     */
    public void testPercentCompletedWhenStoriesIsNotEmpty() {
    
    	MockCore.reset();
    	
    	Iteration iteration = new IterationImpl();
    	
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	
    	// l'ordre d'appel n'est pas important
    	MockCore.startBlock();
    	
    	mockStory1.expectDaysRemaining(1);
    	mockStory1.expectDaysCompleted(1);
    	iteration.getStories().add(mockStory1);
    	mockStory2.expectDaysRemaining(5);
    	mockStory2.expectDaysCompleted(1);
    	iteration.getStories().add(mockStory2);
    	
    	MockCore.endBlock();
    	
    	
    	// appel de la méthode
    	double percentCompleted = iteration.percentCompleted();
    	
    	// et contrôle du résultat
    	assertEquals(25.0, percentCompleted);
    	
    	// puis contrôle des appels
    	MockCore.verify();
    	
    }


    /**
     * Test le pourcentage restant de l'iteration quand le set des story est null
     * La méthode doit retourner 0
     */
    public void testPercentRemainingWhenStoriesIsNull() {
    	
    	assertEquals(0.0, iterationWithNullStories.percentRemaining());
    	
    }

    
    /**
     * Test le pourcentage restant de l'iteration quand le set des story est vide
     * La méthode doit retourner 0
     */
    public void testPercentRemainingWhenStoriesIsEmpty() {
    	
    	assertEquals(0.0, iterationWithEmptyStories.percentRemaining());
    	
    }


    /**
     * Test le pourcentage restant de l'iteration quand le set des story contient des story
     * La méthode doit retourner 75
     */
    public void testPercentRemainingWhenStoriesIsNotEmpty() {
    
    	Iteration iteration = new IterationImpl();
    	
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	
    	mockStory1.setDaysRemainingDummy(1);
    	mockStory1.setDaysCompletedDummy(1);
    	iteration.getStories().add(mockStory1);
    	mockStory2.setDaysRemainingDummy(5);
    	mockStory2.setDaysCompletedDummy(1);
    	iteration.getStories().add(mockStory2);    	
    	
    	// appel de la méthode et contrôle du résultat
    	assertEquals(75.0, iteration.percentRemaining());
    	
    }


    /**
     * Test la différence en jours quand le set de stories est null.
     * La méthode doit retourner 0, cad pas de différence. Il n'y a as encore de story (l'iteration est "vide").
     */
    public void testDifferenceOfDaysBetweenIterationAndStoriesWhenStoriesIsNull() {
    	
    	assertEquals(0.0, iterationWithNullStories.differenceOfDaysBetweenIterationAndStories());
    	
    }
    
    /**
     * Test la différence en pourcentage quand le set de stories est null.
     * La méthode doit retourner 0, cad pas de différence. Il n'y a as encore de story (l'iteration est "vide").
     */
    public void testDifferenceInPercentBetweenIterationAndStoriesWhenStoriesIsNull() {
    	
    	assertEquals(0.0, iterationWithNullStories.differenceInPercentBetweenIterationAndStories());
    	
    }

    
    /**
     * Test la différence en jours quand le set de stories est vide
     * La méthode doit retourner 0, cad pas de différence. Il n'y a as encore de story (l'iteration est "vide").
     */
    public void testDifferenceOfDaysBetweenIterationAndStoriesWhenStoriesIsEmpty() {
    	
    	assertEquals(0.0, iterationWithEmptyStories.differenceOfDaysBetweenIterationAndStories());
    	
    }
    
    
    /**
     * Test la différence en pourcentage quand le set de stories est vide
     * La méthode doit retourner 0, cad pas de différence. Il n'y a as encore de story (l'iteration est "vide").
     */
    public void testDifferenceInPercentBetweenIterationAndStoriesWhenStoriesIsEmpty() {
    	
    	assertEquals(0.0, iterationWithEmptyStories.differenceInPercentBetweenIterationAndStories());
    	
    }
    
    /**
     * Test la différence en jours quand il y a les même nombre de jours entre l'itération et la story
     * La méthode doit retourner 0, cad pas de différence.
     */
    public void testDifferenceOfDaysBetweenIterationAndStoriesWithNoDifference() {
    
    	Iteration iteration = new IterationImpl();
    	iteration.setDays(45);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	MockStory mockStory3 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(6);
    	mockStory1.setDaysRemainingDummy(4);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(4);
    	mockStory2.setDaysRemainingDummy(6);
    	iteration.getStories().add(mockStory2);
    	
    	mockStory3.setDaysCompletedDummy(20);
    	mockStory3.setDaysRemainingDummy(5);
    	iteration.getStories().add(mockStory3);
    	
    	assertEquals(0.0, iteration.differenceOfDaysBetweenIterationAndStories());
    	
    }
    
    
    /**
     * Test la différence en pourcentage quand il y a le même nombre de jours entre l'itération est la story
     * La méthode doit retourner 0, cad pas de différence.
     */
    public void testDifferenceInPercentBetweenIterationAndStoriesWithNoDifference() {
    
    	Iteration iteration = new IterationImpl();
    	iteration.setDays(45);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	MockStory mockStory3 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(6);
    	mockStory1.setDaysRemainingDummy(4);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(4);
    	mockStory2.setDaysRemainingDummy(6);
    	iteration.getStories().add(mockStory2);
    	
    	mockStory3.setDaysCompletedDummy(20);
    	mockStory3.setDaysRemainingDummy(5);
    	iteration.getStories().add(mockStory3);
    	
    	assertEquals(0.0, iteration.differenceInPercentBetweenIterationAndStories());
    	
    }



    /**
     * Test la différence en jours quand il y a plus de jours dans les stories que dans l'iteration.
     */
    public void testDifferenceOfDaysBetweenIterationAndStoriesWithNegativeDifference() {
    
    	Iteration iteration = new IterationImpl();
    	iteration.setDays(45);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	MockStory mockStory3 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(6);
    	mockStory1.setDaysRemainingDummy(4);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(4);
    	mockStory2.setDaysRemainingDummy(6);
    	iteration.getStories().add(mockStory2);
    	
    	mockStory3.setDaysCompletedDummy(20);
    	mockStory3.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory3);
    	
    	assertEquals(-5.0, iteration.differenceOfDaysBetweenIterationAndStories());
    	
    }
    
    
    /**
     * Test la différence en pourcentage quand il y a plus de jours dans les stories que dans l'iteration.
     */
    public void testDifferenceInPercentBetweenIterationAndStoriesWithNegativeDifference() {
    
    	Iteration iteration = new IterationImpl();
    	iteration.setDays(100);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	MockStory mockStory3 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(40);
    	mockStory1.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(10);
    	mockStory2.setDaysRemainingDummy(40);
    	iteration.getStories().add(mockStory2);
    	
    	mockStory3.setDaysCompletedDummy(5);
    	mockStory3.setDaysRemainingDummy(5);
    	iteration.getStories().add(mockStory3);
    	
    	assertEquals(10.0, iteration.differenceInPercentBetweenIterationAndStories());
    	
    }


    /**
     * Test la différence en jours quand il y a plus de jours dans l'iteration que dans les stories.
     */
    public void testDifferenceOfDaysBetweenIterationAndStoriesWithPositiveDifference() {
    
    	Iteration iteration = new IterationImpl();
    	iteration.setDays(45);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	MockStory mockStory3 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(6);
    	mockStory1.setDaysRemainingDummy(4);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(4);
    	mockStory2.setDaysRemainingDummy(6);
    	iteration.getStories().add(mockStory2);
    	
    	mockStory3.setDaysCompletedDummy(10);
    	mockStory3.setDaysRemainingDummy(5);
    	iteration.getStories().add(mockStory3);
    	
    	assertEquals(10.0, iteration.differenceOfDaysBetweenIterationAndStories());
    	
    }
 
    /**
     * Test la différence en pourcentage quand il y a plus de jours dans l'iteration que dans les stories.
     */
    public void testDifferenceInPercentBetweenIterationAndStoriesWithPositiveDifference() {
    
    	Iteration iteration = new IterationImpl();
    	iteration.setDays(100);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	MockStory mockStory3 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(40);
    	mockStory1.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(10);
    	mockStory2.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory2);
    	
    	mockStory3.setDaysCompletedDummy(5);
    	mockStory3.setDaysRemainingDummy(5);
    	iteration.getStories().add(mockStory3);
    	
    	assertEquals(-20.0, iteration.differenceInPercentBetweenIterationAndStories());
    	
    }
    
    /**
     * Test la méthode waring quand il y a plus de jours dans l'iteration que dans les stories
     * warning doit retourner false
     */
    public void testWarningWithMoreDaysInIterationThanInStories() {
    	
    	Iteration iteration = new IterationImpl();
    	iteration.setDays(40);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(10);
    	mockStory1.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(5);
    	mockStory2.setDaysRemainingDummy(5);
    	iteration.getStories().add(mockStory2);
    	
    	assertFalse(iteration.warning());

    	
    }
    
    /**
     * Test la méthode waring quand il y a plus de jours dans les stories que dans les iterations
     * warning doit retourner true
     */
    public void testWarningWithMoreDaysStoriesThanInIteration() {

    	Iteration iteration = new IterationImpl();
    	iteration.setDays(40);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(10);
    	mockStory1.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(20);
    	mockStory2.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory2);
    	
    	assertTrue(iteration.warning());

    	
    }
    
    
    /**
     * Test la méthode waring quand il y a autant de jour dans les stories que dans les iterations
     * warning doit retourner true
     */
    public void testWarningWithTheSameNumberOfDaysInStoriesAndInIteration() {

    	Iteration iteration = new IterationImpl();
    	iteration.setDays(40);
    	iteration.setStories(new HashSet<Story>());
    	
    	// mock de story
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();
    	
    	mockStory1.setDaysCompletedDummy(10);
    	mockStory1.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory1);
    	
    	mockStory2.setDaysCompletedDummy(10);
    	mockStory2.setDaysRemainingDummy(10);
    	iteration.getStories().add(mockStory2);
    	
    	assertFalse(iteration.warning());

    	
    }



}