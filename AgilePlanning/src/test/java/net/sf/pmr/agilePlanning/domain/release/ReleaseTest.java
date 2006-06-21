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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.domain.release.Release;
import net.sf.pmr.agilePlanning.domain.release.ReleaseImpl;
import net.sf.pmr.agilePlanning.domain.story.MockStory;
import net.sf.pmr.agilePlanning.domain.story.Story;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import de.abstrakt.mock.MockCore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ReleaseTest extends TestCase {

    /* (non-javadoc)
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /* (non-javadoc)
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * test qu'il s'agit d'un singleton.
     */
    public void testIsNotASingleton() {
        
        assertFalse(AgilePlanningObjectFactory.isSingleton("release"));
    }

    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>le projet</li>
     * <li>le num�ro (number)</li>
     * </ul>
     * Test avec le même projet et le même numêro
     */
    public void testIsEqualsAndHashcodeWithSameNumberAndSameProject() {
        
        BasicProject basicProject1 = new BasicProjectImpl();
        basicProject1.setCode("001");
        basicProject1.setName("Bound");
        basicProject1.setPersistanceId(5);
        basicProject1.setPersistanceVersion(23);
        
        BasicProject basicProject2 = new BasicProjectImpl();
        basicProject2.setCode("001");
        basicProject2.setName("Bound");
        basicProject2.setPersistanceId(5);
        basicProject2.setPersistanceVersion(23);
        
        
        Release release1 = new ReleaseImpl();
        release1.setNumber("1");
        release1.setDate(new Date());
        release1.setPersistanceId(1);
        release1.setPersistanceVersion(1);
        release1.setBasicProject(basicProject1);
        
        Release release2 = new ReleaseImpl();
        release2.setNumber("1");
        release2.setDate(new Date());
        release2.setPersistanceId(1);
        release2.setPersistanceVersion(1);
        release2.setBasicProject(basicProject2);
        
        // equals
        assertTrue(release1.equals(release2));
        // hashcode
        assertTrue(release1.hashCode() == release2.hashCode());

        
    }
    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>le projet</li>
     * <li>le numéro (number)</li>
     * </ul>
     * Test avec le même projet mais des numéro différents
     */
    public void testIsEqualsAndHashcodeWithDifferentNumberAndSameProject() {
        
        
        BasicProject basicProject1 = new BasicProjectImpl();
        basicProject1.setCode("001");
        basicProject1.setName("Bound");
        basicProject1.setPersistanceId(5);
        basicProject1.setPersistanceVersion(23);
        
        BasicProject basicProject2 = new BasicProjectImpl();
        basicProject2.setCode("001");
        basicProject2.setName("Bound");
        basicProject2.setPersistanceId(5);
        basicProject2.setPersistanceVersion(23);
        
        Release release1 = new ReleaseImpl();
        release1.setNumber("1");
        release1.setDate(new Date());
        release1.setPersistanceId(1);
        release1.setPersistanceVersion(1);
        release1.setBasicProject(basicProject1);
        
        Release release2 = new ReleaseImpl();
        release2.setNumber("2");
        release2.setDate(new Date());
        release2.setPersistanceId(1);
        release2.setPersistanceVersion(1);
        release2.setBasicProject(basicProject2);
        
        // equals
        assertFalse(release1.equals(release2));
        // hashcode
        assertFalse(release1.hashCode() == release2.hashCode());
        
    }

    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>le projet</li>
     * <li>le numéro (number)</li>
     * </ul>
     * Test avec des projets différents et des numéros identiques
     */
    public void testIsEqualsAndHashcodeWithSameNumberAndDifferentProject() {
        
        
        BasicProject basicProject1 = new BasicProjectImpl();
        basicProject1.setCode("001");
        basicProject1.setName("Bound");
        basicProject1.setPersistanceId(5);
        basicProject1.setPersistanceVersion(23);
        
        BasicProject basicProject2 = new BasicProjectImpl();
        basicProject2.setCode("Scooby");
        basicProject2.setName("Doo");
        basicProject2.setPersistanceId(10);
        basicProject2.setPersistanceVersion(3);
        
        Release release1 = new ReleaseImpl();
        release1.setNumber("1");
        release1.setDate(new Date());
        release1.setPersistanceId(1);
        release1.setPersistanceVersion(1);
        release1.setBasicProject(basicProject1);
        
        Release release2 = new ReleaseImpl();
        release2.setNumber("1");
        release2.setDate(new Date());
        release2.setPersistanceId(1);
        release2.setPersistanceVersion(1);
        release2.setBasicProject(basicProject2);
        
        // equals
        assertFalse(release1.equals(release2));
        // hashcode
        assertFalse(release1.hashCode() == release2.hashCode());
        
    }
    
    
    /**
     * l'égalité de l'object est faite sur :
     * <ul>
     * <li>le projet</li>
     * <li>le numéro (number)</li>
     * </ul>
     * Test avec des projets différents et des numéros différents
     */
    public void testIsEqualsAndHashcodeWithDifferentNumberAndDifferentProject() {
        
        
        BasicProject basicProject1 = new BasicProjectImpl();
        basicProject1.setCode("001");
        basicProject1.setName("Bound");
        basicProject1.setPersistanceId(5);
        basicProject1.setPersistanceVersion(23);
        
        BasicProject basicProject2 = new BasicProjectImpl();
        basicProject2.setCode("Scooby");
        basicProject2.setName("Doo");
        basicProject2.setPersistanceId(10);
        basicProject2.setPersistanceVersion(3);
        
        Release release1 = new ReleaseImpl();
        release1.setNumber("1");
        release1.setDate(new Date());
        release1.setPersistanceId(1);
        release1.setPersistanceVersion(1);
        release1.setBasicProject(basicProject1);
        
        Release release2 = new ReleaseImpl();
        release2.setNumber("2");
        release2.setDate(new Date());
        release2.setPersistanceId(1);
        release2.setPersistanceVersion(1);
        release2.setBasicProject(basicProject2);
        
        // equals
        assertFalse(release1.equals(release2));
        // hashcode
        assertFalse(release1.hashCode() == release2.hashCode());
        
    }

    /**
     * Test la méthode warning quand le set de story est null.
     * la méthode doit retourner false.
     */
    public void testIsWarningWhenSetOfStoriesIsNull() {
    	
    	Release release = new ReleaseImpl();
    
    	// le set des story est null
    	release.setStories(null);
    	
    	assertFalse(release.warning());
    	
    }
    
    /**
     * Test la méthode warning quand le set de story est vide.
     * la méthode doit retourner false.
     */
    public void testIsWarningWhenSetOfStoriesIsEmpty() {
    	
    	Release release = new ReleaseImpl();
    
    	// le set des story est null
    	release.setStories(new HashSet<Story>());
    	
    	assertFalse(release.warning());
    	
    }
    
    
    /**
     * Test la méthode warning quand le set de story contient une story en warning.
     * la méthode doit retourner true.
     */
    public void testIsWarningWhenSetOfStoriesIsNotEmptyAndHasAStoryInWarning() {

    	// TODO : A FAIRE
    	
//    	MockCore.reset();
//    	
//    	Release release = new ReleaseImpl();
//    
//    	// création de la liste de story
//    	Set<Story> stories = new HashSet<Story>();
//    	
//    	MockStory mockStory1 = new MockStory();
//    	MockStory mockStory2 = new MockStory();
//
//    	// l'ordre n'est pas important
//    	MockCore.startBlock();
// 
//    	// dès que la première story est en warning, on sort de la méthode
//    	mockStory2.expectWarning(true);
//    	
//    	MockCore.endBlock();
//
//    	stories.add(mockStory2);
//    	stories.add(mockStory1);
//
//    	release.setStories(stories);
//    	
//    	// la méthode doit retourner true
//    	assertTrue(release.warning());
//    	
//    	// contrôle des appels
//    	MockCore.verify();
    	
    }


    /**
     * Test la méthode warning quand le set de story ne contient aucune story en warning
     * la méthode doit retourner true.
     */
    public void testIsWarningWhenSetOfStoriesIsNotEmptyAndHasNotAStoryInWarning() {
    	
    	MockCore.reset();
    	
    	Release release = new ReleaseImpl();
    
    	// création de la liste de story
    	Set stories = new HashSet<Story>();
    	
    	MockStory mockStory1 = new MockStory();
    	MockStory mockStory2 = new MockStory();

    	// l'ordre n'est pas important
    	MockCore.startBlock();
 
    	mockStory1.expectWarning(false);
    	mockStory2.expectWarning(false);
    	
    	MockCore.endBlock();
    	
    	stories.add(mockStory1);
    	stories.add(mockStory2);

    	release.setStories(stories);
    	
    	// la méthode doit retourner true
    	assertFalse(release.warning());
    	
    	// contrôle des appels
    	MockCore.verify();
    	
    }

    
}
