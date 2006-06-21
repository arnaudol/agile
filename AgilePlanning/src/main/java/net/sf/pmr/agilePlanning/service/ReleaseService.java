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

import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public interface ReleaseService {

    /**
     * find releases for a projet (using his persistanceId).
     * @param projectPersistanceId projectPersistanceId
     * @return Iteration
     */
    Set findByProjectPersistanceId(final int projectPersistanceId);

    /**
     * find a release by its persistance Id.
     * @param persistanceId persistanceId
     * @return Release
     */
    Release findByPersistanceId(final int persistanceId);

    /**
     * Add a release.
     * @param projectPersistanceId id of the agileProject.
     * @param number of the release
     * @param date of the release
     * @return errors errors
     */
    Errors add(final int projectPersistanceId, final String number, final Date date);

    /**
     * Update a release.
     * @param number of the release
     * @param date of the release
     * @param persistanceId of the release
     * @param persistanceVersion persistance version
     * @return errors errors
     */
    Errors update(final String number, final Date date, final int persistanceId, final long persistanceVersion);


    /**
     * Add a story to a release.
     * @param storyPersistanceIds id of the story
     * @param releasePersistanceId id of the release
     * @param releasePersistanceVersion persistance version of the release (used for concurrency management)
     * @return errors (business) errors found when adding the story
     */
    Errors addStories(final Set < Integer > storyPersistanceIds, final int releasePersistanceId, final long releasePersistanceVersion);


    /**
     * Remove a story from a release.
     * @param storyPersistanceIds id of the story
     * @param releasePersistanceId id of the release
     * @param releasePersistanceVersion persistance version of the release (used for concurrency management) 
     * @return errors errors
     */
    Errors removeStories(final Set < Integer > storyPersistanceIds, final int releasePersistanceId, final long releasePersistanceVersion);

    /**
     * Delete a release
     * @param agileProjectPersistanceId id of the agileProject
     * @param persistanceId of the release
     * @param persistanceVersion persistance version
     * @return errors errors
     */
    Errors delete(final int persistanceId, final long persistanceVersion);
    
    /**
     * Find the stories available to add for a release.
     * @param basicProjectPersistanceId persistanceId of the project. 
     * @return set of story
     */
    Set < Story > findStoriesToAdd(final int basicProjectPersistanceId);
    
    /**
     * find the release for an iteration.
     * @param basicProjectPersistanceId persistanceId of the project. 
     * @param iterationPersistanceId persistance id of the iteration to find release for.
     * @return Release finded
     */
    Release findByIterationPersistanceId(final int basicProjectPersistanceId, final int iterationPersistanceId);

}
