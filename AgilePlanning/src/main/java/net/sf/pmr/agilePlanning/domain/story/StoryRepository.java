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

import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * Repository for the story
 */
public interface StoryRepository {

    /**
     * find by persistanceId.
     * @param persistanceId of the story to find
     */
    Story findByPersistanceId(final int persistanceId);

    /**
     * add or update.
     * @param story story to add or update
     */
    void addOrUpdate(final Story story);
    
    /**
     * delete a story.
     * @param story story to delete
     */
    void delete(final Story story);
    
    /**
     * add or update stories.
     * @param stories stories to add or update
     */
    void addOrUpdate(final Set<Story> stories);

    /**
     * find by project persistance id.
     * @param projetPersistanceId persistance id of the project to find stories for.
     * @return Set of story
     */
    Set<Story> findByProjectPersistanceId(final int projetPersistanceId);
    
    /**
     * find by release persistance id.
     * @param releasePersistanceId persistance id of the release to find stories for.
     * @return Set of story
     */
    Set<Story> findByReleasePersistanceId(final int releasePersistanceId);

    
    /**
     * find by iteration persistance id.
     * @param iterationPersistanceId persistance id of the iteration to find stories for.
     * @return Set of story
     */
    Set<Story> findByIterationPersistanceId(final int iterationPersistanceId);


    /**
     * find task by persistance id.
     * @param persistanceId persistanceId
     * @return task
     */
    Task findTaskByPersistanceId(final int persistanceId);
    
    /**
     * find a charge by persistance id.
     * @param persistanceId persistanceId
     * @return charge
     */
    Charge findChargeByPersistanceId(final int persistanceId);
    
    
    /**
     * find the stories which aren't in a release.
     * @return set of story
     */
    Set < Story > findStoriesWhichAreNotInARelease(final int basicProjectPersistanceIds);
    
    /**
     * find the stories available to add for a release.
     * @param basicProjectPersistanceId persistancd id of the basicProject
     * @param iterationPersistanceId persistance id of the iteration to find stories for.
     * @return Set of story
     */
    Set < Story> findAvailableStoriesToAddForAnIteration(final int basicProjectPersistanceId, final int iterationPersistanceId);

}