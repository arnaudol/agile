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

package net.sf.pmr.struts.agilePlanning.charge.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.agilePlanning.service.StoryService;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.struts.agilePlanning.charge.form.ChargeForm;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;


public class ChargeAction extends LookupDispatchAction {

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
     * list of the charges
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

        // list the charges for the current task
        int taskPersistanceId = 0;
        if ( StringUtils.isNotEmpty(request.getParameter("taskPersistanceId"))) {
            taskPersistanceId = Integer.parseInt(request.getParameter("taskPersistanceId"));
        }
        int storyPersistanceId = 0;
        if ( StringUtils.isNotEmpty(request.getParameter("storyPersistanceId"))) {
        	storyPersistanceId = Integer.parseInt(request.getParameter("storyPersistanceId"));
        }
        
        Task task = storyService.findTaskByPersistanceId(taskPersistanceId);

        // put the tasks in the request
        request.setAttribute("chargeList", task.getCharges());

        // populate summary
        populateSummary(request, storyPersistanceId, taskPersistanceId);

        return mapping.findForward("chargeList");
    }

    /**
     * detail of a charge
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward detail(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // get the service
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        // populate the form
        ChargeForm chargeForm = (ChargeForm) form;
        chargeForm.setStoryPersistanceId(Integer.parseInt((String) request.getParameter("storyPersistanceId")));
        chargeForm.setTaskPersistanceId(Integer.parseInt((String) request.getParameter("taskPersistanceId")));
        
        // find the Story... if needed
        if (StringUtils.isNotEmpty((String) request.getParameter("persistanceId"))) {

            Charge charge = storyService.findChargeByPersistanceId(Integer.parseInt((String) request.getParameter("persistanceId")));

            chargeForm.setDay(charge.getDay());
            chargeForm.setDaysNeededToFinish(charge.getDaysNeededToFinish());
            chargeForm.setTimeUsedToday(charge.getTimeUsedToday());
            chargeForm.setPersistanceVersion(charge.getPersistanceVersion());
            
        }    
    
        // populate summary
        populateSummary(request, chargeForm.getStoryPersistanceId(), chargeForm.getTaskPersistanceId());

        return mapping.findForward("chargeDetail");

    }

    /**
     * Save charge
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward save(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // get the service
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        // get the form
        ChargeForm chargeForm = (ChargeForm) form;

        // TODO faire une seul m�thode taskService.save ?
        // save the story
        if (chargeForm.getPersistanceId() == 0) {
            // add
            storyService.addCharge(chargeForm.getStoryPersistanceId(), 
            								chargeForm.getTaskPersistanceId(),
            								((User) request.getSession().getAttribute("user")).getPersistanceId(),
            								chargeForm.getDay(),
            								chargeForm.getTimeUsedToday(),
            								chargeForm.getDaysNeededToFinish());
        } else {
            // update
            storyService.updateCharge(chargeForm.getDay(), 
            						  chargeForm.getTimeUsedToday(),
            						  chargeForm.getDaysNeededToFinish(),
            						  chargeForm.getStoryPersistanceId(),
            						  chargeForm.getTaskPersistanceId(),
            						  chargeForm.getPersistanceId(),
            						  chargeForm.getPersistanceVersion());
        }

            
        // set the storyPersistanceId in request
        request.setAttribute("storyPersistanceId", String.valueOf(chargeForm.getStoryPersistanceId()));
            
         return this.list(mapping, form, request, response);

    }

    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // TODO A faire ...

        // // get the user service
        // UserService userService = CoreObjectFactory.getUserService();
        // // get the project repository
        // BasicProjectService basicProjectService = CoreObjectFactory
        // .getBasicProjectService();
        //
        // // delete
        // //userService
        //
        // // set the number of user in the request
        // request.setAttribute("numberOfUser", userService.countAll());
        // // set the number of project in the request
        // request.setAttribute("numberOfProject", basicProjectService.countAll());
        //
        // return mapping.findForward("storyList");

        return this.list(mapping, form, request, response);

    }

    /**
     * populate the summary
     * @param request request
     */
    private void populateSummary(final HttpServletRequest request, final int storyPersistanceId, final int taskPersistanceId) {

        // get the service
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        request.setAttribute("numberOfCharge", Integer.valueOf(storyService.findTaskByPersistanceId(taskPersistanceId).getCharges().size()) );
        request.setAttribute("storyPersistanceId", storyPersistanceId);
        request.setAttribute("taskPersistanceId", taskPersistanceId);
        request.setAttribute("story.shortDescription", storyService.findByPersistanceId(storyPersistanceId).getShortDescription());
        request.setAttribute("task.shortDescription", storyService.findTaskByPersistanceId(taskPersistanceId).getShortDescription());
        

    }

}