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

package net.sf.pmr.agilePlanning.domain.story;

import java.util.Set;

import net.sf.pmr.agilePlanning.data.story.StoryMapper;
import net.sf.pmr.agilePlanning.data.story.task.TaskMapper;
import net.sf.pmr.agilePlanning.data.story.task.charge.ChargeMapper;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectProxyUtil;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * story repository
 */
public class StoryRepositoryImpl implements StoryRepository {

    /**
     * mapper.
     */
    private StoryMapper storyMapper;
    
    /**
     * mapper.
     */
    private TaskMapper taskMapper;
    
    /**
     * mapper.
     */
    private ChargeMapper chargeMapper;
    
    /**
     * BasicProjectProxyUtil.
     */
    private ProjectProxyUtil projectProxyUtil;


    /**
     * @param storyMapper storyMapper
     */
    public StoryRepositoryImpl(final StoryMapper storyMapper, final TaskMapper taskMapper, final ChargeMapper chargeMapper, final ProjectProxyUtil projectProxyUtil) {
        super();
        this.storyMapper = storyMapper;
        this.taskMapper = taskMapper;
        this.chargeMapper = chargeMapper;
        this.projectProxyUtil = projectProxyUtil;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#findByPersistanceId(int)
     */
    public Story findByPersistanceId(final int persistanceId) {
        Story story = (Story) storyMapper.findById(persistanceId);

        if (story != null) {

            story.setProject(projectProxyUtil
                    .injectDependencies(story.getProject()));

        }

        return story;

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#findTaskByPersistanceId(int)
     */
    public Task findTaskByPersistanceId(final int persistanceId) {
        return (Task) taskMapper.findById(persistanceId);
    }
    

    /**
	 * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#findChargeByPersistanceId(int)
	 */
	public Charge findChargeByPersistanceId(final int persistanceId) {
		return (Charge) chargeMapper.findById(persistanceId);
	}

	/**
     * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#addOrUpdate(net.sf.pmr.agilePlanning.domain.story.Story)
     */
    public void addOrUpdate(final Story story) {
        
        Project projectTarget = (projectProxyUtil.getTarget(story.getProject()));
        story.setProject(projectTarget);
        
        // enregistrement
        storyMapper.addOrUpdate(story);
    }
    
    
    /** 
     * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#addOrUpdate(java.util.Set)
     */
    public void addOrUpdate(Set<Story> stories) {
        
        for (Story story : stories) {
            storyMapper.addOrUpdate(story);
        }
        
    }
    
    

    /* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#delete(net.sf.pmr.agilePlanning.domain.story.Story)
	 */
	public void delete(final Story story) {
		
		Project projectTarget = (projectProxyUtil.getTarget(story.getProject()));
        story.setProject(projectTarget);
		
		this.storyMapper.delete(story);
	}

	/**
     * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#findByProjectPersistanceId(int)
     */
    public Set<Story> findByProjectPersistanceId(final int projetPersistanceId) {
        
        Set<Story> storiesToReturn = storyMapper.findByProjectPersistanceId(projetPersistanceId);

		this.injectDependencies(storiesToReturn);

        return storiesToReturn;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#findByIterationPersistanceId(int)
     */
    public Set<Story> findByIterationPersistanceId(final int iterationPersistanceId) {

        Set<Story> storiesToReturn = storyMapper.findByIterationPersistanceId(iterationPersistanceId);

		this.injectDependencies(storiesToReturn);

        return storiesToReturn;

        
    }

    /** 
     * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#findByReleasePersistanceId(int)
     */
    public Set<Story> findByReleasePersistanceId(final int releasePersistanceId) {
        
        Set<Story> storiesToReturn = storyMapper.findByReleasePersistanceId(releasePersistanceId);

		this.injectDependencies(storiesToReturn);

        return storiesToReturn;

    }
    
	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#findStoriesWhichAreNotInARelease()
	 */
	public Set<Story> findStoriesWhichAreNotInARelease(final int basicProjectPersistanceId) {

		Set<Story> storiesToReturn = storyMapper.findStoriesWhichAreNotInARelease(basicProjectPersistanceId);

		this.injectDependencies(storiesToReturn);
		
        return storiesToReturn;

	}
	
	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.story.StoryRepository#findAvailableStoriesToAddForAnIteration(int, int)
	 */
	public Set<Story> findAvailableStoriesToAddForAnIteration(final int basicProjectPersistanceId, final int iterationPersistanceId) {
		Set<Story> storiesToReturn =  this.storyMapper.findAvailableStoriesToAddForAnIteration(basicProjectPersistanceId, iterationPersistanceId);
		
		// inject dependency for lasy loading
		this.injectDependencies(storiesToReturn);
		
		return storiesToReturn;
		
	}
	
	
	/**
	 * inject dependencies for lasy load on BasicProject.
	 * @param stories stories
	 */
	private void injectDependencies(final Set < Story > stories) {

		for (Story story : stories) {

            story.setProject(projectProxyUtil
                    .injectDependencies(story.getProject()));
			
		} 

		
	}

}
