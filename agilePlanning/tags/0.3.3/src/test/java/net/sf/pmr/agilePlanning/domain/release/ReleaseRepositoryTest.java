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

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.data.release.MockReleaseMapper;
import net.sf.pmr.core.domain.project.MockProjectProxyUtil;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import de.abstrakt.mock.MockCore;

/**
 * @author arnaud.prosts@gmail.com
 *
 */
public class ReleaseRepositoryTest extends TestCase {
    
    
    private MockReleaseMapper mockReleaseMapper;
    
    private MockProjectProxyUtil mockBasicProjectProxyUtil;
    
    private Release release;
    
    private Project basicProject = new ProjectImpl();
    
    private ReleaseRepository releaseRepository;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        mockReleaseMapper = new MockReleaseMapper();
        
        mockBasicProjectProxyUtil = new MockProjectProxyUtil();
        
        release = new ReleaseImpl();
        
        basicProject = new ProjectImpl();
        
        releaseRepository = new ReleaseRepositoryImpl(mockReleaseMapper, mockBasicProjectProxyUtil);
        
        MockCore.reset();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * test que le repository est bien un singleton
     */
    public void testIsASingleton() {
        
        assertTrue("singleton", AgilePlanningObjectFactory.isSingleton("releaseRepository"));
        
    }


    
    /**
     * BasicProject est un proxy à cause du lazy load fait par AOP pour la
     * methode getMembers. Avant d'envoyer l'object au mapper pour ajout en base il faut récupérer la target du proxy
     */
    public void testAddOrUpdate() {

        release.setProject(basicProject);
        
        Project basicProjectTarget = new ProjectImpl();
        
        mockBasicProjectProxyUtil.expectGetTarget(basicProject, basicProjectTarget);
        
        mockReleaseMapper.expectAddOrUpdate(release);
        
        // add or update iteration
        releaseRepository.addOrUpdate(release);

         MockCore.verify();
        
        // check the the basic poject is replaced by the target
        assertSame(release.getProject(), basicProjectTarget);
    
    }
    
    /**
     * BasicProject est un proxy à cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour suppression en base, il faut récupérer la target du proxy
     */
    public void testdelete() {

        release.setProject(basicProject);
        
        Project basicProjectTarget = new ProjectImpl();
        
        mockBasicProjectProxyUtil.expectGetTarget(basicProject, basicProjectTarget);
        
        mockReleaseMapper.expectDelete(release);
        
        // add or update iteration
        releaseRepository.delete(release);

         MockCore.verify();
        
        // check the the basic poject is replaced by the target
        assertSame(release.getProject(), basicProjectTarget);
    
    }

    
    /**
     * Test que la repository renvoit un Basic Project "Advised"
     */
    public void testFindByProjectPersistanceId() {
        
       Set set = new HashSet();
       
       Release release1 = new ReleaseImpl();
       Project basicProject1 = new ProjectImpl();
       release1.setProject(basicProject1);
       release1.setNumber("1");

       Release release2 = new ReleaseImpl();
       Project basicProject2 = new ProjectImpl();
       release2.setProject(basicProject2);
       release2.setNumber("2");
       
       set.add(release1);
       set.add(release2);
       
       mockReleaseMapper.expectFindByProjectPersistanceId(1, set);
       
       Project basicProjectToReturn1 = new ProjectImpl();
       Project basicProjectToReturn2 = new ProjectImpl();

       MockCore.startBlock();
       
       mockBasicProjectProxyUtil.expectInjectDependencies(basicProject2, basicProjectToReturn2);
       mockBasicProjectProxyUtil.expectInjectDependencies(basicProject1, basicProjectToReturn1);
       
       MockCore.endBlock();
       
       releaseRepository.findByProjectPersistanceId(1);
       
       MockCore.verify();
       
       assertSame(release1.getProject(), basicProjectToReturn1);
       assertSame(release2.getProject(), basicProjectToReturn2);
       
       
    }
    /**
     * Test que la repository renvoit un Basic Project "Advised"
     */
    public void testFindByPersistanceId() {

        Release release = new ReleaseImpl();
        Project basicProject = new ProjectImpl();
        release.setProject(basicProject);
        
        Project basicProjectToReturn = new ProjectImpl();
        
        mockReleaseMapper.expectFindById(1, release);
        
        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject, basicProjectToReturn);
        
        releaseRepository.findByPersistanceId(1);
        
        MockCore.verify();
        
        assertSame(release.getProject(), basicProjectToReturn);
        
    }
    
}
