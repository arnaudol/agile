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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectRepository;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ProjectServiceImpl implements ProjectService {

    /**
     * basicProject validator
     */
    private Validator projectValidator;

    /**
     * basicProject repository
     */
    private ProjectRepository projectRepository;

    /**
     * user repository
     */
    private UserRepository userRepository;

    /**
     * @param projectValidator
     * @param basicProjectRepository
     * @param userRepository
     */
    public ProjectServiceImpl(final Validator projectValidator,
            final ProjectRepository basicProjectRepository,
            final UserRepository userRepository) {
        super();
        this.projectValidator = projectValidator;
        this.projectRepository = basicProjectRepository;
        this.userRepository = userRepository;
    }
    

    /**
     * @see ProjectService#add(String, String, int)
     */
    public Errors add(final String code, final String name, final int defaultMemberPersistanceId) {

      // First call for a project instance
      Project basicProject = CoreObjectFactory.getProject();

      // populate the instance
      basicProject.setCode(code);
      basicProject.setName(name);

      // then find the default member in the user repository
      User user = userRepository.findUserByPersistanceId(defaultMemberPersistanceId);

      // add the user to the set of members
      Set<User> members = new HashSet<User>();
      members.add(user);
      basicProject.setMembers(members);

      // validation of the basicProject
      Errors errors = projectValidator.validate(basicProject);

      if (!errors.hasErrors()) {

          // if no error, add to repository
          try {
              projectRepository.addOrUpdate(basicProject);
          } catch (Exception exception) {
              // in case of exception, it put in the error struture
              errors.reject(exception.getClass().getName());
          }
      }

      return errors;

    }

    public Errors add(final Project project, final User defaultMember) {        

      // add the user to the set of members
      Set<User> members = new HashSet<User>();
      members.add(defaultMember);
      project.setMembers(members);

      // validation of the basicProject
      Errors errors = projectValidator.validate(project);

      if (!errors.hasErrors()) {

          // if no error, add to repository
          try {
              projectRepository.addOrUpdate(project);
          } catch (Exception exception) {
              // in case of exception, it put in the error struture
              errors.reject(exception.getClass().getName());
          }
      }

      return errors;
        
    }
    

    public Errors update(final int persistanceId, final String code, final String name, final long persistanceVersion) {

        // First call for a project instance
        Project basicProject = CoreObjectFactory.getProject();

        // populate the instance
        basicProject.setPersistanceId(persistanceId);
        basicProject.setCode(code);
        basicProject.setName(name);
        basicProject.setPersistanceVersion(persistanceVersion);

        // validation of the basicProject
        Errors errors = projectValidator.validate(basicProject);

        if (!errors.hasErrors()) {

            // if no error, add to repository
            try {
                projectRepository.addOrUpdate(basicProject);
            } catch (Exception exception) {
                // in case of exception, it put in the error struture
                errors.reject(exception.getClass().getName());
            }
        }

        return errors;
    }

    /**
     * @see net.sf.pmr.core.service.ProjectService#countAll()
     */
    public Long countAll() {
        return projectRepository.countAll();
    }
    
    
    
    
    /**
     * @see net.sf.pmr.core.service.ProjectService#findAll()
     */
    public List<Project> findAll() {
        return projectRepository.findAll();
    }


    /** 
     * @see net.sf.pmr.core.service.ProjectService#findByPersistanceId(int)
     */
    public Project findByPersistanceId(final int persistanceId) {
        return projectRepository.findByPersistanceId(persistanceId);
    }


	/* (non-Javadoc)
	 * @see net.sf.pmr.core.service.ProjectService#findForAUser(int)
	 */
	public Set<Project> findForAUser(final int userPersistanceId) {
		return this.projectRepository.findForAUser(userPersistanceId);
	}
    
       
}