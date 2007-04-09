/*
 * Stories.java
 *
 * Created on 18 mars 2007, 16:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import java.util.Set;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.Story;
import org.apache.tapestry.IPage;
import org.apache.tapestry.annotations.InjectPage;

import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Stories extends BasePage {    
    
    // set of stories to display
    public abstract Set<Story> getStories();
    public abstract void setStories(Set<Story> stories);
 
    // inject story page
    @InjectPage("Story")
    public abstract net.sf.pmr.web.pages.Story getStory();

   /**
    * find the story selected by the user
    *
    */
   public IPage selectStory(int persistanceId)  {
       
       net.sf.pmr.web.pages.Story storyPage = getStory();
       
       storyPage.setStory(AgilePlanningObjectFactory.getStoryService().findByPersistanceId(persistanceId));
       
       return storyPage;
       
   }
    
}
