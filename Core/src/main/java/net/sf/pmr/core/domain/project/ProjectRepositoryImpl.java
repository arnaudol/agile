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

package net.sf.pmr.core.domain.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.sf.pmr.core.data.project.ProjectMapper;

/**
 * @author arnaud.prost@gmail.com
 * Cette classe fait l'interface entre le domaine métier et les données <br>
 * Le project étant un proxy pour déclancher le lazy loading sur la méthode getMembers,
 * il faut :<ul>
 * <li>avant d'enregistrer l'objet en base, récupérer la target</li>
 * <li>après la récupuration de l'object de la base, récupurer un objet de la factory est le peupler avec l'objet venant de la base </li> 
 * </ul>
 */
public class ProjectRepositoryImpl implements ProjectRepository {

    /**
     * project mapper.
     */
    private ProjectMapper projectMapper;
    
    /**
     * projectProxyUtil.
     */
    private ProjectProxyUtil projectProxyUtil;

    /**
     * @param projectMapper basicProjectMapper
     */
    public ProjectRepositoryImpl(
            final ProjectMapper projectMapper, final ProjectProxyUtil projectProxyUtil) {
        this.projectMapper = projectMapper;
        this.projectProxyUtil = projectProxyUtil;
    }

    /**
     * @see net.sf.pmr.core.domain.project.ProjectRepositoryTest#countAll()
     */
    public Integer countAll() {
        return projectMapper.countAll();
    }

    /**
     * @see net.sf.pmr.core.domain.project.ProjectRepository#add(net.sf.pmr.core.domain.project.Project)
     */
    public void addOrUpdate(final Project basicProject) {
        
        projectMapper.addOrUpdate(projectProxyUtil.getTarget(basicProject));

    }

    /**
     * @see net.sf.pmr.core.domain.project.ProjectRepository#findAll()
     */
    public List<Project> findAll() {

        List<Project> list = projectMapper.findAll();

        List<Project> listToReturn = new ArrayList<Project>();

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Project project = (Project) iterator.next();

            listToReturn.add(projectProxyUtil.injectDependencies(project));

        }

        return listToReturn;

    }

    public Project findByPersistanceId(final int persistanceId) {
        
        Project project =  (Project) projectMapper.findById(persistanceId);
        
        return projectProxyUtil.injectDependencies(project);
        
    }

	/* (non-Javadoc)
	 * @see net.sf.pmr.core.domain.project.ProjectRepository#findForAUser(int)
	 */
	public Set<Project> findForAUser(final int userPersistanceId) {
		return this.projectMapper.findForAUser(userPersistanceId);
	}
    
}
