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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.story.BusinessValue;
import net.sf.pmr.agilePlanning.domain.story.BusinessValueRepository;
import net.sf.pmr.agilePlanning.domain.story.RiskLevel;
import net.sf.pmr.agilePlanning.domain.story.RiskLevelRepository;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryRepository;
import net.sf.pmr.agilePlanning.domain.story.StoryValidator;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.TaskValidator;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectRepository;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class StoryServiceImpl implements StoryService {

    /**
     * Validator.
     */
    private TaskValidator taskValidator;

    /**
     * story repository.
     */
    private StoryRepository storyRepository;

    /**
     * projectRepository.
     */
    private ProjectRepository projectRepository;

    /**
     * BusinessValue repository.
     */
    private BusinessValueRepository businessValueRepository;

    /**
     * RiskLevel repository.
     */
    private RiskLevelRepository riskLevelRepository;

    /**
     * User repository.
     */
    private UserRepository userRepository;

    /**
     * story validator.
     */
    private StoryValidator storyValidator;

    public StoryServiceImpl(final TaskValidator taskValidator, final StoryRepository storyRepository,
            final StoryValidator storyValidator, final ProjectRepository projectRepository,
            final BusinessValueRepository businessValueRepository, final RiskLevelRepository riskLevelRepository,
            final UserRepository userRepository) {
        super();

        this.taskValidator = taskValidator;
        this.storyRepository = storyRepository;
        this.storyValidator = storyValidator;
        this.projectRepository = projectRepository;
        this.businessValueRepository = businessValueRepository;
        this.riskLevelRepository = riskLevelRepository;
        this.userRepository = userRepository;
    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#add(int, String,
     *      String, double, int, int)
     */
    public Errors add(final int projectPersistanceId, final String shortDescription, final String description,
            final double daysEstimated, final int businessValueId, final int riskLevelId) {

        // buid the story
        Story story = this.buildStory(projectPersistanceId, shortDescription, description, daysEstimated,
                businessValueId, riskLevelId);

        // validate
        Errors errors = storyValidator.validate(story);

        // no errors
        if (!errors.hasErrors()) {
            // persist
            storyRepository.addOrUpdate(story);
        }

        return errors;

    }
    
    public Errors addOrUpdate (final Story story) {
        
         // validate
        Errors errors = storyValidator.validate(story);
        
        // no errors
        if (!errors.hasErrors()) {
            // persist
            storyRepository.addOrUpdate(story);
        }

        return errors;
        
    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#addTask(int, double,
     *      java.lang.String, int)
     */
    public Errors addTask(final int storyPersistanceId, final double numberOfIdealDays, final String shortDescription,
            final int developperPersistanceId) {
    	
        // find the story
        Story story = storyRepository.findByPersistanceId(storyPersistanceId);
        
		// if the story is not found, return a global error
		if (story == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("story.doesntExistsInDatabase");
			return errros;
		}

        // else build the object to persist
        Task task = AgilePlanningObjectFactory.getTask();
        User user = CoreObjectFactory.getUser();
        user.setPersistanceId(developperPersistanceId);

        task.setOwner(user);
        task.setDaysEstimated(numberOfIdealDays);
        task.setShortDescription(shortDescription);

        // validate
        Errors errors = taskValidator.validate(task);

        // persist
        if (!errors.hasErrors()) {
                story.getTasks().add(task);
                storyRepository.addOrUpdate(story);

        }

        return errors;

    }

    public Errors addOrUpdateTask(final int storyPersistanceId, final Task task) {
        
         // find the story
        Story story = storyRepository.findByPersistanceId(storyPersistanceId);
        
		// if the story is not found, return a global error
		if (story == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("story.doesntExistsInDatabase");
			return errros;
		}

      
        // validate
        Errors errors = taskValidator.validate(task);

        // persist
        if (!errors.hasErrors()) {
                story.getTasks().add(task);
                storyRepository.addOrUpdate(story);

        }

        return errors;
        
        
    }


     /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#delete(int, long)
     */
     public Errors delete(final int persistanceId, final long persistanceVersion) {
     
         // find the story to delete in the repository
         Story story = storyRepository.findByPersistanceId(persistanceId);

 		// if the story is not found, return a global error
 		if (story == null) {
 			Errors errors = AgilePlanningObjectFactory.getErrors();
 			errors.reject("story.doesntExistsInDatabase");
 			return errors;
 		}
         
         // if the story is found, update the persistanceVersion for concurrency management
         story.setPersistanceVersion(persistanceVersion);
  
         // validate
         Errors errors = storyValidator.validateForDelete(story);

         // delete if validation is ok
         if (!errors.hasErrors()) {
             storyRepository.delete(story);
         }
         
         return errors;
    	 
     }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#findByPersistanceId(int)
     */
    public Story findByPersistanceId(final int persistanceId) {
        return storyRepository.findByPersistanceId(persistanceId);
    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#findByProjectPersistanceId(int)
     */
    public Set<Story> findByProjectPersistanceId(final int projectPersistanceId) {
        return storyRepository.findByProjectPersistanceId(projectPersistanceId);
    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#findByIterationPersistanceId(int)
     */
    public Set<Story> findByIterationPersistanceId(final int iterationPersistanceId) {
        return storyRepository.findByIterationPersistanceId(iterationPersistanceId);
    }

    public Set<Story> findByReleasePersistanceId(final int releasePersistanceId) {
        return storyRepository.findByReleasePersistanceId(releasePersistanceId);
    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#findTaskByPersistanceId(int)
     */
    public Task findTaskByPersistanceId(final int persistanceId) {
        return storyRepository.findTaskByPersistanceId(persistanceId);
    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#findChargeByPersistanceId(int)
     */
    public Charge findChargeByPersistanceId(final int persistanceId) {
        return storyRepository.findChargeByPersistanceId(persistanceId);
    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#update(String, String,
     *      double, int, int, int, long)
     */
    public Errors update(final String shortDescription, final String description, final double daysEstimated,
            final int businessValueId, final int riskLevelId, final int persistanceId, final long persistanceVersion) {

        // find the story to update in the repository
        Story story = storyRepository.findByPersistanceId(persistanceId);

		// if the story is not found, return a global error
		if (story == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("story.doesntExistsInDatabase");
			return errros;
		}

        
        // update the story
        story.setShortDescription(shortDescription);
        story.setDescription(description);
        story.setDaysEstimated(daysEstimated);
        story.setPersistanceId(persistanceId);
        story.setPersistanceVersion(persistanceVersion);

        // find the riskLevel and business value
        BusinessValue businessValue = businessValueRepository.findById(businessValueId);
        story.setBusinessValue(businessValue);

        RiskLevel riskLevel = riskLevelRepository.findById(riskLevelId);
        story.setRiskLevel(riskLevel);

        // validate
        Errors errors = storyValidator.validate(story);

        // persist
        if (!errors.hasErrors()) {
            storyRepository.addOrUpdate(story);
        }

        // return an empty error object (no validations are made)
        return AgilePlanningObjectFactory.getErrors();

    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#updateTask(int,
     *      double, java.lang.String, int, int, long)
     */
    public Errors updateTask(final int storyPersistanceId,
			final double numberOfIdealDays, final String shortDescription,
			final int developperPersistanceId, final int persistanceId,
			final long persistanceVersion) {

		// find the story
		Story story = storyRepository.findByPersistanceId(storyPersistanceId);

		// if the story is not found, return a global error
		if (story == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("story.doesntExistsInDatabase");
			return errros;
		}

		// else, build the object to persist
		Task task = AgilePlanningObjectFactory.getTask();
		User user = CoreObjectFactory.getUser();
		user.setPersistanceId(developperPersistanceId);

		task.setOwner(user);
		task.setPersistanceId(persistanceId);
		task.setPersistanceVersion(persistanceVersion);
		task.setDaysEstimated(numberOfIdealDays);
		task.setShortDescription(shortDescription);

		// validate
		Errors errors = taskValidator.validate(task);

		if (!errors.hasErrors()) {

			// find the task to update
			for (Iterator iterator = story.getTasks().iterator(); iterator
					.hasNext();) {
				Task taskToUpdate = (Task) iterator.next();

				if (task.getPersistanceId() == taskToUpdate.getPersistanceId()) {

					taskToUpdate.setOwner(task.getOwner());
					taskToUpdate.setDaysEstimated(task.getDaysEstimated());
					taskToUpdate.setPersistanceVersion(task
							.getPersistanceVersion());
					taskToUpdate
							.setShortDescription(task.getShortDescription());

					// persist
					storyRepository.addOrUpdate(story);

					// finish
					break;

				}

			}

		}

		return errors;
	}
    
    /* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.service.StoryService#deleteTask(int, int, long)
	 */
	public Errors deleteTask(final int storyPersistanceId, final int persistanceId, final long persistanceVersion) {

		// find the story
		Story story = storyRepository.findByPersistanceId(storyPersistanceId);

		// if the story is not found, return a global error
		if (story == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("story.doesntExistsInDatabase");
			return errros;
		}
		
		Task taskToDelete = null;
		
		// find the task to delete
		for (Task task : story.getTasks()) {
			if (task.getPersistanceId() == persistanceId) {
				taskToDelete = task;
			}
		}
		
		// if the task is not found, return a global error
		if (taskToDelete == null) {
			Errors errros = AgilePlanningObjectFactory.getErrors();
			errros.reject("task.doesntExistsInDatabase");
			return errros;
		}
		
		// else check if the task can be deleted
		Errors errors = taskValidator.validateForDelete(taskToDelete);
		
		// else, remove the task from the set
		if (!errors.hasErrors()) {

			// update the persistanceVersion
			taskToDelete.setPersistanceVersion(persistanceVersion);

			// remove from the set
			story.getTasks().remove(taskToDelete);
			
			// persist
			this.storyRepository.addOrUpdate(story);
			
		}

		return errors;
		
	}

	/**
	 * @see net.sf.pmr.agilePlanning.service.StoryService#findAllBusinessValue()
	 */
    public Set<BusinessValue> findAllBusinessValue() {

        return businessValueRepository.findAll();
    }

    /**
	 * @see net.sf.pmr.agilePlanning.service.StoryService#findAllRiskLevel()
	 */
    public Set<RiskLevel> findAllRiskLevel() {

        return riskLevelRepository.findAll();

    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#addCharge(int, int,
     *      int, java.util.Date, double, double)
     */
    public Errors addCharge(final int storyPersistanceId, final int taskPersistanceId, final int userPersistanceId,
            final Date day, final double timeUsedToday, final double daysNeededToFinish) {


        // finding story
        Story story = storyRepository.findByPersistanceId(storyPersistanceId);

		Errors errors = AgilePlanningObjectFactory.getErrors();
        
		// if the story is not found, return a global error
		if (story == null) {
			errors.reject("story.doesntExistsInDatabase");
			return errors;
		}

    	
        // building object charge
        Charge charge = AgilePlanningObjectFactory.getCharge();

        charge.setDay(day);
        charge.setDaysNeededToFinish(daysNeededToFinish);
        charge.setTimeUsedToday(timeUsedToday);

        // finding user
        User user = userRepository.findUserByPersistanceId(userPersistanceId);

        charge.setUser(user);

        // adding the charge
        for (Task task : story.getTasks()) {

            if (task.getPersistanceId() == taskPersistanceId) {

                if (task.getCharges() == null) {

                    task.setCharges(new HashSet<Charge>());
                }

                task.getCharges().add(charge);

            }

        }

        // save
        storyRepository.addOrUpdate(story);
        
        return errors;

    }

    /**
     * @see net.sf.pmr.agilePlanning.service.StoryService#updateCharge(java.util.Date,
     *      double, double, int, int)
     */
    public Errors updateCharge(final Date day, final double timeUsedToday, final double daysNeededToFinish,
            final int storyPersistanceId, final int taskPersistanceId, final int chargePersistanceId,
            final long chargePersistanceVersion) {

        // find the charge
        Story story = storyRepository.findByPersistanceId(storyPersistanceId);
        
		Errors errors = AgilePlanningObjectFactory.getErrors();
        
		// if the story is not found, return a global error
		if (story == null) {
			errors.reject("story.doesntExistsInDatabase");
			return errors;
		}


        for (Task task : story.getTasks()) {

            if (task.getPersistanceId() == taskPersistanceId) {

                for (Charge charge : task.getCharges()) {

                    if (charge.getPersistanceId() == chargePersistanceId) {

                        // upate the charge
                        charge.setDay(day);
                        charge.setTimeUsedToday(timeUsedToday);
                        charge.setDaysNeededToFinish(daysNeededToFinish);
                        charge.setPersistanceVersion(chargePersistanceVersion);

                    }

                }

            }

        }

        // save
        storyRepository.addOrUpdate(story);
        
		return errors;


    }

    /**
     * Build the story with the given arguments
     */
    private Story buildStory(final int projectPersistanceId, final String shortDescription, final String description,
            final double daysEstimated, final int businessValueId, final int riskLevelId) {

        // Build the object
        Story story = AgilePlanningObjectFactory.getStory();

        // find the project
        Project project = projectRepository.findByPersistanceId(projectPersistanceId);
        story.setProject(project);

        story.setShortDescription(shortDescription);
        story.setDescription(description);
        story.setDaysEstimated(daysEstimated);

        // find the riskLevel and business value
        BusinessValue businessValue = businessValueRepository.findById(businessValueId);
        story.setBusinessValue(businessValue);

        RiskLevel riskLevel = riskLevelRepository.findById(riskLevelId);
        story.setRiskLevel(riskLevel);

        return story;

    }


}
