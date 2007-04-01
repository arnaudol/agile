/*
 * ProjectSelectionModel.java
 *
 * Created on 30 mars 2007, 21:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import java.util.Set;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import org.apache.tapestry.form.IPropertySelectionModel;

/**
 *
 * @author arnaud
 */
public class ProjectSelectionModel implements IPropertySelectionModel  {
    
    private String[] projects = new String[10];
    
    /** Creates a new instance of ProjectSelectionModel */
    public ProjectSelectionModel(int userPersistanceId) {

        // get the projets for the user
        Set<Project> projetSet = CoreObjectFactory.getProjectService().findForAUser(userPersistanceId);
        
        int i = 0;
        for (Project projet : projetSet) {
            projects[i] = projet.getName();
            i = i + 1;
        }
         
    }

    public Object translateValue(String val) {
        if ((val==null) || (val.length() == 0))
            return null;
        return getOption(Integer.parseInt(val));
    }

    public String getValue(int index) {
        return String.valueOf(index);
    }

    public Object getOption(int index) {
        return projects[index];
    }

    public String getLabel(int index) {
        return projects[index];
    }

    public int getOptionCount() {
        return projects.length;
    }
    
    
    
    
}
