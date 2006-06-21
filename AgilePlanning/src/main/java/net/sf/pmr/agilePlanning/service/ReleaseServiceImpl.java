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

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.release.ReleaseRepository;
import net.sf.pmr.agilePlanning.domain.release.ReleaseValidator;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ReleaseServiceImpl implements ReleaseService {

    /**
     * Validator.
     */
    private ReleaseValidator releaseValidator;

    /**
     * Release repository.
     */
    private ReleaseRepository releaseRepository;
    
    /**
     * Story repository.
     */
    private StoryRepository storyRepository;


    /**
     * constructor.
     *
     * @param releaseValidator releaseValidator
     * @param releaseRepository releaseValidator
     * @param storyRepository storyRepository
     */
    public ReleaseServiceImpl(final ReleaseValidator releaseValidator, final ReleaseRepository releaseRepository, final StoryRepository storyRepository) {
        super();
        this.releaseValidator = releaseValidator;
        this.releaseRepository = releaseRepository;
        this.storyRepository = storyRepository;
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.ReleaseService#add(int, String,
     *      java.util.Date)
     */
    public Errors add(final int projectPersistanceId, final String number, final Date date) {

        // Buid the object to persist
        Release release = AgilePlanningObjectFactory.getRelease();
        release.getBasicProject().setPersistanceId(projectPersistanceId);
        release.setDate(date);
        release.setNumber(number);

        // validate
        Errors errors = releaseValidator.validate(release);

        // if there are no errors, persist iteration
        if (!errors.hasErrors()) {
            releaseRepository.addOrUpdate(release);
        }

        return errors;
    }

    
    /* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.service.ReleaseService#delete(int, long)
	 */
	public Errors delete(final int persistanceId, final long persistanceVersion) {

        // find the release to delete in the repository
        Release release = releaseRepository.findByPersistanceId(persistanceId);

		// if the release is not found, return a global error
		if (release == null) {
			Errors errors = AgilePlanningObjectFactory.getErrors();
			errors.reject("release.doesntExistsInDatabase");
			return errors;
		}
        
        // if the release is found, update the persistanceVersion for concurrency management
        release.setPersistanceVersion(persistanceVersion);
 
        // validate
        Errors errors = releaseValidator.validateForDelete(release);

        // delete if validation is ok
        if (!errors.hasErrors()) {
            releaseRepository.delete(release);
        }
        
        return errors;
		
	}

	/* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.ReleaseService#findByPersistanceId(int)
     */
    public Release findByPersistanceId(final int persistanceId) {
        return releaseRepository.findByPersistanceId(persistanceId);
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.ReleaseService#findByProjectPersistanceId(int)
     */
    public Set findByProjectPersistanceId(final int projectPersistanceId) {
        return releaseRepository.findByProjectPersistanceId(projectPersistanceId);
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.ReleaseService#update(int,
     *      java.lang.String, java.util.Date, int, long)
     */
    public Errors update(final String number, final Date date, final int persistanceId, final long persistanceVersion) {

        Release releaseToUpdate = releaseRepository
				.findByPersistanceId(persistanceId);

		// if release is not found
		if (releaseToUpdate == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("release.doesntExistsInDatabase");
			return errros;
		}

		releaseToUpdate.setDate(date);
		releaseToUpdate.setNumber(number);
		releaseToUpdate.setPersistanceId(persistanceId);
		releaseToUpdate.setPersistanceVersion(persistanceVersion);

		// validate
		Errors errors = releaseValidator.validate(releaseToUpdate);

		// if there are no errors, persist iteration
		if (!errors.hasErrors()) {
			releaseRepository.addOrUpdate(releaseToUpdate);
		}

		return errors;
        
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.pmr.agilePlanning.service.ReleaseService#addStory(int, int)
	 */
    public Errors addStories(final Set<Integer> storyPersistanceIds, final int releasePersistanceId, long releasePersistanceVersion) {
       
         // recherche de la release
         Release release = releaseRepository.findByPersistanceId(releasePersistanceId);
        
         // if release is not found
         if (release == null) {
        	 Errors errros = AgilePlanningObjectFactory.getErrors();
        	 errros.reject("release.doesntExistsInDatabase");
        	 return errros;
         }
        
         // recherche de chaque story
         for (Integer id : storyPersistanceIds) {

        	 Story story = storyRepository.findByPersistanceId(id);
        	 
        	 // et ajout à la liste des story.
        	 release.getStories().add(story);
        
         }
         
         // mise à jour du numéro de version (pour la gestion de la concurrence d'accès)
         release.setPersistanceVersion(releasePersistanceVersion);
         
         // Validation de la release
         Errors errors = releaseValidator.validate(release);
         
         // si pas d'erreur...
         if (!errors.hasErrors()) {
             // ... on sauvegarde dans la repository
             releaseRepository.addOrUpdate(release);
         }
         
         // ... sinon, retour de la structure d'erreurs
        return errors;

    }

    /*
     * (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.ReleaseService#removeStories(int, java.util.Set)
     */
    public Errors removeStories(final Set<Integer> storyPersistanceIds, final int releasePersistanceId, final long releasePersistanceVersion) {

         // find release
         Release release = releaseRepository.findByPersistanceId(releasePersistanceId);
        
         // if release is not found
         if (release == null) {
        	 Errors errros = AgilePlanningObjectFactory.getErrors();
        	 errros.reject("release.doesntExistsInDatabase");
        	 return errros;
         }
        
         // recherche de chaque story
         for (Integer id : storyPersistanceIds) {

        	 Story story = storyRepository.findByPersistanceId(id);
        	 
        	 // et ajout à la liste des story.
        	 release.getStories().remove(story);
        
         }
         
         // mise à jour du persistance version
         release.setPersistanceVersion(releasePersistanceVersion);
         
         // Validation de la release
         Errors errors = releaseValidator.validate(release);
         
         // si pas d'erreur, on enregistre
         if (!errors.hasErrors()) {
             // sinon, sauvegarde dans la repository
             releaseRepository.addOrUpdate(release);
         }
         
         // retours de la structure d'erreur
        return errors;

    }

	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.service.ReleaseService#findStoriesAvailableToAddInARelease()
	 */
	public Set<Story> findStoriesToAdd(final int basicProjectPersistanceId) {
		return storyRepository.findStoriesWhichAreNotInARelease(basicProjectPersistanceId);
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.service.ReleaseService#findByIterationPersistanceId(int)
	 */
	public Release findByIterationPersistanceId(final int basicProjectPersistanceId, final int iterationPersistanceId) {
		return this.releaseRepository.findByIterationPersistanceId(basicProjectPersistanceId, iterationPersistanceId);
	}

	
	
}
