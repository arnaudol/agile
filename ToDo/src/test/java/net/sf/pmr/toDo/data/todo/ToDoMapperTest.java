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

package net.sf.pmr.toDo.data.todo;

import java.util.Calendar;
import java.util.List;

import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.toDo.MapperTestCase;
import net.sf.pmr.toDo.ToDoObjectFactory;
import net.sf.pmr.toDo.domain.todo.ToDo;
import net.sf.pmr.toDo.domain.todo.ToDoImpl;

import org.dbunit.dataset.ITable;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.orm.hibernate3.HibernateOptimisticLockingFailureException;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 * 
 * $Header
 */
public class ToDoMapperTest extends MapperTestCase {
	
	private ToDoMapper toDoMapper;
	
	private ToDo toDoToUpdate;
	
	private ToDo toDoToAdd;
	
	private User ownerForAdd;
	
	private User ownerForUpdate;

    private Project projectForAdd;
      
    private Project projectForUpdate;
    
    private Calendar calendar;

    private static final String SELECT_TODO_TO_ADD  = "select * from TODO where description = 'faire le modèle de compte-rendu'";
      
    private static final String SELECT_TODO_TO_UPDATE  = "select * from TODO where id = 1";     

    private static final String SELECT_BASICPROJECT_FOR_ADD = "select * from PROJECT where id = 2";
      
    private static final String SELECT_BASICPROJECT_FOR_UPDATE = "select * from PROJECT where id = 3";

    private static final String SELECT_OWNER_FOR_ADD  = "select * from PMUSER where id = 1";
     
    private static final String SELECT_OWNER_FOR_UPDATE  = "select * from PMUSER where id = 2";
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        toDoMapper = ToDoObjectFactory.getToDoMapper();
        
        // build basic project
        projectForAdd = new ProjectImpl();
        projectForAdd.setCode("A");
        projectForAdd.setName("Super A");
        projectForAdd.setPersistanceId(2);
        projectForAdd.setPersistanceVersion(3);
        
        projectForUpdate = new ProjectImpl();
        projectForUpdate.setCode("B");
        projectForUpdate.setName("Super B");
        projectForUpdate.setPersistanceId(3);
        projectForUpdate.setPersistanceVersion(4);
        
        ownerForAdd = new UserImpl();
        ownerForAdd.setFirstName("Pon");
        ownerForAdd.setLastName("Fel");
        ownerForAdd.setLogin("ponfel");
        ownerForAdd.setPassword("password");
        ownerForAdd.setPersistanceId(2);
        ownerForAdd.setPersistanceVersion(1);
        ownerForAdd.setEmail("ponfel@worldcompany.com");
        
        ownerForUpdate = new UserImpl();
        ownerForUpdate.setFirstName("Arnaud");
        ownerForUpdate.setLastName("Prost");
        ownerForUpdate.setLogin("aprost");
        ownerForUpdate.setPassword("password");
        ownerForUpdate.setPersistanceId(2);
        ownerForUpdate.setPersistanceVersion(1);
        ownerForUpdate.setEmail("aprost@worldcompany.com");
        
        calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        calendar.set(Calendar.HOUR, 1);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        
        
        toDoToUpdate = new ToDoImpl();
        toDoToUpdate.setPersistanceId(1);
        toDoToUpdate.setDate(calendar.getTime());
        toDoToUpdate.setProject(projectForUpdate);
        toDoToUpdate.setDescription("préparer une réunion projet");
        toDoToUpdate.setDone(true);
        toDoToUpdate.setOwner(ownerForUpdate);
        toDoToUpdate.setPersistanceVersion(3);
        

        toDoToAdd = new ToDoImpl();
        toDoToAdd.setDate(calendar.getTime());
        toDoToAdd.setProject(projectForAdd);
        toDoToAdd.setDescription("faire le modèle de compte-rendu");
        toDoToAdd.setOwner(ownerForAdd);
        toDoToAdd.setDone(false);
        
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * test qu'il s'agit d'un singleton.
     */
    public void testIsASingleton() {
        assertTrue(ToDoObjectFactory.isSingleton("toDoMapper"));
    }
    
    
    /**
     * Test de la recherche d'un todo par id.
     * quand le todo est trouvée.
     */
    public void testFindByIdWhenToDoIsFound() {
    	
    	// recherche du toDo
    	ToDo TodoFound = (ToDo) this.toDoMapper.findById(1);
    	
    	// vérifie le résultat de la recherche
    	assertEquals(TodoFound.getDescription(), "préparer réunion projet");
    	// TODO comment tester les dates ?
    	//assertEquals(TodoFound.getDate(), toDoToUpdate.getDate());
    	assertFalse(TodoFound.isDone());
    	assertEquals(TodoFound.getPersistanceId(), toDoToUpdate.getPersistanceId());
    	assertEquals(TodoFound.getPersistanceVersion(), toDoToUpdate.getPersistanceVersion());
    	
    	
//    	// le lasy loading est activé dans le mapping hibernate
//    	// mais la session est fermée par hibernate --> on doit avoir une exception (ce qui nous permet de vérifier
//    	// que le lazy load est activé)
//    	try {
//    		TodoFound.getBasicProject().getCode();
//    		fail("should throw a org.hibernate.LazyInitializationException");
//    	} catch (LazyInitializationException e) {
//		} catch (Exception e) {
//    		fail("should throw a org.hibernate.LazyInitializationException");
//		}
//		
//		try {
//    		TodoFound.getOwner().getLogin();
//    		fail("should throw a org.hibernate.LazyInitializationException");
//    	} catch (LazyInitializationException e) {
//		} catch (Exception e) {
//    		fail("should throw a org.hibernate.LazyInitializationException");
//		} 
    }

    
    /**
     * Test de la recherche d'un todo par id.
     * quand le todo n'est pas trouvée.
     */
    public void testFindByIdWhenToDoIsNotFound() {
    	
    	// recherche du toDo
    	ToDo TodoFound = (ToDo) this.toDoMapper.findById(444);

    	assertNull(TodoFound);
    	
    }

    
    /**
     * test de l'ajout d'un ToDo quand tout est ok.
     */
    public void testAddOrUpdateWhenAdding() throws Exception {
    	
    	// ajout
    	toDoMapper.addOrUpdate(toDoToAdd);
    	
    	// contrôle en base
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TODO_TO_ADD);
        
		assertEquals("number of row", 1, databaseData.getRowCount());

		assertFalse("id", new Integer(0) == (Integer) databaseData.getValue(0, "id"));
		assertEquals(toDoToAdd.getProject().getPersistanceId(), databaseData.getValue(0, "pro_id"));
		assertEquals(toDoToAdd.getOwner().getPersistanceId(), databaseData.getValue(0, "pmu_id"));
		assertEquals(toDoToAdd.getDescription(), databaseData.getValue(0, "description"));
		assertEquals(toDoToAdd.isDone(), databaseData.getValue(0, "done"));
		// TODO comment tester les dates ?
		assertEquals(toDoToAdd.getPersistanceVersion(), databaseData.getValue(0, "version"));
    	
    }

    
    /**
     * test de la mise à jour d'un ToDo quand tout est ok.
     */
    public void testAddOrUpdateWhenUpdating() throws Exception {
    	
    	// ajout
    	toDoMapper.addOrUpdate(toDoToUpdate);
    	
    	// contrôle en base
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TODO_TO_UPDATE);
        
		assertEquals("number of row", 1, databaseData.getRowCount());

		assertEquals("id", new Integer(toDoToUpdate.getPersistanceId()), (Integer) databaseData.getValue(0, "id"));
		assertEquals(toDoToUpdate.getProject().getPersistanceId(), databaseData.getValue(0, "pro_id"));
		assertEquals(toDoToUpdate.getOwner().getPersistanceId(), databaseData.getValue(0, "pmu_id"));
		assertEquals(toDoToUpdate.getDescription(), databaseData.getValue(0, "description"));
		assertEquals(toDoToUpdate.isDone(), databaseData.getValue(0, "done"));
		// TODO comment tester les dates ?
		assertEquals(toDoToUpdate.getPersistanceVersion(), databaseData.getValue(0, "version"));
    	
    }

    /**
     * test de la suppression d'un ToDo quand tout est ok.
     */
    public void testDelete() throws Exception {
    	
    	// ajout
    	toDoMapper.delete(toDoToUpdate);
    	
    	// contrôle en base
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_TODO_TO_UPDATE);

		// contrôle que rien n'est trouvé
		assertEquals("number of row", 0, databaseData.getRowCount());
		
    	// contrôle en base que le projet n'est pas supprimé
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT_FOR_UPDATE);
		assertEquals("number of row", 1, databaseData.getRowCount());
		
    	// contrôle en base que le owner n'est pas supprime
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_OWNER_FOR_UPDATE);
		assertEquals("number of row", 1, databaseData.getRowCount());		

    	
    }

    
    /**
     * test de la mise à jour d'un ToDo quand il y a concurrence d'accès (grâce au numéro de verison).
     */
    public void testAddOrUpdateWhenUpdatingWithConcurrencyException() throws Exception {
    	
    	// modification du numéro de version
    	toDoToUpdate.setPersistanceVersion(2);
  
    	// ajout
    	try {
    		toDoMapper.addOrUpdate(toDoToUpdate);
    		fail("Il doit y avoir une HibernateOptimisticLockingFailureException");
		} catch (HibernateOptimisticLockingFailureException e) {
			// TODO: handle exception
		} catch (Exception e) {
    		fail("Il doit y avoir une HibernateOptimisticLockingFailureException");
		}
    	
    }


    /**
     * test de la suppression d'un ToDo quand il y a concurrence d'accès (grâce au numéro de verison).
     */
    public void testDeleteWithConcurrencyException() throws Exception {
    	
    	// modification du numéro de version
    	toDoToUpdate.setPersistanceVersion(2);
  
    	// ajout
    	try {
    		toDoMapper.delete(toDoToUpdate);
    		fail("Il doit y avoir une HibernateOptimisticLockingFailureException");
		} catch (HibernateOptimisticLockingFailureException e) {
			// TODO: handle exception
		} catch (Exception e) {
    		fail("Il doit y avoir une HibernateOptimisticLockingFailureException");
		}
    	
    }

    /**
     * test de l'ajout d'un ToDo. Contôle que le projet et le owner ne sont pas mis à jour
     * s'ils sont modifiés.
     */
    public void testAddOrUpdateWhenAddingDoesNotUpdateBasicProjectOrOwner() throws Exception {
    	
    	toDoToAdd.getProject().setName("scooby");
    	toDoToAdd.getOwner().setFirstName("doo");
    	
    	// ajout
    	toDoMapper.addOrUpdate(toDoToAdd);
    	
    	// contrôle en base pour le projet
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT_FOR_ADD);
		assertEquals("number of row", 1, databaseData.getRowCount());
		assertEquals("Super A", databaseData.getValue(0, "name"));
		
    	// contrôle en base pour le owner
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_OWNER_FOR_ADD);
		assertEquals("number of row", 1, databaseData.getRowCount());
		assertEquals("Pon", databaseData.getValue(0, "firstName"));		
    	
    }
    
    
    /**
     * test de la modification d'un ToDo. Contôle que le projet et le owner ne sont pas mis à jour
     * s'ils sont modifiés.
     */
    public void testAddOrUpdateWhenUpdatingDoesNotUpdateBasicProjectOrOwner() throws Exception {
    	
    	toDoToUpdate.getProject().setName("scooby");
    	toDoToUpdate.getOwner().setFirstName("doo");
    	
    	// ajout
    	toDoMapper.addOrUpdate(toDoToUpdate);
    	
    	// contrôle en base pour le projet
		ITable databaseData = getConnection().createQueryTable("ExpectedData", SELECT_BASICPROJECT_FOR_UPDATE);
		assertEquals("number of row", 1, databaseData.getRowCount());
		assertEquals("Super B", databaseData.getValue(0, "name"));
		
    	// contrôle en base pour le owner
		databaseData = getConnection().createQueryTable("ExpectedData", SELECT_OWNER_FOR_UPDATE);
		assertEquals("number of row", 1, databaseData.getRowCount());
		assertEquals("Arnaud", databaseData.getValue(0, "firstName"));		
    	
    }

    
    
    /**
     * test de l'ajout d'un ToDo. Contôle que le projet n'est pas ajouté.
     */
    public void testAddOrUpdateWhenAddingDoesNotAddBasicProject() throws Exception {
    	
    	toDoToAdd.getProject().setPersistanceId(0);
    	toDoToAdd.getProject().setPersistanceVersion(0);
    	toDoToAdd.getProject().setName("scooby");
    	
    	// ajout
    	try {
    		toDoMapper.addOrUpdate(toDoToAdd);
    		fail("une DataIntegrityViolationException doit être levée");
    	} catch (DataIntegrityViolationException e) {

		} catch (Exception e) {
			fail("une DataIntegrityViolationException doit être levée");
		}
    	
    }
    
    
    /**
     * test de la modification d'un ToDo. Contrôle que le projet n'est pas ajouté.
     */
    public void testAddOrUpdateWhenUpdatingDoesNotAddBasicProject() throws Exception {
    	
    	toDoToUpdate.getProject().setPersistanceId(0);
    	toDoToUpdate.getProject().setPersistanceVersion(0);
    	toDoToUpdate.getProject().setName("scooby");
    	
    	// ajout
    	try {
    		toDoMapper.addOrUpdate(toDoToUpdate);
    		fail("une TInvalidDataAccessApiUsageExceptionransientObjectException doit être levée");
    	} catch (InvalidDataAccessApiUsageException e) {

		} catch (Exception e) {
			fail("une InvalidDataAccessApiUsageException doit être levée");
		}
    	
    }

    
    /**
     * test de l'ajout d'un ToDo. Contôle que le owner n'est pas ajouté.
     * Le owner n'existe pas, une exception doit être levée
     */
    public void testAddOrUpdateWhenAddingDoesNotAddOwner() throws Exception {
    	
    	toDoToAdd.getOwner().setPersistanceId(0);
    	toDoToAdd.getOwner().setPersistanceVersion(0);
    	toDoToAdd.getOwner().setFirstName("doo");
    	
    	// ajout
    	try {
    		toDoMapper.addOrUpdate(toDoToAdd);
    		fail("une DataIntegrityViolationException doit être levée");
    	} catch (DataIntegrityViolationException e) {

		} catch (Exception e) {
			fail("une DataIntegrityViolationException doit être levée");
		}
    	
    	
    }
    

    /**
     * test de la mise à jour d'un ToDo. Contôle que le owner n'est pas ajouté.
     * Le owner n'existe pas, une exception doit être levée
     */
    public void testAddOrUpdateWhenUpdatingDoesNotAddOwner() throws Exception {
    	
    	toDoToUpdate.getOwner().setPersistanceId(0);
    	toDoToUpdate.getOwner().setPersistanceVersion(0);
    	toDoToUpdate.getOwner().setFirstName("doo");
    	
    	// ajout
    	try {
    		toDoMapper.addOrUpdate(toDoToUpdate);
    		fail("une TInvalidDataAccessApiUsageExceptionransientObjectException doit être levée");
    	} catch (InvalidDataAccessApiUsageException e) {

		} catch (Exception e) {
			fail("une InvalidDataAccessApiUsageException doit être levée");
		}    	
    	
    }
    
    /**
     * Test de la recherche des ToDo pour un user.
     * Des ToDo sont trouvés
     */
    public void testFindByUserPersistanceIdWhenToDosAreFound() {
    	
    	List list = toDoMapper.findByUserPersistanceId(1);
    	
    	// deux ToDo doivent être trouvés
    	assertEquals(2, list.size());
    	
    }
    
    
    /**
     * Test de la recherche des ToDo pour un user.
     * Des ToDo sont trouvés
     */
    public void testFindByUserPersistanceIdWhenToDosAreNotFound() {
    	
    	List list = toDoMapper.findByUserPersistanceId(99);
    	
    	// rien n'est trouvé
    	assertEquals(0, list.size());
    	
    }
    
    
    /**
     * Test de la recherche des ToDo pour un user et un projet.
     * Des ToDo sont trouvés
     */
    public void testFindByUserPersistanceIdAndByBasicProjectPersistanceId() {
    	
    	List<ToDo> list = toDoMapper.findByProjectPersistanceIdAndUserPersistanceId(2, 2);
    	
    	// un seul ToDo doit être trouvé
    	assertEquals(1, list.size());
    	
    	// contrôle que c'est le bon
    	for (ToDo todo : list) {
			assertEquals(3, todo.getPersistanceId());
		}
    	
    }
    
}
