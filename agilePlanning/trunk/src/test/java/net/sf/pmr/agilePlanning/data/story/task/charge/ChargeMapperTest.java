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

package net.sf.pmr.agilePlanning.data.story.task.charge;

import java.util.Calendar;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.MapperTestCase;
import net.sf.pmr.agilePlanning.data.story.task.charge.ChargeMapper;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.agilePlanning.domain.story.task.charge.ChargeImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ChargeMapperTest extends MapperTestCase {

    private ChargeMapper chargeMapper;
    
    private Charge chargeToFind;
    
    /**
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        chargeMapper = AgilePlanningObjectFactory.getChargeMapper();
                
        // build charge to find
        chargeToFind = new ChargeImpl();

        Calendar calendar = Calendar.getInstance();
        
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 03);
        
        User user = new UserImpl();
        user.setPersistanceId(1);
        user.setPersistanceVersion(2);

        chargeToFind.setPersistanceId(1);
        chargeToFind.setDay(calendar.getTime());
        chargeToFind.setTimeUsedToday(1);
        chargeToFind.setDaysNeededToFinish(2);
        chargeToFind.setUser(user);
        chargeToFind.setPersistanceVersion(2);
        
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
        assertTrue(AgilePlanningObjectFactory.isSingleton("chargeMapper"));
    }

    
    
    /**
     * test quand la task est trouv�e
     */
    public void testFindByIdWhenChargeIsFound() {
        
        Charge charge = (Charge) chargeMapper.findById(chargeToFind.getPersistanceId());
        
		assertEquals("id", chargeToFind.getPersistanceId(), charge.getPersistanceId());
		assertEquals("pmu_id", chargeToFind.getUser().getPersistanceId(), charge.getUser().getPersistanceId());
		assertEquals("day", chargeToFind.getDay(), charge.getDay());
		assertEquals("timeused", chargeToFind.getTimeUsedToday(), charge.getTimeUsedToday());
		assertEquals("daysneededtofinish", chargeToFind.getDaysNeededToFinish(), charge.getDaysNeededToFinish());
		assertEquals("version", chargeToFind.getPersistanceVersion(), charge.getPersistanceVersion());
                
    }
    
    /**
     * test quand la charge n'est pas trouv�e
     */
    public void testFindByIdWhenChargeIsNotFound(){
        
        Charge charge = (Charge) chargeMapper.findById(555);

        assertNull(charge);

    }

}