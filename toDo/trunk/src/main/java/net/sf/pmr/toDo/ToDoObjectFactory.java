/*
* Copyright 2006 Arnaud Prost
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

package net.sf.pmr.toDo;

import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.toDo.data.todo.ToDoMapper;
import net.sf.pmr.toDo.domain.todo.ToDo;
import net.sf.pmr.toDo.service.ToDoService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;

/**
 * @author Arnaud
 */
public final class ToDoObjectFactory {

    /**
     * private constructor.
     */
    private ToDoObjectFactory() {
    }

    /**
     * get the errors.
     * @return errors
     */
    public static Errors getErrors() {

        return (Errors) ToDoObjectFactory.getObject("todoErrors");
    }


    /**
     * get the todo.
     * @return todo
     */
    public static ToDo getToDo() {

        return (ToDo) ToDoObjectFactory.getObject("toDo");
    }

    /**
     * get the todoMapper.
     * @return todoMapper
     */
    public static ToDoMapper getToDoMapper() {

        return (ToDoMapper) ToDoObjectFactory.getObject("toDoMapper");
    }

    
    
//    /**
//     * get the todo validator
//     * @return todo validator
//     */
//    public static TodoValidator getTodoValidator() {
//
//        return (TodoValidator) TodoObjectFactory.getObject("todoValidator");
//    }

    /**
     * get the todo service.
     * @return todo service
     */
    public static ToDoService getToDoService() {

        return (ToDoService) ToDoObjectFactory.getObject("toDoService");
    }

//    /**
//     * get the todo repository
//     * @return todo repository
//     */
//    public static TodoRepository getStoryRepository() {
//
//        return (StoryRepository) TodoObjectFactory.getObject("storyRepository");
//    }
//
//    /**
//     * get the iteration
//     * @return iteration
//     */
//    public static Iteration getIteration() {
//
//        return (Iteration) TodoObjectFactory.getObject("iteration");
//    }
//
//    /**
//     * get the iteration service
//     * @return iteration service
//     */
//    public static IterationService getIterationService() {
//
//        return (IterationService) TodoObjectFactory.getObject("iterationService");
//    }
//
//
//
//    /**
//     * get the release validator
//     * @return releaseValidator
//     */
//    public static ReleaseValidator getReleaseValidator() {
//
//        return (ReleaseValidator) TodoObjectFactory.getObject("releaseValidator");
//
//    }
//
//    /**
//     * get the release
//     * @return release
//     */
//    public static Release getRelease() {
//
//        return (Release) TodoObjectFactory.getObject("release");
//
//    }
//
//    /**
//     * get the release service
//     * @return release service
//     */
//    public static ReleaseService getReleaseService() {
//
//        return (ReleaseService) TodoObjectFactory.getObject("releaseService");
//
//    }
//
//
//    /**
//     * get the task
//     * @return task
//     */
//    public static Task getTask() {
//
//        return (Task) TodoObjectFactory.getObject("task");
//
//    }
//
//    /**
//     * get the task mapper
//     * @return task mapper
//     */
//
//    public static TaskMapper getTaskMapper() {
//
//        return (TaskMapper) TodoObjectFactory.getObject("taskMapper");
//
//    }
//
//    
//    /**
//     * get the charge
//     * @return charge
//     */
//
//    public static Charge getCharge() {
//
//        return (Charge) TodoObjectFactory.getObject("charge");
//
//    }
//
//    
//    /**
//     * get the charge mapper
//     * @return charge mapper
//     */
//
//    public static ChargeMapper getChargeMapper() {
//
//        return (ChargeMapper) TodoObjectFactory.getObject("chargeMapper");
//
//    }
//
//
//    /**
//     * get the iteration validator
//     * @return iterationValidator
//     */
//    public static IterationValidator getIterationValidator() {
//
//        return (IterationValidator) TodoObjectFactory.getObject("iterationValidator");
//
//    }
//
//    /**
//     * get the task validator
//     * @return taskValidator
//     */
//    public static TaskValidator getTaskValidator() {
//
//        return (TaskValidator) TodoObjectFactory.getObject("taskValidator");
//
//    }
//
//
//    /**
//     * get the iteration mapper
//     * @return iterationMapper
//     */
//    public static IterationMapper getIterationMapper() {
//
//        return (IterationMapper) TodoObjectFactory.getObject("iterationMapper");
//
//    }
//
//    /**
//     * get the release mapper
//     * @return releaseMapper
//     */
//    public static ReleaseMapper getReleaseMapper() {
//
//        return (ReleaseMapper) TodoObjectFactory.getObject("releaseMapper");
//
//    }
//
//    /**
//     * get the story mapper
//     * @return storyMapper
//     */
//    public static StoryMapper getStoryMapper() {
//
//        return (StoryMapper) TodoObjectFactory.getObject("storyMapper");
//
//    }
//    
//    /**
//     * get the businessValue mapper
//     * @return BusinessValueMapper
//     */
//    public static BusinessValueMapper getBusinessValueMapper() {
//
//        return (BusinessValueMapper) TodoObjectFactory.getObject("businessValueMapper");
//
//    }
//
//    
//    /**
//     * get the RiskLevelMapper
//     * @return RiskLevelMapper
//     */
//    public static RiskLevelMapper getRiskLevelMapper() {
//
//        return (RiskLevelMapper) TodoObjectFactory.getObject("riskLevelMapper");
//
//    }


    /**
     * get an object from the Spring application context.
     * @param objectName objectName
     * @return object object
     */
    private static Object getObject(final String objectName) {

        return ContextSingletonBeanFactoryLocator.getInstance().useBeanFactory(
                "net.sf.pmr").getFactory().getBean(objectName);

    }

    /**
     * get the bean factory.
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

        return ToDoObjectFactory.getBeanFactory().isSingleton(object);

    }

}
