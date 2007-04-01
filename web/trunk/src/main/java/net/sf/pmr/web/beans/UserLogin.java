/*
 * UserLogin.java
 *
 * Created on 24 décembre 2006, 18:23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.beans;

/**
 *
 * @author arnaud
 */
public class UserLogin {

    private int persistanceId;
    
    private String login;
    
    private String password;

    public int getPersistanceId() {
        return persistanceId;
    }

    public void setPersistanceId(int persistanceId) {
        this.persistanceId = persistanceId;
    }
        
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

}
