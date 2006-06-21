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
package net.sf.pmr.toDo.service;

import java.util.Date;
import java.util.List;

import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectRepository;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.toDo.ToDoObjectFactory;
import net.sf.pmr.toDo.domain.todo.ToDo;
import net.sf.pmr.toDo.domain.todo.ToDoRepository;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ToDoServiceImpl implements ToDoService {
	
	/**
	 * ToDoRepository.
	 */
	private ToDoRepository toDoRepository;
	
	/**
	 * UserRepository.
	 */
	private UserRepository userRepository;
	
	/**
	 * basicProjectRepository.
	 */
	private BasicProjectRepository basicProjectRepository;

	/**
	 * constuctor.
	 * @param toDoRepository
	 * @param userRepository userRepository
	 * @param basicProjectRepository basicProjectrepository
	 */
	public ToDoServiceImpl(final ToDoRepository toDoRepository, final UserRepository userRepository, final BasicProjectRepository basicProjectRepository) {
		this.toDoRepository = toDoRepository;
		this.userRepository = userRepository;
		this.basicProjectRepository = basicProjectRepository;
	}

	/*
	 * (non-Javadoc)
	 * @see net.sf.pmr.toDo.service.ToDoService#add(java.lang.String, java.util.Date, boolean, int, int)
	 */
	public void add(final String description, final Date date,  final boolean done, final int userPersistanceId, final int basicProjectPersistanceId) {

		// récupération du todo
		ToDo toDo = ToDoObjectFactory.getToDo();
		
		// recherche du user
		User user = userRepository.findUserByPersistanceId(userPersistanceId);
		
		// recherche du basicProject
		BasicProject basicProject =  basicProjectRepository.findByPersistanceId(basicProjectPersistanceId);
		
		// mise à jour du todo
		toDo.setDescription(description);
		toDo.setDate(date);
		toDo.setDone(done);
		toDo.setBasicProject(basicProject);
		toDo.setOwner(user);
		
		// enregistrement
		toDoRepository.addOrUpdate(toDo);
		
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.service.ToDoService#delete(int, long)
	 */
	public void delete(final int persistanceId, final long persistanceVersion) {
		
		// recherche du toDo à supprimer
		ToDo toDoToDelete = this.toDoRepository.findByPersistanceId(persistanceId);
		
		if (toDoToDelete != null) {
			
			// mise à jour du numéro de version (pour la concurrence d'accès
			toDoToDelete.setPersistanceVersion(persistanceVersion);

			// suppression
			this.toDoRepository.delete(toDoToDelete);

		}
		
		
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.service.ToDoService#findByPersistanceId(int)
	 */
	public ToDo findByPersistanceId(final int persistanceId) {
		return this.toDoRepository.findByPersistanceId(persistanceId);
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.service.ToDoService#findByProjectPersistanceIdAndUserPersistanceId(int, int)
	 */
	public List<ToDo> findByProjectPersistanceIdAndUserPersistanceId(final int projetPersistanceId, final int userPersistanceId) {
		return this.toDoRepository.findByProjectPersistanceIdAndUserPersistanceId(projetPersistanceId, userPersistanceId);
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.service.ToDoService#findByUserPersistanceId(int)
	 */
	public List<ToDo> findByUserPersistanceId(final int userPersistanceId) {
		return this.toDoRepository.findByUserPersistanceId(userPersistanceId);
	}

	/*
	 * (non-Javadoc)
	 * @see net.sf.pmr.toDo.service.ToDoService#update(int, long, java.lang.String, java.util.Date, boolean)
	 */
	public void update(final int persistanceId, final long persistanceVersion, final String description, final Date date, final boolean done) {
		
		// recherche du todo à mettre à jour
		ToDo toDoToUpdate = this.toDoRepository.findByPersistanceId(persistanceId);
		
		// si l'object est trouvé
		if (toDoToUpdate != null) {
		
			// mise à jour des propriétés,
			toDoToUpdate.setDescription(description);
			toDoToUpdate.setDate(date);
			toDoToUpdate.setDone(done);
			
			// mise à jour de la repository
			this.toDoRepository.addOrUpdate(toDoToUpdate);
		
		}
		
	}
}
