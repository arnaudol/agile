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

package net.sf.pmr.struts.agilePlanning.iteration.view;

import java.util.Date;

import net.sf.pmr.struts.utils.DateFormatUtils;

/**
 * @author arnaud.prost@gmail.com
 */
public class IterationView {

	/**
	 * start.
	 */
    private Date start;

    /**
     * end.
     */
    private Date end;

    /**
     * persistance id.
     */
    private int persistanceId;
    
    /**
     * percent completed.
     */
    private double percentCompleted;


    public String getEndInString() {
    	return  DateFormatUtils.DateToString(end);
    }
    
    public Date getEnd() {
        return end;
    }

    public void setEnd(final Date end) {
        this.end = end;
    }

    public int getPersistanceId() {
        return persistanceId;
    }

    public void setPersistanceId(final int persistanceId) {
        this.persistanceId = persistanceId;
    }

    public String getStartInString() {
    	return  DateFormatUtils.DateToString(start);
    }

    
    public Date getStart() {
        return start;
    }

    public void setStart(final Date start) {
        this.start = start;
    }

	/**
	 * @return Returns the percentCompleted.
	 */
	public double getPercentCompleted() {
		return percentCompleted;
	}

	/**
	 * @param percentCompleted The percentCompleted to set.
	 */
	public void setPercentCompleted(double percentCompleted) {
		this.percentCompleted = percentCompleted;
	}
    
    
}
