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

import net.sf.pmr.agilePlanning.data.iteration.IterationMapper;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectProxyUtil;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 * 
 * Iteration repositoy
 */
public class IterationRepositoryImpl implements IterationRepository {

    /**
     * Iteration mapper
     */
    private IterationMapper iterationMapper;

    /**
     * BasicProjectProxyUtil
     */
    private BasicProjectProxyUtil basicProjectProxyUtil;

    /**
     * @param iterationMapper
     */
    public IterationRepositoryImpl(final IterationMapper iterationMapper,
            final BasicProjectProxyUtil basicProjectProxyUtil) {
        super();
        this.iterationMapper = iterationMapper;
        this.basicProjectProxyUtil = basicProjectProxyUtil;
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.iteration.IterationRepository#findByPersistanceId(int)
     */
    public Iteration findByPersistanceId(final int persistanceId) {

        Iteration iteration = (Iteration) iterationMapper
                .findById(persistanceId);

        iteration.setBasicProject(basicProjectProxyUtil
                .injectDependencies(iteration.getBasicProject()));

        return iteration;

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.iteration.IterationRepository#addOrUpdate(net.sf.pmr.agilePlanning.domain.iteration.Iteration)
     */
    public void addOrUpdate(final Iteration iteration) {

        BasicProject basicProjectTarget = (basicProjectProxyUtil
                .getTarget(iteration.getBasicProject()));
        iteration.setBasicProject(basicProjectTarget);

        iterationMapper.addOrUpdate(iteration);
    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.iteration.IterationRepository#findByProjectPersistanceId(int)
     */
    public Set findByProjectPersistanceId(final int projetPersistanceId) {
    	
        Set<Iteration> set = iterationMapper.findByProjectPersistanceId(projetPersistanceId);
        
        for (Iteration iteration : set) {
            
            iteration.setBasicProject(basicProjectProxyUtil
                    .injectDependencies(iteration.getBasicProject()));
        	
		} 
        

        return set;

    }

    /**
     * @see net.sf.pmr.agilePlanning.domain.iteration.IterationRepository#findByProjectPersistanceIdAndByDate(int,
     *      java.util.Date)
     */
    public Iteration findByProjectPersistanceIdAndByDate(
            final int projetPersistanceId, final Date date) {
    	
        Iteration iteration = iterationMapper
                .findByProjectPersistanceIdAndByDate(projetPersistanceId, date);

        if (iteration != null) {

            iteration.setBasicProject(basicProjectProxyUtil
                    .injectDependencies(iteration.getBasicProject()));

        }
        

        return iteration;
    }
}
