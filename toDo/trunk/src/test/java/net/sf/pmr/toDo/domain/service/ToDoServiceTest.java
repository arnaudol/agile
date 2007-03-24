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
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.project.ProjectRepository;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.toDo.ToDoObjectFactory;
import net.sf.pmr.toDo.domain.todo.ToDo;
import net.sf.pmr.toDo.domain.todo.ToDoImpl;
import net.sf.pmr.toDo.domain.todo.ToDoRepository;
import net.sf.pmr.toDo.service.ToDoService;
import net.sf.pmr.toDo.service.ToDoServiceImpl;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;


public class ToDoServiceTest extends TestCase {
	
    private ToDoRepository mockToDoRepository;
    
    private UserRepository mockUserRepository;
    
    private ProjectRepository mockProjectRepository;
    
    private ToDoService toDoService;
    
    private ToDo toDo;
    
    private IMocksControl mocksControl;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // create mocks
        mocksControl = EasyMock.createStrictControl();
        
        this.mockToDoRepository = mocksControl.createMock(ToDoRepository.class);
        
        this.mockUserRepository = mocksControl.createMock(UserRepository.class);
        
        this.mockProjectRepository = mocksControl.createMock(ProjectRepository.class);
        
        this.toDoService = new ToDoServiceImpl(mockToDoRepository, mockUserRepository, mockProjectRepository);
        
        this.toDo = new ToDoImpl();
        this.toDo.setPersistanceId(0);
        this.toDo.setPersistanceVersion(0);
        this.toDo.setDate(new Date());
        this.toDo.setDescription("");
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
     	
    	mocksControl.reset();
    	
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
        
    	EasyMock.expect(mockUserRepository.findUserByPersistanceId(1)).andReturn(user);
    	EasyMock.expect(mockProjectRepository.findByPersistanceId(2)).andReturn(project);
        
    	// mise à jour
    	mockToDoRepository.addOrUpdate(EasyMock.isA(ToDo.class));
    	
    	//this.mockToDoRepository.acceptAddOrUpdate(new Ignore());
    	
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
    	
    	// appel de la méthode
    	this.toDoService.add("réunion!", null, true, 1, 2);
    	
    	// contrôle de l'appel des méthodes
        mocksControl.verify();
    	
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
    	EasyMock.expect(mockToDoRepository.findByPersistanceId(1)).andReturn(toDo);
    	
    	// mise à jour
    	mockToDoRepository.addOrUpdate(EasyMock.isA(ToDo.class));

    	// check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
    	
    	// appel de la méthode
    	this.toDoService.update(1, 2, "réunion avec Bob", null, true);
    	
        // verify calls
        mocksControl.verify();
        
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
    	EasyMock.expect(mockToDoRepository.findByPersistanceId(1)).andReturn(toDo);

    	// check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
    	
    	// appel de la méthode
    	this.toDoService.update(1, 2, "réunion avec Bob", null, true);
    	
    	// contrôle de l'appel des méthodes
        mocksControl.verify();
    	
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
    	EasyMock.expect(mockToDoRepository.findByPersistanceId(1)).andReturn(toDo);
        
    	// suppression
    	mockToDoRepository.delete(toDo);
    	
    	// check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
    	
    	// appel de la méthode
    	this.toDoService.delete(1, 44);
    	
    	// contrôle de l'appel des méthodes
        mocksControl.verify();
        
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
    	EasyMock.expect(mockToDoRepository.findByPersistanceId(1)).andReturn(toDo);

    	// check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
    	
    	// appel de la méthode
    	this.toDoService.delete(1, 2);
    	
    	// contrôle de l'appel des méthodes
        mocksControl.verify();
    	
    }

    
}
