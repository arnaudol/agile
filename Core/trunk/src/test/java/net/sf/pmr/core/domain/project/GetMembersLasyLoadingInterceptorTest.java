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

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.reset;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.data.user.UserMapper;
import net.sf.pmr.core.domain.user.UserImpl;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.SingletonTargetSource;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class GetMembersLasyLoadingInterceptorTest extends TestCase {

    private Project basicProject;

    private DomainCollectionLasyLoadingInterceptor domainCollectionLasyLoadingInterceptor;

    private UserMapper mockUserMapper;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // Project
        basicProject = CoreObjectFactory.getProject();

        // interceptor
        domainCollectionLasyLoadingInterceptor = CoreObjectFactory.getMembersLasyLoadingAdvice();

        // mock the mapper
        mockUserMapper = createMock(UserMapper.class);
        
        domainCollectionLasyLoadingInterceptor.setDomainListMapper(mockUserMapper);
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
    	
    	reset(mockUserMapper);
    	
        super.tearDown();
     
    }

    /**
     * test le bon fonctionnement du lazy loading
     * quand la liste des membres est null :
     * <ul>
     * <li>le lazy loading doit se déclencher</li>
     * <li>Une nouvelle liste doit être retournée</li>
     * <li>Cette nouvelle liste doit être stockée dans le l'object "targetté"</li>
     * </ul>
     */
    public void testLasyLoadingWhenCollectionOfMemberIsNull() {

        basicProject.setMembers(null);

        Set set = new HashSet();

        //expect(mockUserMapper.findCollectionForObject(EasyMock.same(basicProject))).andReturn(set);
        
        expect(mockUserMapper.findCollectionForObject(basicProject)).andReturn(set);
        
        replay(mockUserMapper);
        
        // Test le retour de la liste
        assertEquals(set, basicProject.getMembers());
        
        // test que la liste est bien stock�e dans l'object targett�
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
        Object target = ((SingletonTargetSource) targetSource).getTarget();
        Project basicProjectTarget = (Project) target;
        
        assertEquals(set, basicProjectTarget.getMembers());

        //verify(mockUserMapper);

    }
    
    /**
     * test le lazy loading quand la liste des membres est vite
     * (size = 0)
     * Le Lazy loading ne doit pas se déclancher
     */
    public void testLasyLoadingWhenCollectionMemberIsEmpty() {

        Set set = new HashSet();
        Set set2 = new HashSet();

        expect(mockUserMapper.findCollectionForObject(basicProject)).andReturn(set);

        basicProject.setMembers(set2);

        // Test le retour de la liste
        assertEquals(set2, basicProject.getMembers());
        
        // test que la liste est bien stock�e dans l'object targett�
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
        Object target = ((SingletonTargetSource) targetSource).getTarget();
        Project basicProjectTarget = (Project) target;
        
        assertEquals(set2, basicProjectTarget.getMembers());

    }

    
    /**
     * test le bon fonctionnement du lazy loading quand la liste
     * des membres n'est pas vide (size > 0).
     * Le lazy loading ne doit pas se d�clancher. 
     */
    public void testLasyLoadingWhenCollectionMemberIsNotEmpty() {

        Set set = new HashSet();
        Set set2 = new HashSet();
        set2.add(new UserImpl());

        expect(mockUserMapper.findCollectionForObject(basicProject)).andReturn(set);


        basicProject.setMembers(set2);

        // Test sur la retour de la liste
        assertEquals(set2, basicProject.getMembers());
        
        // test que la liste est bien stock�e dans l'object targett�
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
        Object target = ((SingletonTargetSource) targetSource).getTarget();
        Project basicProjectTarget = (Project) target;
        
        assertEquals(set2, basicProjectTarget.getMembers());

     
    }

}