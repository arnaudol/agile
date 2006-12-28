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

import java.util.Locale;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.TaskImpl;
import net.sf.pmr.agilePlanning.domain.story.task.TaskValidator;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.keopsframework.domain.validation.Errors;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * Task validator test
 */
public class ChargeValidatorTest extends TestCase {
    
    private TaskValidator validator;
    
    private Task task;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        validator = AgilePlanningObjectFactory.getTaskValidator();
        
        task = new TaskImpl();
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * test avec la description courte null
     * (le champs est obligatoire)
     */
    public void testWithShortDescriptionNull() {
        
        task.setPersistanceId(2);
        task.setDaysEstimated(3);
        task.setOwner(new UserImpl());
        task.setPersistanceVersion(5);
        task.setShortDescription(null);
        
        Errors errors = validator.validate(task);
        
        assertTrue(errors.hasFieldErrors(TaskValidator.FIELD_SHORT_DESCRIPTION));
        
        // en fran�ais
        assertEquals("la description courte est obligatoire", errors.getFieldError(TaskValidator.FIELD_SHORT_DESCRIPTION, Locale.FRENCH));
        
        // en anglais
        assertEquals("short description is mandatory", errors.getFieldError(TaskValidator.FIELD_SHORT_DESCRIPTION, Locale.ENGLISH));
        
        
    }
    
    /**
     * test avec la description courte � blanc
     * (le champs est obligatoire)
     */
    public void testWithShortDescriptionBlank() {
        
        task.setPersistanceId(2);
        task.setDaysEstimated(3);
        task.setOwner(new UserImpl());
        task.setPersistanceVersion(5);
        task.setShortDescription("  ");
        
        Errors errors = validator.validate(task);
        
        assertTrue(errors.hasFieldErrors(TaskValidator.FIELD_SHORT_DESCRIPTION));
        
        // en fran�ais
        assertEquals("la description courte est obligatoire", errors.getFieldError(TaskValidator.FIELD_SHORT_DESCRIPTION, Locale.FRENCH));
        
        // en anglais
        assertEquals("short description is mandatory", errors.getFieldError(TaskValidator.FIELD_SHORT_DESCRIPTION, Locale.ENGLISH));
        
        
    }

    
    /**
     * test avec la description courte non null
     * (le champs est obligatoire)
     */
    public void testWithShortDescriptionNotNull() {

        task.setPersistanceId(2);
        task.setDaysEstimated(3);
        task.setOwner(new UserImpl());
        task.setPersistanceVersion(5);
        task.setShortDescription("super");
        
        Errors errors = validator.validate(task);
        
        assertFalse(errors.hasFieldErrors(TaskValidator.FIELD_SHORT_DESCRIPTION));

        
    }

}