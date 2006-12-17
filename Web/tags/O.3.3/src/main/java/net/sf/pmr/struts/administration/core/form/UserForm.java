/*
* Copyright 2005 Arnaud Prost
* 
* Arnaud.prost@gmail.com
* 
* This software is a computer program whose purpose is to ease the 
* management of software project.
* 
* This software is governed by the CeCILL  license under French law and
* abiding by the rules of distribution of free software.  You can  use, 
* modify and/ or redistribute the software under the terms of the CeCILL
* license as circulated by CEA, CNRS and INRIA at the following URL
* "http://www.cecill.info". 
* 
* As a counterpart to the access to the source code and  rights to copy,
* modify and redistribute granted by the license, users are provided only
* with a limited warranty  and the software's author,  the holder of the
* economic rights,  and the successive licensors  have only  limited
* liability. 
* 
* In this respect, the user's attention is drawn to the risks associated
* with loading,  using,  modifying and/or developing or reproducing the
* software by the user in light of its specific status of free software,
* that may mean  that it is complicated to manipulate,  and  that  also
* therefore means  that it is reserved for developers  and  experienced
* professionals having in-depth computer knowledge. Users are therefore
* encouraged to load and test the software's suitability as regards their
* requirements in conditions enabling the security of their systems and/or 
* data to be ensured and,  more generally, to use and operate it in the 
* same conditions as regards security. 
* 
* The fact that you are presently reading this means that you have had
* knowledge of the CeCILL license and that you accept its terms.
*/

package net.sf.pmr.struts.administration.core.form;

import org.apache.struts.action.ActionForm;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class UserForm extends ActionForm {

    
    private int persistanceId;

    private String firstName;

    private String lastName;

    private String login;

    private String password;
    
    private String email;
    
    private long persistanceVersion;
            
    
    /**
     * @return Returns the version.
     */
    public final long getPersistanceVersion() {
        return persistanceVersion;
    }
    /**
     * @param version The version to set.
     */
    public final void setPersistanceVersion(long persistanceVersion) {
        this.persistanceVersion = persistanceVersion;
    }
    /**
     * @return Returns the firstName.
     */
    public final String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName The firstName to set.
     */
    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * @return Returns the id.
     */
    public final int getPersistanceId() {
        return persistanceId;
    }
    /**
     * @param id The id to set.
     */
    public final void setPersistanceId(int persistanceId) {
        this.persistanceId = persistanceId;
    }
    /**
     * @return Returns the lastName.
     */
    public final String getLastName() {
        return lastName;
    }
    /**
     * @param lastName The lastName to set.
     */
    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return Returns the login.
     */
    public final String getLogin() {
        return login;
    }
    /**
     * @param login The login to set.
     */
    public final void setLogin(String login) {
        this.login = login;
    }
    /**
     * @return Returns the password.
     */
    public final String getPassword() {
        return password;
    }
    /**
     * @param password The password to set.
     */
    public final void setPassword(String password) {
        this.password = password;
    }
    
    
    public final  String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }
    
}
