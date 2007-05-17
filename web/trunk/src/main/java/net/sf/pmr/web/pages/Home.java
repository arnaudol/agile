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
import net.sf.pmr.web.aso.CurrentUser;
import net.sf.pmr.web.beans.UserLogin;

import org.apache.tapestry.IPage;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.annotations.InjectState;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 * @author arnaud
 */
public abstract class Home extends BasePage implements PageBeginRenderListener {
    
    // getter for userLogin
    public abstract net.sf.pmr.web.beans.UserLogin getUserLogin();
    
    // setter for userLogin
    public abstract void setUserLogin(UserLogin userLogin);
    
    // security service
    //@InjectSpring("securityService")
    //@InjectObject("spring:securityService")
    //public abstract SecurityService getSecurityService();
    
    @InjectState("currentUser")
    public abstract CurrentUser getCurrentUser();
    
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
        
        //User user =  CoreObjectFactory.getSecurityService().login(getUserLogin().getLogin(), getUserLogin().getPassword());
        
        User user =  CoreObjectFactory.getSecurityService().login(getUserLogin().getLogin(), getUserLogin().getPassword());
        
        
        if (user == null) {
            return this;
        } else {
            getUserLogin().setPersistanceId(user.getPersistanceId());
            // erase password (user login is put in session)
            user.setPassword("");
            this.getCurrentUser().setUser(user);
            getUserLogin().setPassword("");
            return workspace;
        }
        
    }
    
}
