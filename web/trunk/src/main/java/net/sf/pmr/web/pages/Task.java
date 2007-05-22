
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.BusinessValue;
import net.sf.pmr.agilePlanning.domain.story.RiskLevel;
import net.sf.pmr.web.aso.CurrentProject;
import net.sf.pmr.web.aso.CurrentStory;
import net.sf.pmr.web.components.Tabs;
import net.sf.pmr.web.components.TabsContent;
import net.sf.pmr.web.select.BusinessValueSelectionModel;
import net.sf.pmr.web.select.RiskLevelSelectionModel;
import org.apache.tapestry.IPage;
import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.annotations.InjectComponent;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.annotations.InjectState;

import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.form.IPropertySelectionModel;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Task extends BasePage implements PageBeginRenderListener {    
    
      // labels to use for the component
     public abstract List<TabsContent> getNotSelectedTabs();         
     public abstract void setNotSelectedTabs(List<TabsContent> tabsContents);
     
     // current label to use for the component
     public abstract TabsContent getSelectedTab();         
     public abstract void setSelectedTab(TabsContent TabsContent);

    private RiskLevelSelectionModel riskLevelSelectionModel;
    
    private BusinessValueSelectionModel businessValueSelectionModel;
    
    // inject storyList page
    @InjectPage("Tasks")
    public abstract Tasks getTasksPage();
    
    @InjectState("currentStory")
    public abstract CurrentStory getCurrentStory();
        
    // the task to display
    public abstract net.sf.pmr.agilePlanning.domain.story.task.Task getTask();
    public abstract void setTask(net.sf.pmr.agilePlanning.domain.story.task.Task Task);
    
//    // property selection model for riskLevels list
//    public IPropertySelectionModel getRiskLevelSelectionModel() {
//        return this.riskLevelSelectionModel;
//    }
    
//    // selected riskLevels
//    public abstract RiskLevel getSelectedRiskLevel();    
//    public abstract void setSelectedRiskLevel(RiskLevel riskLevel);
    
//    // property selection model for businessValue list
//    public IPropertySelectionModel getBusinessValueSelectionModel() {
//        return this.businessValueSelectionModel;
//    }
    
//    // selected businessValue
//    public abstract BusinessValue getSelectedBusinessValue();    
//    public abstract void setSelectedBusinessValue(BusinessValue businessValue);


    public void pageBeginRender(PageEvent pageEvent) {
        
        // build tabs
        this.buildTabs();

//        // instanciate the selection lists
//        this.riskLevelSelectionModel = new RiskLevelSelectionModel();
//        this.businessValueSelectionModel = new BusinessValueSelectionModel();
//        
//        // if there is no story to display, get a empty one from the factory
//        if (this.getStory() == null) {
//            this.setStory(AgilePlanningObjectFactory.getStory());
//            
//             setSelectedRiskLevel((RiskLevel) riskLevelSelectionModel.getOption(0));
//             setSelectedBusinessValue((BusinessValue) businessValueSelectionModel.getOption(0));
//            
//        } else {
//            
//            if (getSelectedRiskLevel() == null) {
//                setSelectedRiskLevel((RiskLevel) riskLevelSelectionModel.getOptionById(this.getStory().getRiskLevel().getId()));
//            }
//            
//            if (getSelectedBusinessValue() == null) {
//                setSelectedBusinessValue(businessValueSelectionModel.getOptionById(this.getStory().getBusinessValue().getId()));
//            }
//            
//        }

    }
    
    
     public IPage addStory() {
   
//         getStory().setBusinessValue(this.getSelectedBusinessValue());
//         getStory().setRiskLevel(this.getSelectedRiskLevel());
//         getStory().setProject(this.getCurrentProject().getProject());
//         
//         AgilePlanningObjectFactory.getStoryService().addOrUpdate(getStory());
//         
          return getTasksPage();
        
    }
     
     
    public void findTaskToDisplay(final int taskPersistanceId)  {
        
        this.setTask(AgilePlanningObjectFactory.getStoryService().findTaskByPersistanceId(taskPersistanceId));
        
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
        
}
