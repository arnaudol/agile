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

package net.sf.pmr.agilePlanning.data.story;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryImpl;
import net.sf.pmr.keopsframework.domain.object.DomainObject;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class StoryMapperImpl extends HibernateDaoSupport implements StoryMapper {

    /**
     * @see net.sf.pmr.keopsframework.data.EntityMapper#findById(int)
     */
    public Object findById(final int id) {

        return getHibernateTemplate().get(StoryImpl.class, new Integer(id));

    }

    /**
     * @see net.sf.pmr.keopsframework.data.DomainObjectRootAggregateMapper#addOrUpdate(java.lang.Object)
     */
    public void addOrUpdate(final DomainObject story) {

        Story storyToAddorUpdate = (Story) story;

        getHibernateTemplate().saveOrUpdate(storyToAddorUpdate);

    }

    /**
     * @see net.sf.pmr.keopsframework.data.DomainObjectRootAggregateMapper#delete(java.lang.Object)
     */
    public void delete(final DomainObject story) {

        getHibernateTemplate().delete((Story) story);

    }

    /** 
     * @see net.sf.pmr.agilePlanning.data.story.StoryMapper#findByProjectPersistanceId(int)
     */
    public Set<Story> findByProjectPersistanceId(final int projetPersistanceId) {

        List list = getHibernateTemplate()
                .find(
                        "from net.sf.pmr.agilePlanning.domain.story.StoryImpl story where story.Project.PersistanceId = ? order by story.PersistanceId asc",
                        new Integer(projetPersistanceId));

        Set<Story> setToReturn = new HashSet<Story>();

        setToReturn.addAll(list);
        
        return setToReturn;
    }

    /** 
     * @see net.sf.pmr.agilePlanning.data.story.StoryMapper#findByIterationPersistanceId(int)
     */
    public Set<Story> findByIterationPersistanceId(int iterationPersistanceId) {
        return new HashSet<Story>();
    }

    /**
     * @see net.sf.pmr.agilePlanning.data.story.StoryMapper#findByReleasePersistanceId(int)
     */
    public Set<Story> findByReleasePersistanceId(int releasePersistanceId) {
        return new HashSet<Story>();
    }

	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.data.story.StoryMapper#findStoriesWhichAreNotInARelease()
	 */
	public Set<Story> findStoriesWhichAreNotInARelease(final int projectPersistanceId) {

		List list = getHibernateTemplate()
				.findByNamedParam(
						"from net.sf.pmr.agilePlanning.domain.story.StoryImpl as story "
						+ " where story.PersistanceId not in "
						+ " (select release.Stories.PersistanceId from net.sf.pmr.agilePlanning.domain.release.ReleaseImpl as release)"
						+ " and story.Project.PersistanceId = :projectPersistanceId",
		                new String[] {"projectPersistanceId"},
		                new Object[] {new Integer(projectPersistanceId)});

		
		Set<Story> setToReturn = new HashSet<Story>();

		// add the stories in the set
		setToReturn.addAll(list);

		return setToReturn;

	}
	
	
	/*
	 * (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.data.story.StoryMapper#findAvailableStoriesToAddForAnIteration(int)
	 */
	public Set <Story> findAvailableStoriesToAddForAnIteration(final int projectPersistanceId, final int iterationPersistanceId) {
		
		
        List list = getHibernateTemplate()
        .findByNamedParam(
                "select story"  
        		+ " from net.sf.pmr.agilePlanning.domain.story.StoryImpl as story,"
                + "      net.sf.pmr.agilePlanning.domain.release.ReleaseImpl as release,"
                + " 	 net.sf.pmr.agilePlanning.domain.iteration.IterationImpl as iteration"
                // La story n'est dans aucune iteration
                + " where story.PersistanceId not in (select iteration2.Stories.PersistanceId "
                + "									  from net.sf.pmr.agilePlanning.domain.iteration.IterationImpl as iteration2"
                + "									  where iteration2.Project.PersistanceId = :projectPersistanceId)"
                + " and story.Project.PersistanceId = :projectPersistanceId"
                // mais elle est dans la release de l'iteration...
                // ... recherche de la release de l'iteration
                + " and iteration.Project.PersistanceId = :projectPersistanceId"
                + " and iteration.PersistanceId = :iterationPersistanceId"
                + " and iteration.End <= release.Date"
                + " and release.Date = ( select min(release2.Date) from net.sf.pmr.agilePlanning.domain.release.ReleaseImpl as release2, "
                + "                 							     	net.sf.pmr.agilePlanning.domain.iteration.IterationImpl as iteration2 "
                + " 												where iteration2.PersistanceId = :iterationPersistanceId"
                + " 												and iteration2.End <= release2.Date )"
                // ... recherche des stories de la release
                + " and story.PersistanceId in (release.Stories.PersistanceId)",
                new String[] {"iterationPersistanceId", "projectPersistanceId"},
                new Object[] {new Integer(iterationPersistanceId), new Integer(projectPersistanceId)});
        
         Set<Story> setToReturn = new HashSet<Story>();
         
         setToReturn.addAll(list);
        
         return setToReturn;

	}


}
