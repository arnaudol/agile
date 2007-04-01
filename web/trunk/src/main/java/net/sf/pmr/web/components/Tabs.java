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
import org.apache.tapestry.annotations.ComponentClass;
import org.apache.tapestry.annotations.Parameter;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;

@ComponentClass(allowBody=false)
public abstract class Tabs extends BaseComponent implements PageBeginRenderListener {
	
	@Parameter(required=true)
	 public abstract List<Tab> getTabList();
	
    // setter for user
    public abstract void setTabList(List<Tab> tabList);
	
	/* (non-Javadoc)
	 * @see org.apache.tapestry.event.PageBeginRenderListener#pageBeginRender(org.apache.tapestry.event.PageEvent)
	 */
	public void pageBeginRender(PageEvent arg0) {
		// TODO Auto-generated method stub
		
		String toto = "yy";
		
		toto="jj";
		
	}
	 
}