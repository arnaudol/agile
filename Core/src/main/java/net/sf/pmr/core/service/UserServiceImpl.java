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

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectRepository;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.core.domain.user.company.CompanyRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class UserServiceImpl implements UserService {

    /**
     * User repository
     */
    private UserRepository userRepository;

    /**
     * user validator
     */
    private Validator userValidator;

    /**
     * Company repository
     */
    //private CompanyRepository companyRepository;

    /**
     * company validator
     */
    //private Validator companyValidator;
    
    /**
     * basicProject repository
     */
    private ProjectRepository basicProjectRepository;
    
    /**
     * Basic Constructor is made private
     */
    private UserServiceImpl() {
	}

	/**
     * Constructor
     * @param userRepository userRepository
     * @param userValidator userValidator
     * @param companyRepository companyRepository
     * @param companyValidator companyValidator
     * @param basicProjectRepository basicProjectRepository
     */
    public UserServiceImpl(final UserRepository userRepository,
            final Validator userValidator, final CompanyRepository companyRepository, final ProjectRepository basicProjectRepository) {
        super();
        this.userRepository = userRepository;
        this.userValidator = userValidator;
        //this.companyRepository = companyRepository;
        this.basicProjectRepository = basicProjectRepository;
    }

    /**
     * @see net.sf.pmr.core.service.UserService#update(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long)
     */
    public Errors addOrUpdate(final int persistanceId, final String firstName, final String lastName,
            final String login, final String password, final String email, final long persistanceVersion) {

    	User user = null;
    	Errors errors = null;
    	
    	if (persistanceId == 0) {
            // get a user instance from the factory
            user = CoreObjectFactory.getUser();
    	} else {
    		user = userRepository.findUserByPersistanceId(persistanceId);
    	}
    	
    	if (user != null) {

	        // populate user
	        user.setPersistanceId(persistanceId);
	        user.setFirstName(firstName);
	        user.setLastName(lastName);
	        user.setLogin(login);
	        user.setPassword(password);
	        user.setEmail(email);
	        user.setPersistanceVersion(persistanceVersion);
	
	        // validate user
	        errors = userValidator.validate(user);
	
	        if (!errors.hasErrors()) {
	            // if no errors are found,
	            // then save user
	            userRepository.addOrUpdate(user);
	        }
	        
    	} else {
    		errors = CoreObjectFactory.getErrors();
    	}

        return errors;

    }

    /**
     * @see net.sf.pmr.core.service.UserService#findByPersistanceId(java.lang.Integer)
     */
    public User findByPersistanceId(int persistanceId) {
        return userRepository.findUserByPersistanceId(persistanceId);
    }
    
    /**
     * @see net.sf.pmr.core.service.UserService#findByLogin(java.lang.String)
     */
    public User findByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }

    
    /**
     * @see net.sf.pmr.core.service.UserService#findAll()
     */
    public List<User> findAll() {
        return userRepository.findAll();
    }
    
    
    /**
     * @see net.sf.pmr.core.service.UserService#countAll()
     */
    public Integer countAll() {
        return userRepository.countAll();
    }
    
    /**
     * @see net.sf.pmr.core.service.UserService#delete(java.lang.Integer)
     */
    public Errors delete(Integer id) {
        // TODO � tester et impl�menter
        return null;
    }

    /**
     * @see net.sf.pmr.core.service.UserService#addUserToProject(int, int)
     */
	public void addUserToProject(int userPersistanceId, int projectPersistanceId) {
		
		//find the user
		User user = userRepository.findUserByPersistanceId(userPersistanceId);
		
		// if user is found, find the basicProject
		if (user != null) {
			Project basicProject = basicProjectRepository.findByPersistanceId(projectPersistanceId);
			
			if (basicProject != null) {
				// add the basicProject
				user.getProjects().add(basicProject);
				// call the repository
				userRepository.addOrUpdate(user);
			}
			
		}
		
	}
        
}