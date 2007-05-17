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
import java.util.Set;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.web.aso.CurrentUser;
import net.sf.pmr.web.components.TabsContent;
import org.apache.tapestry.annotations.InjectState;

import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 * @author arnaud
 */
public abstract class Projects extends BasePage implements PageBeginRenderListener {
    
    // tabs
     public abstract List<TabsContent> getNotSelectedTabs();         
     public abstract void setNotSelectedTabs(List<TabsContent> tabsContents);
     
     // current tab to use for the component
     public abstract TabsContent getSelectedTab();         
     public abstract void setSelectedTab(TabsContent TabsContent);

    // projet
    public abstract Set<net.sf.pmr.core.domain.project.Project> getProjects();
    public abstract void setProjects(Set<net.sf.pmr.core.domain.project.Project> projects);
    
    @InjectState("currentUser")
    public abstract CurrentUser getCurrentUser();
    
    
    public void pageBeginRender(PageEvent pageEvent) {
     
        this.buildTabs();
        
    	this.setProjects(CoreObjectFactory.getProjectService().findForAUser(this.getCurrentUser().getUser().getPersistanceId()));
       
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
}
