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
package net.sf.pmr.agilePlanning.service;

import java.util.Date;
import java.util.Set;

import net.sf.pmr.agilePlanning.domain.story.BusinessValue;
import net.sf.pmr.agilePlanning.domain.story.RiskLevel;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 * 
 * $Header
 */
public interface StoryService {

    /**
     * find stories for a projet (using his persistanceId).
     * @param projectPersistanceId ProjectPersistanceId
     * @return Set of stories
     */
    Set < Story > findByProjectPersistanceId(final int projectPersistanceId);
    
    /**
     * find stories for a release (using his persistanceId).
     * @param releasePersistanceId ReleasePersistanceId
     * @return Set of stories
     */
    Set < Story > findByReleasePersistanceId(final int releasePersistanceId);
    
    /**
     * find stories for a iteration (using his persistanceId).
     * @param iterationPersistanceId IterationPersistanceId
     * @return Set of stories
     */
    Set<Story> findByIterationPersistanceId(final int iPersistanceId);

    /**
     * find story by its persistance Id.
     * @param persistanceId persistanceId
     * @return Story
     */
    Story findByPersistanceId(final int persistanceId);

    /**
     * Add a story.
     * @param agileProjectPersistanceId id of the agileProject
     * @param shortDescription short description of the story
     * @param description description of the story
     * @param daysEstimated first estimate
     * @param businessValueId business value of the story
     * @param riskLevelId risk level for the story
     * @return errors errors
     * @deprecated
     */
    @Deprecated
    Errors add(final int agileProjectPersistanceId, final String shortDescription, final String description, final double daysEstimated, final int businessValueId, final int riskLevelId);
    
    /**
     * Add or update a story.
     * @param story story to add or update
     * @return errors errors
     */
    Errors addOrUpdate(final Story story);


    /**
     * Update a story.
     * @param shortDescription short description of the story
     * @param description description of the story
     * @param daysEstimated estimate of the story in days
     * @param businessValueId business value of the story
     * @param riskLevelId risk level for the story 
     * @param persistanceId of the story
     * @param persistanceVersion persistance version
     * @return errors errors
     * @deprecated
     */
    @Deprecated
    Errors update(final String shortDescription, final String description,
            final double daysEstimated, final int businessValueId, final int riskLevelId,
            final int persistanceId, final long persistanceVersion);

    /**
     * Delete a story
     * @param persistanceId of the story
     * @param persistanceVersion persistance version
     * @return errors errors
     */
    Errors delete(final int persistanceId, final long persistanceVersion);

    /**
     * find task by its persistance Id.
     * @param persistanceId persistanceId
     * @return Task
     */
    Task findTaskByPersistanceId(final int persistanceId);
    
    /**
     * find charge by its persistance Id.
     * @param persistanceId persistance
     * @return Charge
     */
    Charge findChargeByPersistanceId(final int persistanceId);
    

    /**
     * Add a task.
     * @param storyPersistanceId id of the story
     * @param daysEstimated for the task
     * @param shortDescription short description of the task
     * @param devopperPersistanceId for the task
     * @return errors errors
     * @deprecated
     */
    @Deprecated
    Errors addTask(final int storyPersistanceId, final double daysEstimated, final String shortDescription, final int devopperPersistanceId);


    /**
     * Add or update a task.
     * @param storyPersistanceId id of the story
     * @param task task to add
     * @return errors errors
     */
    Errors addOrUpdateTask(final int storyPersistanceId, final Task task);
        
        
    /**
     * Update a task.
     * @param storyPersistanceId id of the story
     * @param daysEstimated for the task
     * @param shortDescription short description of the task
     * @param developperPersistanceId for the task
     * @param persistanceId of the task
     * @param persistanceVersion persistance version
     * @return errors errors
     * @deprecated
     */
    @Deprecated
    Errors updateTask(final int storyPersistanceId, final double daysEstimated, final String shortDescription, final int developperPersistanceId,
            final int persistanceId, final long persistanceVersion);

    
    /**
     * Delete a task.
     * @param storyPersistanceId id of the story
     * @param persistanceId of the task
     * @param persistanceVersion persistance version
     * @return errors errors
     */
    Errors deleteTask(final int storyPersistanceId, final int persistanceId, final long persistanceVersion);

    
    /**
     * Add a charge.
     * @param storyPersistanceId id of the charge
     * @param taskPersistanceId persistance id of the task
     * @param userPersistanceId persistance id of the user
     * @param day day of the charge
     * @param timeUsedToday time used for the day
     * @param daysNeededToFinish days needed to finish
     * @return Errors errors
     */
    Errors addCharge(final int storyPersistanceId, final int taskPersistanceId, final int userPersistanceId, final Date day, final double timeUsedToday, final double daysNeededToFinish);


    /**
     * Add a charge.
     * @param day day of the charge
     * @param timeUsedToday time used for the day
     * @param daysNeededToFinish days needed to finis
     * @param chargePersistanceId persistance id of the charge
     * @param chargePersistanceVersion persistance version of the charge
     * @return Errors errors
     */
    Errors updateCharge(final Date day, final double timeUsedToday, final double daysNeededToFinish, final int storyPersistanceId, final int taskPersistanceId, final int chargePersistanceId, final long chargePersistanceVersion);

    
    /**
     * find all BusinessValue.
     * @return Set of BusinessValue
     */
    Set < BusinessValue > findAllBusinessValue();

    /**
     * find all RiskLevel.
     * @return Set of RiskLevel
     */
    Set < RiskLevel > findAllRiskLevel();
    
    
}
