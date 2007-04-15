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

package net.sf.pmr.agilePlanning.domain.story;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class BusinessValueImpl implements BusinessValue, Serializable {
    
    /**
     * Id.
     */
    private int id;
    
    /**
     * Description.
     */
    private String description;

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.BusinessValue#getDescription()
     */
    public String getDescription() {
        return description;
    }

 
    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.BusinessValue#setDescription(java.lang.String)
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.BusinessValue#getId()
     */
    public int getId() {
        return id;
    }


    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.BusinessValue#setId(int)
     */
    public void setId(final int id) {
        this.id = id;
    }


	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof BusinessValueImpl)) {
			return false;
		}
		BusinessValueImpl rhs = (BusinessValueImpl) object;
		return new EqualsBuilder().append(
				this.description, rhs.description)
				.isEquals();
	}


	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(601447893, 145848409).append(this.description)
				.toHashCode();
	}
	
	
    
}
