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
import java.util.Locale;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.agilePlanning.domain.story.StoryValidator;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.TaskImpl;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class StoryValidatorTest extends TestCase {

    private StoryValidator validator;
    
    private Story story;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        validator = AgilePlanningObjectFactory.getStoryValidator();
        
        story = new StoryImpl();
        
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
        
        assertTrue("singleton", AgilePlanningObjectFactory.isSingleton("storyValidator"));
        
    }


    /**
     * Test la méthode isDeletable quand la story n'a pas de tasks.
     * Dans ce cas la story peut être supprimée
     */
    public void testIsDeletableWhenStoryTaskSetIsEmpty() {

    	story.setTasks(new HashSet<Task>());
    	
    	Errors errors = this.validator.validateForDelete(story);
    	
    	assertFalse(errors.hasErrors());    	
    }
    
    /**
     * Test la méthode isDeletable quand la story la liste des task est nulle.
     * Dans ce cas la story peut être supprimée
     */
    public void testIsDeletableWhenStoryTaskSetIsNull() {
    
    	story.setTasks(null);
    	
    	Errors errors = this.validator.validateForDelete(story);
    	
    	assertFalse(errors.hasErrors());    	

    	
    }
    
    
    /**
     * Test la méthode isDeletable quand la story a des tasks.
     * Dans ce cas la story ne peut être supprimée
     */
    public void testIsDeletableWhenStoryTaskIsNotEmpty() {
    	
    	Task task = new TaskImpl();
    	Set<Task> taskSet = new HashSet<Task>();
    	taskSet.add(task);
    	
    	story.setTasks(taskSet);
    	
    	Errors errors = this.validator.validateForDelete(story);
    	
    	assertTrue(errors.hasErrors());
    	
    	assertEquals("L'histoire ne peut pas être supprimée. Vous devez d'abord supprimer les tâches", errors.getGlobalError(Locale.FRENCH));
    	assertEquals("This story cannot be deleted. Delete tasks first", errors.getGlobalError(Locale.ENGLISH));
    	
    	

    	
    }
    
    
}
