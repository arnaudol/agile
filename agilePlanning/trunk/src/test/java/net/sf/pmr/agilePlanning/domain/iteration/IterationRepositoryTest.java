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
import net.sf.pmr.agilePlanning.data.iteration.IterationMapper;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.project.ProjectProxyUtil;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;

/**
 * @author arnaud.prost@gmail.com
 */
public class IterationRepositoryTest extends TestCase {

    // MockMapper
    private IterationMapper mockIterationMapper;

    private ProjectProxyUtil mockBasicProjectProxyUtil;
    
    private Iteration iteration;
    
    private Project project;
    
    private IterationRepository iterationRepository;
    
    private IMocksControl mocksControl;
    

    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // create mocks
        mocksControl = EasyMock.createStrictControl();
        
        mockIterationMapper = mocksControl.createMock(IterationMapper.class);
        
        mockBasicProjectProxyUtil = mocksControl.createMock(ProjectProxyUtil.class);

        iteration = new IterationImpl();
        
        project = new ProjectImpl();
        
        // create iterationRepository
        iterationRepository = new IterationRepositoryImpl(mockIterationMapper, mockBasicProjectProxyUtil);
        

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
    	
    	mocksControl.reset();
    	
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
    	
        iteration.setProject(project);
        Project basicProjectTarget = new ProjectImpl();
        
        // set expectations
        EasyMock.expect(mockBasicProjectProxyUtil.getTarget(project)).andReturn(basicProjectTarget);
        mockIterationMapper.addOrUpdate(iteration);
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        // add or update iteration
        iterationRepository.addOrUpdate(iteration);
        
        // verify calls
        mocksControl.verify();
        
        // check the the basic poject is replaced by the target
        assertSame(iteration.getProject(), basicProjectTarget);
        
        
    }
    
    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByProjectPersistanceId() {
        
       Set<Iteration> set = new HashSet<Iteration>();
       
       Iteration iteration1 = new IterationImpl();
       Project basicProject1 = new ProjectImpl();
       iteration1.setProject(basicProject1);
       iteration1.setStart(new Date());

       Iteration iteration2 = new IterationImpl();
       Project basicProject2 = new ProjectImpl();
       iteration2.setProject(basicProject2);
       iteration2.setStart(new Date());
       iteration2.setEnd(new Date());
       
       set.add(iteration1);
       set.add(iteration2);
       
       // set expectation
       EasyMock.expect(mockIterationMapper.findByProjectPersistanceId(1)).andReturn(set);
       
       Project basicProjectToReturn = new ProjectImpl();

       EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject2)).andReturn(basicProjectToReturn);
       EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject1)).andReturn(basicProjectToReturn);
       // check order
       mocksControl.checkOrder(true);
       
       // set mock in replay mode
       mocksControl.replay();
       
       // test
       iterationRepository.findByProjectPersistanceId(1);
       
       // verify mock calls
       mocksControl.verify();
       
       assertSame(iteration1.getProject(), basicProjectToReturn);
       assertSame(iteration2.getProject(), basicProjectToReturn);
       
    }

    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByPersistanceId() {

        Iteration iteration = new IterationImpl();
        Project basicProject = new ProjectImpl();
        iteration.setProject(basicProject);
        
        Project basicProjectToReturn = new ProjectImpl();
        
        // set expectation
        EasyMock.expect(mockIterationMapper.findById(1)).andReturn(iteration);
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject)).andReturn(basicProjectToReturn);
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        iterationRepository.findByPersistanceId(1);
        
        // verify mock calls
        mocksControl.verify();
        
        assertSame(iteration.getProject(), basicProjectToReturn);
        
    }
    
    /**
     * test la recherche d'une iteration par projet et par date quand tout est ok.
     */
    public void testFindByProjectPersistanceIdAndByDate() {
        
        Iteration iteration = new IterationImpl();
        Project basicProject = new ProjectImpl();
        iteration.setProject(basicProject);
        
        Project basicProjectToReturn = new ProjectImpl();
        
        Date date = new Date();
        
        EasyMock.expect(mockIterationMapper.findByProjectPersistanceIdAndByDate(1, date)).andReturn(iteration);
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject)).andReturn(basicProjectToReturn);
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        iterationRepository.findByProjectPersistanceIdAndByDate(1, date);
        
        // verify mock calls
        mocksControl.verify();
        
        assertSame(iteration.getProject(), basicProjectToReturn); 
        
    }
    
    
    /**
     * test la recherche d'une iteration par projet et par date quand l'iteration n'est pas trouvée.
     * l'iteration renvoyée par le mapper est null. corrige un bug qui provoque une nullPointerException.
     * ne doit pas passer par le proxyUtil.
     */
    public void testFindByProjectPersistanceIdAndByDateWhenIterationIsNotFound() {
        
        Iteration iteration = null;
        
        Date date = new Date();
        
        EasyMock.expect(mockIterationMapper.findByProjectPersistanceIdAndByDate(1, date)).andReturn(iteration);
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
                
        iterationRepository.findByProjectPersistanceIdAndByDate(1, date);
        
        // verify mock calls
        mocksControl.verify();
        
        assertNull(iteration); 
        
    }

    
}
