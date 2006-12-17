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

package net.sf.pmr.struts.agilePlanning.story.view;


public class StoryView {

    /**
     * persistanceId
     */
    private int persistanceId;
    
    /**
     * persistanceVersion
     */
    private long persistanceVersion;
    
    /**
     * short description
     */
    private String shortDescription;

    /**
     * description
     */
    private String description;

    /**
     * daysEstimated
     */
    private double daysEstimated;
    
    /**
     * tasks
     */
    private int numberOfTask;
    
    /**
     * riskLevel
     */
    private String riskLevel;
    
    /**
     * BusinessValue
     */
    private String businessValue;
    
    /**
     * percent completed
     */
    private double percentCompleted;

    
    private boolean warning;
    

    public double getPercentCompleted() {
		return this.percentCompleted ;
	}

	public void setPercentCompleted(double percentCompleted) {
		this.percentCompleted = percentCompleted;
	}

	public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getBusinessValue() {
		return businessValue;
	}

	public void setBusinessValue(String businessValue) {
		this.businessValue = businessValue;
	}

	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDaysEstimated() {
        return daysEstimated;
    }

    public void setDaysEstimated(double daysEstimated) {
        this.daysEstimated = daysEstimated;
    }

    public int getNumberOfTask() {
        return numberOfTask;
    }

    public void setNumberOfTask(int numberOfTask) {
        this.numberOfTask = numberOfTask;
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

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

    
}
