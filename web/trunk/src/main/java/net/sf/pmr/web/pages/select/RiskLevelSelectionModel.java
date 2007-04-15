/*
 * RiskLevelsSelectionModel.java
 *
 * Created on 30 mars 2007, 21:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages.select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.RiskLevel;
import org.apache.tapestry.form.IPropertySelectionModel;

/**
 *
 * @author arnaud
 */
public class RiskLevelSelectionModel implements IPropertySelectionModel  {
    
    private List<RiskLevel> riskLevels;
    
    /** Creates a new instance of RiskLevelsSelectionModel */
    public RiskLevelSelectionModel() {

        // get the risk levels
        Set<RiskLevel> riskLevelSet = AgilePlanningObjectFactory.getStoryService().findAllRiskLevel();
       
        // put the risk levels in a list
        riskLevels = new ArrayList<RiskLevel>(riskLevelSet);
         
    }

    public Object translateValue(String value) {
           return getOption(Integer.parseInt(value));
    }

    public String getValue(int index) {
        return Integer.toString(index);
    }

    public Object getOption(int index) {
        return riskLevels.get(index);
    }

    public String getLabel(int index) {
        return riskLevels.get(index).getDescription();
    }

    public int getOptionCount() {
        return riskLevels.size(); 
        }
   
    /**
     * 
     * @param id 
     * @return RiskLevel found
     */
    public RiskLevel getOptionById(int id) {
        
        RiskLevel riskLevelToReturn = null;
        
        for (RiskLevel riskLevel : riskLevels) {
            if (riskLevel.getId() == id) {
                riskLevelToReturn = riskLevel;
            }
        }
        
        return riskLevelToReturn;
    }
    
}
    
    
    
