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
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil;
import de.abstrakt.mock.MockCore;

/**
 * @author arnaud.prost@gmail.com
 */
public class IterationRepositoryTest extends TestCase {

    // MockMapper
    private MockIterationMapper mockIterationMapper;

    private MockBasicProjectProxyUtil mockBasicProjectProxyUtil;
    
    private Iteration iteration;
    
    private BasicProject basicProject;
    
    private IterationRepository iterationRepository;
    

    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        mockIterationMapper = new MockIterationMapper();
        
        mockBasicProjectProxyUtil = new MockBasicProjectProxyUtil();
        
        iteration = new IterationImpl();
        
        basicProject = new BasicProjectImpl();
        
        // create iterationRepository
        iterationRepository = new IterationRepositoryImpl(mockIterationMapper, mockBasicProjectProxyUtil);
        
        MockCore.reset();
       

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * test que le repository est bien un singleton.
     */
    public void testIsASingleton() {
        
        assertTrue("singleton", AgilePlanningObjectFactory.isSingleton("iterationRepository"));
        
    }

    /**
     * BasicProject est un proxy à cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour ajout en base.
     */
    public void testAddOrUpdate() {

        iteration.setBasicProject(basicProject);
        
        BasicProject basicProjectTarget = new BasicProjectImpl();
        
        mockBasicProjectProxyUtil.expectGetTarget(basicProject, basicProjectTarget);
        
        mockIterationMapper.expectAddOrUpdate(iteration);
        
        // add or update iteration
        iterationRepository.addOrUpdate(iteration);

         MockCore.verify();
        
        // check the the basic poject is replaced by the target
        assertSame(iteration.getBasicProject(), basicProjectTarget);
    
    }
    
    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByProjectPersistanceId() {
        
       Set<Iteration> set = new HashSet<Iteration>();
       
       Iteration iteration1 = new IterationImpl();
       BasicProject basicProject1 = new BasicProjectImpl();
       iteration1.setBasicProject(basicProject1);
       iteration1.setStartDate(new Date());

       Iteration iteration2 = new IterationImpl();
       BasicProject basicProject2 = new BasicProjectImpl();
       iteration2.setBasicProject(basicProject2);
       iteration2.setStartDate(new Date());
       iteration2.setEndDate(new Date());
       
       set.add(iteration1);
       set.add(iteration2);
       
       mockIterationMapper.expectFindByProjectPersistanceId(1, set);
       
       BasicProject basicProjectToReturn = new BasicProjectImpl();

       MockCore.startBlock();
       
       mockBasicProjectProxyUtil.expectInjectDependencies(basicProject2, basicProjectToReturn);
       mockBasicProjectProxyUtil.expectInjectDependencies(basicProject1, basicProjectToReturn);
       
       MockCore.endBlock();
       
       iterationRepository.findByProjectPersistanceId(1);
       
       MockCore.verify();
       
       assertSame(iteration1.getBasicProject(), basicProjectToReturn);
       assertSame(iteration2.getBasicProject(), basicProjectToReturn);
       
    }

    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByPersistanceId() {

        Iteration iteration = new IterationImpl();
        BasicProject basicProject = new BasicProjectImpl();
        iteration.setBasicProject(basicProject);
        
        BasicProject basicProjectToReturn = new BasicProjectImpl();
        
        mockIterationMapper.expectFindById(1, iteration);
        
        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject, basicProjectToReturn);
        
        iterationRepository.findByPersistanceId(1);
        
        MockCore.verify();
        
        assertSame(iteration.getBasicProject(), basicProjectToReturn);
        
    }
    
    /**
     * test la recherche d'une iteration par projet et par date quand tout est ok.
     */
    public void testFindByProjectPersistanceIdAndByDate() {
        
        Iteration iteration = new IterationImpl();
        BasicProject basicProject = new BasicProjectImpl();
        iteration.setBasicProject(basicProject);
        
        BasicProject basicProjectToReturn = new BasicProjectImpl();
        
        Date date = new Date();
        
        mockIterationMapper.expectFindByProjectPersistanceIdAndByDate(1, date, iteration);
        
        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject, basicProjectToReturn);
        
        iterationRepository.findByProjectPersistanceIdAndByDate(1, date);
        
        MockCore.verify();
        
        assertSame(iteration.getBasicProject(), basicProjectToReturn); 
        
    }
    
    
    /**
     * test la recherche d'une iteration par projet et par date quand l'iteration n'est pas trouvée.
     * l'iteration renvoyée par le mapper est null. corrige un bug qui provoque une nullPointerException.
     * ne doit pas passer par le proxyUtil.
     */
    public void testFindByProjectPersistanceIdAndByDateWhenIterationIsNotFound() {
        
        Iteration iteration = null;
        
        Date date = new Date();
        
        mockIterationMapper.expectFindByProjectPersistanceIdAndByDate(1, date, iteration);
                
        iterationRepository.findByProjectPersistanceIdAndByDate(1, date);
        
        MockCore.verify();
        
        assertNull(iteration); 
        
    }

    
}
