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

import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Stories extends BasePage implements PageBeginRenderListener {    
    
	 // projet
    public abstract Set<Story> getStories();
    public abstract void setStories(Set<Story> stories);
    
    public void pageBeginRender(PageEvent pageEvent) {
        
    	this.setStories(AgilePlanningObjectFactory.getStoryService().findByProjectPersistanceId(1));
       
    }
}
