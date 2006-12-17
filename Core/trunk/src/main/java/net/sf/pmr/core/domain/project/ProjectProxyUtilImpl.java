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

import net.sf.pmr.core.CoreObjectFactory;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.beans.BeanUtils;

/**
 * @author arnaud.prost@gmail.com
 *
 * Utility class allowing to get the proxy for the basicProject or to get the target for the proxy.
 */
public class ProjectProxyUtilImpl implements ProjectProxyUtil {

    /**
     * @see net.sf.pmr.core.domain.project.ProjectProxyUtil#getTarget(java.lang.Object)
     */
    public Project getTarget(Project project) {

        if (project instanceof Advised) {

            // Project est un proxy, il faut récupérer la target
            TargetSource targetSource = ((Advised) project)
                    .getTargetSource();
            Object target = ((SingletonTargetSource) targetSource).getTarget();

            // retour de la target
            return (Project) target;

        } else {

        	// sinon on renvoit le projet tel qu'il est
        	return project;

        }

    }

    /**
     * @see net.sf.pmr.core.domain.project.ProjectProxyUtil#injectDependencies(net.sf.pmr.core.domain.project.Project)
     */
    public Project injectDependencies(final Project project) {


    	// si le projet est déjà advised...
        if ( project instanceof Advised) {

            return project;

        // sinon...
        } else {

            Project projectFromFactory = CoreObjectFactory
                    .getProject();

            BeanUtils.copyProperties(project, projectFromFactory);

            return projectFromFactory;

        }


    }

}
