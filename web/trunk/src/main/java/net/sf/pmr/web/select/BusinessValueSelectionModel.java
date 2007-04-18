/*
 * BusinessValueSelectionModel.java
 *
 * Created on 30 mars 2007, 21:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.BusinessValue;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import org.apache.tapestry.form.IPropertySelectionModel;

/**
 *
 * @author arnaud
 */
public class BusinessValueSelectionModel implements IPropertySelectionModel  {
    
    private List<BusinessValue> businessValues;
    
    /** Creates a new instance of ProjectSelectionModel */
    public BusinessValueSelectionModel() {

        // get the business values
        Set<BusinessValue> businessSet = AgilePlanningObjectFactory.getStoryService().findAllBusinessValue();
        
        // put the business values in a list
        businessValues = new ArrayList<BusinessValue>(businessSet);
         
    }

    public Object translateValue(String value) {
           return getOption(Integer.parseInt(value));
    }

    public String getValue(int index) {
        return Integer.toString(index);
    }

    public Object getOption(int index) {
        return businessValues.get(index);
    }
    
    /**
     * find the BusinessValue for a given id
     * @param id 
     * @return BusinessValue found
     */
    public BusinessValue getOptionById(int id) {
        
        BusinessValue businessValueToReturn = null;
        
        for (BusinessValue businessValue : businessValues) {
            if (businessValue.getId() == id) {
                businessValueToReturn = businessValue;
            }
        }
        
        return businessValueToReturn;
    }


    public String getLabel(int index) {
        return businessValues.get(index).getDescription();
    }

    public int getOptionCount() {
        return businessValues.size(); 
        }
    
    }
