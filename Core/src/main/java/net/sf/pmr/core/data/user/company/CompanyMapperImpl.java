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

package net.sf.pmr.core.data.user.company;

import java.util.Iterator;
import java.util.List;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.user.company.Company;
import net.sf.pmr.core.domain.user.company.CompanyImpl;
import net.sf.pmr.keopsframework.domain.object.DomainObject;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public final class CompanyMapperImpl extends
        org.springframework.orm.hibernate3.support.HibernateDaoSupport
        implements CompanyMapper {

    /**
     * @see net.sf.pmr.core.data.EntityMapper#findByPersistanceId(java.lang.String)
     */
    public Object findById(final int id) {

        Company company = (Company) getHibernateTemplate().get(
                CompanyImpl.class, new Integer(id));
        if (company != null) {
            company.setAddress(CoreObjectFactory.getAddress());
        }
        return company;

    }

    /**
     * @see net.sf.pmr.core.data.user.CompanyMapper#findAll()
     */
    @SuppressWarnings("unchecked")
	public List<Company> findAll() {

        List<Company> list = getHibernateTemplate().loadAll(CompanyImpl.class);

        for (Iterator i = list.iterator(); i.hasNext();) {
            Company company = (Company) i.next();
            company.setAddress(CoreObjectFactory.getAddress());
        }

        return list;

    }

    public void addOrUpdate(final DomainObject domainObject) {

        getHibernateTemplate().saveOrUpdate((Company) domainObject);

    }

    public void delete(final DomainObject domainObject) {

        getHibernateTemplate().delete((Company) domainObject);

    }
}
