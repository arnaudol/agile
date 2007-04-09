/*
 * ProjectSelectionModel.java
 *
 * Created on 30 mars 2007, 21:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import org.apache.tapestry.form.IPropertySelectionModel;

/**
 *
 * @author arnaud
 */
public class ProjectSelectionModel implements IPropertySelectionModel  {
    
    private List<Project> projects;
    
    /** Creates a new instance of ProjectSelectionModel */
    public ProjectSelectionModel(int userPersistanceId) {

        // get the projets for the user
        Set<Project> projectSet = CoreObjectFactory.getProjectService().findForAUser(userPersistanceId);
        
        // put the project in a list
        projects = new ArrayList<Project>(projectSet);
         
    }

    public Object translateValue(String value) {
           return getOption(Integer.parseInt(value));
    }

    public String getValue(int index) {
        return Integer.toString(index);
    }

    public Object getOption(int index) {
        return projects.get(index);
    }

    public String getLabel(int index) {
        return projects.get(index).getName();
    }

    public int getOptionCount() {
        return projects.size(); 
        }
    
    }
    
    
    
