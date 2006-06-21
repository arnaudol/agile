/*
* Copyright 2006 Arnaud Prost
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

package net.sf.pmr.toDo.domain.todo;

import java.util.Date;

import junit.framework.TestCase;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.toDo.ToDoObjectFactory;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ToDoTest extends TestCase {
    
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
     * test qu'il s'agit d'un singleton
     */
    public void testIsNotASingleton() {
        
        assertFalse(ToDoObjectFactory.isSingleton("toDo"));
    }
    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>la description</li>
     * <li>le project</li>
     * <li>le owner</li>
     * </ul>
     * 
     * Test avec des descriptions différentes
     */
    public void testIsEqualsAndHashcodeWithDifferentDescriptions() {
        
    	ToDo toDo1 = new ToDoImpl();
    	ToDo toDo2 = new ToDoImpl();
    	
   	    BasicProject basicProject = new BasicProjectImpl();
        
        Date date = new Date();
        
        User owner = new UserImpl();
        
        // les descriptions sont différentes
        toDo1.setPersistanceId(1);
        toDo1.setDate(date);
        toDo1.setDescription("première description");
        toDo1.setOwner(owner);
        toDo1.setBasicProject(basicProject);
        toDo1.setPersistanceVersion(2);
        
        toDo2.setPersistanceId(1);
        toDo2.setDate(date);
        toDo2.setDescription("seconde description");
        toDo2.setOwner(owner);
        toDo2.setBasicProject(basicProject);
        toDo2.setPersistanceVersion(2);
        
        assertFalse(toDo1.equals(toDo2));
        assertFalse(toDo1.hashCode() == toDo2.hashCode());
        
    }
    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>la description</li>
     * <li>le project</li>
     * <li>le owner</li> 
     * </ul>
     * 
     * Test avec des projets différents
     */
    public void testIsEqualsAndHashcodeWithDifferentProjects() {
        
    	ToDo toDo1 = new ToDoImpl();
    	ToDo toDo2 = new ToDoImpl();
    	
   	    BasicProject basicProject1 = new BasicProjectImpl();
   	    basicProject1.setCode("code1");
   	    basicProject1.setName("name1");
        
   	    BasicProject basicProject2 = new BasicProjectImpl();
	    basicProject2.setCode("code2");
	    basicProject2.setName("name2");
   	    
        Date date = new Date();
        
        User owner = new UserImpl();
        
        // les descriptions sont différentes
        toDo1.setPersistanceId(1);
        toDo1.setDate(date);
        toDo1.setDescription("description");
        toDo1.setOwner(owner);
        toDo1.setBasicProject(basicProject1);
        toDo1.setPersistanceVersion(2);
        
        toDo2.setPersistanceId(1);
        toDo2.setDate(date);
        toDo2.setDescription("description");
        toDo2.setOwner(owner);
        toDo2.setBasicProject(basicProject2);
        toDo2.setPersistanceVersion(2);
        
        assertFalse(toDo1.equals(toDo2));
        assertFalse(toDo1.hashCode() == toDo2.hashCode());
        
    }

    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>la description</li>
     * <li>le project</li>
     * <li>le owner</li> 
     * </ul>
     * 
     * Test avec des owner différents
     */
    public void testIsEqualsAndHashcodeWithDifferentOwner() {
        
    	ToDo toDo1 = new ToDoImpl();
    	ToDo toDo2 = new ToDoImpl();
    	
   	    BasicProject basicProject = new BasicProjectImpl();
   	    basicProject.setCode("code1");
   	    basicProject.setName("name1");
   	    
        Date date1 = new Date();
        Date date2 = new Date();
        
        User owner1 = new UserImpl();
        owner1.setLogin("login1");
        
        User owner2 = new UserImpl();
        owner2.setLogin("login2");
        
        // les owner sont différents
        toDo1.setPersistanceId(1);
        toDo1.setDate(date1);
        toDo1.setDescription("description");
        toDo1.setOwner(owner1);
        toDo1.setBasicProject(basicProject);
        toDo1.setPersistanceVersion(2);
        
        toDo2.setPersistanceId(1);
        toDo2.setDate(date2);
        toDo2.setDescription("description");
        toDo2.setOwner(owner2);
        toDo2.setBasicProject(basicProject);
        toDo2.setPersistanceVersion(2);
        
        assertFalse(toDo1.equals(toDo2));
        assertFalse(toDo1.hashCode() == toDo2.hashCode());
        
    }
    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>la description</li>
     * <li>le project</li>
     * <li>le owner</li> 
     * </ul>
     * 
     * Test avec les même descriptions et le même project
     */
    public void testIsEqualsAndHashcodeWithSameDescriptionAndSameProjectAndSameOwner() {
        
    	ToDo toDo1 = new ToDoImpl();
    	ToDo toDo2 = new ToDoImpl();
    	
   	    BasicProject basicProject = new BasicProjectImpl();
   	    basicProject.setCode("code1");
   	    basicProject.setName("name1");
   	    
        Date date1 = new Date();
        Date date2 = new Date();
        
        User owner = new UserImpl();
        owner.setLogin("login1");
        
        
        // les descriptions sont différentes
        toDo1.setPersistanceId(1);
        toDo1.setDate(date1);
        toDo1.setDescription("description");
        toDo1.setOwner(owner);
        toDo1.setBasicProject(basicProject);
        toDo1.setPersistanceVersion(2);
        
        toDo2.setPersistanceId(2);
        toDo2.setDate(date2);
        toDo2.setDescription("description");
        toDo2.setOwner(owner);
        toDo2.setBasicProject(basicProject);
        toDo2.setPersistanceVersion(3);
        
        assertTrue(toDo1.equals(toDo2));
        assertTrue(toDo1.hashCode() == toDo2.hashCode());
        
    }

}