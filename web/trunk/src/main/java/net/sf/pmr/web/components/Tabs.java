/*
 * Home.java
 *
 * Created on 23 décembre 2006, 19:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.components;

import java.util.List;
import org.apache.tapestry.BaseComponent;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;

public abstract class Tabs extends BaseComponent implements PageBeginRenderListener {
	
         // current label
	 public abstract String getCurrentLabel();         
         public abstract void setCurrentLabel(String currentLabel);
        
         public abstract List getLabels();         
         public abstract void setLabels(List labels);
         	
	
	/* (non-Javadoc)
	 * @see org.apache.tapestry.event.PageBeginRenderListener#pageBeginRender(org.apache.tapestry.event.PageEvent)
	 */
	public void pageBeginRender(PageEvent arg0) {
		// TODO Auto-generated method stub
		
                //java.lang.String[] tete = new java.lang.String[]{"hh", "jj", "hh"};
            
            
		String toto = "yy";                
		
		toto="jj";
		
	}
	 
}