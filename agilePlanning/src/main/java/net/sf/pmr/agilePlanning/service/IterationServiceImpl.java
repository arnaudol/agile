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
import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.iteration.IterationRepository;
import net.sf.pmr.agilePlanning.domain.iteration.IterationValidator;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class IterationServiceImpl implements IterationService {

    /**
     * Validator.
     */
    private IterationValidator iterationValidator;

    /**
     * Iteration repository.
     */
    private IterationRepository iterationRepository;
    

    /**
     * Story repository.
     */
    private StoryRepository storyRepository;

    /**
     * Constructor.
     *
     * @param iterationValidator iterationValidator
     * @param iterationRepository iterationRepository
     * @param storyRepository storyRepository
     */
    public IterationServiceImpl(final IterationValidator iterationValidator,
            final IterationRepository iterationRepository, final StoryRepository storyRepository) {
        super();
        this.iterationValidator = iterationValidator;
        this.iterationRepository = iterationRepository;
        this.storyRepository = storyRepository;
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.IterationService#add(int, java.util.Date, java.util.Date)
     */
    public Errors add(final int projetPersistanceId, final Date start, final Date end) {

        // Buid the object to persist
        Iteration iteration = AgilePlanningObjectFactory.getIteration();
        iteration.getProject().setPersistanceId(projetPersistanceId);
        iteration.setEndDate(end);
        iteration.setStartDate(start);

        // validate
        Errors errors = iterationValidator.validate(iteration);

        // if there are no errors, persist iteration
        if (!errors.hasErrors()) {
            iterationRepository.addOrUpdate(iteration);
        }

        return errors;

    }

    // public Errors delete(int persistanceId, long persistanceVersion) {
    // return null;
    // }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.IterationService#findByPersistanceId(int)
     */
    public Iteration findByPersistanceId(final int persistanceId) {
        return iterationRepository.findByPersistanceId(persistanceId);
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.IterationService#findByProjectPersistanceId(int)
     */
    public Set findByProjectPersistanceId(final int projectPersistanceId) {
        return iterationRepository.findByProjectPersistanceId(projectPersistanceId);
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.IterationService#findByProjectPersistanceIdAndByDate(int,
     *      java.util.Date)
     */
    public Iteration findByProjectPersistanceIdAndByDate(final int projetPersistanceId, final Date date) {
        return iterationRepository.findByProjectPersistanceIdAndByDate(projetPersistanceId, date);
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.IterationService#update(java.util.Date,
     *      java.util.Date, int, int, long)
     */
    public Errors update(final Date start, final Date end, final int iterationPersistanceId, final long iterationPersistanceVersion) {

        // find the iteration to update
        Iteration iteration = iterationRepository.findByPersistanceId(iterationPersistanceId);

        // if iteration is found
        if (iteration != null) {

            // update the iteration object
            iteration.setEndDate(end);
            iteration.setPersistanceId(iterationPersistanceId);
            iteration.setPersistanceVersion(iterationPersistanceVersion);
            iteration.setStartDate(start);

            // validate
            Errors errors = iterationValidator.validate(iteration);

            // if there are no errors, persist iteration
            if (!errors.hasErrors()) {
                iterationRepository.addOrUpdate(iteration);
            }

            return errors;

        } else {

            return AgilePlanningObjectFactory.getErrors();
        }

    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.IterationService#addStories(int, long, java.util.Set)
     */
    public Errors addStories(final Set<Integer> storyPersistanceIds, final int iterationPersistanceId, final long iterationPersistanceVersion) {

         // recherche de l'iteratin
    	Iteration iteration = iterationRepository.findByPersistanceId(iterationPersistanceId);
        
		// if iteration is not found
		if (iteration == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("iteration.doesntExistsInDatabase");
			return errros;
		}
         
         // mise à jour du numéro de version
         iteration.setPersistanceVersion(iterationPersistanceVersion);

         // recherche de chaque story
         for (Integer id : storyPersistanceIds) {
        
        	 Story story = storyRepository.findByPersistanceId(id);

	         if (story != null) {
	        	 // ajout au set de story de l'iteration
	        	 iteration.getStories().add(story);
	         }
	       
         }
         
         // validation de l'iteration
         Errors errors = this.iterationValidator.validate(iteration);
         
         // en cas d'erreurs
         if (errors.hasErrors()) {
        	 return errors;
         } else {
        	 // si pas d'erreur, enregistrement
        	 iterationRepository.addOrUpdate(iteration);
        	 // retour d'une structure d'erreurs vides
        	 return AgilePlanningObjectFactory.getErrors();
         }

        
    }

    /* (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.IterationService#removeStories(int,
     *      java.util.Set)
     */
    public Errors removeStories(final Set<Integer> storyPersistanceIds, final int iterationPersistanceId, final long iterationPersistanceVersion) {

        // recherche de l'iteratin
    	Iteration iteration = iterationRepository.findByPersistanceId(iterationPersistanceId);
        
		// if iteration is not found
		if (iteration == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("iteration.doesntExistsInDatabase");
			return errros;
		}

         
         // mise à jour du numéro de version
         iteration.setPersistanceVersion(iterationPersistanceVersion);

         // recherche de chaque story
         for (Integer id : storyPersistanceIds) {
        
        	 Story story = storyRepository.findByPersistanceId(id);

	         if (story != null) {
	        	 // ajout au set de story de l'iteration
	        	 iteration.getStories().remove(story);
	         }
	       
         }
         
         // validation de l'iteration
         Errors errors = this.iterationValidator.validate(iteration);
         
         // en cas d'erreurs
         if (!errors.hasErrors()) {
        	 // si pas d'erreur, enregistrement
        	 iterationRepository.addOrUpdate(iteration);
        	 return errors;
         } else {
        	 return errors;
         }
    }

    /*
     * (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.service.IterationService#findStoriesToAdd(int, int)
     */
	public Set< Story > findStoriesToAdd(final int basicProjectPersistanceId, final int iterationPersistanceId) {
		return this.storyRepository.findAvailableStoriesToAddForAnIteration(basicProjectPersistanceId, iterationPersistanceId);
	}

	/* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.service.IterationService#findCurrentIteration(int)
	 */
	public Iteration findCurrentIteration(final int basicProjectPersistanceId) {
		return this.iterationRepository.findByProjectPersistanceIdAndByDate(basicProjectPersistanceId, new Date());
	}

	

}
