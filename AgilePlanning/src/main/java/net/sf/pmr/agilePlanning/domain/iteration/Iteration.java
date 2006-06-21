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
package net.sf.pmr.agilePlanning.domain.iteration;

import java.util.Date;
import java.util.Set;

import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.keopsframework.domain.object.DomainObject;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public interface Iteration extends DomainObject {

    /**
     * basicProject.
     * @return basicProject
     */
    BasicProject getBasicProject();

    /**
     * basicProject.
     * @param basicProject basicProject
     */
    void setBasicProject(final BasicProject basicProject);

    /**
     * début de l'iteration.
     * @return start date
     */
    Date getStartDate();

    /**
     * début de l'iteration.
     * @param start date to set
     */
    void setStartDate(final Date start);

    /**
     * date de fin de l'iteration.
     * @return end date
     */
    Date getEndDate();

    /**
     * date de fin de l'iteration.
     * @param end date to set
     */
    void setEndDate(final Date end);
    
    /**
     * nombre de jours (idéaux) disponibles dans l'iteration.
     * @return number of days
     */
    int getDays();
    
    /**
     * nombre de jours (idéaux) disponibles dans l'iteration.
     * @param days number of days
     */
    void setDays(final int days);
    
    /**
     * nombre de jours consommés sur l'itération.
     * @return int numbre de jours consommés
     */
    double daysCompleted();
    
    /**
     * nombre de jours restant à réaliser.
     * @return nombre de jours restant à réaliser
     */
    double daysRemaining();

    /**
     * pourcentage réalisé de l'iteration.
     * @return pourcentage réalisé de l'iteration
     */
    double percentCompleted();
    
    /**
     * pourcentage restant pour la story.
     * @return pourcentage restant pour la story
     */
    double percentRemaining();
    
    /**
     * Différence entre le nombre de jours de l'iteration (days) et le nombre de jours des stories.
     * Cela permet de voir si les stories vont tenir dans l'iteration.
     * (completed + remaining)
     * @return différence en jours
     */
    double differenceOfDaysBetweenIterationAndStories();


    /**
     * Différence en pourcentage entre le nombre de jours de l'iteration (days) et le nombre de jours des stories.
     * Cela permet de voir si les stories vont tenir dans l'iteration.
     * (completed + remaining)
     * @return différence en pourcentage
     */
    double differenceInPercentBetweenIterationAndStories();

    /**
     * set stories.
     * @param stories set of stories
     * @param stories
     */
    void setStories(final Set < Story > stories);

    /**
     * get stories.
     * @return set of stories
     */
    Set < Story > getStories();

    /**
     * Y-a-t-il une alerte sur l'iteration ?
     * C'est le cas si la différence entre le nombre de jours de l'iteration (days) et le nombre de jours des stories
     * est positif. (plus de jours dans les stories que dans les iterations.
     * @return true en cas d'alerte sur l'iteration, false si pas d'alerte.
     */
    boolean warning();

}
