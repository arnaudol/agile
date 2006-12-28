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

package net.sf.pmr.agilePlanning.domain.release;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.release.ReleaseImpl;
import net.sf.pmr.agilePlanning.domain.release.ReleaseValidator;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ReleaseValidatorTest extends TestCase {

    private ReleaseValidator validator;
    
    private Release release;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        validator = AgilePlanningObjectFactory.getReleaseValidator();
        
        release = new ReleaseImpl();
        
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
        
        assertTrue("singleton", AgilePlanningObjectFactory.isSingleton("releaseValidator"));
        
    }
    
    /**
     * Test que la date de la release (saisie) est supérieure
     * ou égale � la date du jour.
     * Attention, seul le jour, mois, année sont pris en compte
     */
    
    /**
     * Test quand la date est null
     * la validation doit �chouer
     */
    public void testWhithDateIsnull() {
        
        release.setDate(null);
        
        Errors errors = validator.validate(release);
        
        assertTrue(errors.hasFieldErrors(ReleaseValidator.FIELD_DATE));
        // message en Français
        assertEquals("la date est obligatoire", errors.getFieldError(ReleaseValidator.FIELD_DATE, Locale.FRENCH));
        // message en anglais
        assertEquals("date is mandatory", errors.getFieldError(ReleaseValidator.FIELD_DATE, Locale.ENGLISH));

    }
    
    /**
     * Test quand la date est avant celle du jour
     */
    public void testWithDateIsBeforeToday(){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(true);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) -1 );
        
        release.setDate(calendar.getTime());
        
        Errors errors = validator.validate(release);
        
        assertTrue(errors.hasFieldErrors(ReleaseValidator.FIELD_DATE));
        // message en Français
        assertEquals("la date doit être antérieure à la date du jour", errors.getFieldError(ReleaseValidator.FIELD_DATE, Locale.FRENCH));
        // message en anglais
        assertEquals("date must be former to the current date", errors.getFieldError(ReleaseValidator.FIELD_DATE, Locale.ENGLISH));
        
    }
    
    /**
     * Test quand la date est celle du jour
     */
    public void testWithDateIsToday(){
        
        release.setDate(new Date());
        
        Errors errors = validator.validate(release);
        
        assertTrue(errors.hasFieldErrors(ReleaseValidator.FIELD_DATE));
        // message en Français
        assertEquals("la date doit être antérieure à la date du jour", errors.getFieldError(ReleaseValidator.FIELD_DATE, Locale.FRENCH));
        // message en anglais
        assertEquals("date must be former to the current date", errors.getFieldError(ReleaseValidator.FIELD_DATE, Locale.ENGLISH));

        
    }
    
    
    /**
     * Test quand la date est après celle du jour
     */
    public void testWithDateIsAfterToday(){
        
        
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(true);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) +1 );
        
        release.setDate(calendar.getTime());
        
        Errors errors = validator.validate(release);
        
        assertFalse(errors.hasFieldErrors(ReleaseValidator.FIELD_DATE));

        
    }

    /**
     * Test quand la date est null
     *
     */
    public void testNumberIsNull() {
        
        release.setNumber(null);
        
        Errors errors = validator.validate(release);
        
        assertTrue(errors.hasFieldErrors(ReleaseValidator.FIELD_NUMBER));
        // message en Français
        assertEquals("le numéro de release est obligatoire", errors.getFieldError(ReleaseValidator.FIELD_NUMBER, Locale.FRENCH));
        // message en anglais
        assertEquals("release number is mandatory", errors.getFieldError(ReleaseValidator.FIELD_NUMBER, Locale.ENGLISH));        
        
    }
    
    /**
     * Test quand la date est null
     *
     */
    public void testNumberIsBlank() {
        
        release.setNumber("  ");
        
        Errors errors = validator.validate(release);
        
        assertTrue(errors.hasFieldErrors(ReleaseValidator.FIELD_NUMBER));
        // message en Français
        assertEquals("le numéro de release est obligatoire", errors.getFieldError(ReleaseValidator.FIELD_NUMBER, Locale.FRENCH));
        // message en anglais
        assertEquals("release number is mandatory", errors.getFieldError(ReleaseValidator.FIELD_NUMBER, Locale.ENGLISH));        
        
    }
    
    /**
     * Test quand la date n'est pas null
     *
     */
    public void testNumberIsNotNull() {
        
        release.setNumber("1");
        
        Errors errors = validator.validate(release);
        
        assertFalse(errors.hasFieldErrors(ReleaseValidator.FIELD_NUMBER));
        
    }
    
    
    
    
    
    /**
     * Test la méthode isDeletable quand la release n'a pas de story car la liste est vide.
     * Dans ce cas la release peut être supprimée
     */
    public void testIsDeletableWhenStorySetIsEmpty() {

    	release.setStories(new HashSet<Story>());
    	
    	Errors errors = this.validator.validateForDelete(release);
    	
    	assertFalse(errors.hasErrors());    	
    }
    
    /**
     * Test la méthode isDeletable quand la release n'a pas de story car la liste est nulle.
     * Dans ce cas la release peut être supprimée
     */
    public void testIsDeletableWhenStoryTaskSetIsNull() {
    
    	release.setStories(null);
    	
    	Errors errors = this.validator.validateForDelete(release);
    	
    	assertFalse(errors.hasErrors());    	

    	
    }
    
    
    /**
     * Test la méthode isDeletable quand la release a des stories.
     * Dans ce cas la release ne peut être supprimée
     */
    public void testIsDeletableWhenStoryTaskIsNotEmpty() {
    	
    	Story story = new StoryImpl();
    	Set<Story> storySet = new HashSet<Story>();
    	storySet.add(story);
    	
    	release.setStories(storySet);
    	
    	Errors errors = this.validator.validateForDelete(release);
    	
    	assertTrue(errors.hasErrors());
    	
    	assertEquals("La release ne peut pas être supprimée. Vous devez d'abord supprimer les histoires", errors.getGlobalError(Locale.FRENCH));
    	assertEquals("This release cannot be deleted. Delete stories first", errors.getGlobalError(Locale.ENGLISH));
      	
    }
    
}
