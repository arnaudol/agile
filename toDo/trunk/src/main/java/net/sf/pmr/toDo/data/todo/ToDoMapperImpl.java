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

import java.util.List;

import net.sf.pmr.keopsframework.domain.object.DomainObject;
import net.sf.pmr.toDo.domain.todo.ToDo;
import net.sf.pmr.toDo.domain.todo.ToDoImpl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ToDoMapperImpl extends HibernateDaoSupport implements ToDoMapper {

	/*
	 * (non-Javadoc)
	 * @see net.sf.pmr.keopsframework.data.DomainObjectAggregateMemberMapper#findById(int)
	 */
    public Object findById(final int id) {

        return getHibernateTemplate().get(ToDoImpl.class, new Integer(id));

    }


    /*
     * (non-Javadoc)
     * @see net.sf.pmr.keopsframework.data.DomainObjectRootAggregateMapper#addOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject)
     */
    public void addOrUpdate(final DomainObject toDo) {

        getHibernateTemplate().saveOrUpdate((ToDo) toDo);

    }

    /*
     * (non-Javadoc)
     * @see net.sf.pmr.keopsframework.data.DomainObjectRootAggregateMapper#delete(net.sf.pmr.keopsframework.domain.object.DomainObject)
     */
    public void delete(final DomainObject toDo) {

        getHibernateTemplate().delete((ToDo) toDo);

    }

    /*
     * (non-Javadoc)
     * @see net.sf.pmr.todo.data.todo.ToDoMapper#findByUserPersistanceId(int)
     */
	@SuppressWarnings("unchecked")
	public List<ToDo> findByUserPersistanceId(final int userPersistanceId) {
		
        return getHibernateTemplate()
        .find(
                "from net.sf.pmr.toDo.domain.todo.ToDoImpl toDo where toDo.Owner.PersistanceId = ? order by toDo.PersistanceId asc",
                new Integer(userPersistanceId));        
	}
	
	
	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.data.todo.ToDoMapper#findByProjectPersistanceIdAndUserPersistanceId(int, int)
	 */
	@SuppressWarnings("unchecked")
	public List<ToDo> findByProjectPersistanceIdAndUserPersistanceId(final int basicProjetPersistanceId, final int userPersistanceId) {
		

		return getHibernateTemplate()
		.findByNamedParam(
				"from net.sf.pmr.toDo.domain.todo.ToDoImpl toDo"
				+ " where toDo.Project.PersistanceId = :projectPersistanceId"
				+ " and toDo.Owner.PersistanceId = :userPersistanceId",
                new String[] {"projectPersistanceId", "userPersistanceId"},
                new Object[] {new Integer(basicProjetPersistanceId), new Integer(userPersistanceId)});

	}

}
