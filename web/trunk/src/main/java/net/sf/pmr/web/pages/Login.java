/*
 * UserLogin.java
 *
 * Created on 24 décembre 2006, 16:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;


import net.sf.pmr.web.beans.UserLogin;
import org.apache.tapestry.IPage;
import org.apache.tapestry.annotations.InjectPage;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class Login extends BasePage implements PageBeginRenderListener {
    
    // getter for User Login
    public abstract net.sf.pmr.web.beans.UserLogin getUserLogin();
    
    // setter for user Login
    public abstract void setUserLogin(UserLogin userLogin);
    
    // inject workspace page
    @InjectPage("WorkSpace")
    public abstract WorkSpace getWorkSpace();
    
    
    public void pageBeginRender(PageEvent event) {
        
        UserLogin userLogin = new UserLogin();
        
        userLogin.setLogin("toto");
        
        userLogin.setPassword("");
        
        this.setUserLogin(userLogin);
        
    }
    
    
    public IPage doSubmit() {
        
        
        WorkSpace workspace = getWorkSpace();
        
        workspace.setUserLogin(getUserLogin());
        
        return workspace;
        
    }
    
}
