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
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.service.UserService;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.MessageParameters;
import net.sf.pmr.struts.administration.core.form.UserForm;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.LookupDispatchAction;


/**
 * @author arnaud.prost@gmail.com
 */
public class UserAction extends LookupDispatchAction {
    
    
    /**
     * @see org.apache.struts.actions.LookupDispatchAction#getKeyMethodMap()
     */
    protected Map getKeyMethodMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("button.save", "save");
        //map.put("button.delete", "delete");
        map.put("link.list", "list");
        map.put("link.detail", "detail");
        return map;
    }

    /**
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	public ActionForward list(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// TODO Faire une m�thode de s�curit� pour v�rifier le user (voir les spec J2EE)

	    // TODO regarder le ActionSupport pour struts de spring
	    
		// get the user service
		UserService userService = CoreObjectFactory.getUserService();
		
		// set the userList in request for display in the page
		request.setAttribute("userList", userService.findAll());
		
        // populate the summary
        Summary.populate(request);
		
		return mapping.findForward("userList");

	}
	
	
	public ActionForward detail(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

			// get the user service
		UserService userService = CoreObjectFactory.getUserService();
		
		// find the user ... if needed
        if (StringUtils.isNotEmpty( (String) request.getParameter("persistanceId"))) {

            User user = userService.findByPersistanceId(Integer.parseInt(request.getParameter("persistanceId").toString()));
            
            // Populate the form
            UserForm userForm = (UserForm) form;
            
            userForm.setFirstName(user.getFirstName());
            userForm.setPersistanceId(user.getPersistanceId());
            userForm.setLastName(user.getLastName());
            userForm.setLogin(user.getLogin());
            userForm.setEmail(user.getEmail());
            userForm.setPassword(user.getPassword());
            userForm.setPersistanceVersion(user.getPersistanceVersion());
            
    		// populate the summary
            request.setAttribute("numberOfProject", user.getProjects().size());
            request.setAttribute("persistanceId", user.getPersistanceId());

        } else {

    		// populate the summary
            request.setAttribute("numberOfProject", 0);
            request.setAttribute("persistanceId", 0);
        	
        }
		
		
		return mapping.findForward("userDetail");

	}
	
	public ActionForward save(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	    
		// get the user service
		UserService userService = CoreObjectFactory.getUserService();
		// get the form
		UserForm userForm = (UserForm) form;
		
		// TODO faire une seul m�thode userService.save
		
		// save the user
		Errors errors = null;
	    errors = userService.addOrUpdate(userForm.getPersistanceId(), userForm.getFirstName(), userForm.getLastName(), userForm.getLogin(), userForm.getPassword(), userForm.getEmail(), userForm.getPersistanceVersion());		    
		
		// Convert into struts action errors
		ActionMessages actionMessages = new ActionMessages();
		
		if (errors.hasErrors()) {

            for (Iterator iterator = errors.getAllErrorsMessageParameters()
                    .iterator(); iterator.hasNext();) {
                
                MessageParameters messageParameters = (MessageParameters) iterator.next();
                
                actionMessages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageParameters.getErrorCode(), messageParameters.getErrorArguments()));
                
            }
                
                
            saveErrors(request, actionMessages);

        }
	    
        // populate the summary
        Summary.populate(request);

		if (actionMessages.isEmpty() == false) {
		    return mapping.findForward("userDetail");
		} else {
		    return this.list(mapping, form, request, response);    
		}
	    
	    
	}
	
	
//	public ActionForward delete(ActionMapping mapping, ActionForm form,
//			HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//	    
//		// get the user service
//		UserService userService = CoreObjectFactory.getUserService();
//		// get the project repository
//		BasicProjectService basicProjectService = CoreObjectFactory.getBasicProjectService();
//
//		// delete
//	    //userService		    
//
//	    
//	    // set the number of user in the request
//		request.setAttribute("numberOfUser", userService.countAll());
//		// set the number of project in the request
//		request.setAttribute("numberOfProject", basicProjectService.countAll());
//	    
//	    return mapping.findForward("userList");
//	}

}
