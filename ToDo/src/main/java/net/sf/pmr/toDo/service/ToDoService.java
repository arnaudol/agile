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

import net.sf.pmr.toDo.domain.todo.ToDo;

/**
 * @author arnaud.prost@gmail.com
 */
public interface ToDoService {

	/**
	 * find a ToDo by his persistanceId.
	 * @param persistanceId persistanceId of the ToDo
	 * @return Repository found
	 */
	ToDo findByPersistanceId(final int persistanceId);

	/**
	 * Add a ToDo.
	 * @param description to add
	 * @param date date for the todo
	 * @param done is the todo done ?
	 * @param userPersistanceId  user for the ToDo
	 * @param basicProjectPersistanceId basicProject for the ToDo 
	 */
	void add(final String description, final Date date, final boolean done, final int userPersistanceId, final int basicProjectPersistanceId);
	
	/**
	 * Add or update a ToDo.
	 * @param persistanceId persistanceId of the ToDo
	 * @param persistanceVersion persistanceVersion of the ToDo
	 * @param description description of the todo 
	 * @param date date
	 * @param done done
	 */
	void update(final int persistanceId, final long persistanceVersion, final String description, final Date date, final boolean done);


	/**
	 * Delete a ToDo.
	 * @param persistanceId persistanceId of the ToDo
	 * @param persistanceVersion persistanceVersion of the ToDo
	 */
	void delete(final int persistanceId, final long persistanceVersion);

	/**
	 * find the toDos for a user and for a projet.
	 * @param projetPersistanceId project persistance id
	 * @param userPersistanceId user persistance id
	 * @return a set of toDos
	 */
	List<ToDo> findByProjectPersistanceIdAndUserPersistanceId(
			final int projetPersistanceId, final int userPersistanceId);
	
	/**
	 * find the toDos for a user.
	 * @param userPersistanceId user persistance id
	 * @return a set of toDos
	 */
	List<ToDo> findByUserPersistanceId(final int userPersistanceId);
	
}
