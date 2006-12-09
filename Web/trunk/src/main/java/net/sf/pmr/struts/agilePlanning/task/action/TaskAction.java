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

package net.sf.pmr.struts.agilePlanning.task.action;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.service.StoryService;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.core.service.ProjectService;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.MessageParameters;
import net.sf.pmr.struts.agilePlanning.task.form.TaskForm;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.LookupDispatchAction;


public class TaskAction extends LookupDispatchAction {

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
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward list(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // get the service
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        // list the tasks for the current story
        int persistanceId = 0;
        if ( StringUtils.isNotEmpty(request.getParameter("storyPersistanceId"))) {
            persistanceId = Integer.parseInt(request.getParameter("storyPersistanceId"));
        } else if (StringUtils.isNotEmpty((String)request.getAttribute("storyPersistanceId"))) {
            persistanceId = Integer.parseInt((String)request.getAttribute("storyPersistanceId")); 
        }
        
        Story story = storyService.findByPersistanceId(persistanceId);

        // put the tasks in the request
        request.setAttribute("taskList", story.getTasks());

        // populate summary
        populateSummary(request);

        return mapping.findForward("taskList");
    }

    public ActionForward detail(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // TODO Faire une méthode de sécurité pour vérifier le user

        // get the service
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        // populate the form
        TaskForm taskForm = (TaskForm) form;
        taskForm.setStoryPersistanceId(Integer.parseInt((String) request.getParameter("storyPersistanceId")));
        
        // find the Story... if needed
        if (StringUtils.isNotEmpty((String) request.getParameter("persistanceId"))) {

            Task task = storyService.findTaskByPersistanceId(Integer.parseInt((String) request.getParameter("persistanceId")));

            taskForm.setDaysEstimated(task.getDaysEstimated());
            taskForm.setPersistanceId(task.getPersistanceId());
            taskForm.setPersistanceVersion(task.getPersistanceVersion());
            taskForm.setShortDescription(task.getShortDescription());
            
            taskForm.setDaysCompleted(task.daysCompleted());
            taskForm.setDaysRemaining(task.daysRemaining());
            taskForm.setDifferenceInPercentBetweenEstimateAndCharge(task.differenceInPercentBetweenEstimateAndCharge());
            taskForm.setDifferenceOfDaysBetweenEstimateAndCharge(task.differenceOfDaysBetweenEstimateAndCharge());
            taskForm.setPercentCompleted(task.percentCompleted());
            taskForm.setPercentRemaining(task.percentRemaining());
            taskForm.setWarning(task.warning());
            
            if (task.getOwner() != null) {
                taskForm.setDevelopperPersistanceId(task.getOwner().getPersistanceId());
            }
        }    
    
        //populate listBox
        populateListBox(request);
        
        // populate summary
        populateSummary(request);

        return mapping.findForward("taskDetail");

    }

    public ActionForward save(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // get the service
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        // get the form
        TaskForm taskForm = (TaskForm) form;

        // TODO faire une seul m�thode taskService.save ?
        Errors errors = null;
        // save the story
        if (taskForm.getPersistanceId() == 0) {
            // add
            errors = storyService.addTask(taskForm.getStoryPersistanceId(),
                                          taskForm.getDaysEstimated(),
                                          taskForm.getShortDescription(),
                                          taskForm.getDevelopperPersistanceId());
        } else {
            // update
            errors = storyService.updateTask(taskForm.getStoryPersistanceId(),
                                             taskForm.getDaysEstimated(),
                                             taskForm.getShortDescription(),
                                             taskForm.getDevelopperPersistanceId(),
                                             taskForm.getPersistanceId(),
                                             taskForm.getPersistanceVersion());
        }

        // Convert into struts action errors
        ActionMessages actionMessages = new ActionMessages();

        if (errors.hasErrors()) {

            for (Iterator iterator = errors.getAllErrorsMessageParameters().iterator(); iterator.hasNext();) {

                MessageParameters messageParameters = (MessageParameters) iterator.next();

                actionMessages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageParameters.getErrorCode(),
                                                                                    messageParameters.getErrorArguments()));

            }

            saveErrors(request, actionMessages);

        }

        // forward
        if (actionMessages.isEmpty() == false) {
            
            //put the persistanceId in the request
            request.setAttribute("persistanceId", Integer.valueOf(taskForm.getPersistanceId()));
            
            // populate the list box
            populateListBox(request);
            
            // populate the summary
            populateSummary(request);
            
            return mapping.findForward("taskDetail");

        } else {
            
            // set the storyPersistanceId in request
            request.setAttribute("storyPersistanceId", String.valueOf(taskForm.getStoryPersistanceId()));
            
            return this.list(mapping, form, request, response);
        }

    }

    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // get the service
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        // get the form
        TaskForm taskForm = (TaskForm) form;

        Errors errors = null;
        // save the story
        if (taskForm.getPersistanceId() != 0) {
            
            errors = storyService.deleteTask(taskForm.getStoryPersistanceId(), taskForm.getPersistanceId(), taskForm.getPersistanceVersion());
            
        }

        // Convert into struts action errors
        ActionMessages actionMessages = new ActionMessages();

        if (errors.hasErrors()) {

            for (Iterator iterator = errors.getAllErrorsMessageParameters().iterator(); iterator.hasNext();) {

                MessageParameters messageParameters = (MessageParameters) iterator.next();

                actionMessages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageParameters.getErrorCode(),
                                                                                    messageParameters.getErrorArguments()));

            }

            saveErrors(request, actionMessages);

        }

        // forward
        if (actionMessages.isEmpty() == false) {
            
            //put the persistanceId in the request
            request.setAttribute("persistanceId", Integer.valueOf(taskForm.getPersistanceId()));
            
//            // populate the list box
//            populateListBox(request);
//            
//            // populate the summary
//            populateSummary(request);
            
            return this.detail(mapping, form, request, response);
            
            // return mapping.findForward("taskDetail");

        } else {
            
            // set the storyPersistanceId in request
            request.setAttribute("storyPersistanceId", String.valueOf(taskForm.getStoryPersistanceId()));
            
            return this.list(mapping, form, request, response);
        }



    }

    /**
     * populate the summary
     * @param request request
     */
    private void populateSummary(final HttpServletRequest request) {

        // get the service
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        // list the tasks for the current story
        int persistanceId = 0;
        if ( StringUtils.isNotEmpty(request.getParameter("storyPersistanceId"))) {
            persistanceId = Integer.parseInt(request.getParameter("storyPersistanceId"));
        } else if (StringUtils.isNotEmpty((String)request.getAttribute("storyPersistanceId"))) {
            persistanceId = Integer.parseInt((String)request.getAttribute("storyPersistanceId")); 
        }

        Story story = storyService.findByPersistanceId(persistanceId);
        
        
        int numberOfTask = Integer.valueOf(story.getTasks().size());
        int numberOfTaskInProgress = 0;
        int numberOfTaskCompleted = 0;
        int numberOfTaskLeft = 0;
        
        for (Task task : story.getTasks()) {
			
        	if (task.isCompleted()) {
        		numberOfTaskCompleted = numberOfTaskCompleted + 1;
        	} else if (task.isInProgress()) {
        		numberOfTaskInProgress = numberOfTaskInProgress + 1;
        	} else if (task.isLeft()) {
        		numberOfTaskLeft = numberOfTaskLeft + 1;
        	}
        	
		}
        
        // TODO : différence entre le détail et la liste.... Faire de ménage 
        request.setAttribute("numberOfTask", numberOfTask );
        request.setAttribute("numberOfTaskCompleted", numberOfTaskCompleted );
        request.setAttribute("numberOfTaskInProgress", numberOfTaskInProgress );
        request.setAttribute("numberOfTaskLeft", numberOfTaskLeft );
        
        request.setAttribute("story.shortDescription", story.getShortDescription());

    }
    

    /**
     * populate the list box 
     * @param request request
     */
    private void populateListBox(final HttpServletRequest request) {
        
        // get the list of developper for the project to populate the listBox
        ProjectService projectService = CoreObjectFactory.getProjectService();
        Project basicProject = projectService.findByPersistanceId(((Integer) request.getSession()
                                                                                              .getAttribute("basicProject.persistanceId")).intValue());
        Set<User> members = basicProject.getMembers();
        // ajout d'une ligne vide
        User user = new UserImpl();
        user.setCompany(null);
        user.setEmail(null);
        user.setFirstName(null);
        user.setLastName("-");
        user.setLogin(null);
        user.setPassword(null);
        user.setPersistanceId(0);
        user.setPersistanceVersion(0);
        user.setProjects(null);
        members.add(user);

        request.setAttribute("members", members);

    }

}
