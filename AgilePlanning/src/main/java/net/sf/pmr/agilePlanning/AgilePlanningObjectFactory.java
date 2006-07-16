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

package net.sf.pmr.agilePlanning;

import net.sf.pmr.agilePlanning.data.iteration.IterationMapper;
import net.sf.pmr.agilePlanning.data.release.ReleaseMapper;
import net.sf.pmr.agilePlanning.data.story.BusinessValueMapper;
import net.sf.pmr.agilePlanning.data.story.RiskLevelMapper;
import net.sf.pmr.agilePlanning.data.story.StoryMapper;
import net.sf.pmr.agilePlanning.data.story.task.TaskMapper;
import net.sf.pmr.agilePlanning.data.story.task.charge.ChargeMapper;
import net.sf.pmr.agilePlanning.domain.iteration.Iteration;
import net.sf.pmr.agilePlanning.domain.iteration.IterationValidator;
import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.release.ReleaseValidator;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.agilePlanning.domain.story.StoryRepository;
import net.sf.pmr.agilePlanning.domain.story.StoryValidator;
import net.sf.pmr.agilePlanning.domain.story.task.Task;
import net.sf.pmr.agilePlanning.domain.story.task.TaskValidator;
import net.sf.pmr.agilePlanning.domain.story.task.charge.Charge;
import net.sf.pmr.agilePlanning.service.IterationService;
import net.sf.pmr.agilePlanning.service.ReleaseService;
import net.sf.pmr.agilePlanning.service.StoryService;
import net.sf.pmr.keopsframework.domain.validation.Errors;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;

/**
 * @author Arnaud
 */
public final class AgilePlanningObjectFactory {

    /**
     * private constructor
     */
    private AgilePlanningObjectFactory() {
    }

    /**
     * get the address
     * @return address
     */
    public static Errors getErrors() {

        return (Errors) AgilePlanningObjectFactory.getObject("agilePlanningErrors");
    }

    /**
     * get the story
     * @return story
     */
    public static Story getStory() {

        return (Story) AgilePlanningObjectFactory.getObject("story");
    }
    
    
    /**
     * get the story validator
     * @return story
     */
    public static StoryValidator getStoryValidator() {

        return (StoryValidator) AgilePlanningObjectFactory.getObject("storyValidator");
    }

    /**
     * get the story service
     * @return story service
     */
    public static StoryService getStoryService() {

        return (StoryService) AgilePlanningObjectFactory.getObject("storyService");
    }

    /**
     * get the story repository
     * @return story repository
     */
    public static StoryRepository getStoryRepository() {

        return (StoryRepository) AgilePlanningObjectFactory.getObject("storyRepository");
    }

    /**
     * get the iteration
     * @return iteration
     */
    public static Iteration getIteration() {

        return (Iteration) AgilePlanningObjectFactory.getObject("iteration");
    }

    /**
     * get the iteration service
     * @return iteration service
     */
    public static IterationService getIterationService() {

        return (IterationService) AgilePlanningObjectFactory.getObject("iterationService");
    }



    /**
     * get the release validator
     * @return releaseValidator
     */
    public static ReleaseValidator getReleaseValidator() {

        return (ReleaseValidator) AgilePlanningObjectFactory.getObject("releaseValidator");

    }

    /**
     * get the release
     * @return release
     */
    public static Release getRelease() {

        return (Release) AgilePlanningObjectFactory.getObject("release");

    }

    /**
     * get the release service
     * @return release service
     */
    public static ReleaseService getReleaseService() {

        return (ReleaseService) AgilePlanningObjectFactory.getObject("releaseService");

    }


    /**
     * get the task
     * @return task
     */
    public static Task getTask() {

        return (Task) AgilePlanningObjectFactory.getObject("task");

    }

    /**
     * get the task mapper
     * @return task mapper
     */

    public static TaskMapper getTaskMapper() {

        return (TaskMapper) AgilePlanningObjectFactory.getObject("taskMapper");

    }

    
    /**
     * get the charge
     * @return charge
     */

    public static Charge getCharge() {

        return (Charge) AgilePlanningObjectFactory.getObject("charge");

    }

    
    /**
     * get the charge mapper
     * @return charge mapper
     */

    public static ChargeMapper getChargeMapper() {

        return (ChargeMapper) AgilePlanningObjectFactory.getObject("chargeMapper");

    }


    /**
     * get the iteration validator
     * @return iterationValidator
     */
    public static IterationValidator getIterationValidator() {

        return (IterationValidator) AgilePlanningObjectFactory.getObject("iterationValidator");

    }

    /**
     * get the task validator
     * @return taskValidator
     */
    public static TaskValidator getTaskValidator() {

        return (TaskValidator) AgilePlanningObjectFactory.getObject("taskValidator");

    }


    /**
     * get the iteration mapper
     * @return iterationMapper
     */
    public static IterationMapper getIterationMapper() {

        return (IterationMapper) AgilePlanningObjectFactory.getObject("iterationMapper");

    }

    /**
     * get the release mapper
     * @return releaseMapper
     */
    public static ReleaseMapper getReleaseMapper() {

        return (ReleaseMapper) AgilePlanningObjectFactory.getObject("releaseMapper");

    }

    /**
     * get the story mapper
     * @return storyMapper
     */
    public static StoryMapper getStoryMapper() {

        return (StoryMapper) AgilePlanningObjectFactory.getObject("storyMapper");

    }
    
    /**
     * get the businessValue mapper
     * @return BusinessValueMapper
     */
    public static BusinessValueMapper getBusinessValueMapper() {

        return (BusinessValueMapper) AgilePlanningObjectFactory.getObject("businessValueMapper");

    }

    
    /**
     * get the RiskLevelMapper
     * @return RiskLevelMapper
     */
    public static RiskLevelMapper getRiskLevelMapper() {

        return (RiskLevelMapper) AgilePlanningObjectFactory.getObject("riskLevelMapper");

    }


    /**
     * get an object from the Spring application context
     * @param objectName objectName
     * @return object object
     */
    private static Object getObject(final String objectName) {

        return ContextSingletonBeanFactoryLocator.getInstance().useBeanFactory(
                "net.sf.pmr").getFactory().getBean(objectName);

    }

    /**
     * get the bean factory
     * @return beanFactory
     */
    private static BeanFactory getBeanFactory() {

        return ContextSingletonBeanFactoryLocator.getInstance().useBeanFactory(
                "net.sf.pmr").getFactory();
    }

    /**
     * is an object singleton ?
     * @param object object
     * @return boolean boolean
     */
    public static boolean isSingleton(final String object) {

        return AgilePlanningObjectFactory.getBeanFactory().isSingleton(object);

    }

}