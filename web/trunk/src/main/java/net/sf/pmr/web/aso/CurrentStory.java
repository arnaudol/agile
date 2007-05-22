/*
 * CurrentProject.java
 *
 * Created on 18 avril 2007, 22:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.aso;

import java.io.Serializable;

/**
 *
 * @author arnaud
 */
public class CurrentStory implements Serializable {

     private int persistanceId;
     
     private String shortDescription;

    public int getPersistanceId() {
        return persistanceId;
    }

    public void setPersistanceId(int persistanceId) {
        this.persistanceId = persistanceId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    
    
}
