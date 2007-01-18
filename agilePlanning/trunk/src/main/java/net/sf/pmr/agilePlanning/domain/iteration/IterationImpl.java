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

package net.sf.pmr.agilePlanning.domain.iteration;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.keopsframework.domain.object.AbstractDomainObject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class IterationImpl extends AbstractDomainObject implements Iteration {

    /**
     * basic Project.
     */
    private Project project;

    /**
     * start.
     */
    private Date start;

    /**
     * end.
     */
    private Date end;
    
    /**
     * days.
     */
    private int days;

    /**
     * stories.
     */
    private Set<Story> stories;

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#getBasicProject()
     */
    public Project getProject() {
        return project;
    }

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#setBasicProject(net.sf.pmr.core.domain.project.BasicProject)
     */
    public void setProject(final Project project) {
        this.project = project;
    }

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration#getStartDate()
     */
    public Date getStart() {
        return start;
    }

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration#setStartDate(java.util.Date)
     */
    public void setStart(final Date start) {

        this.start = roundDateToDay(start);

    }

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration#getEndDate()
     */
    public Date getEnd() {
        return end;
    }

	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.iteration#setEndDate(java.util.Date)
     */
    public void setEnd(final Date end) {

        this.end = roundDateToDay(end);

    }

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#getDays()
     */
    public int getDays() {
		return days;
	}

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#setDays(int)
     */
	public void setDays(final int days) {
		this.days = days;
	}


	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#daysCompleted()
     */
    public double daysCompleted() {

    	// jours complétés à retourner
		double daysCompletedToReturn = 0;

		if (stories != null) {

			// parcours du nombre de jours complétés de la liste des stories
			for (Story story : stories) {
				daysCompletedToReturn = daysCompletedToReturn + story.daysCompleted();
			}

		}

		// retour des jours
		return daysCompletedToReturn;
		
	}
    
	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#daysRemaining()
     */
	public double daysRemaining() {
		
    	// jours restant à retourner
		double daysRemainingToReturn = 0;

		if (stories != null) {

			// parcours du nombre de jours complétés de la liste des stories
			for (Story story : stories) {
				daysRemainingToReturn = daysRemainingToReturn + story.daysRemaining();
			}

		}

		// retour des jours
		return daysRemainingToReturn;
	}
	
	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#percentCompleted()
	 */
	public double percentCompleted() {
		
		// pourcentage à retourner
		double percentCompletedToReturn = 0;
		
		double daysCompleted = 0;
		double daysRemaining = 0;
		
		// parcours de la liste des story si elle n'est pas null ou vide (dans ce cas on retourne 0)
		if (stories != null && !stories.isEmpty()) {			

			
			for (Story story : stories) {
				daysCompleted = daysCompleted + story.daysCompleted();
				daysRemaining = daysRemaining + story.daysRemaining();
			}

			// calcul du pourcentage 
			percentCompletedToReturn = 100 * daysCompleted / (daysRemaining + daysCompleted);
			
		} 

		// retours du pourcentage
		return percentCompletedToReturn;
		
	}
	

	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#percentRemaining()
	 */
	public double percentRemaining() {
		
		// si la liste des story est null ou vide, on retourne O
		if (stories == null || stories.isEmpty()) {			
			return 0;
		} else {
			// sinon on soustrait le pourcentage consommé 
			return 100 - this.percentCompleted();
		}
	}

	
	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#differenceInPercentBetweenIterationAndStories()
	 */
	public double differenceInPercentBetweenIterationAndStories() {

		// pas de stories, donc pas de différence
		if (stories == null || stories.isEmpty()) {			
			return 0;
		} else {
			// sinon, calcul du pourcentage 
			return (100 * (this.daysCompleted() + this.daysRemaining()) / this.days) -100 ;			
		}
		
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#differenceOfDaysBetweenIterationAndStories()
	 */
	public double differenceOfDaysBetweenIterationAndStories() {

		// pas de stories, donc pas de différence
		if (stories == null || stories.isEmpty()) {			
			return 0;
		} else {
			// sinon, calcul de la différence
			return this.days - this.daysCompleted() - this.daysRemaining();
		}
		
	}

	
	
	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#warning()
	 */
	public boolean warning() {
		
		if (this.differenceOfDaysBetweenIterationAndStories() >= 0 ) {
			return false;
		}
		
		return true;
		
	}

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#getStories()
     */
    public Set<Story> getStories() {
        return this.stories;
    }

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.iteration.Iteration#setStories(java.util.Set)
     */
    public void setStories(final Set<Story> stories) {
        this.stories = stories;
    }

    
    /**
     * Arrondi la date donnée au jour Le nombre de milliseconde est positionné à
     * 1 (pour ne pas changer de date si on est à minuit).
     *
     * @param date à arrondir
     * @return date arrondi
     */
    private Date roundDateToDay(final Date date) {

        if (date != null) {

            Calendar calendar = Calendar.getInstance();

            calendar.setTime(date);

            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 1);

            return calendar.getTime();

        } else {

            return date;

        }

    }
    
	/* (non-Javadoc)
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(final Object object) {
        if (!(object instanceof IterationImpl)) {
            return false;
        }
        IterationImpl rhs = (IterationImpl) object;
        return new EqualsBuilder().append(this.project, rhs.project)
                                  .append(this.start, rhs.start)
                                  .append(this.end, rhs.end)
                                  .isEquals();
    }
    
	/* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(522268527, -355299201).append(this.project)
                                                         .append(this.start)
                                                         .append(this.end)
                                                         .toHashCode();
    }
}
