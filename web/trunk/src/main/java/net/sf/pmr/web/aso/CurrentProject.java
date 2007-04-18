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
    
}
