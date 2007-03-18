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

package net.sf.pmr.struts.agilePlanning.charge.form;

import java.util.Date;

import org.apache.struts.action.ActionForm;

public class ChargeForm extends ActionForm {

    /**
     * Day of the charge
     */
    private Date day;
    
    /**
     * Day of the chargeInString
     */
    private String dayInString;
    
    /**
     * double
     */
    private double timeUsedToday;
    
    /**
     * number of days
     */
    private double daysNeededToFinish;
    
    /**
     * storyPersistanceId
     */
    private int  storyPersistanceId;
    
    /**
     * taskPersistanceId
     */
    private int taskPersistanceId;
    
    /**
     * persistanceId
     */
    private int persistanceId;
    
    /**
     * persistance version
     */
    private long persistanceVersion;
    

	/**
	 * @return Returns the day.
	 */
	public Date getDay() {
		return day;
	}

	/**
	 * @param day The day to set.
	 */
	public void setDay(Date day) {
		this.day = day;
		
        if (day != null) {
            this.dayInString = net.sf.pmr.struts.utils.DateFormatUtils.DateToString(day);
        } else {
            dayInString = null;
        }

	}
	
    public void setDayInString(String dayInString) {
        this.dayInString = dayInString;

        if (dayInString != null) {
                day = net.sf.pmr.struts.utils.DateFormatUtils.StringToDate(dayInString);
        } else {
            day = null;
        }

    }
    
    public String getDayInString() {
        return dayInString;
    }



	/**
	 * @return Returns the daysNeededToFinish.
	 */
	public double getDaysNeededToFinish() {
		return daysNeededToFinish;
	}

	/**
	 * @param daysNeededToFinish The daysNeededToFinish to set.
	 */
	public void setDaysNeededToFinish(double daysNeededToFinish) {
		this.daysNeededToFinish = daysNeededToFinish;
	}

	/**
	 * @return Returns the timeUsedToday.
	 */
	public double getTimeUsedToday() {
		return timeUsedToday;
	}

	/**
	 * @param timeUsedToday The timeUsedToday to set.
	 */
	public void setTimeUsedToday(double timeUsedToday) {
		this.timeUsedToday = timeUsedToday;
	}

	/**
	 * @return Returns the storyPersistanceId.
	 */
	public int getStoryPersistanceId() {
		return storyPersistanceId;
	}

	/**
	 * @param storyPersistanceId The storyPersistanceId to set.
	 */
	public void setStoryPersistanceId(int storyPersistanceId) {
		this.storyPersistanceId = storyPersistanceId;
	}

	/**
	 * @return Returns the taskPersistanceId.
	 */
	public int getTaskPersistanceId() {
		return taskPersistanceId;
	}

	/**
	 * @param taskPersistanceID The taskPersistanceId to set.
	 */
	public void setTaskPersistanceId(int taskPersistanceId) {
		this.taskPersistanceId = taskPersistanceId;
	}

	/**
	 * @return Returns the persistanceId.
	 */
	public int getPersistanceId() {
		return persistanceId;
	}

	/**
	 * @param persistanceId The persistanceId to set.
	 */
	public void setPersistanceId(int persistanceId) {
		this.persistanceId = persistanceId;
	}

	/**
	 * @return Returns the persistanceVersion.
	 */
	public long getPersistanceVersion() {
		return persistanceVersion;
	}

	/**
	 * @param persistanceVersion The persistanceVersion to set.
	 */
	public void setPersistanceVersion(long persistanceVersion) {
		this.persistanceVersion = persistanceVersion;
	}

	
	
	
}