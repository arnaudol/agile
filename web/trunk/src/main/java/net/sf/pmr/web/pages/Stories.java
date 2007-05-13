/*
 * Stories.java
 *
 * Created on 18 mars 2007, 16:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.web.aso.CurrentProject;
import net.sf.pmr.web.components.Tabs;
import net.sf.pmr.web.components.TabsContent;
import org.apache.tapestry.IPage;
import org.apache.tapestry.annotations.InjectComponent;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.annotations.InjectState;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Stories extends BasePage implements PageBeginRenderListener{
    
     // labels to use for the component
     public abstract List<TabsContent> getNotSelectedTabs();         
     public abstract void setNotSelectedTabs(List<TabsContent> tabsContents);
     
     // current label to use for the component
     public abstract TabsContent getSelectedTab();         
     public abstract void setSelectedTab(TabsContent TabsContent);
    
    // set of stories to display
    public abstract Set<Story> getStories();
    public abstract void setStories(Set<Story> stories);
    
    //@InjectComponent("tabs")
    //public abstract Tabs getStoriesTabs();
 
    // inject story page
    @InjectPage("Story")
    public abstract net.sf.pmr.web.pages.Story getStory();
    
    // inject current project
    @InjectState("currentProject")
    public abstract CurrentProject getCurrentProject();

    
    // get the list of projets
    public void pageBeginRender(PageEvent event) {
        
        this.buildTabs();
        
        // récupération de la liste des histoires
        this.setStories(AgilePlanningObjectFactory.getStoryService().findByProjectPersistanceId(this.getCurrentProject().getProject().getPersistanceId()));
        
    }
    
    
    // buid the tabs for the page
    private void buildTabs(){
        
        List<TabsContent> tabsContents = new ArrayList<TabsContent>();
        
        TabsContent tabsContent1 = new TabsContent();
        tabsContent1.setLabel("Histoire");
        tabsContent1.setUrl("#");
        
        // onglet actif
        this.setSelectedTab(tabsContent1);

        TabsContent tabsContent2 = new TabsContent();
        tabsContent2.setLabel("Iteration");
        tabsContent2.setUrl("#");
        
        tabsContents.add(tabsContent2);
        
        TabsContent tabsContent3 = new TabsContent();
        tabsContent3.setLabel("Release");
        tabsContent3.setUrl("#");
        
        tabsContents.add(tabsContent3);
        
        // liste des onglets utilisé par le composant Tabs
        this.setNotSelectedTabs(tabsContents);
                
    }
    

   /**
    * find the story selected by the user
    * @param persistanceId
    * @return Ipage
    */
   public IPage selectStory(int persistanceId)  {
       
       net.sf.pmr.web.pages.Story storyPage = getStory();
       
       storyPage.setStory(AgilePlanningObjectFactory.getStoryService().findByPersistanceId(persistanceId));
       
       return storyPage;
       
   }
       
}
