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

package net.sf.pmr.core.service;

import java.util.List;
import java.util.Set;

import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.keopsframework.domain.validation.Errors;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public interface ProjectService {

    /**
     * Service to allow to add a project in the repository.
     * @param code code of the project
     * @param name name of the project
     * @param defaultMemberPersistanceId defaultMemberPersistanceId of the project
     * @return Errors
     * @deprecated
     */
    @Deprecated
    Errors add(final String code, final String name, final int defaultMemberPersistanceId);
        
    /**
     * Service to allow to add a project in the repository.
     * @param project project to add
     * @param defaultMember defaultMember of the project
     * @return Errors
     */
    Errors add(final Project project, final User defaultMember);
    
    /**
     * Service to allow to update a project in the repository.
     * @param persistanceId of the project
     * @param code code of the project
     * @param name name of the project
     * @param persistanceVersion of the project
     * @return Errors
     */
    Errors update(final int persistanceId, final String code, final String name, final long persistanceVersion);
    
    /**
     * Count all projects.
     * @return number of projects
     */
    Long countAll();
    
    /**
     * find all project.
     * @return list of basicProjects
     */
    List < Project > findAll();
    
    /**
     * find a basicProject by persistanceId.
     * @param persistanceId of the basicProject
     * @return Project
     */
    Project findByPersistanceId(final int persistanceId);
    
    /**
     * find projects for a user.
     * @param userPersistanceId persistance id of the user
     * @return Set of Project
     */
    Set < Project > findForAUser(final int userPersistanceId);

}
