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

package net.sf.pmr.core.domain.user;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.pmr.core.data.user.UserMapper;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectProxyUtil;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class UserRepositoryImpl implements UserRepository {

    /**
     * userMapper
     */
    private UserMapper userMapper;
    
    /**
     * ProjectProxyUtil
     */
    private ProjectProxyUtil basicProjectProxyUtil;
    

    /**
     * Constructor
     * @param userMapper userMapper
     */
    public UserRepositoryImpl(final UserMapper userMapper, final ProjectProxyUtil basicProjectProxyUtil) {
        this.userMapper = userMapper;
        this.basicProjectProxyUtil = basicProjectProxyUtil;
    }

    /**
     * @see net.sf.pmr.core.domain.user.UserRepository#findUserByPersistanceId(java.lang.Integer)
     */
    public final User findUserByPersistanceId(final int id) {
    	
    	User user = (User) userMapper.findById(id);
    	
    	// inject dependencies for lazy loading
    	user = injectDependencies(user);
    	    	
    	return user;
    }

    /**
     * find a user by login
     *
     * @param login login
     * @return User user
     */
    public final User findUserByLogin(final String login) {
    	
    	User user =  userMapper.findByLogin(login);
        
    	//// inject dependencies for lazy loading
    	//user = injectDependencies(user);

    	return user;
    	
    }

    /**
     * Count All User
     * @return int number of user
     */
    public final Integer countAll() {
        return userMapper.countAll();
    }

    /**
     * find all users
     * @return List of users
     */
    public final List<User> findAll() {
    	
        List<User> list =  userMapper.findAll();
        
        // list to return
        //List<User> listToReturn = new ArrayList<User>();
        
        //for (User user : list) {
        //	// inject dependencies for lazy loading
        //	listToReturn.add(injectDependencies(user));
		//}
        	
        //return listToReturn;
        
        return list;
        
    }

    /**
     * add a user in the persistance
     * @param user user to add
     */
    public final void addOrUpdate(final User user) {
        userMapper.addOrUpdate(getTarget(user));
    }

    /**
     * delete a user in the persistance
     * @param user user to add
     */

    public final void delete(final User user) {
        userMapper.delete(getTarget(user));
    }
    
    /**
     * inject dependency for lazy loading
     * @param user
     * @return
     */
    private User injectDependencies(final User user) {
    	
    	// inject dependency for lazy loading
    	if (user != null) {

    		HashSet<Project> hashSetToReturn = new HashSet<Project>();
    		
    		for (Project basicProject : user.getProjects()) {
    			hashSetToReturn.add(basicProjectProxyUtil.injectDependencies(basicProject));
			}

            user.setProjects(hashSetToReturn);
    		
        }
    	
    	return user;
    	
    }
    
    /**
     * remove proxy and get the target
     * @param user
     * @return
     */
    private User getTarget(final User user) {

    	// set of basicProject to return
    	Set<Project> setToReturn = new HashSet<Project>();
    	
    	for (Project basicProject : user.getProjects()) {
    		// get the basicProject target of the proxy
    		setToReturn.add(basicProjectProxyUtil.getTarget(basicProject));
		}
    	
    	user.setProjects(setToReturn);
    	
    	return user;
    	
    }

}