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

import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public interface IterationService {

    /**
     * find iterations for a projet (using his persistanceId).
     * @param basicProjectPersistanceId basicProjectPersistanceId
     * @return Iteration
     */
    Set findByProjectPersistanceId(final int basicProjectPersistanceId);

    /**
     * find a iteration by its persistance Id.
     * @param persistanceId persistanceId
     * @return Iteration
     */
    Iteration findByPersistanceId(final int persistanceId);
    
    /**
     * find by project persistance id and by date.
     * @param projetPersistanceId persistance id of the project to find iteration for.
     * @param date date to find the iteration for
     * @return Set of iteration
     */
    Iteration findByProjectPersistanceIdAndByDate(final int projetPersistanceId, final Date date);

    /**
     * add an iteration.
     * @param projectPersistanceId id of the project
     * @param start start date of the iteration
     * @param end end date of the iteration
     * @return errors errors
     */
    Errors add(final int projectPersistanceId, final Date start, final Date end);

    /**
     * Update an iteration.
     * @param start start date of the iteration
     * @param end end date of the iteration
     * @param iterationPersistanceId of the iteration
     * @param iterationPersistanceVersion persistance version (used for concurrency management)
     * @return errors errors
     */
    Errors update(final Date start, final Date end, final int iterationPersistanceId, final long iterationPersistanceVersion);

//    /**
//     * Delete an iteration
//     * @param persistanceId of the iteration
//     * @param persistanceVersion persistance version
//     * @return errors errors
//     */
//    Errors delete(final int persistanceId, final long persistanceVersion);

    /**
     * Add a story to an iteration.
     * @param storyPersistanceIds ids of the story
     * @param iterationPersistanceId id of the iteration
     * @param iterationPersistanceVersion id of the iteration
     * @return errors errors
     */
    Errors addStories(final Set < Integer > storyPersistanceIds, final int iterationPersistanceId, final long iterationPersistanceVersion);

    /**
     * Remove a story from an iteration.
     * @param storyPersistanceIds ids of the story
     * @param iterationPersistanceId id of the iteration
     * @param iterationPersistanceVersion persistance version (used for concurrency management) 
     * @return errors errors
     */
    Errors removeStories(final Set < Integer > storyPersistanceIds, final int iterationPersistanceId, final long iterationPersistanceVersion);

    /**
     * Find the stories which can be added in a release.
     * @param basicProjectPersistanceId persistancd id of the basicProject
     * @param iterationPersistanceId persistance id of the iteration to find stories for.
     * @return Set of story
     */
	Set < Story > findStoriesToAdd(final int basicProjectPersistanceId, final int iterationPersistanceId);
	
	/**
	 * Find the current iteration (for a project).
     * @param basicProjectPersistanceId persistancd id of the basicProject
	 * @return Iteration
	 */
	Iteration findCurrentIteration(final int basicProjectPersistanceId);

}
