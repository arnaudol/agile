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
import net.sf.pmr.keopsframework.domain.object.DomainObject;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * A story is a customer requirement.
 */
public interface Story extends DomainObject {

    /**
     * short description <br>
     * i.e.: display, compute ...
     * @return shortDescription
     */
    String getShortDescription();

    /**
     * short description.
     * @param shortDescription short description
     */
    void setShortDescription(final String shortDescription);

    /**
     * description.
     * @return description
     */
    String getDescription();

    /**
     * description.
     * @param description description
     */
    void setDescription(final String description);

    /**
     * first estimate.
     * @return first estimate
     */
    double getDaysEstimated();

    /**
     * first estimate.
     * @param estimate : first estimate
     */
    void setDaysEstimated(final double estimate);

    /**
     * tasks fot the story.
     * @return tasks
     */
    Set<Task> getTasks();

    /**
     * tasks fot the story.
     * @param tasks tasks
     */
    void setTasks(final Set<Task> tasks);

    /**
     * basic project.
     * @return basic project
     */
    Project getProject();

    /**
     * basic project.
     * @param basicProject basic project
     */
    void setProject(final Project project);
    
    
    /**
     * business value.
     * @return business value
     */
    BusinessValue getBusinessValue();

    /**
     * business value.
     * @param businessValue business value
     */
    void setBusinessValue(final BusinessValue businessValue);
    
    
    /**
     * risk level.
     * @return risk level
     */
    RiskLevel getRiskLevel();

    /**
     * risk level.
     * @param riskLevel risk level
     */
    void setRiskLevel(final RiskLevel riskLevel);
    
    /**
     * number of days completed.
     * @return int number of days completed
     */
    double daysCompleted();
    
    /**
     * number of days remaing.
     * @return number of days completed
     */
    double daysRemaining();
    
    /**
     * pourcentage completed for the story.
     * @return pourcentage completed
     */
    double percentCompleted();
    
    /**
     * pourcentage remaining for the story.
     * @return pourcentage remaining
     */
    double percentRemaining();

    
    /**
     * difference with estimate (in days).
     */
    double differenceOfDaysBetweenEstimateAndTaskEstimate();
    
    /**
     * difference with estimate (in percent).
     */
    double differenceInPercentBetweenEstimateAndTaskEstimate();

    /**
     * difference with estimate (in days).
     */
    double differenceOfDaysBetweenEstimateAndTaskCharge();
    
    /**
     * difference with estimate (in percent).
     */
    double differenceInPercentBetweenEstimateAndTaskCharge();

    /**
     * does the story have a problem ?
     * <ul>
     * <li>difference between story estimate and task estimate is positive</li>
     * <li>difference between story estimate and task charge is positive</li>
     * </ul>
     */
    boolean warning();
    
    /**
     * is the story a work is progress ?
     * @return true or false.
     */
    boolean isInProgress();
    
    /**
     * is the story finished ?
     * @return true or false
     */
    boolean isCompleted();

    /**
     * has the work on the story started ?
     * @return true or false
     */
    boolean isLeft();

}