/*
 * UserLogin.java
 *
 * Created on 24 décembre 2006, 16:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.web.beans.UserLogin;
import org.apache.tapestry.IPage;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;


/**
 * @author arnaud
 */
public abstract class Home extends BasePage implements PageBeginRenderListener {
    
    // getter for user
    public abstract net.sf.pmr.web.beans.UserLogin getUserLogin();
    
    // setter for user
    public abstract void setUserLogin(UserLogin userLogin);
    
    // inject workspace page
    @InjectPage("WorkSpace")
    public abstract WorkSpace getWorkSpace();
    
    
    public void pageBeginRender(PageEvent event) {

        UserLogin userLogin = new UserLogin();

        this.setUserLogin(userLogin);

    }
    
    /*
     *
     */
    public IPage doSubmit() {
        
        WorkSpace workspace = getWorkSpace();
        
        workspace.setUserLogin(getUserLogin());
        
        User user = CoreObjectFactory.getSecurityService().login(getUserLogin().getLogin(), getUserLogin().getPassword());
        
        if (user == null) {
            return this;
        } else {
            return workspace;
        }
        
    }
    
}
