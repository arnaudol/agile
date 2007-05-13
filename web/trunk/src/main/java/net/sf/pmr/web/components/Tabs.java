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

public abstract class Tabs extends BaseComponent {
	
         // current label
	 public abstract TabsContent getSelectedTab();         
         public abstract void setSelectedTab(TabsContent tabsContent);
        
         public abstract List<TabsContent> getNotSelectedTabs();         
         public abstract void setNotSelectedTabs(List<TabsContent> labels);
         
         public abstract TabsContent getTabsContent();         
         public abstract void setTabsContent(TabsContent labels);
         
}