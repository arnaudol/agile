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

package net.sf.pmr.struts.agilePlanning.release.action;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.service.IterationService;
import net.sf.pmr.agilePlanning.service.ReleaseService;
import net.sf.pmr.agilePlanning.service.StoryService;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.struts.agilePlanning.release.form.ReleaseForm;
import net.sf.pmr.struts.agilePlanning.release.view.ReleaseView;
import net.sf.pmr.struts.agilePlanning.story.view.StoryView;
import net.sf.pmr.struts.utils.ActionMessageUtils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.LookupDispatchAction;

/**
 * Struts action pour la release.
 * @author arnaud.prost@gmail.com
 */
public class ReleaseAction extends LookupDispatchAction {

    /**
     * @see org.apache.struts.actions.LookupDispatchAction#getKeyMethodMap()
     */
    protected Map getKeyMethodMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("button.save", "save");
        map.put("link.list", "list");
        map.put("link.detail", "detail");
        map.put("button.delete", "delete");
        map.put("link.storiesToAdd", "storiesToAdd");
        map.put("link.storiesToRemove", "storiesToRemove");
        map.put("link.storiesForRelease", "storiesForRelease");
        map.put("button.addStories", "addStories");
        map.put("button.cancelAddStories", "cancelAddStories");
        map.put("button.removeStories", "removeStories");
        map.put("button.cancelRemoveStories", "cancelRemoveStories");
        return map;
    }

    /**
     * liste des releases.
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

        // get the  service
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
        
        // list the releases for the current project
        Set<Release> releases = releaseService.findByProjectPersistanceId(((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue());
        
        Set<ReleaseView> releasesView = new HashSet<ReleaseView>();

        // copy the properties from the release to the view
        for (Release release : releases) {
        	ReleaseView releaseView = new ReleaseView();
        	BeanUtils.copyProperties(releaseView, release);
        	// set the warning
        	releaseView.setWarning(release.warning());
        	
        	releasesView.add(releaseView);
		}
        
        // put the list in the wiev
        request.setAttribute("releaseList", releasesView);
    
        // populate summary
        populateSummary(request);
        
        return mapping.findForward("releaseList");

    }

    /**
     * Affiche le détail d'une release.
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

        // TODO Faire une m�thode de s�curit� pour v�rifier le user

        // get the  service
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();        
        
        // find the release... if needed
        if (StringUtils.isNotEmpty( (String) request.getParameter("persistanceId"))) {
      
            Release release = releaseService.findByPersistanceId(Integer.parseInt((String)request.getParameter("persistanceId")));

            // populate the form
            ReleaseForm releaseForm = (ReleaseForm) form;
            
            releaseForm.setDate(release.getDate());
            releaseForm.setNumber(release.getNumber());
            releaseForm.setPersistanceId(release.getPersistanceId());
            releaseForm.setPersistanceVersion(release.getPersistanceVersion());
            
        }
              
        // populate summary
        populateSummary(request);
  
        return mapping.findForward("releaseDetail");

    }

    
    /**
     * display the stories to add for the release.
     * @param mapping mapping
     * @param form form
     * @param request request
     * @param response response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward storiesToAdd(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // get the service
    	ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
    	
        // list the stories for the release
    	Set<Story> stories = releaseService.findStoriesToAdd(Integer.parseInt(request.getSession().getAttribute("basicProject.persistanceId").toString()));
    	
    	// build the set of storyViews
    	Set<StoryView> storyViews = this.buildStoryViewsFromStories(stories);
    	
        // put the storyViews in the request
        request.setAttribute("storyList", storyViews);
        
        // put the releasePersistanceId back in the request (for the navigationBar)
        request.setAttribute("releasePersistanceId", request.getParameter("releasePersistanceId"));
        // put the release.number in the request (for the summary)
        request.setAttribute("release.number", request.getParameter("releasePersistanceId"));
        // put the number or story in the request
        request.setAttribute("numberOfStory", stories.size());

        int numberOfStoryCompleted = 0;
        int numberOfStoryInProgress = 0;
        int numberOfStoryLeft = 0;
        for (Story story : stories) {
        	if (story.isCompleted()) {
        		numberOfStoryCompleted = numberOfStoryCompleted +1;
        	}
        	if (story.isInProgress()) {
        		numberOfStoryInProgress = numberOfStoryInProgress +1;
        	}
        	if (story.isLeft()) {
        		numberOfStoryLeft = numberOfStoryLeft +1;
        	}
		}
        // put the number of story completed in the request
        request.setAttribute("numberOfStoryCompleted", numberOfStoryCompleted);
        // put the number of story in progress in the request        
        request.setAttribute("numberOfStoryInProgress", numberOfStoryInProgress);
        // put the number of story left in the request
        request.setAttribute("numberOfStoryLeft", numberOfStoryLeft);

        // populate summary
        //populateListForProjectSummary(request);

        return mapping.findForward("storiesToAdd");

    }
    
    /**
     * display the stories for the release.
     * @param mapping mapping
     * @param form form
     * @param request request
     * @param response response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward storiesForRelease(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

    	this.stories(mapping, form, request, response);
    	
        return mapping.findForward("storiesForRelease");

    }
    
    
    /**
     * display the stories to remove.
     * @param mapping mapping
     * @param form form
     * @param request request
     * @param response response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward storiesToRemove(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	this.stories(mapping, form, request, response);

        return mapping.findForward("storiesToRemove");

    }

    
    /**
     * Add stories to a release.
     * @param mapping mapping
     * @param form form
     * @param request request
     * @param response response
     * @return ActionForward
     * @throws Exception Exception
     */
    public ActionForward addStories(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	
    	// 1. on recherche d'abord dans la request les stories affichées dans la liste
    	Set<String> stories = new HashSet<String>();
    	
    	// on se base sur le nom des checkBox qui est de la forme storyPersistanceId=<persistanceId de la story>
    	String storyPersistanceIdString = "storyPersistanceId=";
    	
    	// parcours de la list des parameters name
        for (Enumeration enumeration = request.getParameterNames() ; enumeration.hasMoreElements() ;) {
        	
    		String parameterName = enumeration.nextElement().toString();
    		
    		if (StringUtils.contains(parameterName, storyPersistanceIdString)) {
    			
    			// ajout à la liste des story
    			stories.add(StringUtils.remove(parameterName, storyPersistanceIdString));
    			
    		}


        }
    	
    	
    	// 2. puis on recherche celles qui sont sélectionnées pour ajout
        // TODO : est-ce nécesaire ? les story renvoyées dans la request ne sont que celles qui sont sélectionnnées ?
    	Set<Integer> storiesToAdd = new HashSet<Integer>();
    	
    	for (String storyPersistanceId : stories) {
    		
    		if ("on".equalsIgnoreCase(request.getParameter(storyPersistanceIdString + storyPersistanceId))) {
    			
    			storiesToAdd.add(Integer.parseInt(storyPersistanceId));
    			
    		}
			
		}
    	
    	// 3. Enfin, on appel le service d'ajout
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
        
        // TODO : recupérer la persistanveVersion dans la request !!!
        
        Release release = releaseService.findByPersistanceId(Integer.parseInt(request.getParameter("releasePersistanceId")));
        
        long persistanceVersion = release.getPersistanceVersion();
        
        
        // ajout
        Errors errors = releaseService.addStories(storiesToAdd, Integer.parseInt(request.getParameter("releasePersistanceId")), persistanceVersion);

        // traitement des erreurs...
        // ... si des erreurs sont trouvée...
        if (errors.hasErrors()) {

        	// ... conversion...
        	ActionMessages actionMessages = ActionMessageUtils.convertFromKeopsErrorsToActionMessages(errors);
        	
        	//... et sauvegarde dans la request
            saveErrors(request, actionMessages);
        	
        }

        //request.setAttribute("releasePersistanceId", request.getParameter("releasePersistanceId"));
        // populate summray
        //request.setAttribute("release.number", release.getNumber());

        if (errors.hasErrors()) {
        	this.populateSummary(request);
        	return mapping.findForward("storiesToAdd");
        } else {
        	return this.storiesForRelease(mapping, form, request, response);
        }
    	
    }
    
    
    /**
     * Cancel the adding of stories to a release.
     * @param mapping mapping
     * @param form form
     * @param request request
     * @param response response
     * @return ActionForward
     * @throws Exception Exception
     */
    public ActionForward cancelAddStories(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    
    	return this.storiesForRelease(mapping, form, request, response);
    	
    }
    
    
    /**
     * Cancel the removing of stories to a release.
     * @param mapping mapping
     * @param form form
     * @param request request
     * @param response response
     * @return ActionForward
     * @throws Exception Exception
     */
    public ActionForward cancelRemoveStories(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    
    	return this.storiesForRelease(mapping, form, request, response);
    	
    }

    
    /**
     * remove stories from a release.
     * @param mapping mapping
     * @param form form
     * @param request request
     * @param response response
     * @return ActionForward
     * @throws Exception Exception
     */
    public ActionForward removeStories(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	
    	// 1. on recherche d'abord dans la request les stories affichées dans la liste
    	Set<String> stories = new HashSet<String>();
    	
    	// on se base sur le nom des checkBox qui est de la forme storyPersistanceId=<persistanceId de la story>
    	String storyPersistanceIdString = "storyPersistanceId=";
    	
    	// parcours de la list des parameters name
        for (Enumeration enumeration = request.getParameterNames() ; enumeration.hasMoreElements() ;) {
        	
    		String parameterName = enumeration.nextElement().toString();
    		
    		if (StringUtils.contains(parameterName, storyPersistanceIdString)) {
    			
    			// ajout à la liste des story
    			stories.add(StringUtils.remove(parameterName, storyPersistanceIdString));
    			
    		}

        }
    	
    	
    	// 2. puis on recherche celles qui sont sélectionnées pour suppression
        // TODO : est-ce nécesaire ? les story renvoyées dans la request ne sont que celles qui sont sélectionnnées ?
    	Set<Integer> storiesToRemove = new HashSet<Integer>();
    	
    	for (String storyPersistanceId : stories) {
    		
    		if ("on".equalsIgnoreCase(request.getParameter(storyPersistanceIdString + storyPersistanceId))) {
    			
    			storiesToRemove.add(Integer.parseInt(storyPersistanceId));
    			
    		}
			
		}
    	
    	// 3. Enfin, on appel le service de suppression
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
        
        // TODO : recupérer la persistanveVersion dans la request !!!
        
        Release release = releaseService.findByPersistanceId(Integer.parseInt(request.getParameter("releasePersistanceId")));
        
        long persistanceVersion = release.getPersistanceVersion();
        
        
        // ajout
        Errors errors = releaseService.removeStories(storiesToRemove, Integer.parseInt(request.getParameter("releasePersistanceId")), persistanceVersion);

        // traitement des erreurs...
        // ... si des erreurs sont trouvée...
        if (errors.hasErrors()) {

        	// ... conversion...
        	ActionMessages actionMessages = ActionMessageUtils.convertFromKeopsErrorsToActionMessages(errors);
        	
        	//... et sauvegarde dans la request
            saveErrors(request, actionMessages);
        	
        }

        //request.setAttribute("releasePersistanceId", request.getParameter("releasePersistanceId"));
        // populate summray
        //request.setAttribute("release.number", release.getNumber());

        if (errors.hasErrors()) {
        	this.populateSummary(request);
        	return mapping.findForward("storiesToRemove");
        } else {
        	return this.storiesForRelease(mapping, form, request, response);
        }
        
    }

    /**
     * Save a release
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

        // get the  service
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
        
        // get the form
        ReleaseForm releaseform = (ReleaseForm) form;

        // TODO faire une seul méthode iterationService.saveOrUpdate ?
        Errors errors = null;
        // get the current basicProject from the session
        Integer basicProjectPersistanceId = (Integer) request.getSession().getAttribute("basicProject.persistanceId");
        // save the iteration
        if (releaseform.getPersistanceId() == 0) {
            // add
            errors = releaseService.add(basicProjectPersistanceId.intValue(), releaseform.getNumber(), releaseform.getDate());    
        } else {
            // update
            errors = releaseService.update(releaseform.getNumber(), releaseform.getDate(), releaseform.getPersistanceId(), releaseform.getPersistanceVersion());
        }

        // Convert into struts action errors
        if (errors.hasErrors()) {
            ActionMessages actionMessages = ActionMessageUtils.convertFromKeopsErrorsToActionMessages(errors);

            saveErrors(request, actionMessages);
            
            // populate the summary
            populateSummary(request);

            return mapping.findForward("releaseDetail");

            
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

        // get the  service
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
        
        // get the form
        ReleaseForm releaseform = (ReleaseForm) form;

        Errors errors = null;
        // delete the iteration
        errors = releaseService.delete(releaseform.getPersistanceId(), releaseform.getPersistanceVersion());

        // Convert into struts action errors
        if (errors.hasErrors()) {
            ActionMessages actionMessages = ActionMessageUtils.convertFromKeopsErrorsToActionMessages(errors);
            saveErrors(request, actionMessages);

            // populate the summary
            populateSummary(request);
            
            // return to the detail
            return mapping.findForward("releaseDetail");
            
        } else {
        	return this.list(mapping, form, request, response);
        }
        
    }

    
    /**
     * build a list of storyView from a list of story.
     * @param stories
     * @return set of story view
     */
    private Set<StoryView> buildStoryViewsFromStories (final Set<Story> stories) {
    	
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
     * populate the summary.
     * @param request request
     */
    private void populateSummary(final HttpServletRequest request) {
        
        // Get the services
        StoryService storyService = AgilePlanningObjectFactory.getStoryService();
        IterationService iterationService = AgilePlanningObjectFactory.getIterationService();
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
        
        
        request.setAttribute("numberOfStory", new Integer(storyService.findByProjectPersistanceId(((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue()).size()));
        request.setAttribute("numberOfIteration", new Integer(iterationService.findByProjectPersistanceId(((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue()).size()));
        request.setAttribute("numberOfRelease", new Integer(releaseService.findByProjectPersistanceId(((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue()).size()));
        
    }
    
    
    
    /**
     * display the stories for the release.
     * @param mapping mapping
     * @param form form
     * @param request request
     * @param response response
     * @throws Exception
     */
    private void stories(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // get the service
    	ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
    	
        // list the stories for the release
    	Release release = releaseService.findByPersistanceId(Integer.parseInt((String) request.getParameter("releasePersistanceId")));
    	
    	// build the set of storyViews
    	Set<StoryView> storyViews = this.buildStoryViewsFromStories(release.getStories());
    	
        // put the storyViews in the request
        request.setAttribute("storyList", storyViews);
        
        // put the releasePersistanceId back in the request (for the navigationBar)
        request.setAttribute("releasePersistanceId", request.getParameter("releasePersistanceId"));
        // put the release.number in the request (for the summary)
        request.setAttribute("release.number", release.getNumber());
        // put the number or story in the request
        request.setAttribute("numberOfStory", release.getStories().size());

        int numberOfStoryCompleted = 0;
        int numberOfStoryInProgress = 0;
        int numberOfStoryLeft = 0;
        for (Story story : release.getStories()) {
        	if (story.isCompleted()) {
        		numberOfStoryCompleted = numberOfStoryCompleted +1;
        	}
        	if (story.isInProgress()) {
        		numberOfStoryInProgress = numberOfStoryInProgress +1;
        	}
        	if (story.isLeft()) {
        		numberOfStoryLeft = numberOfStoryLeft +1;
        	}
		}
        // put the number of story completed in the request
        request.setAttribute("numberOfStoryCompleted", numberOfStoryCompleted);
        // put the number of story in progress in the request        
        request.setAttribute("numberOfStoryInProgress", numberOfStoryInProgress);
        // put the number of story left in the request
        request.setAttribute("numberOfStoryLeft", numberOfStoryLeft);

        // populate summary
        //populateListForProjectSummary(request);

    }
    

}
