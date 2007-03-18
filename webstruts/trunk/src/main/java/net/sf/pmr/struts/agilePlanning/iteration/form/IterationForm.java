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

package net.sf.pmr.struts.agilePlanning.iteration.form;

import java.util.Date;

import org.apache.struts.action.ActionForm;

public class IterationForm extends ActionForm {

    private Date start;

    private String startInString;

    private Date end;

    private String endInString;
    
    private int days;
    
    private int releasePersistanceId;

    private int persistanceId;

    private long persistanceVersion;
    

    public Date getEndDate() {
        return end;
    }

    public void setEndDate(final Date end) {
        this.end = end;

        if (end != null) {
            this.endInString = net.sf.pmr.struts.utils.DateFormatUtils.DateToString(end);
        } else {
            this.endInString = null;
        }

    }

    public String getEndDateInString() {
        return endInString;
    }

    public void setEndDateInString(String endInString) {
        this.endInString = endInString;

        if (endInString != null && endInString.trim() != "") {
           end =  net.sf.pmr.struts.utils.DateFormatUtils.StringToDate(endInString);
        } else {
            end = null;
        }

    }
    
    public int getReleasePersistanceId() {
        return releasePersistanceId;
    }

    public void setReleasePersistanceId(int releasePersistanceId) {
        this.releasePersistanceId = releasePersistanceId;
    }

    public int getPersistanceId() {
        return persistanceId;
    }

    public void setPersistanceId(final int persistanceId) {
        this.persistanceId = persistanceId;
    }

    public long getPersistanceVersion() {
        return persistanceVersion;
    }

    public void setPersistanceVersion(final long persistanceVersion) {
        this.persistanceVersion = persistanceVersion;
    }

    public Date getStartDate() {
        return start;
    }

    public void setStartDate(final Date start) {
        this.start = start;

        if (start != null) {
            this.startInString = net.sf.pmr.struts.utils.DateFormatUtils.DateToString(start);
        } else {
            startInString = null;
        }

    }

    public String getStartDateInString() {
        return startInString;
    }

    public void setStartDateInString(String startInString) {
        this.startInString = startInString;

        if (startInString != null && startInString.trim() != "") {
                start = net.sf.pmr.struts.utils.DateFormatUtils.StringToDate(startInString);
        } else {
            start = null;
        }

    }

	/**
	 * @return Returns the days.
	 */
	public int getDays() {
		return days;
	}

	/**
	 * @param days The days to set.
	 */
	public void setDays(int days) {
		this.days = days;
	}

}