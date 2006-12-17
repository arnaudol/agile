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

package net.sf.pmr.struts.agilePlanning.task.form;

import org.apache.struts.action.ActionForm;

public class TaskForm extends ActionForm {

	
	private double differenceInPercentBetweenEstimateAndCharge;
	
	private double differenceOfDaysBetweenEstimateAndCharge;
	
	private double daysCompleted;
	
	private double daysRemaining;
	
	private double percentCompleted;
	
	private double percentRemaining;

	private boolean warning;
	 
    /**
     * number minutes estimated
     */
    private double daysEstimated;

    /**
     * short description
     */
    private String shortDescription;
    
    /**
     * description
     */
    private String description;


    /**
     * developper
     */
    private int developperPersistanceId;

    /**
     * storyPersistanceId
     */
    private int storyPersistanceId;

    /**
     * persistanceId
     */
    private int persistanceId;

    /**
     * persistanceVersion
     */
    private long persistanceVersion;

    public double getDaysEstimated() {
        return daysEstimated;
    }

    public void setDaysEstimated(double daysEstimated) {
        this.daysEstimated = daysEstimated;
    }

    public int getDevelopperPersistanceId() {
        return developperPersistanceId;
    }

    public void setDevelopperPersistanceId(int developperPersistanceId) {
        this.developperPersistanceId = developperPersistanceId;
    }

    public int getStoryPersistanceId() {
        return storyPersistanceId;
    }

    public void setStoryPersistanceId(int storyPersistanceId) {
        this.storyPersistanceId = storyPersistanceId;
    }

    public int getPersistanceId() {
        return persistanceId;
    }

    public void setPersistanceId(int persistanceId) {
        this.persistanceId = persistanceId;
    }

    public long getPersistanceVersion() {
        return persistanceVersion;
    }

    public void setPersistanceVersion(long persistanceVersion) {
        this.persistanceVersion = persistanceVersion;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public double getDaysCompleted() {
		return daysCompleted;
	}

	public void setDaysCompleted(double daysCompleted) {
		this.daysCompleted = daysCompleted;
	}

	public double getDaysRemaining() {
		return daysRemaining;
	}

	public void setDaysRemaining(double daysRemaining) {
		this.daysRemaining = daysRemaining;
	}

	public double getDifferenceInPercentBetweenEstimateAndCharge() {
		return differenceInPercentBetweenEstimateAndCharge;
	}

	public void setDifferenceInPercentBetweenEstimateAndCharge(
			double differenceInPercentBetweenEstimateAndCharge) {
		this.differenceInPercentBetweenEstimateAndCharge = differenceInPercentBetweenEstimateAndCharge;
	}

	public double getDifferenceOfDaysBetweenEstimateAndCharge() {
		return differenceOfDaysBetweenEstimateAndCharge;
	}

	public void setDifferenceOfDaysBetweenEstimateAndCharge(
			double differenceOfDaysBetweenEstimateAndCharge) {
		this.differenceOfDaysBetweenEstimateAndCharge = differenceOfDaysBetweenEstimateAndCharge;
	}

	public double getPercentCompleted() {
		return percentCompleted;
	}

	public void setPercentCompleted(double percentCompleted) {
		this.percentCompleted = percentCompleted;
	}

	public double getPercentRemaining() {
		return percentRemaining;
	}

	public void setPercentRemaining(double percentRemaining) {
		this.percentRemaining = percentRemaining;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

    
    
}
