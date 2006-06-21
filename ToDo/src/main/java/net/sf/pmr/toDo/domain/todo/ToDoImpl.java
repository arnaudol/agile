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

import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.keopsframework.domain.object.AbstractDomainObject;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ToDoImpl extends AbstractDomainObject implements ToDo {

    /**
     * description.
     */
    private String description;
    
    /**
     * date.
     */
    private Date date;

    /**
     * Basic project.
     */
    private BasicProject basicProject;
    
    /**
     * Owner.
     */
    private User owner;
    
    /**
     * is the toDo done ?
     */
    private boolean done;

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.story.ToDo#getBasicProject()
	 */
	public BasicProject getBasicProject() {
		return basicProject;
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.story.ToDo#setBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject)
	 */
	public void setBasicProject(final BasicProject basicProject) {
		this.basicProject = basicProject;
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.story.ToDo#getDate()
	 */
	public Date getDate() {
		return date;
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.story.ToDo#setDate(java.util.Date)
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.story.ToDo#getDescription()
	 */
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.story.ToDo#setDescription(java.lang.String)
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * @see net.sf.pmr.toDo.domain.todo.ToDo#isDone()
	 */
	public boolean isDone() {
		return done;
	}

	/*
	 * (non-Javadoc)
	 * @see net.sf.pmr.toDo.domain.todo.ToDo#setDone(boolean)
	 */
	public void setDone(boolean done) {
		this.done = done;
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.todo.ToDo#getOwner()
	 */
	public User getOwner() {
		return this.owner;
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.todo.domain.todo.ToDo#setOwner(net.sf.pmr.core.domain.user.User)
	 */
	public void setOwner(final User owner) {
		this.owner = owner;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(final Object object) {
		if (!(object instanceof ToDoImpl)) {
			return false;
		}
		ToDoImpl rhs = (ToDoImpl) object;
		return new EqualsBuilder().append(
				this.basicProject, rhs.basicProject).append(this.owner,
				rhs.owner).append(this.description, rhs.description).isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(1252424663, 549631693).append(this.basicProject).append(this.owner)
				.append(this.description).toHashCode();
	}

}
