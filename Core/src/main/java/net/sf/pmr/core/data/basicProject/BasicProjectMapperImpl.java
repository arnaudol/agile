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

package net.sf.pmr.core.data.basicProject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import net.sf.pmr.keopsframework.domain.object.DomainObject;

import org.springframework.dao.support.DataAccessUtils;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class BasicProjectMapperImpl extends
        org.springframework.orm.hibernate3.support.HibernateDaoSupport
        implements BasicProjectMapper {

    /* (non-Javadoc)
     * @see com.keops.data.EntityMapper#findByPersistanceId(java.lang.Integer)
     */
    public final Object findById(final int id) {

        return (BasicProject) getHibernateTemplate().get(
                BasicProjectImpl.class, new Integer(id));

    }

    /* (non-Javadoc)
     * @see net.sf.pmr.keopsframework.data.EntityRootAgregateMapper#addOrUpdate(java.lang.Object)
     */
    public final void addOrUpdate(DomainObject domainObject) {

        getHibernateTemplate().saveOrUpdate((BasicProject) domainObject);

    }

    /* (non-Javadoc)
     * @see com.keops.data.EntityRootAgregateMapper#delete(java.lang.Object)
     */
    public final void delete(final DomainObject DomainObject) {

        getHibernateTemplate().delete((BasicProject) DomainObject);

    }

    /* (non-Javadoc)
     * @see net.sf.pmr.core.data.project.BasicProjectMapper#countAll()
     */
    public final Integer countAll() {

        List list = getHibernateTemplate()
                .find(
                        "select count(*) from net.sf.pmr.core.domain.basicProject.BasicProjectImpl");
        return (Integer) DataAccessUtils.uniqueResult(list);

    }

    /*
     * (non-Javadoc)
     * @see net.sf.pmr.core.data.basicProject.BasicProjectMapper#findAll()
     */
	@SuppressWarnings("unchecked")
	public final List<BasicProject> findAll() {

        return getHibernateTemplate().loadAll(BasicProject.class);

    }

	/* (non-Javadoc)
	 * @see net.sf.pmr.core.data.basicProject.BasicProjectMapper#findForAUser()
	 */
	@SuppressWarnings("unchecked")
	public Set<BasicProject> findForAUser(final int userPersistanceId) {

		List<BasicProject> list = getHibernateTemplate()
				.find(
						"from net.sf.pmr.core.domain.basicProject.BasicProjectImpl basicProject where basicProject.Members.PersistanceId = ?",
						new Integer(userPersistanceId));

		Set<BasicProject> setToReturn = new HashSet<BasicProject>();

		setToReturn.addAll(list);

		return setToReturn;
		
	}
}
