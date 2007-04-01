/*
 * Home.java
 *
 * Created on 23 décembre 2006, 19:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages.core;

import java.util.ArrayList;
import java.util.List;

import net.sf.pmr.web.components.Tab;
import net.sf.pmr.web.components.Tabs;

import org.apache.tapestry.html.BasePage;

public abstract class UserList extends BasePage {
    
    public abstract List<Tab> getTabList();
    public abstract void setTabList(List<Tab> tabList);
    	
    
    /* (non-Javadoc)
     * @see org.apache.tapestry.AbstractPage#beginPageRender()
     */
    @Override
    public void beginPageRender() {
    	
//    	List<Tab> list = new ArrayList<Tab>();
//    	
//    	Tab tab = new Tab(); 
//    	
//    	list.add(tab);
//    	
//        setTabList(list);
    	
    	super.beginPageRender();
    }
  
	
	
}