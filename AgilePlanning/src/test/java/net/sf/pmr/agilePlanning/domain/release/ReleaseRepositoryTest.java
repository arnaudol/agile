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
import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.release.ReleaseImpl;
import net.sf.pmr.agilePlanning.domain.release.ReleaseRepository;
import net.sf.pmr.agilePlanning.domain.release.ReleaseRepositoryImpl;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil;
import de.abstrakt.mock.MockCore;

/**
 * @author arnaud.prosts@gmail.com
 *
 */
public class ReleaseRepositoryTest extends TestCase {
    
    
    private MockReleaseMapper mockReleaseMapper;
    
    private MockBasicProjectProxyUtil mockBasicProjectProxyUtil;
    
    private Release release;
    
    private BasicProject basicProject = new BasicProjectImpl();
    
    private ReleaseRepository releaseRepository;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        mockReleaseMapper = new MockReleaseMapper();
        
        mockBasicProjectProxyUtil = new MockBasicProjectProxyUtil();
        
        release = new ReleaseImpl();
        
        basicProject = new BasicProjectImpl();
        
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

        release.setBasicProject(basicProject);
        
        BasicProject basicProjectTarget = new BasicProjectImpl();
        
        mockBasicProjectProxyUtil.expectGetTarget(basicProject, basicProjectTarget);
        
        mockReleaseMapper.expectAddOrUpdate(release);
        
        // add or update iteration
        releaseRepository.addOrUpdate(release);

         MockCore.verify();
        
        // check the the basic poject is replaced by the target
        assertSame(release.getBasicProject(), basicProjectTarget);
    
    }
    
    /**
     * BasicProject est un proxy à cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour suppression en base, il faut récupérer la target du proxy
     */
    public void testdelete() {

        release.setBasicProject(basicProject);
        
        BasicProject basicProjectTarget = new BasicProjectImpl();
        
        mockBasicProjectProxyUtil.expectGetTarget(basicProject, basicProjectTarget);
        
        mockReleaseMapper.expectDelete(release);
        
        // add or update iteration
        releaseRepository.delete(release);

         MockCore.verify();
        
        // check the the basic poject is replaced by the target
        assertSame(release.getBasicProject(), basicProjectTarget);
    
    }

    
    /**
     * Test que la repository renvoit un Basic Project "Advised"
     */
    public void testFindByProjectPersistanceId() {
        
       Set set = new HashSet();
       
       Release release1 = new ReleaseImpl();
       BasicProject basicProject1 = new BasicProjectImpl();
       release1.setBasicProject(basicProject1);
       release1.setNumber("1");

       Release release2 = new ReleaseImpl();
       BasicProject basicProject2 = new BasicProjectImpl();
       release2.setBasicProject(basicProject2);
       release2.setNumber("2");
       
       set.add(release1);
       set.add(release2);
       
       mockReleaseMapper.expectFindByProjectPersistanceId(1, set);
       
       BasicProject basicProjectToReturn1 = new BasicProjectImpl();
       BasicProject basicProjectToReturn2 = new BasicProjectImpl();

       MockCore.startBlock();
       
       mockBasicProjectProxyUtil.expectInjectDependencies(basicProject2, basicProjectToReturn2);
       mockBasicProjectProxyUtil.expectInjectDependencies(basicProject1, basicProjectToReturn1);
       
       MockCore.endBlock();
       
       releaseRepository.findByProjectPersistanceId(1);
       
       MockCore.verify();
       
       assertSame(release1.getBasicProject(), basicProjectToReturn1);
       assertSame(release2.getBasicProject(), basicProjectToReturn2);
       
       
    }
    /**
     * Test que la repository renvoit un Basic Project "Advised"
     */
    public void testFindByPersistanceId() {

        Release release = new ReleaseImpl();
        BasicProject basicProject = new BasicProjectImpl();
        release.setBasicProject(basicProject);
        
        BasicProject basicProjectToReturn = new BasicProjectImpl();
        
        mockReleaseMapper.expectFindById(1, release);
        
        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject, basicProjectToReturn);
        
        releaseRepository.findByPersistanceId(1);
        
        MockCore.verify();
        
        assertSame(release.getBasicProject(), basicProjectToReturn);
        
    }
    
}
