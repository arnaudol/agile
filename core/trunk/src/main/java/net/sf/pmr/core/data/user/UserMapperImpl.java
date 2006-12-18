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

package net.sf.pmr.core.data.user;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.keopsframework.domain.object.DomainObject;

import org.springframework.dao.support.DataAccessUtils;

/**
 * @author Arnaud
 */
public class UserMapperImpl extends
        org.springframework.orm.hibernate3.support.HibernateDaoSupport
        implements UserMapper {

    /**
     * find a user by his Id
     * 
     * @param id
     *            id
     * @return Entity User find
     */
    public final Object findById(final int id) {

        return (User) getHibernateTemplate().get(UserImpl.class,
                new Integer(id));

    }

    /**
     * find a user by his login
     * 
     * @param login
     *            login
     * @return Entity User find
     */
    public final User findByLogin(final String login) {

        List list = getHibernateTemplate()
                .find(
                        "from net.sf.pmr.core.domain.user.UserImpl user where user.Login = ?",
                        login);
        return (User) DataAccessUtils.uniqueResult(list);

    }

    /**
     * find all users
     * 
     * @return List of user
     */
    @SuppressWarnings("unchecked")
	public final List<User> findAll() {

        return getHibernateTemplate().loadAll(User.class);

    }

    /**
     * Count All User
     * 
     * @return int number of user
     */
    public final Long countAll() {

        List list = getHibernateTemplate().find(
                "select count(*) from net.sf.pmr.core.domain.user.UserImpl");
        return (Long) DataAccessUtils.uniqueResult(list);

    }

    /**
     * add or update a user
     * 
     * @param entity
     *            user to update
     */
    public final void addOrUpdate(final DomainObject domainObject) {

        getHibernateTemplate().saveOrUpdate((User) domainObject);

    }

    /**
     * Delete a user
     * 
     * @param entity
     *            user to delete
     */
    public final void delete(final DomainObject domainObject) {

        getHibernateTemplate().delete((User) domainObject);

    }

    /** 
     * @see net.sf.pmr.keopsframework.data.DomainListMapper#findCollectionForObject(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
	public final Collection<User> findCollectionForObject(final Object object) {

        Set<User> collectionToReturn = new HashSet<User>();

        if (object instanceof Project) {

            Project basicProject = (Project) object;

            List list = getHibernateTemplate()
                    .find(
                            "from net.sf.pmr.core.domain.user.UserImpl user where ? in elements(user.Projects)",
                            basicProject);
            
            collectionToReturn.addAll(list);

        }

        return collectionToReturn;

    }
}