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

package net.sf.pmr.agilePlanning.data.story.task;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.MapperTestCase;
import net.sf.pmr.agilePlanning.data.story.task.TaskMapper;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.TaskImpl;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class TaskMapperTest extends MapperTestCase {

    private TaskMapper taskMapper;
    
    private Task TaskToFind;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        taskMapper = AgilePlanningObjectFactory.getTaskMapper();
        
        // build task to find
        TaskToFind = new TaskImpl();
        TaskToFind.setOwner(null);
        TaskToFind.setDaysEstimated(80);
        TaskToFind.setPersistanceId(1);
        TaskToFind.setPersistanceVersion(2);
        TaskToFind.setShortDescription("première tâche à modifier");
        
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
        assertTrue(AgilePlanningObjectFactory.isSingleton("taskMapper"));
    }

    
    
    /**
     * test quand la task est trouv�e
     */
    public void testFindByIdWhenTaskIsFound() {
        
        Task task = (Task) taskMapper.findById(TaskToFind.getPersistanceId());
        
        assertEquals("id", TaskToFind.getPersistanceId(), task.getPersistanceId());
        assertEquals("daysestimated", TaskToFind.getDaysEstimated(), task.getDaysEstimated());
        assertEquals("shortDescription", TaskToFind.getShortDescription(), task.getShortDescription());
        assertEquals("version", TaskToFind.getPersistanceVersion(), task.getPersistanceVersion());
                
    }
    
    /**
     * test quand la story n'est pas trouv�e
     */
    public void testFindByIdWhenTaskIsNotFound(){
        
        Task task = (Task) taskMapper.findById(555);

        assertNull(task);

    }
    
    // TODO Comment tester que le developper n'est pas charg� ?

}