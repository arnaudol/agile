/*
 * Project.java
 *
 * Created on 1 avril 2007, 13:25
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import java.util.ArrayList;
import java.util.List;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.web.aso.CurrentUser;
import net.sf.pmr.web.components.TabsContent;

import org.apache.tapestry.IPage;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.annotations.InjectState;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Project extends BasePage implements PageBeginRenderListener {
    
      // labels to use for the component
     public abstract List<TabsContent> getNotSelectedTabs();         
     public abstract void setNotSelectedTabs(List<TabsContent> tabsContents);
     
     // current label to use for the component
     public abstract TabsContent getSelectedTab();         
     public abstract void setSelectedTab(TabsContent TabsContent);
    
    // get projet
    public abstract net.sf.pmr.core.domain.project.Project getProject();
    // set project
    public abstract void setProject(net.sf.pmr.core.domain.project.Project project);
    
    // get current user from session
    @InjectState("currentUser")
    public abstract CurrentUser getCurrentProject();
    
     // inject projectList page
    @InjectPage("Projects")
    public abstract Projects getProjectsPage();
    
    public void pageBeginRender(PageEvent pageEvent) {
        
        this.buildTabs();
        
        if (getProject() == null) {
            setProject(CoreObjectFactory.getProject());
        }
       
    }
    
    // buid the tabs for the page
    private void buildTabs(){
        
        List<TabsContent> tabsContents = new ArrayList<TabsContent>();
        
        TabsContent tabsContent1 = new TabsContent();
        tabsContent1.setLabel("Projet");
        tabsContent1.setUrl("#");
        
        // onglet actif
        this.setSelectedTab(tabsContent1);

        TabsContent tabsContent2 = new TabsContent();
        tabsContent2.setLabel("Utilisateur");
        tabsContent2.setUrl("#");
        
        tabsContents.add(tabsContent2);
        
        // onglets inactifs
        this.setNotSelectedTabs(tabsContents);
                
    }
    
    
    public IPage addProject() {
        
        net.sf.pmr.core.domain.project.Project project = getProject();
        
        Errors errors =  CoreObjectFactory.getProjectService().add(this.getProject(), getCurrentProject().getUser());
        
        return getProjectsPage();
        
    }
    
}
