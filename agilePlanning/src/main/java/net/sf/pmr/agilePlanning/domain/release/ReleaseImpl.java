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
package net.sf.pmr.agilePlanning.domain.release;

import java.util.Date;
import java.util.Set;

import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.keopsframework.domain.object.AbstractDomainObject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ReleaseImpl extends AbstractDomainObject implements Release {

    /**
     * project.
     */
    private Project project;

    /**
     * number.
     */
    private String number;

    /**
     * date.
     */
    private Date date;
    
    /**
     * stories.
     */
    private Set<Story> stories;

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.Release#getBasicProject()
     */
    public Project getProject() {
        return project;
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.Release#setBasicProject(net.sf.pmr.core.domain.project.BasicProject)
     */
    public void setProject(final Project project) {
        this.project = project;
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.Release#getNumber()
     */
    public String getNumber() {
        return number;
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.Release#setNumber(java.lang.String)
     */
    public void setNumber(final String number) {
        this.number = number;

    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.Release#getDate()
     */
    public Date getDate() {
        return date;
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.Release#setDate(java.util.Date)
     */
    public void setDate(final Date date) {
        this.date = date;

    }
    
    
    /* (non-Javadoc) 
	 * @return Returns the stories.
	 */
	public Set<Story> getStories() {
		return stories;
	}

	/* (non-Javadoc)
	 * @param stories The stories to set.
	 */
	public void setStories(Set<Story> stories) {
		this.stories = stories;
	}

	
	
	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.release.Release#warning()
	 */
	public boolean warning() {
		
		// si la liste des story est null ou vide, pas de warning
		if (this.stories == null || this.stories.isEmpty()) {
			return false;
		} else {
			for (Story story : stories) {
				
				if (story.warning()) {
					return true;
				}
			}
		}
		
		return false;
		
		
	}

	/**
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(final Object object) {
        if (!(object instanceof ReleaseImpl)) {
            return false;
        }
        ReleaseImpl rhs = (ReleaseImpl) object;
        return new EqualsBuilder().append(this.project, rhs.project).append(this.number, rhs.number).isEquals();
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(-746013211, 836163745).append(this.project).append(this.number).toHashCode();
    }
}
