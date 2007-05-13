/*
 * CurrentUser.java
 * 
 * Created on 13 mai 2007, 22:56:30
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.aso;

import net.sf.pmr.core.domain.user.User;

/**
 *
 * @author arnaud
 */
public class CurrentUser {

    private User user;
    
    public CurrentUser()  {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }    

}
