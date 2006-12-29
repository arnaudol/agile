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
package net.sf.pmr.agilePlanning.domain.story;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.data.story.StoryMapper;
import net.sf.pmr.agilePlanning.data.story.task.TaskMapper;
import net.sf.pmr.agilePlanning.data.story.task.charge.ChargeMapper;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.project.ProjectProxyUtil;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;

/**
 * Définition :
 * 
 * @author a.prost
 * 
 */
public class StoryRepositoryTest extends TestCase {

    private Story story1;

    private Project basicProject1;

    private Story story2;

    private Project basicProject2;

    private Set<Story> setOfStories;

    private StoryMapper mockStoryMapper;
    
    private ChargeMapper mockChargeMapper;

    private ProjectProxyUtil mockBasicProjectProxyUtil;

    private Project basicProject;

    private StoryRepository storyRepository;
    
    private IMocksControl mocksControl;


    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();

        // create mocks
        mocksControl = EasyMock.createStrictControl();

        mockStoryMapper = mocksControl.createMock(StoryMapper.class);
        mockChargeMapper = mocksControl.createMock(ChargeMapper.class);
        mockBasicProjectProxyUtil = mocksControl.createMock(ProjectProxyUtil.class);
        TaskMapper mockTaskMapper = mocksControl.createMock(TaskMapper.class);
        
        basicProject = new ProjectImpl();

        storyRepository = new StoryRepositoryImpl(mockStoryMapper,
                mockTaskMapper,mockChargeMapper,  mockBasicProjectProxyUtil);

        story1 = new StoryImpl();
        basicProject1 = new ProjectImpl();
        story1.setProject(basicProject1);
        story1.setShortDescription("1");

        story2 = new StoryImpl();
        basicProject2 = new ProjectImpl();
        story2.setProject(basicProject2);
        story2.setShortDescription("2");

        setOfStories = new HashSet<Story>();
        setOfStories.add(story1);
        setOfStories.add(story2);

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
    	
    	mocksControl.reset();
    	
        super.tearDown();
    }

    /**
     * test que le repository est bien un singleton
     */
    public void testIsASingleton() {

        assertTrue("singleton", AgilePlanningObjectFactory
                .isSingleton("storyRepository"));

    }

    /**
     * BasicProject est un proxy à cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour ajout en base,
     */
    public void testAddOrUpdate() {

        story1.setProject(basicProject);

        Project basicProjectTarget = new ProjectImpl();

        EasyMock.expect(mockBasicProjectProxyUtil.getTarget(basicProject)).andReturn(basicProjectTarget);
        mockStoryMapper.addOrUpdate(story1);
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();

        // add or update iteration
        storyRepository.addOrUpdate(story1);

        // check the the basic poject is replaced by the target
        assertSame(story1.getProject(), basicProjectTarget);
        
        mocksControl.verify();

    }

    /**
     * BasicProject est un proxy à  cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour suppression en base,
     */
    public void testDelete() {

        story1.setProject(basicProject);

        Project basicProjectTarget = new ProjectImpl();

        EasyMock.expect(mockBasicProjectProxyUtil.getTarget(basicProject)).andReturn(basicProjectTarget);
        mockStoryMapper.delete(story1);
        // check order
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        // delete the story
        storyRepository.delete(story1);

        // check the the basic poject is replaced by the target
        assertSame(story1.getProject(), basicProjectTarget);
        
        mocksControl.verify();

    }

    
    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByProjectPersistanceId() {
    	
    	EasyMock.expect(mockStoryMapper.findByProjectPersistanceId(1)).andReturn(setOfStories);

        Project basicProjectToReturn1 = new ProjectImpl();
        Project basicProjectToReturn2 = new ProjectImpl();

        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject1)).andReturn(basicProjectToReturn1);
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject2)).andReturn(basicProjectToReturn2);
        
        // set mock in replay mode
        mocksControl.replay();

        storyRepository.findByProjectPersistanceId(1);

        assertSame(story1.getProject(), basicProjectToReturn1);
        assertSame(story2.getProject(), basicProjectToReturn2);
        
       mocksControl.verify();

    }

    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByReleasePersistanceId() {

    	EasyMock.expect(mockStoryMapper.findByReleasePersistanceId(1)).andReturn(setOfStories);
    	
        Project basicProjectToReturn1 = new ProjectImpl();
        Project basicProjectToReturn2 = new ProjectImpl();

//        EasyMock.expect(mockBasicProjectProxyUtil.getTarget(basicProject1)).andReturn(basicProjectToReturn1);
//        EasyMock.expect(mockBasicProjectProxyUtil.getTarget(basicProject2)).andReturn(basicProjectToReturn2);
        
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject1)).andReturn(basicProjectToReturn1);
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject2)).andReturn(basicProjectToReturn2);

        
        // set mock in replay mode
        mocksControl.replay();

        storyRepository.findByReleasePersistanceId(1);

        assertSame(story1.getProject(), basicProjectToReturn1);
        assertSame(story2.getProject(), basicProjectToReturn2);
        
        mocksControl.verify();

    }

    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByIterationPersistanceId() {

    	EasyMock.expect(mockStoryMapper.findByIterationPersistanceId(1)).andReturn(setOfStories);

        Project basicProjectToReturn1 = new ProjectImpl();
        Project basicProjectToReturn2 = new ProjectImpl();
        
//        EasyMock.expect(mockBasicProjectProxyUtil.getTarget(basicProject1)).andReturn(basicProjectToReturn1);
//        EasyMock.expect(mockBasicProjectProxyUtil.getTarget(basicProject2)).andReturn(basicProjectToReturn2);

        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject1)).andReturn(basicProjectToReturn1);
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject2)).andReturn(basicProjectToReturn2);

        
        // set mock in replay mode
        mocksControl.replay();

        storyRepository.findByIterationPersistanceId(1);

        assertSame(story1.getProject(), basicProjectToReturn1);
        assertSame(story2.getProject(), basicProjectToReturn2);
        
        mocksControl.verify();

    }

    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByPersistanceId() {

        story1.setProject(basicProject);

        Project basicProjectToReturn = new ProjectImpl();

        EasyMock.expect(mockStoryMapper.findById(1)).andReturn(story1);
        //EasyMock.expect(mockBasicProjectProxyUtil.getTarget(basicProject)).andReturn(basicProjectToReturn);
        
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject)).andReturn(basicProjectToReturn);
        
        // set mock in replay mode
        mocksControl.replay();
        
        storyRepository.findByPersistanceId(1);

        assertSame(story1.getProject(), basicProjectToReturn);
        
        mocksControl.verify();

    }
    
    /**
     * Test quand la story n'est pas trouvée, il ne doit pas 
     * avoir de crash quand on inject la dépendance manuellement
     */
    public void testFindByPersistanceIdWhenStoryIsNotFound() {
 
    	EasyMock.expect(mockStoryMapper.findById(1)).andReturn(null);
        // don't check order
        mocksControl.checkOrder(false);
        
        // set mock in replay mode
        mocksControl.replay();
    	
        Story story = storyRepository.findByPersistanceId(1);

        assertNull(story);

        
    }


}