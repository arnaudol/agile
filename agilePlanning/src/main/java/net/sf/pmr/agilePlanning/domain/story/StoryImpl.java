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

import java.util.Set;

import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectProxyUtil;
import net.sf.pmr.core.domain.project.ProjectProxyUtilImpl;
import net.sf.pmr.core.utils.Math;
import net.sf.pmr.keopsframework.domain.object.AbstractDomainObject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class StoryImpl extends AbstractDomainObject implements Story {

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
     * tasks.
     */
    private Set<Task> tasks;

    /**
     * Project.
     */
    private Project project;

    /**
     * BusinessValue.
     */
    private BusinessValue businessValue;

    /**
     * risk level.
     */
    private RiskLevel riskLevel;

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#getShortDescription()
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#setShortDescription(java.lang.String)
     */
    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#getDescription()
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#setDescription(java.lang.String)
     */
    public void setDescription(final String description) {
        this.description = description;

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#getDaysEstimated()
     */
    public double getDaysEstimated() {
        return this.daysEstimated;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#setDaysEstimated(double)
     */
    public void setDaysEstimated(final double estimate) {
        this.daysEstimated = estimate;

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#getTasks()
     */
    public Set<Task> getTasks() {
        return this.tasks;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#setTasks(java.util.List)
     */
    public void setTasks(final Set<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#getProject()
     */
    public Project getProject() {
        return project;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#setProject(BasicProject)
     */
    public void setProject(final Project basicProject) {
        this.project = basicProject;
    }

    /*
     * @see net.sf.pmr.agilePlanning.domain.story.Story#getBusinessValue()
     */
    public BusinessValue getBusinessValue() {
        return this.businessValue;
    }

    public RiskLevel getRiskLevel() {
        return this.riskLevel;
    }

    public void setBusinessValue(final BusinessValue businessValue) {
        this.businessValue = businessValue;
    }

    public void setRiskLevel(final RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#daysCompleted()
     */
    public double daysCompleted() {

        double daysCompleted = 0;

        // if task is null, return 0
        if (tasks != null) {
            // else sum task.daysCompleted()
            for (Task task : tasks) {
                daysCompleted = daysCompleted + task.daysCompleted();
            }

        }

        return daysCompleted;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#daysRemaining()
     */
    public double daysRemaining() {

        double daysRemaining = 0;

        // if task is null or empty return the days estimated
        if (tasks != null && !tasks.isEmpty()) {
            // else sum task.daysRemaining()
            for (Task task : tasks) {
                daysRemaining = daysRemaining + task.daysRemaining();
            }
        } else {
            daysRemaining = this.daysEstimated;
        }

        return daysRemaining;
    }

    public double differenceInPercentBetweenEstimateAndTaskEstimate() {

        double differenceInPercent = 0;

        if (getDaysEstimated() > 0) {

            differenceInPercent = ((getDaysEstimated() + differenceOfDaysBetweenEstimateAndTaskEstimate()) * 100)
                    / getDaysEstimated();

        }

        return Math.round(differenceInPercent, 2);

    }

    public double differenceOfDaysBetweenEstimateAndTaskEstimate() {

        double differenceOfDays = 0;

        // if task is null or empty, return 0
        if (tasks != null && tasks.size() > 0) {

            double daysEstimatedForTasks = 0;
            // else sum task.getDaysEstimated()

            for (Task task : tasks) {
                daysEstimatedForTasks = daysEstimatedForTasks
                        + task.getDaysEstimated();
            }

            differenceOfDays = daysEstimatedForTasks - getDaysEstimated();

        }

        return differenceOfDays;

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#percentCompleted()
     */
    public double percentCompleted() {

        double percentCompletedToReturn = 0;

        if (daysCompleted() + daysRemaining() != 0) {
            percentCompletedToReturn = (daysCompleted() * 100)
                    / (daysCompleted() + daysRemaining());
        }

        return Math.round(percentCompletedToReturn, 2);

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#percentRemaining()
     */
    public double percentRemaining() {
        return 100 - percentCompleted();
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#differenceInPercentBetweenEstimateAndTaskCharge()
     */
    public double differenceInPercentBetweenEstimateAndTaskCharge() {

        double differenceInPercent = 0;

        if (daysCompleted() + daysRemaining() != 0) {
            differenceInPercent = (daysEstimated * 100)
                    / (daysCompleted() + daysRemaining());
        }

        return Math.round(differenceInPercent, 2);

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#differenceOfDaysBetweenEstimateAndTaskCharge()
     */
    public double differenceOfDaysBetweenEstimateAndTaskCharge() {
        return daysCompleted() + daysRemaining() - daysEstimated;
    }

    public boolean warning() {

        if (this.differenceOfDaysBetweenEstimateAndTaskEstimate() > 0
                || this.differenceOfDaysBetweenEstimateAndTaskCharge() > 0) {
            return true;
        }

        return false;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#isInProgress()
     */
    public boolean isInProgress() {

        // si aucun jours de réalisés, la story n'a pas débuté
        if (this.daysCompleted() == 0) {
            return false;
        }

        // si la tâche a débuté
        if (this.daysCompleted() > 0 && this.daysRemaining() == 0) {
            return false;
        }

        return true;

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#isCompleted()
     */
    public boolean isCompleted() {

        // des jours ont été utilisé et aucun jours restant
        if (this.daysCompleted() > 0 && this.daysRemaining() == 0) {
            return true;
        }

        return false;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.Story#isLeft()
     */
    public boolean isLeft() {

        // aucun jour utilisé, la story n'a pas commencé.
        if (daysCompleted() == 0) {
            return true;
        }

        return false;

    }


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
    public boolean equals(final Object object) {
        if (!(object instanceof StoryImpl)) {
            return false;
        }

        // TODO : trouver mieux...
        ProjectProxyUtil basicProjectProxyUtil = new ProjectProxyUtilImpl();
        
        StoryImpl rhs = (StoryImpl) object;
        return new EqualsBuilder().append(this.shortDescription,
                rhs.shortDescription).append(basicProjectProxyUtil.getTarget(this.project),
                		basicProjectProxyUtil.getTarget(rhs.project)).isEquals();
        
        
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
    	
        // TODO : trouver mieux...
        ProjectProxyUtil projectProxyUtil = new ProjectProxyUtilImpl();
    	
        return new HashCodeBuilder(258479881, -53180989).append(
                this.shortDescription).append(projectProxyUtil.getTarget(this.project)).toHashCode();
    }

}
