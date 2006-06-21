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
package net.sf.pmr.agilePlanning.data.release;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.release.ReleaseImpl;
import net.sf.pmr.keopsframework.domain.object.DomainObject;

import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ReleaseMapperImpl extends HibernateDaoSupport implements
        ReleaseMapper {

    /**
     * @see net.sf.pmr.keopsframework.data.EntityMapper#findById(int)
     */
    public Object findById(final int id) {

        return getHibernateTemplate().get(ReleaseImpl.class, new Integer(id));

    }

    /**
     * @see net.sf.pmr.keopsframework.data.DomainObjectRootAggregateMapper#addOrUpdate(java.lang.Object)
     */
    public void addOrUpdate(final DomainObject release) {

        getHibernateTemplate().saveOrUpdate((Release) release);

    }

    /**
     * @see net.sf.pmr.keopsframework.data.DomainObjectRootAggregateMapper#delete(java.lang.Object)
     */
    public void delete(final DomainObject release) {

        getHibernateTemplate().delete((Release) release);
    }

    /**
     * @see net.sf.pmr.agilePlanning.data.release.ReleaseMapper#findByProjectPersistanceId(int)
     */
    public Set<Release> findByProjectPersistanceId(final int projetPersistanceId) {

        List list = getHibernateTemplate()
                .find(
                        "from net.sf.pmr.agilePlanning.domain.release.ReleaseImpl release where release.BasicProject.PersistanceId = ?",
                        new Integer(projetPersistanceId));

        Set<Release> setToReturn = new HashSet<Release>();

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Release release = (Release) iterator.next();

            setToReturn.add(release);

        }

        return setToReturn;

    }

	/**
	 * @see net.sf.pmr.agilePlanning.data.release.ReleaseMapper#findByIterationPersistanceId(int)
	 */
	public Release findByIterationPersistanceId(final int basicProjectPrersistanceId, final int iterationPersistanceId) {
		
        List list = getHibernateTemplate()
        .findByNamedParam(
                "select release"  
                + " from net.sf.pmr.agilePlanning.domain.release.ReleaseImpl as release,"
                + " 	 net.sf.pmr.agilePlanning.domain.iteration.IterationImpl as iteration"
                + " where iteration.PersistanceId = :iterationPersistanceId"
                + " and iteration.EndDate <= release.Date"
                + " and iteration.BasicProject.PersistanceId = :basicProjectPersistanceId"                
                + " and release.Date = ( select min(release2.Date) from net.sf.pmr.agilePlanning.domain.release.ReleaseImpl as release2, "
                + "                 							     	net.sf.pmr.agilePlanning.domain.iteration.IterationImpl as iteration2 "
                + " 												where iteration2.PersistanceId = :iterationPersistanceId"
                + " 												and iteration2.EndDate <= release2.Date "
                + " 											    and iteration2.BasicProject.PersistanceId = :basicProjectPersistanceId)",
                new String[] {"iterationPersistanceId", "basicProjectPersistanceId"},
                new Object[] {new Integer(iterationPersistanceId), new Integer(basicProjectPrersistanceId) });

         Release releaseToReturn = (Release) DataAccessUtils.uniqueResult(list);
        
         return releaseToReturn;

	}
    
}
