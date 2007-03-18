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

package net.sf.pmr.struts.agilePlanning.story.action;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.BusinessValue;
import net.sf.pmr.agilePlanning.domain.story.RiskLevel;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.service.IterationService;
import net.sf.pmr.agilePlanning.service.ReleaseService;
import net.sf.pmr.agilePlanning.service.StoryService;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.MessageParameters;
import net.sf.pmr.struts.agilePlanning.story.form.StoryForm;
import net.sf.pmr.struts.agilePlanning.story.view.BusinessValueView;
import net.sf.pmr.struts.agilePlanning.story.view.RiskLevelView;
import net.sf.pmr.struts.agilePlanning.story.view.StoryView;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.LookupDispatchAction;

public class StoryAction extends LookupDispatchAction {
	
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
     * display the stories for the project.
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
        StoryService storyService = AgilePlanningObjectFactory
                .getStoryService();

        // list the stories for the current project
        Set stories = storyService
                .findByProjectPersistanceId(((Integer) request.getSession()
                        .getAttribute("basicProject.persistanceId")).intValue());

    	Set<StoryView> storyViews = this.buildStoryViewsForStories(stories);

        // put in request
        request.setAttribute("storyList", storyViews);

        // populate summary
        populateListForProjectSummary(request);

        return mapping.findForward("storyList");

    }
    
    
    public ActionForward detail(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // TODO Faire une m�thode de s�curit� pour v�rifier le user

        // get the service
        StoryService storyService = AgilePlanningObjectFactory
                .getStoryService();

        // find the Story... if needed
        if (StringUtils.isNotEmpty((String) request
                .getParameter("persistanceId"))) {

            Story story = storyService.findByPersistanceId(Integer
                    .parseInt((String) request.getParameter("persistanceId")));

            // populate the form
            StoryForm storyForm = (StoryForm) form;

            storyForm.setDescription(story.getDescription());
            storyForm.setDaysEstimated(story.getDaysEstimated());
            storyForm.setShortDescription(story.getShortDescription());
            storyForm.setPersistanceId(story.getPersistanceId());
            storyForm.setPersistanceVersion(story.getPersistanceVersion());
            storyForm.setBusinessValueId(story.getBusinessValue().getId());
            storyForm.setRiskLevelId(story.getRiskLevel().getId());
            storyForm.setDaysCompleted(story.daysCompleted());
            storyForm.setDaysRemaining(story.daysRemaining());
            storyForm.setPercentCompleted(story.percentCompleted());
            storyForm.setDifferenceInPercentBetweenEstimateAndTaskCharge(story.differenceInPercentBetweenEstimateAndTaskCharge());
            storyForm.setDifferenceOfDaysBetweenEstimateAndTaskCharge(story.differenceOfDaysBetweenEstimateAndTaskCharge());
            storyForm.setDifferenceInPercentBetweenEstimateAndTaskEstimate(story.differenceInPercentBetweenEstimateAndTaskEstimate());
            storyForm.setDifferenceOfDaysBetweenEstimateAndTaskEstimate(story.differenceOfDaysBetweenEstimateAndTaskEstimate());

        }

        // get the list of riskLevel to populate the list box
        Set<RiskLevel> riskLevels = storyService.findAllRiskLevel();
        // populate a list of views
        Set<RiskLevelView> riskLevelsToReturn = new HashSet<RiskLevelView>();
        for (RiskLevel riskLevel : riskLevels) {
            RiskLevelView riskLevelView = new RiskLevelView();
            riskLevelView.populateWithRiskLevel(riskLevel);
            riskLevelsToReturn.add(riskLevelView);
        }
        
        request.setAttribute("riskLevels", riskLevelsToReturn);
        
        // get the list of businessValue to populate the list box
        Set<BusinessValue> businessValues = storyService.findAllBusinessValue();
        // populate a list of views
        Set<BusinessValueView> businessValuesToReturn = new HashSet<BusinessValueView>();
        for (BusinessValue businessvalue : businessValues) {
            BusinessValueView businessValueView = new BusinessValueView();
            businessValueView.populateWithBusinessValue(businessvalue);
            businessValuesToReturn.add(businessValueView);
        }
        
        request.setAttribute("businessValues", businessValuesToReturn);

        // populate summary
        populateListForProjectSummary(request);

        return mapping.findForward("storyDetail");

    }

    public ActionForward save(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // get the service
        StoryService storyService = AgilePlanningObjectFactory
                .getStoryService();

        // get the form
        StoryForm storyform = (StoryForm) form;

        // TODO faire une seul m�thode storyService.save ?
        Errors errors = null;
        // save the story
        if (storyform.getPersistanceId() == 0) {
            // add
            // get the current basicProject from the session
            Integer basicProjectPersistanceId = (Integer) request.getSession()
                    .getAttribute("basicProject.persistanceId");
            errors = storyService.add(basicProjectPersistanceId.intValue(),
                    storyform.getShortDescription(),
                    storyform.getDescription(), storyform.getDaysEstimated(),
                    storyform.getBusinessValueId(), storyform.getRiskLevelId());
        } else {
            // update
             errors = storyService.update(storyform.getShortDescription(),
             storyform.getDescription(), storyform.getDaysEstimated(),
             storyform.getBusinessValueId(), storyform.getRiskLevelId(),
             storyform.getPersistanceId(), storyform.getPersistanceVersion());
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

        // populate the summary
        populateListForProjectSummary(request);

        // forward
        if (actionMessages.isEmpty() == false) {
            return mapping.findForward("storyDetail");
        } else {
            return this.list(mapping, form, request, response);
        }

    }

    /**
     * delete a story
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
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();

        // get the form
        StoryForm storyform = (StoryForm) form;
        
        // delete the story
        Errors errors = storyService.delete(storyform.getPersistanceId(), storyform.getPersistanceVersion());

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

        // populate the summary
        populateListForProjectSummary(request);
        


        // forward
        if (actionMessages.isEmpty() == false) {
        	// TODO trouver mieux 
        	return this.detail(mapping, form, request, response);        	
            // return mapping.findForward("storyDetail");
        } else {
            return this.list(mapping, form, request, response);
        }

    }

    /**
     * build a list of storyView from a list of story.
     * @param stories
     * @return set of story view
     */
    private Set<StoryView> buildStoryViewsForStories (final Set<Story> stories) {
    	
        // use the view because of the display which can't display the size()
        // for the set of tasks
        Set<StoryView> storiesToReturn = new HashSet<StoryView>();
        
        for (Iterator iterator = stories.iterator(); iterator.hasNext();) {
            Story story = (Story) iterator.next();

            StoryView storyView = new StoryView();

            storyView.setDescription(story.getDescription());
            storyView.setDaysEstimated(story.getDaysEstimated());
            storyView.setNumberOfTask(story.getTasks().size());
            storyView.setPersistanceId(story.getPersistanceId());
            storyView.setPersistanceVersion(story.getPersistanceVersion());
            storyView.setShortDescription(story.getShortDescription());
            storyView.setBusinessValue(story.getBusinessValue().getDescription());
            storyView.setRiskLevel(story.getRiskLevel().getDescription());
            storyView.setPercentCompleted(story.percentCompleted());
            storyView.setWarning(story.warning());

            storiesToReturn.add(storyView);

        }
        
        return storiesToReturn;
    	
    }

    
    /**
     * populate the summary for the list of stories for the project.
     * @param request request
     */
    private void populateListForProjectSummary(final HttpServletRequest request) {

        // Get the services
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();
        IterationService iterationService = AgilePlanningObjectFactory.getIterationService();
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();

        // number of story 
        request.setAttribute("numberOfStory", new Integer(storyService
                .findByProjectPersistanceId(((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue()).size()));
        
        // number of iteration
        request.setAttribute("numberOfIteration", new Integer(
        		iterationService.findByProjectPersistanceId(((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue()).size()));
        
        // number of release
        request.setAttribute("numberOfRelease", new Integer(
        		releaseService.findByProjectPersistanceId(((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue()).size()));

    }

}
