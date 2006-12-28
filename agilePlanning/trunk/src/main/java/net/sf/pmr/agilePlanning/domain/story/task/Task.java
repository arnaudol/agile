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

package net.sf.pmr.agilePlanning.domain.story.task;

import java.util.Set;

import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.keopsframework.domain.object.DomainObject;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public interface Task extends DomainObject {

    /**
     * owner
     * @return user owner
     */
    User getOwner();

    /**
     * owner
     * @param owner owner
     */
    void setOwner(final User owner);

    /**
     * estimate in minutes
     * @return minutes
     */
    double getDaysEstimated();

    /**
     * number of minutes
     * @param days
     */
    void setDaysEstimated(final double days);

    /**
     * name
     * @return
     */
    String getShortDescription();

    /**
     * name
     * @param shortDescription
     */
    void setShortDescription(final String shortDescription);
    

    /**
     * name
     * @return
     */
    Set<Charge> getCharges();

    /**
     * name
     * @param shortDescription
     */
    void setCharges(final Set<Charge> charges);
    
    /**
     * number of minutes completed for the task.<br>
     * Sum of the minutes used for the charges of the task.
     * @return int number of minutes completed
     */
    double daysCompleted();
    
    /**
     * number of days remaing.<br> 
     * It's the latest number of days needed to finish in the charge set.<br>
     * If two developers work on the same task, the remaing is the sum of the days needed to finish.
     * @return number of minutes completed
     */
    double daysRemaining();
    
    /**
     * pourcentage completed
     * @return pourcentage completed
     */
    double percentCompleted();
    
    /**
     * pourcentage remaining
     * @return pourcentage remaining
     */
    double percentRemaining();
    
    /**
     * difference wih estimate (in minutes) <br>
     * days completed + days remaining - days estimated
     */
    double differenceOfDaysBetweenEstimateAndCharge();
    
    /**
     * difference wih estimate (in minutes)
     */
    double differenceInPercentBetweenEstimateAndCharge();

    /**
     * does the task have a problem ?
     * <ul>
     * <li>difference between task estimate and charge is positive</li>
     * </ul>
     */
    boolean warning();
    
    /**
     * is the task a work is progress ?
     * @return true or false.
     */
    boolean isInProgress();
    
    /**
     * is the tassk finished ?
     * @return true or false
     */
    boolean isCompleted();
    
    /**
     * has the work on the task started ?
     * @return true or false
     */
    boolean isLeft();
    
}
