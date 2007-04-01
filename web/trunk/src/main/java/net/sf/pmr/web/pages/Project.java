/*
 * Project.java
 *
 * Created on 1 avril 2007, 13:25
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import net.sf.pmr.core.CoreObjectFactory;

import org.apache.tapestry.IPage;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Project extends BasePage implements PageBeginRenderListener {
    
    // get projet
    public abstract net.sf.pmr.core.domain.project.Project getMyProject();
    
    // set project
    public abstract void setMyProject(net.sf.pmr.core.domain.project.Project project);
    
    // inject workspace page
    @InjectPage("WorkSpace")
    public abstract WorkSpace getWorkSpace();
    
    public void pageBeginRender(PageEvent pageEvent) {
        
        if (getMyProject() == null) {
            setMyProject(CoreObjectFactory.getProjectService().findByPersistanceId(1));
        }
       
    }
    
    public IPage addProject() {
        
        net.sf.pmr.core.domain.project.Project project = getMyProject();
        
        CoreObjectFactory.getProjectService().add(project.getCode(), project.getName(), 1);
        
        return getWorkSpace();
        
    }
    
}
