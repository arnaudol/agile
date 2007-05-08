/*
 * WorkSpace.java
 *
 * Created on 24 décembre 2006, 18:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.web.aso.CurrentProject;
import net.sf.pmr.web.beans.UserLogin;
import net.sf.pmr.web.select.ProjectSelectionModel;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.annotations.InjectState;

import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.form.IPropertySelectionModel;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class WorkSpace extends BasePage implements PageBeginRenderListener {
    
    // property selection model for projets list
    private IPropertySelectionModel iPropertySelectionModel = null;
    
    // getter for User Login
    public abstract void setUserLogin(UserLogin userLogin);
    
    @InjectState("currentProject")
    public abstract CurrentProject getCurrentProject();
    
    // selected projet
    public abstract net.sf.pmr.core.domain.project.Project getSelectedProject();    
    public abstract void setSelectedProject(net.sf.pmr.core.domain.project.Project currentProject);
    
    // inject stories page
    @InjectPage("Stories")
    public abstract net.sf.pmr.web.pages.Stories getStories();
    
    // get projects list for the current user
    public IPropertySelectionModel getProjectSelectionModel() {        
        return new ProjectSelectionModel(1);
    }    

    // get the list of projets
    public void pageBeginRender(PageEvent event) {
        
       this.iPropertySelectionModel = new ProjectSelectionModel(1);
       
       // set the default selected project for the first rendering of the page
       if (getSelectedProject() == null) {
            setSelectedProject((net.sf.pmr.core.domain.project.Project) iPropertySelectionModel.getOption(0));
       }
       
       CurrentProject currentProject = this.getCurrentProject();
       currentProject.setProject(this.getSelectedProject());
       
    }

   /**
     * Get the number of projects
     * @return
     */
    public long getNumberOfProjects() {
    	return CoreObjectFactory.getProjectService().countAll();
    }
    
    /**
     * Get the number of stories for the projet
     * @return
     */
    public int getNumberOfStories() {
    	return AgilePlanningObjectFactory.getStoryService().findByProjectPersistanceId(getSelectedProject().getPersistanceId()).size();
    }
    
    /**
     * Get the number of iteration for the projet
     * @return
     */
    public int getNumberOfIterations() {
    	return AgilePlanningObjectFactory.getIterationService().findByProjectPersistanceId(getSelectedProject().getPersistanceId()).size();
    }
    
    /**
     * Get the number of release for the projet
     * @return 
     */
    public int getNumberOfReleases() {
    	return AgilePlanningObjectFactory.getReleaseService().findByProjectPersistanceId(getSelectedProject().getPersistanceId()).size();
    }
    
    /**
     * Get the number of iteration for the projet
     * @return
     */
    public Iteration getCurrentIteration() {
    	return AgilePlanningObjectFactory.getIterationService().findCurrentIteration(getSelectedProject().getPersistanceId());
    }

    /**
     * the form is submited where the project is changed
     **/
    public void formSubmit() {
        
    }
}
