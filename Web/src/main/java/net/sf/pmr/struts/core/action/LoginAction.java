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

package net.sf.pmr.struts.core.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.Version;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.service.SecurityService;
import net.sf.pmr.struts.core.form.LoginForm;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;


/**
 * @author Arnaud To change the template for this generated type comment go to
 *         Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class LoginAction extends DispatchAction {

	/**
	 * grant or denied access for a user according to a login and a password
	 *
	 * @param mapping
	 *            mapping
	 * @param form
	 *            form
	 * @param request
	 *            request
	 * @param response
	 *            response
	 * @throws IOException
	 *             IOException
	 * @throws ServletException
	 *             ServletException
	 * @throws DataSourceException
	 *             DataSourceException
	 */
	public final ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		LoginForm loginForm = (LoginForm) form;

		//TODO dans la page jsp remplacer le javascript pour le submit du form

		// Get the securityService
		SecurityService securityService = CoreObjectFactory.getSecurityService();
		
		// login
		User user = securityService.login(loginForm.getLogin(), loginForm.getPassword());
		

		// if user is null, access is denied

		if (user == null) {
			this.displayAvailableModules(request);
			return mapping.findForward("failure");
		} else {
			// set the user in session
			request.getSession().setAttribute("user", user);
			return mapping.findForward("success");
		}

	}

	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		this.displayAvailableModules(request);
		
		//TODO comment traiter les exceptions globales dans struts
		
		return mapping.findForward("failure");
	}

	/**
	 * Default Action
	 */
	public ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		this.displayAvailableModules(request);

		return mapping.findForward("failure");

	}
	
	/**
	 * display the versions of the available modules
	 */
	private void displayAvailableModules(final HttpServletRequest request) {

		 // TODO a mettre en variable d'application et � v�rifier au d�marrage
        // TODO � renseigner dans le manifest plut�t qu'en variable d'application 
		// request ne fonctionne pas
		// de l'appli
		// set the version for each module
		// if the module does not exist, catch the exception
//		try {
//			request.setAttribute("bugTrackerVersion",
//					com.pm.bugTracker.Version.VERSION);
//		} catch (NoClassDefFoundError exception) {
//		}
//
//		try {
//			request.setAttribute("calendarVersion",
//					com.pm.calendar.Version.VERSION);
//		} catch (NoClassDefFoundError exception) {
//		}
//
		try {
			request.setAttribute("coreVersion", Version.VERSION);
		} catch (NoClassDefFoundError exception) {
		}
       
       try {
           request.setAttribute("agilePlanningVersion", net.sf.pmr.agilePlanning.Version.VERSION);
       } catch (NoClassDefFoundError exception) {
       }
       
       try {
           request.setAttribute("toDoVersion", net.sf.pmr.toDo.Version.VERSION);
       } catch (NoClassDefFoundError exception) {
       }


//
//		try {
//			request.setAttribute("documentManagerVersion",
//					com.pm.documentManager.Version.VERSION);
//		} catch (NoClassDefFoundError exception) {
//		}
//
//		try {
//			request.setAttribute("evolutionManagerVersion",
//					com.pm.evolutionManager.Version.VERSION);
//		} catch (NoClassDefFoundError exception) {
//		}
//
//		try {
//			request.setAttribute("forumVersion", com.pm.forum.Version.VERSION);
//		} catch (NoClassDefFoundError exception) {
//		}

//		try {
//			request.setAttribute("projectManagerVersion",
//					//com.pm.projectManager.Version.VERSION);
//		} catch (NoClassDefFoundError exception) {
//		}

		
	}


}