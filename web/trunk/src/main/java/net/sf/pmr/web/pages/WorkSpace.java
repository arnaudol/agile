/*
 * WorkSpace.java
 *
 * Created on 24 décembre 2006, 18:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.web.beans.UserLogin;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.form.IPropertySelectionModel;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class WorkSpace extends BasePage implements PageBeginRenderListener {
    
    // getter for User Login
    public abstract void setUserLogin(UserLogin userLogin);
    
    public abstract int getCurrentProject();
    
    public abstract void setCurrentProject(int currentProject);
    
    public void pageBeginRender(PageEvent pageEnvent) {
        setCurrentProject(1);
    }
    
    // get projects list for the current user
    public IPropertySelectionModel getProjects() {        
        return new ProjectSelectionModel(1);
    }    
    
}
