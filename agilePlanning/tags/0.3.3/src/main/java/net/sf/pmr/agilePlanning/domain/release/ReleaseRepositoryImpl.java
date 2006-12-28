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

package net.sf.pmr.agilePlanning.domain.release;

import java.util.Iterator;
import java.util.Set;

import net.sf.pmr.agilePlanning.data.release.ReleaseMapper;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectProxyUtil;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * release repository
 */
public class ReleaseRepositoryImpl implements ReleaseRepository {

    /**
     * mapper.
     */
    private ReleaseMapper releaseMapper;
    
    /**
     * BasicProjectProxyUtil.
     */
    private ProjectProxyUtil projectProxyUtil;


    /**
     * @param releaseMapper releaseMapper
     */
    public ReleaseRepositoryImpl(final ReleaseMapper releaseMapper, final ProjectProxyUtil projectProxyUtil) {
        super();
        this.releaseMapper = releaseMapper;
        this.projectProxyUtil = projectProxyUtil;
    }

    /*
     * (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.ReleaseRepository#findByPersistanceId(int)
     */
    public Release findByPersistanceId(final int persistanceId) {
        Release release =  (Release) releaseMapper.findById(persistanceId);
        
        release.setProject(projectProxyUtil.injectDependencies(release.getProject()));
        
        return release;

        
        
    }

    /*
     * (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.ReleaseRepository#addOrUpdate(net.sf.pmr.agilePlanning.domain.release.Release)
     */
    public void addOrUpdate(final Release release) {
        
        // Avant de faire l'enregistrement en base, il faut récupérer la target du proxy
        // basicProject
    	this.replaceBasicProjectProxyByTarget(release);
        
        releaseMapper.addOrUpdate(release);
    }
    

    /* (non-Javadoc)
	 * @see net.sf.pmr.agilePlanning.domain.release.ReleaseRepository#delete(net.sf.pmr.agilePlanning.domain.release.Release)
	 */
	public void delete(final Release release) {
		
        // Avant de faire l'enregistrement en base, il faut récupérer la target du proxy
        // basicProject
		this.replaceBasicProjectProxyByTarget(release);
        
        releaseMapper.delete(release);
		
	}

	/*
     * (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.ReleaseRepository#findByProjectPersistanceId(int)
     */
    public Set findByProjectPersistanceId(final int projetPersistanceId) {
        
        Set set = releaseMapper.findByProjectPersistanceId(projetPersistanceId);
        
        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            Release release = (Release) iterator.next();

            release.setProject(projectProxyUtil.injectDependencies(release.getProject()));

        }

        return set;

    }

    /*
     * (non-Javadoc)
     * @see net.sf.pmr.agilePlanning.domain.release.ReleaseRepository#findByIterationPersistanceId(int, int)
     */
	public Release findByIterationPersistanceId(final int basicProjectPersistanceId, final int iterationPersistanceId) {
		return this.releaseMapper.findByIterationPersistanceId(basicProjectPersistanceId, iterationPersistanceId);
	}
	
	/**
	 * Get the target of the basicProject proxy
	 * @param release
	 */
	private void replaceBasicProjectProxyByTarget(final Release release) {

        Project projectTarget = (projectProxyUtil.getTarget(release.getProject()));
        release.setProject(projectTarget);
		
	}
    
}
