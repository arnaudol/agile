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
public abstract class Stories extends BasePage implements PageBeginRenderListener {
    
     // labels to use for the component
     public abstract List getLabels();         
     public abstract void setLabels(List labels);
     
     // current label to use for the component
     public abstract String getCurrentLabel();         
     public abstract void setCurrentLabel(String currentLabel);
    
    // set of stories to display
    public abstract Set<Story> getStories();
    public abstract void setStories(Set<Story> stories);
 
    // inject story page
    @InjectPage("Story")
    public abstract net.sf.pmr.web.pages.Story getStory();
    
    // inject current project
    @InjectState("currentProject")
    public abstract CurrentProject getCurrentProject();

    
    // get the list of projets
    public void pageBeginRender(PageEvent event) {
        
        this.setCurrentLabel("Onglet 1");
        List list = new ArrayList();
        list.add("Histoire");
        list.add("Itération");
        list.add("Release");
        this.setLabels(list);
        
        this.setStories(AgilePlanningObjectFactory.getStoryService().findByProjectPersistanceId(this.getCurrentProject().getProject().getPersistanceId()));
        
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
