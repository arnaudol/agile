/*
 * Stories.java
 *
 * Created on 18 mars 2007, 16:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;


import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;

import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Story extends BasePage implements PageBeginRenderListener {    
    
    // the story to display
    public abstract net.sf.pmr.agilePlanning.domain.story.Story getStory();
    public abstract void setStory(net.sf.pmr.agilePlanning.domain.story.Story Story);

    
    public void pageBeginRender(PageEvent pageEvent) {
        
    	// if there is no story to display, get a empty one from the factory
        if (this.getStory() == null) {
            this.setStory(AgilePlanningObjectFactory.getStory());
        }
       
    }
        
    
}
