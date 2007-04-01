/*
 * Project.java
 *
 * Created on 1 avril 2007, 13:25
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import java.util.Set;

import net.sf.pmr.core.CoreObjectFactory;

import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Projects extends BasePage implements PageBeginRenderListener {
    
    // projet
    public abstract Set<net.sf.pmr.core.domain.project.Project> getProjects();
    public abstract void setProjects(Set<net.sf.pmr.core.domain.project.Project> projects);
    
    public void pageBeginRender(PageEvent pageEvent) {
        
    	this.setProjects(CoreObjectFactory.getProjectService().findForAUser(1));
       
    }
}
