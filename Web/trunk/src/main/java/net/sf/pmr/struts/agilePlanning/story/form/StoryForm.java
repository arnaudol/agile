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

package net.sf.pmr.struts.agilePlanning.story.form;

import org.apache.struts.action.ActionForm;

public class StoryForm extends ActionForm {
    
    
    /**
     * short description.
     */
    private String shortDescription;

    /**
     * description.
     */
    private String description;

    /**
     * estimate.
     */
    private double daysEstimated;

    /**
     * persistanceId.
     */
    private int persistanceId;

    /**
     * persistanceVersion.
     */
    private long persistanceVersion;
    
    
    /**
     * riskLevelId.
     */
    private int riskLevelId;
    
    /**
     * Business Value.
     */
    private int businessValueId;

    /**
     * days completed.
     */
    private double daysCompleted;
    
    /**
     * days Remaining.
     */
    private double daysRemaining;
    
    /**
     * percent Completed.
     */
    private double percentCompleted;
    
    /**
     * difference in percent between estimate and task estimate.
     */
    private double differenceInPercentBetweenEstimateAndTaskEstimate;
    
    /**
     * difference of days between estimate and task estimate.
     */
    private double differenceOfDaysBetweenEstimateAndTaskEstimate;

    /**
     * difference in percent between estimate and task charge.
     */
    private double differenceInPercentBetweenEstimateAndTaskCharge;
    
    /**
     * difference of days between estimate and task charge.
     */
    private double differenceOfDaysBetweenEstimateAndTaskCharge;
    
    public int getBusinessValueId() {
        return businessValueId;
    }

    public void setBusinessValueId(int businessValueId) {
        this.businessValueId = businessValueId;
    }

    public int getRiskLevelId() {
        return riskLevelId;
    }

    public void setRiskLevelId(int riskLevelId) {
        this.riskLevelId = riskLevelId;
    }


    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;

    }

    public double getDaysEstimated() {
        return this.daysEstimated;
    }

    public void setDaysEstimated(final double daysEstimated) {
        this.daysEstimated = daysEstimated;

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

	public String getPercentCompleted() {
		return Double.toString(percentCompleted) + "%";
	}

	public void setPercentCompleted(double percentCompleted) {
		this.percentCompleted = percentCompleted;
	}
    
    public String getDifferenceInPercentBetweenEstimateAndTaskCharge() {
    	return Double.toString(differenceInPercentBetweenEstimateAndTaskCharge) + "%";
	}

	public void setDifferenceInPercentBetweenEstimateAndTaskCharge(
			double differenceInPercentBetweenEstimateAndTaskCharge) {
		this.differenceInPercentBetweenEstimateAndTaskCharge = differenceInPercentBetweenEstimateAndTaskCharge;
	}

	public String getDifferenceInPercentBetweenEstimateAndTaskEstimate() {
		return Double.toString(differenceInPercentBetweenEstimateAndTaskEstimate) + "%";
	}

	public void setDifferenceInPercentBetweenEstimateAndTaskEstimate(
			double differenceInPercentBetweenEstimateAndTaskEstimate) {
		this.differenceInPercentBetweenEstimateAndTaskEstimate = differenceInPercentBetweenEstimateAndTaskEstimate;
	}

	public double getDifferenceOfDaysBetweenEstimateAndTaskCharge() {
		return differenceOfDaysBetweenEstimateAndTaskCharge;
	}

	public void setDifferenceOfDaysBetweenEstimateAndTaskCharge(
			double differenceOfDaysBetweenEstimateAndTaskCharge) {
		this.differenceOfDaysBetweenEstimateAndTaskCharge = differenceOfDaysBetweenEstimateAndTaskCharge;
	}

	public double getDifferenceOfDaysBetweenEstimateAndTaskEstimate() {
		return differenceOfDaysBetweenEstimateAndTaskEstimate;
	}

	public void setDifferenceOfDaysBetweenEstimateAndTaskEstimate(
			double differenceOfDaysBetweenEstimateAndTaskEstimate) {
		this.differenceOfDaysBetweenEstimateAndTaskEstimate = differenceOfDaysBetweenEstimateAndTaskEstimate;
	}

	public int getPersistanceId() {
        return persistanceId;
    }

    public final void setPersistanceId(final int persistanceId) {
        this.persistanceId = persistanceId;
    }

    public final long getPersistanceVersion() {
        return persistanceVersion;
    }

    public final void setPersistanceVersion(final long persistanceVersion) {
        this.persistanceVersion = persistanceVersion;
    }


}
