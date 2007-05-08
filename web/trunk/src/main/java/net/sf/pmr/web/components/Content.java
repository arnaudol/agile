/*
 * Home.java
 *
 * Created on 23 décembre 2006, 19:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.components;

import org.apache.tapestry.BaseComponent;
import org.apache.tapestry.components.Block;

//@ComponentClass(allowBody=false)
public abstract class Content extends BaseComponent {
    
     public abstract void setSummary(String summaryContent);
     public abstract String getSummary();   
     
     
  public Block getSelectedBlock()
    {
      String selectedId = getSummary();
              
      return (Block) getContainer().getComponent(selectedId);   
    }

}