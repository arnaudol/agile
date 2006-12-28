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
package net.sf.pmr.agilePlanning.domain.story.task;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.TaskImpl;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.agilePlanning.domain.story.task.charge.ChargeImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class TaskTest extends TestCase {
    
    private Task task;
    

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        task = new TaskImpl();
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
        
        assertFalse(AgilePlanningObjectFactory.isSingleton("task"));
    }

    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>ne nombre d'ideal days<li>
     * <li>le développeur</li>
     * </ul>
     * 
     * Test avec le même projet, la même description, le même développer
     */
    public void testIsEqualsAndHashcodeWithSameShortDescriptionAndSameIdealDayAndShameDevelopper() {
    
        User user1 = new UserImpl();
        user1.setFirstName("Bat");
        user1.setLastName("Man");
        user1.setLogin("batman");
        user1.setPersistanceId(1);
        user1.setPersistanceVersion(1);
        
        User user2 = new UserImpl();
        user2.setFirstName("Bat");
        user2.setLastName("Man");
        user2.setLogin("batman");
        user2.setPersistanceId(1);
        user2.setPersistanceVersion(1);
        
        
        Task task1 = new TaskImpl();
        Task task2 = new TaskImpl();
        
        task1.setOwner(user1);
        task1.setDaysEstimated(2);
        task1.setPersistanceId(1);
        task1.setPersistanceVersion(1);
        task1.setShortDescription("aa");
        
        task2.setOwner(user2);
        task2.setDaysEstimated(2);
        task2.setPersistanceId(2);
        task2.setPersistanceVersion(5);
        task2.setShortDescription("aa");

        // equals
        assertTrue(task1.equals(task2));
        // hascode
        assertTrue(task1.hashCode() == task2.hashCode());
        
    }

    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>ne nombre d'ideal days<li>
     * <li>le d�veloppeur</li>
     * </ul>
     * 
     * Test avec un d�velopper diff�rent
     */
    public void testIsEqualsAndHashcodeWithSameShortDescriptionAndSameIdealDayAndDifferentDevelopper() {
    
        User user1 = new UserImpl();
        user1.setFirstName("Bat");
        user1.setLastName("Man");
        user1.setLogin("batman");
        user1.setPersistanceId(1);
        user1.setPersistanceVersion(1);
        
        User user2 = new UserImpl();
        user2.setFirstName("Scooby");
        user2.setLastName("Doo");
        user2.setLogin("scoobydoo");
        user2.setPersistanceId(1);
        user2.setPersistanceVersion(1);
        
        
        Task task1 = new TaskImpl();
        Task task2 = new TaskImpl();
        
        task1.setOwner(user1);
        task1.setDaysEstimated(2);
        task1.setPersistanceId(1);
        task1.setPersistanceVersion(1);
        task1.setShortDescription("aa");
        
        task2.setOwner(user2);
        task2.setDaysEstimated(2);
        task2.setPersistanceId(1);
        task2.setPersistanceVersion(1);
        task2.setShortDescription("aa");

        // equals
        assertFalse(task1.equals(task2));
        // hascode
        assertFalse(task1.hashCode() == task2.hashCode());
        
    }

    
    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>ne nombre d'ideal days<li>
     * <li>le d�veloppeur</li>
     * </ul>
     * 
     * Test avec le nombre d'ideal days diff�rent 
     */
    public void testIsEqualsAndHashcodeWithSameShortDescriptionAndDifferentIdealDayAndSameDevelopper() {
    
        User user1 = new UserImpl();
        user1.setFirstName("Bat");
        user1.setLastName("Man");
        user1.setLogin("batman");
        user1.setPersistanceId(1);
        user1.setPersistanceVersion(1);
        
        User user2 = new UserImpl();
        user2.setFirstName("Bat");
        user2.setLastName("Man");
        user2.setLogin("batman");
        user2.setPersistanceId(1);
        user2.setPersistanceVersion(1);
        
        
        Task task1 = new TaskImpl();
        Task task2 = new TaskImpl();
        
        task1.setOwner(user1);
        task1.setDaysEstimated(2);
        task1.setPersistanceId(1);
        task1.setPersistanceVersion(1);
        task1.setShortDescription("aa");
        
        task2.setOwner(user2);
        task2.setDaysEstimated(5);
        task2.setPersistanceId(1);
        task2.setPersistanceVersion(1);
        task2.setShortDescription("aa");

        // equals
        assertFalse(task1.equals(task2));
        // hascode
        assertFalse(task1.hashCode() == task2.hashCode());
        
    }
    
    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>ne nombre d'ideal days<li>
     * <li>le d�veloppeur</li>
     * </ul>
     * 
     * Test avec une description diff�rents 
     */
    public void testIsEqualsAndHashcodeWithDifferentShortDescriptionAndSameIdealDayAndSameDevelopper() {
    
        User user1 = new UserImpl();
        user1.setFirstName("Bat");
        user1.setLastName("Man");
        user1.setLogin("batman");
        user1.setPersistanceId(1);
        user1.setPersistanceVersion(1);
        
        User user2 = new UserImpl();
        user2.setFirstName("Bat");
        user2.setLastName("Man");
        user2.setLogin("batman");
        user2.setPersistanceId(1);
        user2.setPersistanceVersion(1);
        
        
        Task task1 = new TaskImpl();
        Task task2 = new TaskImpl();
        
        task1.setOwner(user1);
        task1.setDaysEstimated(2);
        task1.setPersistanceId(1);
        task1.setPersistanceVersion(1);
        task1.setShortDescription("aa");
        
        task2.setOwner(user2);
        task2.setDaysEstimated(2);
        task2.setPersistanceId(1);
        task2.setPersistanceVersion(1);
        task2.setShortDescription("bb");

        // equals
        assertFalse(task1.equals(task2));
        // hascode
        assertFalse(task1.hashCode() == task2.hashCode());
        
    }


    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>ne nombre d'ideal days<li>
     * <li>le d�veloppeur</li>
     * </ul>
     * 
     * Test avec une description diff�rents et un nombre d'ideal days diff�rents 
     */
    public void testIsEqualsAndHashcodeWithDifferentShortDescriptionAndDifferentIdealDayAndSameDevelopper() {
    
        User user1 = new UserImpl();
        user1.setFirstName("Bat");
        user1.setLastName("Man");
        user1.setLogin("batman");
        user1.setPersistanceId(1);
        user1.setPersistanceVersion(1);
        
        User user2 = new UserImpl();
        user2.setFirstName("Bat");
        user2.setLastName("Man");
        user2.setLogin("batman");
        user2.setPersistanceId(1);
        user2.setPersistanceVersion(1);
        
        
        Task task1 = new TaskImpl();
        Task task2 = new TaskImpl();
        
        task1.setOwner(user1);
        task1.setDaysEstimated(2);
        task1.setPersistanceId(1);
        task1.setPersistanceVersion(1);
        task1.setShortDescription("aa");
        
        task2.setOwner(user2);
        task2.setDaysEstimated(8);
        task2.setPersistanceId(1);
        task2.setPersistanceVersion(1);
        task2.setShortDescription("bb");

        // equals
        assertFalse(task1.equals(task2));
        // hascode
        assertFalse(task1.hashCode() == task2.hashCode());
        
    }

    
    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>ne nombre d'ideal days<li>
     * <li>le d�veloppeur</li>
     * </ul>
     * 
     * Test avec une description diff�rents, un nombre d'ideal days diff�rents, et des d�veloppeurs diff�rents 
     */
    public void testIsEqualsAndHashcodeWithDifferentShortDescriptionAndDifferentIdealDayAndDifferentDevelopper() {
    
        User user1 = new UserImpl();
        user1.setFirstName("Scooby");
        user1.setLastName("Doo");
        user1.setLogin("scoobydoo");
        user1.setPersistanceId(1);
        user1.setPersistanceVersion(1);
        
        User user2 = new UserImpl();
        user2.setFirstName("Bat");
        user2.setLastName("Man");
        user2.setLogin("batman");
        user2.setPersistanceId(1);
        user2.setPersistanceVersion(1);
        
        
        Task task1 = new TaskImpl();
        Task task2 = new TaskImpl();
        
        task1.setOwner(user1);
        task1.setDaysEstimated(2);
        task1.setPersistanceId(1);
        task1.setPersistanceVersion(1);
        task1.setShortDescription("aa");
        
        task2.setOwner(user2);
        task2.setDaysEstimated(8);
        task2.setPersistanceId(1);
        task2.setPersistanceVersion(1);
        task2.setShortDescription("bb");

        // equals
        assertFalse(task1.equals(task2));
        // hascode
        assertFalse(task1.hashCode() == task2.hashCode());
        
    }
    
    
    
    
    
    
    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>la description courte (short description)</li>
     * <li>ne nombre d'ideal days<li>
     * <li>le d�veloppeur</li>
     * </ul>
     * 
     * Test avec une description diff�rents et des d�veloppeurs diff�rents 
     */
    public void testIsEqualsAndHashcodeWithDifferentShortDescriptionAndSamedealDayAndDifferentDevelopper() {
    
        User user1 = new UserImpl();
        user1.setFirstName("Scooby");
        user1.setLastName("Doo");
        user1.setLogin("scoobydoo");
        user1.setPersistanceId(1);
        user1.setPersistanceVersion(1);
        
        User user2 = new UserImpl();
        user2.setFirstName("Bat");
        user2.setLastName("Man");
        user2.setLogin("batman");
        user2.setPersistanceId(1);
        user2.setPersistanceVersion(1);
        
        
        Task task1 = new TaskImpl();
        Task task2 = new TaskImpl();
        
        task1.setOwner(user1);
        task1.setDaysEstimated(2);
        task1.setPersistanceId(1);
        task1.setPersistanceVersion(1);
        task1.setShortDescription("aa");
        
        task2.setOwner(user2);
        task2.setDaysEstimated(2);
        task2.setPersistanceId(1);
        task2.setPersistanceVersion(1);
        task2.setShortDescription("bb");

        // equals
        assertFalse(task1.equals(task2));
        // hascode
        assertFalse(task1.hashCode() == task2.hashCode());
        
    }
    
    /**
     * Test que la somme des jours consommés par les charges est correcte 
     */
    public void testDaysCompleted() {

        // développeurs pour les charges
        User developpeur1 = new UserImpl();
        developpeur1.setLogin("scooby");
        User developpeur2 = new UserImpl();
        developpeur2.setLogin("doo");
        
        // création des charges
        Charge charge1 = new ChargeImpl();
        charge1.setTimeUsedToday(480);
        charge1.setUser(developpeur1);
        charge1.setDay(new Date());
        
        Charge charge2 = new ChargeImpl();
        charge2.setTimeUsedToday(120);
        charge2.setUser(developpeur2);
        charge2.setDay(new Date());
        
        // création de la liste
        Set<Charge> set = new HashSet<Charge>();
        
        set.add(charge1);
        set.add(charge2);
        
        // ajout de la liste � la t�che
        task.setCharges(set);
        
        // test
        assertEquals(600.0, task.daysCompleted());
        
    }
    
    /**
     * Test la somme des jours consommés lorsque la liste des charges est vide. <br>
     * la méthode doit retourner 0 
     */
    public void testDaysCompletedWhenChargesSetIsEmpty() {

        
        // cr�ation de la liste
        Set<Charge> set = new HashSet<Charge>();
        
        // ajout de la liste � la t�che
        task.setCharges(set);
        
        // test
        assertEquals(0.0, task.daysCompleted());
        
    }
    
    /**
     * Test que la somme des jours consommés lorsque la liste des charges est null. <br>
     * la méthode doit retourner 0 
     */
    public void testDaysCompletedWhenChargesSetIsNull() {
        
        // ajout de la liste � la t�che
        task.setCharges(null);
        
        // test
        assertEquals(0.0, task.daysCompleted());
        
    }
       
    /**
     * Test que la le nombre de jours restant est correct.<br>
     * Il s'agit de récupérer la plus récente valeur de charge.DaysNeededToFinish. </p>
     * 
     * Test la cas ou toutes les charges sont saisies à la date du jour ou avant.  
     */
    public void testDaysRemainingWithChargesTodayAndBeforeToday() {

        Calendar calendar = Calendar.getInstance();
        // aujourd'hui
        Date day1 = calendar.getTime();
        // hier
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 1);
        Date day2 = calendar.getTime();
        
        // d�veloppeurs pour les charges
        User developpeur1 = new UserImpl();
        developpeur1.setLogin("scooby");
        User developpeur2 = new UserImpl();
        developpeur2.setLogin("doo");
        
        // cr�ation des charges
        Charge charge1 = new ChargeImpl();
        charge1.setDaysNeededToFinish(60);
        charge1.setUser(developpeur1);
        charge1.setDay(day1);
        
        Charge charge2 = new ChargeImpl();
        charge2.setDaysNeededToFinish(120);
        charge2.setUser(developpeur2);
        charge2.setDay(day2);
        
        // cr�ation de la liste
        Set<Charge> set = new HashSet<Charge>();
        
        set.add(charge1);
        set.add(charge2);
        
        // ajout de la liste � la t�che
        task.setCharges(set);
        
        // test
        assertEquals(60.0, task.daysRemaining());
        
    }
    
    
    /**
     * Test que la le nombre de jours restant est correct.<br>
     * Il s'agit de récupérer la plus récente valeur de charge.MinutesNeededToFinish. </p>
     * 
     * Test le cas ou une charge est supérieure à la date du jour: on prend celle-ci.
     */
    public void testDaysRemainingWithChargesTodayBeforeTodayAndAfterToday() {

        Calendar calendar = Calendar.getInstance();
        // aujourd'hui
        Date day1 = calendar.getTime();
        // hier
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 1);
        Date day2 = calendar.getTime();
        // demain
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 2);
        Date day3 = calendar.getTime();
        
        // d�veloppeurs pour les charges
        User developpeur1 = new UserImpl();
        developpeur1.setLogin("scooby");
        User developpeur2 = new UserImpl();
        developpeur2.setLogin("doo");
        
        User developpeur3 = new UserImpl();
        developpeur3.setLogin("cartman");
        
        // cr�ation des charges
        Charge charge1 = new ChargeImpl();
        charge1.setDaysNeededToFinish(60);
        charge1.setUser(developpeur1);
        charge1.setDay(day1);
        
        Charge charge2 = new ChargeImpl();
        charge2.setDaysNeededToFinish(120);
        charge2.setUser(developpeur2);
        charge2.setDay(day2);
        
        Charge charge3 = new ChargeImpl();
        charge3.setDaysNeededToFinish(30);
        charge3.setUser(developpeur3);
        charge3.setDay(day3);
        
        // cr�ation de la liste
        Set<Charge> set = new HashSet<Charge>();
        
        set.add(charge1);
        set.add(charge2);
        set.add(charge3);
        
        // ajout de la liste � la t�che
        task.setCharges(set);
        
        // test
        assertEquals(30.0, task.daysRemaining());
        
    }


    /**
     * Test que la le nombre de jours restant est correct.<br>
     * Il s'agit de r�cup�rer la plus r�cente valeur de charge.DaysNeededToFinish. </p>
     * 
     * Test le cas ou plusieurs d�veloppeurs imputent sur la m�me t�che pour le m�me jour: on prend la somme. 
     */
    public void testDaysRemainingWithChargesTheSameDayBySeveralDeveloppeur() {

        Calendar calendar = Calendar.getInstance();
        // aujourd'hui
        Date day = calendar.getTime();
        
        // d�veloppeurs pour les charges
        User developpeur1 = new UserImpl();
        developpeur1.setLogin("scooby");
        User developpeur2 = new UserImpl();
        developpeur2.setLogin("doo");
        
        // cr�ation des charges
        Charge charge1 = new ChargeImpl();
        charge1.setDaysNeededToFinish(60);
        charge1.setUser(developpeur1);
        charge1.setDay(day);
        
        Charge charge2 = new ChargeImpl();
        charge2.setDaysNeededToFinish(30);
        charge2.setUser(developpeur2);
        charge2.setDay(day);
        
        // cr�ation de la liste
        Set<Charge> set = new HashSet<Charge>();
        
        set.add(charge1);
        set.add(charge2);
        
        // ajout de la liste � la t�che
        task.setCharges(set);
        
        // test
        assertEquals(90.0, task.daysRemaining());
        
    }

    
    /**
     * Test que la le nombre de jours restant est correct.</p>
     * 
     * Test le cas ou la liste des charges est vide: la méthode doit retourner le nombre de jour estimé.
     */
    public void testDaysRemainingWhenChargesSetIsEmpty() {
        
        // création de la liste
        Set<Charge> set = new HashSet<Charge>();
        
        // ajout de la liste à la tâche
        task.setCharges(set);
        
        task.setDaysEstimated(1.5);
        
        // test
        assertEquals(1.5, task.daysRemaining());
        
    }
    
    /**
     * Test que la le nombre de jours restant est correct.</p>
     * 
     * Test le cas ou la liste des charges est null: la m�thode doit retourner le nombre de jour estim�.
     */
    public void testDaysRemainingWhenChargesSetIsNull() {
        
        // ajout de la liste � la t�che
        task.setCharges(null);
        
        task.setDaysEstimated(3.5);
        
        // test
        assertEquals(3.5, task.daysRemaining());
        
    }

    /**
     * Donne le consomm� en pourcentage
     */
    public void testPercentCompleted() {
        
        // TODO comment tester unitairement cette m�thode ? car elle fait appel au r�sultat d'autres m�thodes de la classe !
        
    }
    
    /**
     * Donne le restant en pourcentage
     */
    public void testPercentRemaining() {
        
        // TODO comment tester unitairement cette m�thode ? car elle fait appel au r�sultat d'autres m�thodes de la classe !
        
    }


    /**
     * donne la diff�rence en pourcentage entre l'estim� et le r�alis�
     */
    public void testDifferenceInPercentBetweenEstimateAndCharge() {
        
        // TODO comment tester unitairement cette m�thode ? car elle fait appel au r�sultat d'autres m�thodes de la classe !        
    }
    
    
    /**
     * donne la diff�rence en minutes entre l'estim� et le r�alis�
     */
    public void testDifferenceInMinutesBetweenEstimateAndCharge() {
        
        // TODO comment tester unitairement cette m�thode ? car elle fait appel au r�sultat d'autres m�thodes de la classe !        
    }
    
    
    /**
     * Test le warning quand tout est ok.
     * la méthode doit retourner false
     */
    public void testWarning() {
    	
    	assertFalse(task.warning());
    	
    }
    
    /**
     * Test le warning quand la somme des charges est supérieure à celle de la task.
     * la méthode doit retourner true.
     */
    public void testWarningWhenDifferenceBetweenTaskEstimateAndChargeIsPositive() {
    	
    	task.setDaysEstimated(1);
    	
    	Charge charge = new ChargeImpl();
    	charge.setTimeUsedToday(1);
    	charge.setDaysNeededToFinish(0.5);
    	
    	task.setCharges(new HashSet<Charge>());
    	task.getCharges().add(charge);
    	
    	assertTrue(task.warning());   
     	
    }
    
    
//    /**
//     * Test quand la tâche est en cours :
//     * <ul>
//     * <li> des imputations sont faites (charges)</li>
//     * <li>et il reste du reste à faire</li>
//     * </ul>
//     */
//    public void testIsInProgressWhenChargesAreNotFinished() {
//    	
//    	task.setCharges(new HashSet<Charge>());
//    	
//    	Charge charge  = new ChargeImpl();
//    	
//        // aujourd'hui
//        Calendar calendar = Calendar.getInstance();
//        Date day = calendar.getTime();
//        
//    	charge.setDay(day);
//    	charge.setTimeUsedToday(1);
//    	charge.setDaysNeededToFinish(0.5);
//    	
//    	task.getCharges().add(charge);
//    	
//    	assertTrue(task.isInProgress());
//    	
//    }
//    
//    /**
//     * Test quand la tâche est terminée :
//     * <ul>
//     * <li> des imputations sont faites (charges)</li>
//     * <li>et il n'y as plus de reste à faire</li>
//     * </ul>
//     */
//    public void testIsInProgressWhenChargesAreFinished() {
//    	
//    	task.setCharges(new HashSet<Charge>());
//    	
//    	Charge charge  = new ChargeImpl();
//    	
//        // aujourd'hui
//        Calendar calendar = Calendar.getInstance();
//        Date day = calendar.getTime();
//        
//    	charge.setDay(day);
//    	charge.setTimeUsedToday(1);
//    	charge.setDaysNeededToFinish(0);
//    	
//    	task.getCharges().add(charge);
//    	
//    	assertFalse(task.isInProgress());
//    	
//    }
//    
//    /**
//     * Test quand la liste des charges est null.
//     * Is progress doit retourner false
//     */
//    public void testIsInProgressWhenChargesIsNull() {
//
//    	task.setCharges(null);
//    	
//    	assertFalse(task.isInProgress());
//    	
//    }
//    
//    
//    /**
//     * Test quand la liste des charges est vide.
//     * Is progress doit retourner false
//     */
//    public void testIsInProgressWhenChargesIsEmpty() {
//
//    	task.setCharges(new HashSet<Charge>());
//    	
//    	assertFalse(task.isInProgress());
//    	
//    }
//    
//    /**
//     * Test quand la liste des charges est null.
//     * IsCompleted doit retourner false
//     */
//    public void testIsFinishedWhenChargesIsNull() {
//
//    	task.setCharges(null);
//    	
//    	assertFalse(task.isCompleted());
//    	
//    }
//    
//    /**
//     * Test quand la liste des charges est vide.
//     * IsCompleted doit retourner false
//     */
//    public void testIsCompletedWhenChargesIsEmpty() {
//
//    	task.setCharges(new HashSet<Charge>());
//    	
//    	assertFalse(task.isCompleted());
//    	
//    }
//    
//
//    /**
//     * Test quand la tâche est en cours :
//     * <ul>
//     * <li> des imputations sont faites (charges)</li>
//     * <li>et il reste du reste à faire</li>
//     * </ul>
//     */
//    public void testIsCompletedWhenChargesAreNotFinished() {
//    	
//    	task.setCharges(new HashSet<Charge>());
//    	
//    	Charge charge  = new ChargeImpl();
//    	
//        // aujourd'hui
//        Calendar calendar = Calendar.getInstance();
//        Date day = calendar.getTime();
//        
//    	charge.setDay(day);
//    	charge.setTimeUsedToday(1);
//    	charge.setDaysNeededToFinish(0.5);
//    	
//    	task.getCharges().add(charge);
//    	
//    	assertFalse(task.isCompleted());
//    	
//    }
//    
//    /**
//     * Test quand la tâche est terminée :
//     * <ul>
//     * <li> des imputations sont faites (charges)</li>
//     * <li>et il n'y as plus de reste à faire</li>
//     * </ul>
//     */
//    public void testIsCompledWhenChargesAreFinished() {
//    	
//    	task.setCharges(new HashSet<Charge>());
//    	
//    	Charge charge  = new ChargeImpl();
//    	
//        // aujourd'hui
//        Calendar calendar = Calendar.getInstance();
//        Date day = calendar.getTime();
//        
//    	charge.setDay(day);
//    	charge.setTimeUsedToday(1);
//    	charge.setDaysNeededToFinish(0);
//    	
//    	task.getCharges().add(charge);
//    	
//    	assertFalse(task.isInProgress());
//    	
//    	
//    }

    
    /**
     * Test de l'état de la story quand elle n'a pas d�marr� car aucun jour de r�alis�.
     * <ul> 
     * <li>isInProgress doit retourner false</li>
     * <li>isCompleted doit retourner false</li>
     * <li>isLeft doit retourner true</li>
     * </ul>
     */
    public void testWhenWorkOnStoryHaventStart() {
    	
    	// TODO testWhenWorkOnStoryHaventStart
    	
    	// fail("A faire");
    	
    	/**
    	// t�ches mise � nulles pour que daysCompleted renvoit 0
    	story.setTasks(null);
    	
    	assertEquals(false, story.isInProgress());
    	assertEquals(false, story.isCompleted());
    	assertEquals(true, story.isLeft());
    	*/

    	
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
    	
    	// fail("A faire");
    	
    	/**
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
    	*/
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
    	
    	// TODO testWhenWorkOnStoryIsInProgress
    	
    	/**
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
    	
    	*/
    	
    }

    
}