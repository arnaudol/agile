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
import net.sf.pmr.agilePlanning.data.story.MockStoryMapper;
import net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper;
import net.sf.pmr.agilePlanning.data.story.task.charge.MockChargeMapper;
import net.sf.pmr.core.domain.project.MockProjectProxyUtil;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import de.abstrakt.mock.MockCore;

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

    private MockStoryMapper mockStoryMapper;
    
    private MockChargeMapper mockChargeMapper;

    private MockProjectProxyUtil mockBasicProjectProxyUtil;

    private Project basicProject;

    private StoryRepository storyRepository;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();

        mockStoryMapper = new MockStoryMapper();
        
        mockChargeMapper = new MockChargeMapper();

        mockBasicProjectProxyUtil = new MockProjectProxyUtil();

        basicProject = new ProjectImpl();

        storyRepository = new StoryRepositoryImpl(mockStoryMapper,
                new MockTaskMapper(),mockChargeMapper,  mockBasicProjectProxyUtil);

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

        assertTrue("singleton", AgilePlanningObjectFactory
                .isSingleton("storyRepository"));

    }

    /**
     * BasicProject est un proxy � cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour ajout en base,
     */
    public void testAddOrUpdate() {

        story1.setProject(basicProject);

        Project basicProjectTarget = new ProjectImpl();

        mockBasicProjectProxyUtil.expectGetTarget(basicProject,
                basicProjectTarget);

        mockStoryMapper.expectAddOrUpdate(story1);

        // add or update iteration
        storyRepository.addOrUpdate(story1);

        MockCore.verify();

        // check the the basic poject is replaced by the target
        assertSame(story1.getProject(), basicProjectTarget);

    }

    /**
     * BasicProject est un proxy à  cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour suppression en base,
     */
    public void testDelete() {

        story1.setProject(basicProject);

        Project basicProjectTarget = new ProjectImpl();

        mockBasicProjectProxyUtil.expectGetTarget(basicProject,
                basicProjectTarget);

        mockStoryMapper.expectDelete(story1);

        // delete the story
        storyRepository.delete(story1);

        MockCore.verify();

        // check the the basic poject is replaced by the target
        assertSame(story1.getProject(), basicProjectTarget);

    }

    
    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByProjectPersistanceId() {

        mockStoryMapper.expectFindByProjectPersistanceId(1, setOfStories);

        Project basicProjectToReturn1 = new ProjectImpl();
        Project basicProjectToReturn2 = new ProjectImpl();

        MockCore.startBlock();

        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject1,
                basicProjectToReturn1);
        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject2,
                basicProjectToReturn2);


        MockCore.endBlock();

        storyRepository.findByProjectPersistanceId(1);

        MockCore.verify();

        assertSame(story1.getProject(), basicProjectToReturn1);
        assertSame(story2.getProject(), basicProjectToReturn2);

    }

    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByReleasePersistanceId() {

        mockStoryMapper.expectFindByReleasePersistanceId(1, setOfStories);

        Project basicProjectToReturn1 = new ProjectImpl();
        Project basicProjectToReturn2 = new ProjectImpl();

        MockCore.startBlock();

        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject1,
                basicProjectToReturn1);
        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject2,
                basicProjectToReturn2);


        MockCore.endBlock();

        storyRepository.findByReleasePersistanceId(1);

        MockCore.verify();

        assertSame(story1.getProject(), basicProjectToReturn1);
        assertSame(story2.getProject(), basicProjectToReturn2);

    }

    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByIterationPersistanceId() {

        mockStoryMapper.expectFindByIterationPersistanceId(1, setOfStories);

        Project basicProjectToReturn1 = new ProjectImpl();
        Project basicProjectToReturn2 = new ProjectImpl();

        MockCore.startBlock();

        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject1,
                basicProjectToReturn1);
        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject2,
                basicProjectToReturn2);


        MockCore.endBlock();

        storyRepository.findByIterationPersistanceId(1);

        MockCore.verify();

        assertSame(story1.getProject(), basicProjectToReturn1);
        assertSame(story2.getProject(), basicProjectToReturn2);

    }

    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByPersistanceId() {

        story1.setProject(basicProject);

        Project basicProjectToReturn = new ProjectImpl();

        mockStoryMapper.expectFindById(1, story1);

        mockBasicProjectProxyUtil.expectInjectDependencies(basicProject,
                basicProjectToReturn);

        storyRepository.findByPersistanceId(1);

        MockCore.verify();

        assertSame(story1.getProject(), basicProjectToReturn);

    }
    
    /**
     * Test quand la story n'est pas trouvée, il ne doit pas 
     * avoir de crash quand on inject la dépendance manuellement
     */
    public void testFindByPersistanceIdWhenStoryIsNotFound() {
 
        mockStoryMapper.expectFindById(1, null);

        Story story = storyRepository.findByPersistanceId(1);

        assertNull(story);

        
    }


}