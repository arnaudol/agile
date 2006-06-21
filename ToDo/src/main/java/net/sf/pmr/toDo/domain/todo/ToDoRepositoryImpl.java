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

import java.util.List;

import net.sf.pmr.core.domain.basicProject.BasicProjectProxyUtil;
import net.sf.pmr.toDo.data.todo.ToDoMapper;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * todo repository
 */
public class ToDoRepositoryImpl implements ToDoRepository {

    /**
     * mapper.
     */
    private ToDoMapper toDoMapper;
    
    /**
     * BasicProjectProxyUtil.
     */
    private BasicProjectProxyUtil basicProjectProxyUtil;


    /**
     * @param storyMapper storyMapper
     */
    public ToDoRepositoryImpl(final ToDoMapper toDoMapper, final BasicProjectProxyUtil basicProjectProxyUtil) {
        super();
        this.toDoMapper = toDoMapper;
        this.basicProjectProxyUtil = basicProjectProxyUtil;
    }


	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.todo.ToDoRepository#addOrUpdate(net.sf.pmr.todo.domain.todo.ToDo)
	 */
	public void addOrUpdate(final ToDo toDo) {
		
		// avant d'ajouter le toDo, on récupère la target du proxy
		toDo.setBasicProject(basicProjectProxyUtil.getTarget(toDo.getBasicProject()));
		
		toDoMapper.addOrUpdate(toDo);
		
	}


	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.todo.ToDoRepository#delete(net.sf.pmr.todo.domain.todo.ToDo)
	 */
	public void delete(final ToDo toDo) {
		
		// avant de supprimer le toDo, on récupère la target du proxy
		toDo.setBasicProject(basicProjectProxyUtil.getTarget(toDo.getBasicProject()));
		
		toDoMapper.delete(toDo);
		
		
	}


	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.todo.ToDoRepository#findById(int)
	 */
	public ToDo findByPersistanceId(final int persistanceId) {
		
		  ToDo toDo = (ToDo) toDoMapper.findById(persistanceId);
		  
		if (toDo != null) {
			toDo.setBasicProject(basicProjectProxyUtil.injectDependencies(toDo
					.getBasicProject()));
		}

		return toDo;
		
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.pmr.todo.domain.todo.ToDoRepository#findByProjectPersistanceIdAndUserPersistanceId(int,
	 *      int)
	 */
	public List<ToDo> findByProjectPersistanceIdAndUserPersistanceId(final int projetPersistanceId, final int userPersistanceId) {
		
	      List<ToDo> toDosToReturn = toDoMapper.findByProjectPersistanceIdAndUserPersistanceId(projetPersistanceId, userPersistanceId);
			
	      this.injectDependencies(toDosToReturn);
			
		  return toDosToReturn;

	}


	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.todo.ToDoRepository#findByUserPersistanceId(int)
	 */
	public List<ToDo> findByUserPersistanceId(final int userPersistanceId) {

      List<ToDo> toDosToReturn = toDoMapper.findByUserPersistanceId(userPersistanceId);
		
      this.injectDependencies(toDosToReturn);
		
	  return toDosToReturn;

	
	}
	
	/**
	 * inject dependencies for lasy load on BasicProject.
	 * @param stories stories
	 */
	private void injectDependencies(final List <ToDo> todos) {

		for (ToDo todo : todos) {
			todo.setBasicProject(basicProjectProxyUtil.injectDependencies(todo.getBasicProject()));
		} 
		
	}


}
