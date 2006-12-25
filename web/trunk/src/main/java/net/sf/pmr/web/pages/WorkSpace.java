/*
 * WorkSpace.java
 *
 * Created on 24 décembre 2006, 18:56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.pages;

import net.sf.pmr.web.beans.UserLogin;
import org.apache.tapestry.html.BasePage;

/**
 *
 * @author arnaud
 */
public abstract class WorkSpace extends BasePage {
    
    // getter for User Login
    public abstract void setUserLogin(UserLogin userLogin);
    
}
