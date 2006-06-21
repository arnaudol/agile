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


package net.sf.pmr.core.domain.user;

import java.util.Set;

import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.user.company.Company;
import net.sf.pmr.keopsframework.domain.object.AbstractDomainObject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Arnaud
 */
public class UserImpl extends AbstractDomainObject implements User {
   
    private String firstName;

    private String lastName;

    private String login;

    private String password;

    private String email;

    private Company company;

    private Set<Project> basicProjects;


    /**
     * @return Returns the email.
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email The email to set.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#getFirstName()
     */
    public String getFirstName() {
        return firstName;

    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#getLastName()
     */
    public String getLastName() {
        return lastName;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#getLogin()
     */
    public String getLogin() {
        return login;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#getPassword()
     */
    public String getPassword() {
        return password;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#getCompany()
     */
    public Company getCompany() {
        return company;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#setFirstName(java.lang.String)
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;

    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#setLastName(java.lang.String)
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;

    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#setLogin(java.lang.String)
     */
    public void setLogin(final String login) {
        this.login = login;

    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#setPassword(java.lang.String)
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.User#setCompany(net.sf.pmr.core.domain.user.Company)
     */
    public void setCompany(final Company company) {
        this.company = company;
    }

    /**
     * @return Returns the projects.
     */
    public Set<Project> getProjects() {
        return this.basicProjects;
    }

    /**
     * @param projects
     *            The projects to set.
     */
    public void setProjects(final Set<Project> projects) {
        this.basicProjects = projects;
    }


    /**
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(final Object object) {
        if (!(object instanceof UserImpl)) {
            return false;
        }
        UserImpl rhs = (UserImpl) object;
        return new EqualsBuilder().append(
                this.login, rhs.login).isEquals();
    }


    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(-800441645, 1772591927).append(this.login)
                .toHashCode();
    }
}