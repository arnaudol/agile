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

package net.sf.pmr.agilePlanning.data.iteration;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.iteration.IterationImpl;
import net.sf.pmr.keopsframework.domain.object.DomainObject;

import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class IterationMapperImpl extends HibernateDaoSupport implements IterationMapper {

    /* (non-Javadoc)
     * @see net.sf.pmr.keopsframework.data.EntityMapper#findById(int)
     */
    public Object findById(final int id) {

        return getHibernateTemplate().get(IterationImpl.class,
                new Integer(id));

    }

    /* (non-Javadoc)
     * @see net.sf.pmr.keopsframework.data.DomainObjectRootAggregateMapper#addOrUpdate(java.lang.Object)
     */
    public void addOrUpdate(final DomainObject domainObject) {

        Iteration iterationToAddOrUpdate = (Iteration) domainObject;
        
        getHibernateTemplate().saveOrUpdate(iterationToAddOrUpdate);

    }

    /* (non-Javadoc)
     * @see net.sf.pmr.keopsframework.data.DomainObjectRootAggregateMapper#delete(java.lang.Object)
     */
    public void delete(final DomainObject iteration) {

        getHibernateTemplate().delete((Iteration) iteration);

    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.data.iteration.IterationMapper#findByProjectPersistanceId(int)
     */
    public Set<Iteration> findByProjectPersistanceId(final int projetPersistanceId) {

        List list = getHibernateTemplate()
                .find(
                        "from net.sf.pmr.agilePlanning.domain.iteration.IterationImpl iteration where iteration.Project.PersistanceId = ?",
                        new Integer(projetPersistanceId));

        Set<Iteration> setToReturn = new HashSet<Iteration>();

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Iteration iteration = (Iteration) iterator.next();

            setToReturn.add(iteration);

        }

        return setToReturn;

    }
    
    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.data.iteration.IterationMapper#findByProjectPersistanceIdAndByDate(int, java.util.Date)
     */
    public Iteration findByProjectPersistanceIdAndByDate(final int projectPersistanceId, final Date date) {
        
        List list = getHibernateTemplate()
        .findByNamedParam(
                "from net.sf.pmr.agilePlanning.domain.iteration.IterationImpl iteration where iteration.Project.PersistanceId = :persistanceId" +
                " and :date between iteration.StartDate and iteration.EndDate",
                new String[] {"persistanceId", "date"},
                new Object[] {new Integer(projectPersistanceId), date});

         Iteration iterationToReturn = (Iteration) DataAccessUtils.uniqueResult(list);
        
         return iterationToReturn;
        
    }
}
