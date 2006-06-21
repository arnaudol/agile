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
package net.sf.pmr.core.domain.project;

import java.util.Iterator;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;


/**
 * @author Arnaud Prost (aprost@gmail.com)
 *
 * basicProject Validator
 */
public class ProjectValidatorImpl implements Validator {

    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Validator#validate(java.lang.Object)
     */
    public Errors validate(final Object object) {

        Project basicProject = (Project) object;

        Errors errors = CoreObjectFactory.getErrors();

        if (basicProject.getCode() == null
                || basicProject.getCode().trim() == "") {

            errors.rejectValue("code", "basicProject.codeMandatory");

        } else if (basicProject.getCode().length() > 10) {

            errors.rejectValue("code", "basicProject.codeTooLong");
        }

        if (basicProject.getName() == null
                || basicProject.getName().trim() == "") {

            errors.rejectValue("name", "basicProject.nameMandatory");

        } else if (basicProject.getName().length() > 100) {

            errors.rejectValue("name", "basicProject.nameTooLong");

        }

        if (basicProject.getMembers().size() < 1) {

            errors.reject("basicProject.atLeastOneMember");

        } else {

            boolean oneMemberIsNotNull = false;

            for (Iterator i = basicProject.getMembers().iterator(); i.hasNext();) {

                if (i.next() != null) {
                    oneMemberIsNotNull = true;
                }

            }

            if (!oneMemberIsNotNull) {
                errors.reject("basicProject.atLeastOneMember");
            }

        }

        return errors;

    }
}