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
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.service.ProjectService;
import net.sf.pmr.core.service.UserService;
import net.sf.pmr.struts.administration.core.form.UserProjectForm;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;


/**
 * @author arnaud.prost@gmail.com
 */
public class UserProjectAction extends LookupDispatchAction {
    
    
    /**
     * @see org.apache.struts.actions.LookupDispatchAction#getKeyMethodMap()
     */
    protected Map getKeyMethodMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("button.add", "add");
        map.put("button.cancel", "cancel");
        map.put("link.detail", "detail");
        return map;
    }
	
	
	public ActionForward detail(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		
		// get the project service
		ProjectService projectService = CoreObjectFactory.getProjectService();
		
		// find all projects
		List basicProjects = projectService.findAll();
		
		request.setAttribute("basicProjects", basicProjects);
		
		// populate the form
		UserProjectForm userProjectForm = (UserProjectForm) form;
		userProjectForm.setUserPersistanceId(Integer.parseInt(request.getParameter("userPersistanceId").toString()));
		
		// populate the summary
		//UserService userService = CoreObjectFactory.getUserService();
		//User user = userService.findByLogin(request.getParameter("login"));
		// get the user service
        //request.setAttribute("numberOfProject", user.getProjects().size());
		request.setAttribute("numberOfProject", 9999);
		request.setAttribute("numberOfUser", 9999);
		
		request.setAttribute("persistanceId", request.getParameter("userPersistanceId"));
		
		return mapping.findForward("userProjectDetail");

	}
	
	/**
	 * add the user to the selected project
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	    
		// get the user service
		UserService userService = CoreObjectFactory.getUserService();
		// get the form
		UserProjectForm userProjectForm = (UserProjectForm) form;

		// call the service
		userService.addUserToProject(userProjectForm.getUserPersistanceId(), userProjectForm.getBasicProjectPersistanceId());

		// return to the detail
	    return mapping.findForward("userList");
	    
	}

	/**
	 * return to the detail
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

		request.setAttribute("numberOfProject", 9999);
		request.setAttribute("persistanceId", request.getParameter("userPersistanceId"));
		
		// return to the detail
	    return mapping.findForward("userDetail");
	    
	}	
	
	
	@Override
	protected ActionForward unspecified(ActionMapping arg0, ActionForm arg1, HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		// TODO Auto-generated method stub
		return detail(arg0, arg1, arg2, arg3);
	}

}