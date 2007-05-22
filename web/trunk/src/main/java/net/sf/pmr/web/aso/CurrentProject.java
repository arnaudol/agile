/*
 * CurrentProject.java
 *
 * Created on 18 avril 2007, 22:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.aso;

import java.io.Serializable;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.core.domain.project.Project;

/**
 *
 * @author arnaud
 */
public class CurrentProject implements Serializable {
    
    private Project project;
    
    /** Creates a new instance of CurrentProject */
    public CurrentProject() {
        
    }
    
    public Project getProject() {
        return project;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    
    
    public int numberOfStories()  {
        
        return AgilePlanningObjectFactory.getStoryService().findByProjectPersistanceId(this.getProject().getPersistanceId()).size();
        
    }
    
    public int numberOfIterations()  {
        
        return AgilePlanningObjectFactory.getIterationService().findByProjectPersistanceId(this.getProject().getPersistanceId()).size();
        
    }
    
    
    public int numberOfReleases()  {
        
        return AgilePlanningObjectFactory.getReleaseService().findByProjectPersistanceId(this.getProject().getPersistanceId()).size();
        
    }
    
    
}
