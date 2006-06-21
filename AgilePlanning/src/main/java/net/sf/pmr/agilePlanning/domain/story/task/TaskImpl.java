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
import net.sf.pmr.core.utils.Math;
import net.sf.pmr.keopsframework.domain.object.AbstractDomainObject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * Task
 */
public class TaskImpl extends AbstractDomainObject implements Task {

    /**
     * owner
     */
    private User owner;

    /**
     * number of days estimated
     */
    private double daysEstimated;

    /**
     * short description
     */
    private String shortDescription;
    
    /**
     * Set of charges
     */
    private Set<Charge> charges;
    
    
    
    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#getOwner()
     */
    public User getOwner() {
        return this.owner;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#setOwner(net.sf.pmr.core.domain.user.User)
     */
    public void setOwner(final User developper) {
        this.owner = developper;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#getDaysEstimated()
     */
    public double getDaysEstimated() {
        return this.daysEstimated;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#setDaysEstimated(double)
     */
    public void setDaysEstimated(final double days) {
        this.daysEstimated = days;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#getShortDescription()
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#setShortDescription(java.lang.String)
     */
    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#getCharges()
     */
    public Set<Charge> getCharges() {
        return this.charges;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#setCharges(java.util.Set)
     */
    public void setCharges(final Set<Charge> charges) {
        this.charges = charges;
    }

    

    /** 
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#differenceInPercentBetweenEstimateAndCharge()
     */
    public double differenceInPercentBetweenEstimateAndCharge() {

        double differenceToReturn = 100;

        if (getDaysEstimated() != 0) {
            differenceToReturn = (daysCompleted() + daysRemaining() * 100) / getDaysEstimated();
        }
        return differenceToReturn;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#differenceOfDaysBetweenEstimateAndCharge()
     */
    public double differenceOfDaysBetweenEstimateAndCharge() {

        return daysCompleted() + daysRemaining() - getDaysEstimated();        

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#daysCompleted()
     */
    public double daysCompleted() {
        
        double daysCompletedToReturn = 0;

        // if charges is null, return 0
        if (charges != null) {
            // else sum charge.getMinutesUsedToday() and return the sum
            for (Charge charge : charges) {
                daysCompletedToReturn = daysCompletedToReturn + charge.getTimeUsedToday();
            }
        }
        return daysCompletedToReturn;
    }

    /** 
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#daysRemaining()
     */
    public double daysRemaining() {
        
        double daysRemainingToReturn = 0;
        
        // if charges is null or empty, return the days estimated
        if (charges != null && !charges.isEmpty()) {
            // else find time remaining
            Charge previousCharge = null;
            for (Charge charge : charges) {
                
                if (previousCharge == null ) {
                    // if it is the first loop
                    previousCharge = charge;
                    daysRemainingToReturn = charge.getDaysNeededToFinish();
                } else if (charge.getDay().after(previousCharge.getDay())) {
                    // if the charge is more recent than the previous one
                    previousCharge = charge;
                    daysRemainingToReturn = charge.getDaysNeededToFinish();
                } else if (charge.getDay().equals(previousCharge.getDay())) {
                    // if the charge is the same day than the previous one
                    previousCharge = charge;
                    daysRemainingToReturn = daysRemainingToReturn + charge.getDaysNeededToFinish();
                }
            }
        } else {
        	daysRemainingToReturn = this.daysEstimated;
        }
        
        return daysRemainingToReturn;
    }

    /** 
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#percentCompleted()
     */
    public double percentCompleted() {
       
        double percentCompletedToreturn = 0;
        
        // calcul du pourcentage compl�t�
        if ( daysCompleted() + daysRemaining() != 0 ) {
            percentCompletedToreturn = (daysCompleted() * 100) / (daysCompleted() + daysRemaining());
        }
        
        // retourne l'arrondi
        return Math.round(percentCompletedToreturn, 2);
        
    }

    /** 
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#percentRemaining()
     */
    public double percentRemaining() {
        return 100 - percentCompleted();
    }
       
   /**
    * @see net.sf.pmr.agilePlanning.domain.story.task.Task#isCompleted()
    */ 
    public boolean isCompleted() {
		
		// des jours ont été utilisé et aucun jours restant
		if (this.daysCompleted() > 0 && this.daysRemaining() == 0) {
			return true;
		}
		
		return false;
    	
	}

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.task.Task#isInProgress()
     */
	public boolean isInProgress() {
		
		// si aucun jours de réalisés, la tâche n'a pas débuté
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
	 * @see net.sf.pmr.agilePlanning.domain.story.task.Task#isLeft()
	 */
	public boolean isLeft() {
	
		// aucun jour utilisé, la tâche n'a pas commencé.
		if (daysCompleted() == 0) {
			return true;
		}
		
		return false;

		
	}

	/**
	 * @see net.sf.pmr.agilePlanning.domain.story.task.Task#warning()
	 */
	public boolean warning() {
		if (this.differenceOfDaysBetweenEstimateAndCharge() > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
     * @see java.lang.Object#equals(Object)
     */
    // TODO à revoir: pas suffisant !
    public boolean equals(final Object object) {
        if (!(object instanceof TaskImpl)) {
            return false;
        }
        TaskImpl rhs = (TaskImpl) object;
        return new EqualsBuilder().append(this.shortDescription, rhs.shortDescription)
                                  .append(this.daysEstimated, rhs.daysEstimated)
                                  .append(this.owner, rhs.owner)
                                  .isEquals();
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(1805961607, 553061543).append(this.shortDescription).append(this.daysEstimated).append(this.owner).toHashCode();
    }
}