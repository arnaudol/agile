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

package net.sf.pmr.struts.todo.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.struts.todo.form.ToDoForm;
import net.sf.pmr.toDo.ToDoObjectFactory;
import net.sf.pmr.toDo.domain.todo.ToDo;
import net.sf.pmr.toDo.service.ToDoService;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

public class ToDoAction extends LookupDispatchAction {
	
    /**
     * @see org.apache.struts.actions.LookupDispatchAction#getKeyMethodMap()
     */
    protected Map getKeyMethodMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("button.save", "save");
        map.put("button.delete", "delete");
        map.put("link.list", "list");
        map.put("link.detail", "detail");
        return map;
    }

    /**
     * display the todo for the project and the user
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

        // get the service
        ToDoService toDoService = ToDoObjectFactory.getToDoService();

        User user = (User) request.getSession().getAttribute("user");
        
        // list the todos
        List<ToDo> todos = toDoService.findByProjectPersistanceIdAndUserPersistanceId(
        		((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue(), user.getPersistanceId());

        // put in request
        request.setAttribute("toDoList", todos);

        // populate summary
        populateListForProjectSummary(request);

        return mapping.findForward("toDoList");

    }
    
    
    public ActionForward detail(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // get the service
        ToDoService toDoService = ToDoObjectFactory.getToDoService();

        // find the Story... if needed
        if (StringUtils.isNotEmpty((String) request
                .getParameter("persistanceId"))) {

            ToDo toDo = toDoService.findByPersistanceId(Integer.parseInt((String) request.getParameter("persistanceId")));

            // populate the form
            ToDoForm toDoForm = (ToDoForm) form;

            toDoForm.setDate(toDo.getDate());
            toDoForm.setDone(toDo.isDone());
            toDoForm.setDescription(toDo.getDescription());
            toDoForm.setPersistanceId(toDo.getPersistanceId());
            toDoForm.setPersistanceVersion(toDo.getPersistanceVersion());

        }

        // populate summary
        populateListForProjectSummary(request);

        return mapping.findForward("toDoDetail");

    }

    public ActionForward save(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // get the service
        ToDoService toDoService = ToDoObjectFactory.getToDoService();

        // get the form
        ToDoForm toDoForm = (ToDoForm) form;

        // save the todo
        if (toDoForm.getPersistanceId() == 0) {
            // add
            // get the current basicProject from the session
            Integer basicProjectPersistanceId = (Integer) request.getSession()
                    .getAttribute("basicProject.persistanceId");

            User user = (User) request.getSession().getAttribute("user");
           
            toDoService.add(toDoForm.getDescription(), toDoForm.getDate(), toDoForm.getDone() ,user.getPersistanceId(), basicProjectPersistanceId);
            
        } else {
            // update
        	toDoService.update(toDoForm.getPersistanceId(), toDoForm.getPersistanceVersion(), toDoForm.getDescription(), toDoForm.getDate(), toDoForm.getDone());
            
        }

        // populate the summary
        populateListForProjectSummary(request);

        return this.list(mapping, form, request, response);

    }

    /**
     * delete a todo
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward delete(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // get the service
        ToDoService toDoService = ToDoObjectFactory.getToDoService();

        // get the form
        ToDoForm toDoForm = (ToDoForm) form;
        
        // delete the story
        toDoService.delete(toDoForm.getPersistanceId(), toDoForm.getPersistanceVersion());

        // populate the summary
        populateListForProjectSummary(request);
        
        return this.list(mapping, form, request, response);

    }

 
    
    /**
     * populate the summary for the list of stories for the project.
     * @param request request
     */
    private void populateListForProjectSummary(final HttpServletRequest request) {

        // get the service
        ToDoService toDoService = ToDoObjectFactory.getToDoService();

        User user = (User) request.getSession().getAttribute("user");
        
        // list the todos
        List<ToDo> todos = toDoService.findByProjectPersistanceIdAndUserPersistanceId(
        		((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue(), user.getPersistanceId());


        // number of toDo
        request.setAttribute("numberOfToDo", todos.size());
 
    }

}
