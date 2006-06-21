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
package net.sf.pmr.agilePlanning.domain.story.task.charge;

import java.util.Calendar;
import java.util.Date;

import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.keopsframework.domain.object.AbstractDomainObject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.time.DateUtils;

/**
 * 
 * @author arnaud.prost@gmail.com
 *
 */
public class ChargeImpl extends AbstractDomainObject implements Charge {
    
    /**
     * developper.
     */
    private User developper;
    
    /**
     * Day of the charge.
     */
    private Date day;
    
    /**
     * time used.
     */
    private double timeUsedToday;
    
    /**
     * number of days.
     */
    private double daysNeededToFinish;

    /* (non-javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.task.charge.Charge#getDay()
     */
    public Date getDay() {
        return day;
    }

    /* (non-javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.task.charge.Charge#setDay(java.util.Date)
     */
    public void setDay(final Date day) {
        this.day =  DateUtils.truncate(day, Calendar.DAY_OF_MONTH);
    }

    /* (non-javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.task.charge.Charge#getUser()
     */
    public User getUser() {
        return developper;
    }

    /* (non-javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.task.charge.Charge#setUser(net.sf.pmr.core.domain.user.User)
     */
    public void setUser(final User developper) {
        this.developper = developper;
    }

    /* (non-javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.task.charge.Charge#getDaysNeededToFinish()
     */
    public double getDaysNeededToFinish() {
        return daysNeededToFinish;
    }

    /* (non-javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.task.charge.Charge#setDaysNeededToFinish(double)
     */
    public void setDaysNeededToFinish(final double numberOfDays) {
        this.daysNeededToFinish = numberOfDays;
    }

    /* (non-javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.task.charge.Charge#getTimeUsedToday()
     */
    public double getTimeUsedToday() {
        return timeUsedToday;
    }

    /* (non-javadoc)
     * @see net.sf.pmr.agilePlanning.domain.story.task.charge.Charge#setTimeUsedToday(double)
     */
    public void setTimeUsedToday(final double timeUsedToday) {
        this.timeUsedToday = timeUsedToday;
    }

    /* (non-javadoc)
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof ChargeImpl)) {
            return false;
        }
        ChargeImpl rhs = (ChargeImpl) object;
        return new EqualsBuilder().append(this.day, rhs.day)
                                  .append(this.developper, rhs.developper)
                                  .isEquals();
    }

    /* (non-javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(-1837149907, -1046955131).append(this.day)
                                                            .append(this.developper)
                                                            .toHashCode();
    }
    
}
