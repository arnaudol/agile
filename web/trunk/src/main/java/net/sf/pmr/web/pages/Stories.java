/*
 * Stories.java
 *
 * Created on 18 mars 2007, 16:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import java.util.HashSet;
import java.util.Set;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.agilePlanning.service.StoryService;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Stories extends BasePage {    
    
    private StoryService storyService;
    
    public abstract Story getStory();    

    public Stories() {
        super();
    }

    
    public Set<Story> getStories() {
        
        Set<Story> set = new HashSet<Story>();
        Project project = new ProjectImpl();
        project.setPersistanceId(1);
        project.setCode("Projet 1");
        
        Story story1 = new StoryImpl();
        story1.setDescription("Story 1");
        story1.setProject(project);
        
        Story story2 = new StoryImpl();        
        story2.setDescription("Story 2");
        story2.setProject(project);
        
        
        set.add(story1);
        set.add(story2);
        
        return set;
        
        //return this.storyService.findByProjectPersistanceId(1);
    }    
    
}
