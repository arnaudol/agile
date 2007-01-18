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
import java.util.Locale;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.iteration.IterationImpl;
import net.sf.pmr.agilePlanning.domain.iteration.IterationValidator;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class IterationValidatorTest extends TestCase {

    private Iteration iteration;
    
    private IterationValidator validator;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        iteration = new IterationImpl();	
        
        validator = AgilePlanningObjectFactory.getIterationValidator();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * test que le validator est bien un singleton
     */
    public void testIsSingleton() {
        
        assertTrue("singleton", AgilePlanningObjectFactory.isSingleton("iterationValidator"));
        
    }
    
    
    /**
     * Test avec la date de d�but null
     */
    public void testWithStartDateIsNull() {
        
        iteration.setStart(null);
        
        Errors errors = validator.validate(iteration);
        
        assertTrue(errors.hasFieldErrors(IterationValidator.FIELD_START));
        
        // en anglais
        assertEquals("start date is mandatory", errors.getFieldError(IterationValidator.FIELD_START, Locale.ENGLISH));
        // en fran�ais
        assertEquals("la date de début est obligatoire", errors.getFieldError(IterationValidator.FIELD_START, Locale.FRENCH));
        
    }
    
    /**
     * Test avec la date de d�but renseign�e
     */
    public void testWithStartDateIsNotNull() {
        
        iteration.setStart(new Date());
        
        Errors errors = validator.validate(iteration);
        
        assertFalse(errors.hasFieldErrors(IterationValidator.FIELD_START));
        
    }
    
    /**
     * Test avec la date de fin null
     */
    public void testWithEndDateIsNull() {
        
        iteration.setEnd(null);
        
        Errors errors = validator.validate(iteration);
        
        assertTrue(errors.hasFieldErrors(IterationValidator.FIELD_END));
        
        // en anglais
        assertEquals("end date is mandatory", errors.getFieldError(IterationValidator.FIELD_END, Locale.ENGLISH));
        // en fran�ais
        assertEquals("la date de fin est obligatoire", errors.getFieldError(IterationValidator.FIELD_END, Locale.FRENCH));
        
    }
    
    /**
     * Test avec la date de d�but renseign�e
     */
    public void testWithEndDateIsNotNull() {
        
        iteration.setEnd(new Date());
        
        Errors errors = validator.validate(iteration);
        
        assertFalse(errors.hasFieldErrors(IterationValidator.FIELD_END));
        
    }

    
    /**
     * Test quand la date de fin est avant la date de d�but
     */
    public void testWithEndDateBeforeStartDate() {
        
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        end.setLenient(true);
        end.set(Calendar.DAY_OF_YEAR, start.get(Calendar.DAY_OF_YEAR)-1);
        
        iteration.setStart(start.getTime());
        iteration.setEnd(end.getTime());
        
        Errors errors = validator.validate(iteration);
        
        assertTrue(errors.hasGlobalErrors());
        
        // en anglais
        assertEquals("the completion date must be after the date of beginning", errors.getGlobalError(Locale.ENGLISH));
        // en fran�ais
        assertEquals("la date de fin doit être après la date de début", errors.getGlobalError(Locale.FRENCH));
        
    }
    
    /**
     * Test quand la date de fin et de d�but sont les m�mes
     */
    public void testWithEndDateHisTheSameThanStartDate() {
        
        iteration.setStart(new Date());
        iteration.setEnd(new Date());
        
        Errors errors = validator.validate(iteration);
        
        assertFalse(errors.hasErrors());
        
    }
    
    
    /**
     * Test quand la date de fin est apr�s la date de d�but
     */
    public void testWithEndDateAfterStartDate() {

        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        end.setLenient(true);
        end.set(Calendar.DAY_OF_YEAR, start.get(Calendar.DAY_OF_YEAR)+1);

        
        iteration.setStart(start.getTime());
        iteration.setEnd(end.getTime());
        
        Errors errors = validator.validate(iteration);
        
        assertFalse(errors.hasErrors());
        
    }


}
