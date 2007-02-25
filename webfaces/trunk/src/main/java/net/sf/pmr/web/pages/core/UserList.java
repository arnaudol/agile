/*
 * UserList.java
 *
 * Created on 26 décembre 2006, 15:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages.core;

import java.util.List;
import net.sf.pmr.core.CoreObjectFactory;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 * @author arnaud
 */
public abstract class UserList extends BasePage implements PageBeginRenderListener {
    
    // getter for user List
    public abstract List<net.sf.pmr.core.domain.user.User> getUserList();
    
    // setter for user list
    public abstract void setUserList(List<net.sf.pmr.core.domain.user.User> userList);
    
    public void pageBeginRender(PageEvent event) {
        
        // get the user list
        setUserList(CoreObjectFactory.getUserService().findAll());
        
    }
    
}
