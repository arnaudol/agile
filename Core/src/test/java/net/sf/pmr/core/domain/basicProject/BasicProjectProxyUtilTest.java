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

package net.sf.pmr.core.domain.basicProject;

import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.project.ProjectProxyUtil;
import net.sf.pmr.core.domain.project.ProjectProxyUtilImpl;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.SingletonTargetSource;

public class BasicProjectProxyUtilTest extends TestCase {

    private ProjectProxyUtil basicProjectProxyUtil;

    protected void setUp() throws Exception {
        super.setUp();

        basicProjectProxyUtil = new ProjectProxyUtilImpl();

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test que le getTarget renvoit bien la target du proxy 
     * quand on envoit un proxy
     */
    public void testGetTargetWithAnAdvised() {

        Project basicProject = CoreObjectFactory.getBasicProject();

        Project basicProjectTargetReturned = basicProjectProxyUtil
                .getTarget(basicProject);

        // Project est un proxy, il faut r�cup�rer la target
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();
        Object target = ((SingletonTargetSource) targetSource).getTarget();

        assertEquals(basicProjectTargetReturned, target);

    }

    /**
     * Test que le getTarget renvoit bien l'objet envoyé 
     * quand celui-ci n'est pas un proxy
     */
    public void testGetTargetWithoutAnAdvised() {

        Project basicProject1 = new ProjectImpl();

        Project basicProject2 = basicProjectProxyUtil.getTarget(basicProject1);

        assertSame(basicProject1, basicProject2);

    }

    /**
     * Test que l'inject dependencies renvoit bien un proxy
     * quand on lui passe un object
     */
    public void testInjectDependenciesWithoutAnAdvised() {

        Project basicProject = new ProjectImpl();

        Project basicProjectProxyReturned = basicProjectProxyUtil
                .injectDependencies(basicProject);

        assertTrue(basicProjectProxyReturned instanceof Advised);

    }

    /**
     * Test que l'inject dependencies renvoit bien l'object envoyé.
     * si celui-ci est déjé advised
     */
    public void testInjectDependenciesWithAnAdvised() {

        Project basicProject1 = CoreObjectFactory.getBasicProject();

        Project basicProject2 = basicProjectProxyUtil.injectDependencies(basicProject1);

        assertSame(basicProject1, basicProject2);

    }

    /**
     * test if object is a singleton.
     */
    public final void testSingleton() {

        assertTrue("singleton", CoreObjectFactory
                .isSingleton("projectProxyUtil"));

    }

}