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

package net.sf.pmr.struts.utils;

import java.util.Iterator;

import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.MessageParameters;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

/**
 * Cette classe permet de convertir la structure de message d'erreur du framework Keops en message d'erreur pour struts.
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public final class ActionMessageUtils {

	/**
	 * constructeur privée (toutes les méthodes de la classe sont statiques).
	 */
	private ActionMessageUtils() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * convertion des messages d'erreur keops vers struts.
	 * @param errors structure d'erreur de keops
	 * @return ActionMessages de struts
	 */
    public static ActionMessages convertFromKeopsErrorsToActionMessages(
			final Errors errors) {

		// Convert into struts action errors
		ActionMessages actionMessages = new ActionMessages();

		for (Iterator iterator = errors.getAllErrorsMessageParameters()
				.iterator(); iterator.hasNext();) {

			MessageParameters messageParameters = (MessageParameters) iterator
					.next();

			actionMessages.add(ActionMessages.GLOBAL_MESSAGE,
					new ActionMessage(messageParameters.getErrorCode(),
							messageParameters.getErrorArguments()));

		}

		return actionMessages;

	}
    
}
