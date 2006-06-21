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

package net.sf.pmr.struts.myWorkspace.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.service.IterationService;
import net.sf.pmr.agilePlanning.service.ReleaseService;
import net.sf.pmr.agilePlanning.service.StoryService;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.service.BasicProjectService;
import net.sf.pmr.struts.myWorkspace.form.MyWorkspaceForm;
import net.sf.pmr.toDo.ToDoObjectFactory;
import net.sf.pmr.toDo.domain.todo.ToDo;
import net.sf.pmr.toDo.service.ToDoService;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author arnaud.prost@gmail.com
 */
public class MyWorkspaceAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

        MyWorkspaceForm myWorkspaceForm = (MyWorkspaceForm) form;
        
	     // TODO regarder le ActionSupport pour struts de spring
	    
	    BasicProjectService basicProjectService = CoreObjectFactory.getBasicProjectService();
        
        Set projectSet = basicProjectService.findForAUser(((User) request.getSession().getAttribute("user")).getPersistanceId());
        
        List projects = new ArrayList(projectSet);
        
        // Positionnement d'un projet par défaut.... si il en existe un dans la
        // liste...
        // et si ce n'est pas déjà fait... et s'il n'y a rien en session
        if (projects.size() > 0 & myWorkspaceForm.getProjectId() == 0 & request.getSession().getAttribute("basicProject.persistanceId") == null || ((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue() == 0){
            
            myWorkspaceForm.setProjectId( ((BasicProject)projects.get(0)).getPersistanceId());
            myWorkspaceForm.setProjectName( ((BasicProject)projects.get(0)).getName());
            
        } // si un project est en session et que rien n'est dans le form
        else if (projects.size() > 0 & myWorkspaceForm.getProjectId() == 0 & request.getSession().getAttribute("basicProject.persistanceId") != null && ((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue() != 0){
            
            for (Iterator iterator = projects.iterator(); iterator.hasNext();) {
                BasicProject basicProject = (BasicProject) iterator.next();
                
                if (basicProject.getPersistanceId() == ((Integer) request.getSession().getAttribute("basicProject.persistanceId")).intValue()) {

                    myWorkspaceForm.setProjectId(basicProject.getPersistanceId());
                    myWorkspaceForm.setProjectName(basicProject.getName());

                }

            }

        }
        // si une sélection est faite dans la liste
        else if (projects.size() > 0 & myWorkspaceForm.getProjectId() > 0){
        	
            for (Iterator iterator = projects.iterator(); iterator.hasNext();) {
                BasicProject basicProject = (BasicProject) iterator.next();
                
                if (basicProject.getPersistanceId() == myWorkspaceForm.getProjectId()) {

                    myWorkspaceForm.setProjectId(basicProject.getPersistanceId());
                    myWorkspaceForm.setProjectName(basicProject.getName());

                }

            }

        	
        }

        // mise en session de l'id du projet et du nom
        request.getSession().setAttribute("basicProject.persistanceId", Integer.valueOf(myWorkspaceForm.getProjectId()));
        request.getSession().setAttribute("basicProject.name", myWorkspaceForm.getProjectName());

		 // set the list of projects in the request
		 request.setAttribute("projects", projects);
        
		 this.displayProjectPlanning(request, myWorkspaceForm);
		 this.displayCurrentIterationPlanning(request, myWorkspaceForm);
		 this.displayToDo(request, myWorkspaceForm);
		 
		 return mapping.findForward("success");

	}
	
	
	/**
	 * display the project planning.
	 */
	private void displayProjectPlanning(final HttpServletRequest request, final MyWorkspaceForm myWorkspaceForm) {
	
	    // Afficher le nombre de story
        int numberOfStory = 0;
    	// nombre de story terminées, en cours, à faire
    	int numberOfStoryLeft = 0;
    	int numberOfStoryInProgress = 0;
    	int numberOfStoryCompleted = 0;

        StoryService storyService = AgilePlanningObjectFactory.getStoryService();
        if (myWorkspaceForm.getProjectId() > 0) {
        	
        	Set<Story> stories = storyService.findByProjectPersistanceId(myWorkspaceForm.getProjectId());

        	// nombre de story
        	numberOfStory = stories.size();
        	
        	for (Story story : stories) {
        		
        		if (story.isCompleted()) {
        			numberOfStoryCompleted = numberOfStoryCompleted + 1;
        		} else if (story.isInProgress()){
        			numberOfStoryInProgress = numberOfStoryInProgress + 1;
        		} else if (story.isLeft()) {
        			numberOfStoryLeft = numberOfStoryLeft + 1;
        		}
				
			}
            
        }
        
        request.setAttribute("basicProject.numberOfStory", Integer.valueOf(numberOfStory));
        request.setAttribute("basicProject.numberOfStoryLeft", numberOfStoryLeft);
        request.setAttribute("basicProject.numberOfStoryCompleted", numberOfStoryCompleted);
        request.setAttribute("basicProject.numberOfStoryInProgress", numberOfStoryInProgress);
        
        // Afficher le nombre d'iteration
        int numberOfIteration = 0;
        IterationService iterationService = AgilePlanningObjectFactory.getIterationService();
        if (myWorkspaceForm.getProjectId() > 0) {
            numberOfIteration = iterationService.findByProjectPersistanceId(myWorkspaceForm.getProjectId()).size();
        }
        request.setAttribute("basicProject.numberOfIteration", Integer.valueOf(numberOfIteration));
        
        // Afficher le nombre de release
        int numberOfRelease = 0;
        ReleaseService releaseService = AgilePlanningObjectFactory.getReleaseService();
        if (myWorkspaceForm.getProjectId() > 0) {
           numberOfRelease = releaseService.findByProjectPersistanceId(myWorkspaceForm.getProjectId()).size();
        }
        request.setAttribute("basicProject.numberOfRelease", Integer.valueOf(numberOfRelease));                

	}
	
	
	/**
	 * display the current iteration planning.
	 */
	private void displayCurrentIterationPlanning(final HttpServletRequest request, final MyWorkspaceForm myWorkspaceForm) {
	
	    // Afficher le nombre de story
        int numberOfStory = 0;
    	// nombre de story terminées, en cours, à faire
    	int numberOfStoryLeft = 0;
    	int numberOfStoryInProgress = 0;
    	int numberOfStoryCompleted = 0;
    	
    	// Afficher le nombre de task
    	int numberOfTasks = 0;
    	// nombre de task terminées, en cours, à faire
    	int numberOfTaskLeft = 0;
    	int numberOfTaskInProgress = 0;
    	int numberOfTaskCompleted = 0;
    	
    	int iterationPersistanceId = 0;
    	
    	//String iterationProgressBar = "";
    	

        IterationService iterationService = AgilePlanningObjectFactory.getIterationService();
        if (myWorkspaceForm.getProjectId() > 0) {
        	
        	Iteration iteration = iterationService.findCurrentIteration(myWorkspaceForm.getProjectId());
        	
        	Set<Story> stories = new HashSet<Story>();
        	
        	if (iteration != null) {
        		
        		iterationPersistanceId = iteration.getPersistanceId();
        		
        		stories = iteration.getStories();
        		
        		//iterationProgressBar = ProgressBar.buildProgressBar(iteration.percentCompleted());
        		
        	}

        	// nombre de story
        	numberOfStory = stories.size();
        	
        	for (Story story : stories) {
        		
        		if (story.isCompleted()) {
        			numberOfStoryCompleted = numberOfStoryCompleted + 1;
        		} else if (story.isInProgress()){
        			numberOfStoryInProgress = numberOfStoryInProgress + 1;
        		} else if (story.isLeft()) {
        			numberOfStoryLeft = numberOfStoryLeft + 1;
        		}
        		
        		for (Task task : story.getTasks()) {

        			numberOfTasks = numberOfTasks + 1;
        			
            		if (task.isCompleted()) {
            			numberOfTaskCompleted = numberOfTaskCompleted + 1;
            		} else if (task.isInProgress()){
            			numberOfTaskInProgress = numberOfTaskInProgress + 1;
            		} else if (task.isLeft()) {
            			numberOfTaskLeft = numberOfTaskLeft + 1;
            		}
        			
				}
				
			}
            
        }
        
        request.setAttribute("iteration.persistanceId", iterationPersistanceId);
        
        request.setAttribute("iteration.numberOfStory", Integer.valueOf(numberOfStory));
        request.setAttribute("iteration.numberOfStoryLeft", numberOfStoryLeft);
        request.setAttribute("iteration.numberOfStoryCompleted", numberOfStoryCompleted);
        request.setAttribute("iteration.numberOfStoryInProgress", numberOfStoryInProgress);
        
        //request.setAttribute("iteration.progressBar", iterationProgressBar);
        
        request.setAttribute("iteration.numberOfTask", Integer.valueOf(numberOfTasks));
        request.setAttribute("iteration.numberOfTaskLeft", numberOfTaskLeft);
        request.setAttribute("iteration.numberOfTaskCompleted", numberOfTaskCompleted);
        request.setAttribute("iteration.numberOfTaskInProgress", numberOfTaskInProgress);
        
	}

	
	/**
	 * display the ToDos
	 */
	private void displayToDo(final HttpServletRequest request, final MyWorkspaceForm myWorkspaceForm) {
		
	    // Afficher le nombre de todo
        int numberOfToDo = 0;

        // Récupération du service
		ToDoService toDoService = ToDoObjectFactory.getToDoService();
        
        if (myWorkspaceForm.getProjectId() > 0) {
        	
        	User user = (User) request.getSession().getAttribute("user");
        	
        	List<ToDo> todos =  toDoService.findByProjectPersistanceIdAndUserPersistanceId(myWorkspaceForm.getProjectId(), user.getPersistanceId());
        	
        	// nombre de story
        	numberOfToDo = todos.size();
        	
        }
        
        request.setAttribute("toDo.numberOfToDo", Integer.valueOf(numberOfToDo));
        
	}

}
