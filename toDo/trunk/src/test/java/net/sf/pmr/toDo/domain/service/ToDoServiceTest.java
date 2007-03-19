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

package net.sf.pmr.toDo.domain.service;

import java.util.Date;

import junit.framework.TestCase;
import net.sf.pmr.core.domain.project.MockProjectRepository;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.user.MockUserRepository;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.toDo.ToDoObjectFactory;
import net.sf.pmr.toDo.domain.todo.MockToDoRepository;
import net.sf.pmr.toDo.domain.todo.ToDo;
import net.sf.pmr.toDo.domain.todo.ToDoImpl;
import net.sf.pmr.toDo.service.ToDoService;
import net.sf.pmr.toDo.service.ToDoServiceImpl;
import de.abstrakt.mock.MockCore;
import de.abstrakt.mock.expectable.Ignore;


public class ToDoServiceTest extends TestCase {
	
    private MockToDoRepository mockToDoRepository;
    
    private MockUserRepository mockUserRepository;
    
    private MockProjectRepository mockProjectRepository;
    
    private ToDoService toDoService;
    
    private ToDo toDo;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        this.mockToDoRepository = new MockToDoRepository();
        
        this.mockUserRepository = new MockUserRepository();
        
        this.mockProjectRepository = new MockProjectRepository();
        
        this.toDoService = new ToDoServiceImpl(mockToDoRepository, mockUserRepository, mockProjectRepository);
        
        this.toDo = new ToDoImpl();
        this.toDo.setPersistanceId(0);
        this.toDo.setPersistanceVersion(0);
        this.toDo.setDate(new Date());
        this.toDo.setDescription("");
        
        MockCore.reset();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * test que le repository est bien un singleton.
     */
    public void testIsASingleton() {

        assertTrue("singleton", ToDoObjectFactory.isSingleton("toDoService"));

    }

    /**
     * test du service d'ajout.
     * Un objet doit être : 
     * <ul>
     * <li>le user est recherché</li>
     * <li>le basicProject est recherché</li> 
     * <li>récupération de la factory</li>
     * <li>mis à jour</li>
     * <li>envoyé au repository</li>
     * </ul>
     */
    public void testAdd() {
    	
    	User user = new UserImpl();
    	user.setPersistanceId(1);
    	Project project = new ProjectImpl();
    	project.setPersistanceId(2);
    	
    	toDo.setDescription("réunion!");

    	// recherche du user et du basicProject
    	MockCore.startBlock();
        
    	this.mockUserRepository.expectFindUserById(1, user);
    	this.mockProjectRepository.expectFindByPersistanceId(2, project);
    	
    	MockCore.endBlock();
        
    	// mise à jour
    	this.mockToDoRepository.acceptAddOrUpdate(new Ignore());
    	
    	// appel de la méthode
    	this.toDoService.add("réunion!", null, true, 1, 2);
    	
    	// contrôle de l'appel des méthodes
    	MockCore.verify();
    	
    }

    
    /**
     * test du service de mise à jour.
     * le ToDo doit être : 
     * <ul>
     * <li>recherché</li>
     * <li>mis à jour</li> 
     * <li>envoyé au repository</li>
     * </ul>
     */
    public void testUpdate() {
    	
    	User user = new UserImpl();
    	user.setPersistanceId(2);
    	Project project = new ProjectImpl();
    	project.setPersistanceId(3);

    	toDo.setProject(project);
    	toDo.setOwner(user);
    	toDo.setDescription("");
    	toDo.setDone(false);
    	toDo.setPersistanceId(1);
    	toDo.setPersistanceVersion(2);
    	
    	// recherche du todo à mettre à jour
    	this.mockToDoRepository.expectFindByPersistanceId(1, toDo);
        
    	// mise à jour
    	this.mockToDoRepository.acceptAddOrUpdate(new Ignore());
    	
    	// appel de la méthode
    	this.toDoService.update(1, 2, "réunion avec Bob", null, true);
    	
    	// contrôle de l'appel des méthodes
    	MockCore.verify();
    	
    	// contrôle que l'object est mis à jour
    	assertEquals(1, toDo.getPersistanceId());
    	assertEquals("réunion avec Bob", toDo.getDescription());
    	assertTrue(toDo.isDone());
    	assertSame(project, toDo.getProject());
    	assertSame(user, toDo.getOwner());
    	assertEquals(2, toDo.getPersistanceVersion());
    	
    }
    
    
    /**
     * test du service de mise à jour dans le cas ou il n'est pas trouvé dans la repository.
     * le ToDo doit être : 
     * <ul>
     * <li>recherché</li>
     * <li>et c'est tout (pas de mise à jour ou d'erreur renvoyée)</li> 
     * </ul>
     */
    public void testUpdateWhenToDoToUpdateIsNotFound() {
    	
    	this.toDo = null;
    	
    	// recherche du todo à mettre à jour
    	this.mockToDoRepository.expectFindByPersistanceId(1, toDo);
    	
    	// appel de la méthode
    	this.toDoService.update(1, 2, "réunion avec Bob", null, true);
    	
    	// contrôle de l'appel des méthodes
    	MockCore.verify();
    	
    }

    /**
     * test du service de suppression.
     * le ToDo doit être : 
     * <ul>
     * <li>recherché</li>
     * <li>envoyé au repository pour suppression</li>
     * </ul>
     */
    public void testDelete() {
    	
    	// recherche du todo à mettre à jour
    	this.mockToDoRepository.expectFindByPersistanceId(1, this.toDo);
        
    	// suppression
    	this.mockToDoRepository.expectDelete(toDo);
    	
    	// appel de la méthode
    	this.toDoService.delete(1, 44);
    	
    	// contrôle de l'appel des méthodes
    	MockCore.verify();
    	
    	// test de la mise à jour du numéro de version
    	assertEquals(44, toDo.getPersistanceVersion());
    	
    }


    /**
     * test du service de suppression quand rient n'est rouvé à supprimer.
     * le ToDo doit être : 
     * <ul>
     * <li>recherché</li>
     * </ul>
     */
    public void testDeleteWhenToDoToDeleteIsNotFound() {
    	
    	this.toDo = null;
    	
    	// recherche du todo à mettre à jour
    	this.mockToDoRepository.expectFindByPersistanceId(1, toDo);
    	
    	// appel de la méthode
    	this.toDoService.delete(1, 2);
    	
    	// contrôle de l'appel des méthodes
    	MockCore.verify();
    	
    }

    
}
