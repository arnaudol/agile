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

package net.sf.pmr.agilePlanning.domain.release;

import java.util.Calendar;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * Régles de validation:
 * <ul>
 * <li>la date de release est obligatoire</li>
 * <li>la date de release est strictement antérieur à la date du jour</li>
 * <li>le numéro de release est obligatoire</li>
 * </ul>
 */
public class ReleaseValidatorImpl implements ReleaseValidator {

    /* (non-Javadoc)
     * @see net.sf.pmr.keopsframework.domain.validation.Validator#validate(java.lang.Object)
     */
    public Errors validate(final Object object) {

        Release release = (Release) object;

        Errors errors = AgilePlanningObjectFactory.getErrors();

        Calendar calendar = Calendar.getInstance();

        // la date doit être renseignée

        if (release.getDate() == null) {

            errors.rejectValue(ReleaseValidator.FIELD_DATE,
                    "release.dateMandatory");

            // elle doit être supérieure à la date du jour

        } else {

            Calendar dateCalendar = Calendar.getInstance();
            dateCalendar.setTime(release.getDate());

            if (calendar.compareTo(dateCalendar) >= 0) {

                errors.rejectValue(ReleaseValidator.FIELD_DATE,
                        "release.dateToSmall");

            }

        }

        // le numéro de release est obligatoire

        if (release.getNumber() == null || release.getNumber().trim().equals("")) {

            errors.rejectValue(ReleaseValidator.FIELD_NUMBER,
                    "release.numberMandatory");

        }

        return errors;

    }

	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.release.ReleaseValidator#validateForDelete(net.sf.pmr.agilePlanning.domain.release.Release)
	 */
	public Errors validateForDelete(Release release) {
		
        Errors errors = AgilePlanningObjectFactory.getErrors();
		
		if (release.getStories() == null || release.getStories().isEmpty() ) {
			
			return errors;
			
		} else {
			
			errors.reject("release.IsNotDeletableBecauseOfStories");
			
			return errors;
		}

	}
    
    
    
}