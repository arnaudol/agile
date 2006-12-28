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

package net.sf.pmr.agilePlanning.domain.story.task.charge;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.agilePlanning.domain.story.task.charge.ChargeImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ChargeTest extends TestCase {

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * test qu'il ne s'agit pas d'un singleton
     */
    public void testIsNotASingleton() {
        
        assertFalse(AgilePlanningObjectFactory.isSingleton("charge"));
    }
    
    /**
     * Le jour de charge est arrondi au jour pr�s. Les minutes, secondes... ne sont pas prises en comptes
     * Test que seul jour/mois/ann�e sont pris en compte
     */
    public void testDateIsRounded() {
        
        Charge charge = new ChargeImpl();
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        calendar.set(Calendar.HOUR_OF_DAY, 13);
        
        Date date = calendar.getTime();
        
        charge.setDay(date);
        
        Calendar calendarToCheck = Calendar.getInstance();
        calendarToCheck.setTime(charge.getDay());

       assertEquals(calendar.get(Calendar.DAY_OF_MONTH), calendarToCheck.get(Calendar.DAY_OF_MONTH));
       assertEquals(calendar.get(Calendar.MONTH), calendarToCheck.get(Calendar.MONTH));
       assertEquals(calendar.get(Calendar.YEAR), calendarToCheck.get(Calendar.YEAR));
       assertEquals(0, calendarToCheck.get(Calendar.HOUR_OF_DAY));
       assertEquals(0, calendarToCheck.get(Calendar.MINUTE));
       assertEquals(0, calendarToCheck.get(Calendar.SECOND));
       assertEquals(0, calendarToCheck.get(Calendar.MILLISECOND));
        
    }

    
    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>le jour</li>
     * <li>le d�veloppeur<li>
     * </ul>
     * 
     * Test avec des jours diff�rents. seul jour/mois/ann�e sont pris en compte
     */
    public void testIsEqualsAndHashcodeWithDifferentDays() {
        
        Charge charge1 = new ChargeImpl();
        Charge charge2 = new ChargeImpl();
        
        // developpeur
        User developper = new UserImpl();
        
        // jour1
        Calendar calendar = Calendar.getInstance();
        Date day1 = calendar.getTime();

        // jour2
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 1);
        Date day2 = calendar.getTime();
        
        charge1.setUser(developper);
        charge1.setDay(day1);
        charge1.setDaysNeededToFinish(60);
        charge1.setTimeUsedToday(120);
        
        charge2.setUser(developper);
        charge2.setDay(day2);
        charge2.setDaysNeededToFinish(60);
        charge2.setTimeUsedToday(120);
        
        assertFalse(charge1.equals(charge2));
        
    }
    
    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>le jour</li>
     * <li>le d�veloppeur<li>
     * </ul>
     * 
     * Test avec des d�veloppeurs diff�rents
     */
    public void testIsEqualsAndHashcodeWithDifferentDeveloppeurs() {
        
        Charge charge1 = new ChargeImpl();
        Charge charge2 = new ChargeImpl();
        
        // developpeur
        User developper1 = new UserImpl();
        developper1.setLogin("scooby");
        developper1.setLastName("scooby");
        
        User developper2 = new UserImpl();
        developper2.setLogin("doo");
        developper2.setLastName("doo");

        
        // jour1
        Calendar calendar = Calendar.getInstance();
        Date day = calendar.getTime();
        
        charge1.setUser(developper1);
        charge1.setDay(day);
        charge1.setDaysNeededToFinish(60);
        charge1.setTimeUsedToday(120);
        
        charge2.setUser(developper2);
        charge2.setDay(day);
        charge2.setDaysNeededToFinish(60);
        charge2.setTimeUsedToday(120);
        
        assertFalse(charge1.equals(charge2));
        
    }

    /**
     * l'�galit� de l'object est faite sur :
     * <ul>
     * <li>le jour</li>
     * <li>le d�veloppeur<li>
     * </ul>
     * 
     * Test quant tout est ok
     */
    public void testIsEqualsAndHashcodeWithSameDayAndSameDeveloppeurs() {
        
        Charge charge1 = new ChargeImpl();
        Charge charge2 = new ChargeImpl();
        
        // developpeur
        User developper = new UserImpl();
        developper.setLogin("scooby");
        developper.setLastName("scooby");
        
        // jour
        Calendar calendar = Calendar.getInstance();
        Date day = calendar.getTime();
        
        charge1.setUser(developper);
        charge1.setDay(day);
        charge1.setDaysNeededToFinish(60);
        charge1.setTimeUsedToday(120);
        
        charge2.setUser(developper);
        charge2.setDay(day);
        charge2.setDaysNeededToFinish(60);
        charge2.setTimeUsedToday(120);
        
        assertTrue(charge1.equals(charge2));
        
    }

}