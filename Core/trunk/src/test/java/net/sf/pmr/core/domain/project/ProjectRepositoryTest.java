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

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.data.project.ProjectMapper;

import org.easymock.EasyMock;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.SingletonTargetSource;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ProjectRepositoryTest extends TestCase {

    private ProjectMapper mockBasicProjectMapper;
    
    private ProjectProxyUtil mockBasicProjectProxyUtil;
    
    private ProjectRepository basicProjectRepository;
    
    private Project basicProject;
    
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // mock
        mockBasicProjectMapper = EasyMock.createMock(ProjectMapper.class);
        mockBasicProjectProxyUtil = EasyMock.createMock(ProjectProxyUtil.class);
        
        // instanciation de la repository
        basicProjectRepository = new ProjectRepositoryImpl(mockBasicProjectMapper, mockBasicProjectProxyUtil);
        
        // instanciation d'un basicProject (un proxy)
        basicProject = CoreObjectFactory.getProject();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
    	
    	EasyMock.reset(mockBasicProjectMapper);
    	EasyMock.reset(mockBasicProjectProxyUtil);
    	
        super.tearDown();
    }

    /**
     * test que le repository est un singleton (c'est une classe de service)
     */
    public void testIsRepositoryASingleton() {
        
        assertTrue(CoreObjectFactory.isSingleton("projectRepository"));
    }
    
    /**
     * Project est un proxy à cause du lazy load fait par
     * AOP pour la methode getMembers
     * Avant d'envoyer l'object au mapper pour ajout en base, 
     * il faut récupérer la target du proxy 
     */
    public void testRepositorySendTargetedObjectToTheMapperWhenAddingOrUpdating() {
        
        // récupération de l'object target du proxy
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
        Object target = ((SingletonTargetSource) targetSource).getTarget();
        Project basicProjectTarget = (Project) target;
        
        expect(mockBasicProjectProxyUtil.getTarget(basicProject)).andReturn(basicProjectTarget);
        mockBasicProjectMapper.addOrUpdate(basicProjectTarget);
        
        replay(mockBasicProjectProxyUtil);
        
        basicProjectRepository.addOrUpdate(basicProject);

        EasyMock.verify(mockBasicProjectProxyUtil);
        
    }
    
    public void testRepositorySendProxyToTheServiceWhenFindAll(){
       
        Project basicProject1 = new ProjectImpl();
        Project basicProject2 = new ProjectImpl();
        
        List<Project> listToReturn = new ArrayList<Project>();
        listToReturn.add(basicProject1);
        listToReturn.add(basicProject2);
        
        EasyMock.expect(mockBasicProjectMapper.findAll()).andReturn(listToReturn);
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject1)).andReturn(new ProjectImpl());
        EasyMock.expect(mockBasicProjectProxyUtil.injectDependencies(basicProject1)).andReturn(new ProjectImpl());

        replay(mockBasicProjectMapper);
        replay(mockBasicProjectProxyUtil);
                
        basicProjectRepository.findAll();
        
        EasyMock.verify(mockBasicProjectMapper);
        EasyMock.verify(mockBasicProjectProxyUtil);
        
    }
    
    public void testRepositorySendProxyToTheServiceWhenFindByPersistanceId(){
        
        Project basicProject = new ProjectImpl();
        
        Project basicProjectTarget =  new ProjectImpl();
        
        expect(mockBasicProjectMapper.findById(1)).andReturn(basicProjectTarget);
        expect(mockBasicProjectProxyUtil.injectDependencies(basicProject)).andReturn(basicProjectTarget);
        
        replay(mockBasicProjectMapper);
        replay(mockBasicProjectProxyUtil);
        
        basicProjectRepository.findByPersistanceId(1);
        
        EasyMock.verify(mockBasicProjectMapper);
        EasyMock.verify(mockBasicProjectProxyUtil);
        
    }
    
}