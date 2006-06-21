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

package net.sf.pmr.struts.administration.core.action;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.service.BasicProjectService;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.MessageParameters;
import net.sf.pmr.struts.administration.core.form.BasicProjectForm;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.LookupDispatchAction;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class BasicProjectAction extends LookupDispatchAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.struts.actions.LookupDispatchAction#getKeyMethodMap()
	 */
	protected Map getKeyMethodMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("button.save", "save");
		map.put("button.cancel", "list");
		// map.put("button.delete", "delete");
		map.put("link.list", "list");
		map.put("link.detail", "detail");
		map.put("link.memberList", "memberList");
		return map;
	}

	public ActionForward list(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// get the project repository
		BasicProjectService basicProjectService = CoreObjectFactory
				.getBasicProjectService();

		// set the userList in request for display in the page
		request.setAttribute("basicProjectList", basicProjectService.findAll());

		// populate the summary
		Summary.populate(request);

		return mapping.findForward("basicProjectList");

	}

	/**
	 * display the list of members for the projet
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward memberList(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// find basic project
		BasicProject basicProject = findBasicProjectByPersistanceId(request);

		// if basicProject is found
		if (basicProject != null) {

			// set the member list in request for display in the page
			request.setAttribute("memberList", basicProject.getMembers());
		}

		// populate the summary
		Summary.populate(request);

		// forward to the member list
		return mapping.findForward("memberList");

	}

	/**
	 * cancel
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward cancel(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		return mapping.findForward("basicProjectList");

	}

	/**
	 * save
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward save(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// get the basicProject service
		BasicProjectService basicProjectService = CoreObjectFactory
				.getBasicProjectService();

		// get the form
		BasicProjectForm basicProjectForm = (BasicProjectForm) form;

		// Save or update the BasicProject
		Errors errors = null;
		if (basicProjectForm.getPersistanceId() == 0) {
			// get the current user from the session
			User user = (User) request.getSession().getAttribute("user");
			// add
			errors = basicProjectService.add(basicProjectForm.getCode(),
					basicProjectForm.getName(), user.getPersistanceId());
		} else {
			// update
			errors = basicProjectService.update(basicProjectForm
					.getPersistanceId(), basicProjectForm.getCode(),
					basicProjectForm.getName(), basicProjectForm
							.getPersistanceVersion());
		}

		// Convert into struts action errors
		ActionMessages actionMessages = new ActionMessages();

		if (errors.hasErrors()) {

			for (Iterator iterator = errors.getAllErrorsMessageParameters()
					.iterator(); iterator.hasNext();) {

				MessageParameters messageParameters = (MessageParameters) iterator
						.next();

				actionMessages.add(ActionMessages.GLOBAL_MESSAGE,
						new ActionMessage(messageParameters.getErrorCode(),
								messageParameters.getErrorArguments()));

			}

			saveErrors(request, actionMessages);

		}

		// if (errors.hasErrors()) {
		//
		// for (Iterator iterator = errors.getAllErrorsMessageParameters()
		// .iterator(); iterator.hasNext();) {
		//
		// MessageParameters messageParameters = (MessageParameters) iterator
		//                        .next();
		//
		//                actionMessages.add(ActionMessages.GLOBAL_MESSAGE,
		//                        new ActionMessage(messageParameters.getErrorCode(),
		//                                messageParameters.getErrorArguments()));
		//
		//            }
		//
		//            saveErrors(request, actionMessages);
		//
		//        }

		// populate the summary
		Summary.populate(request);

		// forward
		if (actionMessages.isEmpty() == false) {

			// put the persistanceId in the request
			request.setAttribute("persistanceId", Integer
					.valueOf(basicProjectForm.getPersistanceId()));

			return mapping.findForward("basicProjectDetail");

		} else {
			return this.list(mapping, form, request, response);
		}

	}

	/**
	 * detail
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward detail(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		BasicProject basicProject = findBasicProjectByPersistanceId(request);

		// if a basicProject is found
		if (basicProject != null) {

			// populate the form
			BasicProjectForm basicProjectForm = (BasicProjectForm) form;
			basicProjectForm.setCode(basicProject.getCode());
			basicProjectForm.setName(basicProject.getName());
			basicProjectForm.setPersistanceId(basicProject.getPersistanceId());
			basicProjectForm.setPersistanceVersion(basicProject
					.getPersistanceVersion());

		}

		// populate the summary
		Summary.populate(request);

		return mapping.findForward("basicProjectDetail");

	}

	/**
	 * find basicProject by persistance id
	 * 
	 * @param request
	 * @return BasicProject
	 */
	private BasicProject findBasicProjectByPersistanceId(
			final HttpServletRequest request) {

		// get the BasicProject Service
		BasicProjectService basicProjectService = CoreObjectFactory
				.getBasicProjectService();

		// find the basicProject, if a project is needed
		if (StringUtils.isNotEmpty((String) request
				.getParameter("persistanceId"))) {

			return basicProjectService
					.findByPersistanceId(Integer.parseInt(request.getParameter(
							"persistanceId").toString()));

		} else {
			// else return null
			return null;
		}
	}

}