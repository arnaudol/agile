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

package net.sf.pmr.core.data.project;

import java.util.List;
import java.util.Set;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.MapperTestCase;
import net.sf.pmr.core.data.project.ProjectMapper;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;

import org.dbunit.dataset.ITable;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.dao.ConcurrencyFailureException;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class BasicProjectMapperTest extends MapperTestCase {

    private ProjectMapper basicProjectMapper;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // getBasicProjectMapper        
        basicProjectMapper = CoreObjectFactory.getBasicProjectMapper();

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * test if object is a singleton
     *
     */
    public final void testSingleton() {
        
        assertTrue("singleton", CoreObjectFactory.isSingleton("projectMapper"));

    }

    public final void testfindByIdWithBasicProjectFound() {
    	
    		Project basicProject = (Project) basicProjectMapper.findById(1);
    		
    		assertEquals("id", new Integer(1), new Integer(basicProject.getPersistanceId()));
    		assertEquals("code", "PR1", basicProject.getCode());
    		assertEquals("name", "PM Project", basicProject.getName());
    		assertEquals("members", 0, basicProject.getMembers().size());
    		assertEquals("version", 1, basicProject.getPersistanceVersion());

    	}
    
    
    public final void testfindByIdWithoutBasicProjectFound() {

        Project basicProject = (Project) basicProjectMapper.findById(198);

		assertEquals("basicProject", null, basicProject);

	}
    

    /**
     * Test de la recherche des projets pour un User.
     * un projet est trouvée
     */
	public final void testfindForAUserWithBasicProjectFound() {

        Set<Project> set = basicProjectMapper.findForAUser(2);

		// un seul projet trouvé
		assertEquals(1, set.size());

		// vérifie que c'est le bon
		for (Project project : set) {
			assertEquals(2, project.getPersistanceId());
		}

	}


    /**
     * Test de la recherche des projets pour un User.
     * aucun projet n'est trouvé
     */
    public final void testfindForAUserWithoutBasicProjectFound() {

        Set<Project> set = basicProjectMapper.findForAUser(1);

		// un seul projet trouvé
		assertEquals(0, set.size());

    }

    
    
	public final void testAddWithoutConcurrencyFailureException()
            throws Exception {

       // get a new Project
       Project basicProject = CoreObjectFactory.getProject();
                
       basicProject.setCode("SP");
       basicProject.setName("Super Project");
       
       // default member
       User user = new UserImpl();
       user.setPersistanceId(1);
       user.setLogin("ponfel");
       user.setPassword("password");
       user.setFirstName("Pon");
       user.setLastName("Fel");
       user.setEmail("ponfel@worldcompany.com");
       user.setPersistanceVersion(2);

       basicProject.getMembers().add(user);
       
       // Project is a proxy, so we need to get the target
       TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
       Object target = ((SingletonTargetSource) targetSource).getTarget();
       
       // add
       basicProjectMapper.addOrUpdate((Project) target);
       
	   //check
	   String query = "select * FROM PROJECT WHERE CODE='SP'";
       
	   ITable databaseData = getConnection().createQueryTable("ExpectedData", query);
	
	   assertEquals("number of row", 1, databaseData.getRowCount());

       assertEquals("code", "SP", databaseData.getValue(0, "code"));
       assertEquals("name", "Super Project", databaseData.getValue(0, "name"));
       assertEquals("Version", new Long(0), (Long) databaseData.getValue(0, "Version"));
       
       
	   //check
	   String query2 = "select * FROM MEMBER, PROJECT WHERE MEMBER.PMU_ID=1 AND MEMBER.ID = PROJECT.ID AND UPPER(PROJECT.CODE)='SP'";
	
	   ITable databaseData2 = getConnection().createQueryTable("ExpectedData", query2);
	
	   assertEquals("number of row", 1, databaseData2.getRowCount());


    }

    public final void testAddShouldNotThrowConcurrencyFailureException()
            throws Exception {
        
        // get a new Project
        Project basicProject1 = CoreObjectFactory.getProject();
        Project basicProject2 = CoreObjectFactory.getProject();
        
        basicProject1.setCode("FFGT2");
        basicProject1.setName("mega project");
        
        basicProject2.setCode("FFGT2");
        basicProject2.setName("mega project");
        
        TargetSource targetSource1 = ((Advised) basicProject1).getTargetSource();        
        Object target1 = ((SingletonTargetSource) targetSource1).getTarget();
        
        TargetSource targetSource2 = ((Advised) basicProject2).getTargetSource();        
        Object target2 = ((SingletonTargetSource) targetSource2).getTarget();
        
        
        //add
        basicProjectMapper.addOrUpdate((Project) target1);
        
        try {
            basicProjectMapper.addOrUpdate((Project) target2);
        } catch (ConcurrencyFailureException e) {
            fail("should not throw ConcurrencyFailureException");
        }
        
      // check
      String query = "select * FROM PROJECT WHERE CODE='FFGT2'";

      ITable databaseData = getConnection().createQueryTable("ExpectedData", query);

      assertEquals("number of row", 2, databaseData.getRowCount());

    }
    
    public final void testUpdateWithoutConcurrencyFailureException()
            throws Exception {
        
        // get a new Project
        Project basicProject = CoreObjectFactory.getProject();

        // set the properties of a project in the database but change the name
        basicProject.setPersistanceId(1);
        basicProject.setCode("PR1");
        basicProject.setName("super PM Project");
        basicProject.setPersistanceVersion(1);
        
        // Project is a proxy, so we need to get the target
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
        Object target = ((SingletonTargetSource) targetSource).getTarget();
        
        // update
        basicProjectMapper.addOrUpdate((Project) target);
        
        // check
        String query = "select * FROM PROJECT WHERE ID=1";

        ITable databaseData = getConnection().createQueryTable("ExpectedData", query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("code", "PR1", databaseData.getValue(0, "code"));
        assertEquals("name", "super PM Project", databaseData.getValue(0, "name"));
        assertEquals("Version", new Long(2), (Long) databaseData.getValue(0, "Version"));
        
    }
    
    
    public final void testUpdateWithConcurrencyFailureException()
            throws Exception {

        // get a new Project
        Project basicProject1 = CoreObjectFactory.getProject();
        Project basicProject2 = CoreObjectFactory.getProject();

        // set the properties of a project in the database but change the name
        basicProject1.setPersistanceId(1);
        basicProject1.setCode("PR1");
        basicProject1.setName("super PM Project");
        basicProject1.setPersistanceVersion(1);
        
        basicProject2.setPersistanceId(1);
        basicProject2.setCode("PR1");
        basicProject2.setName("super mega PM Project");
        basicProject2.setPersistanceVersion(1);

        TargetSource targetSource1 = ((Advised) basicProject1).getTargetSource();        
        Object target1 = ((SingletonTargetSource) targetSource1).getTarget();
        
        TargetSource targetSource2 = ((Advised) basicProject2).getTargetSource();        
        Object target2 = ((SingletonTargetSource) targetSource2).getTarget();
        
        // update
        basicProjectMapper.addOrUpdate((Project) target1);
        
        try {
            basicProjectMapper.addOrUpdate((Project) target2);
            fail("should throw ConcurrencyFailureException");
        } catch (ConcurrencyFailureException e) {
        }

        // check
        String query = "select * FROM PROJECT WHERE ID=1";

        ITable databaseData = getConnection().createQueryTable("ExpectedData", query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("code", "PR1", databaseData.getValue(0, "code"));
        assertEquals("name", "super PM Project", databaseData.getValue(0, "name"));
        assertEquals("Version", new Long(2), (Long) databaseData.getValue(0, "Version"));
        

    }
    
    public final void testDeleteWithoutConcurrencyFailureException()
            throws Exception {
        
        Project basicProject = CoreObjectFactory.getProject();

        // set the properties of a project in the database
        basicProject.setPersistanceId(1);
        basicProject.setCode("PR1");
        basicProject.setName("PM Project");
        basicProject.setPersistanceVersion(1); 
        
        // Project is a proxy, so we need to get the target
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
        Object target = ((SingletonTargetSource) targetSource).getTarget();
        
        basicProjectMapper.delete((Project) target);
        
        // check
        String query = "select * FROM PROJECT WHERE ID=1";

        ITable databaseData = getConnection().createQueryTable("ExpectedData", query);
        
        assertEquals("number of row", 0, databaseData.getRowCount());

        

    }
    
    
    public final void testDeleteWithConcurrencyFailureException()
            throws Exception {

        Project basicProject1 = CoreObjectFactory.getProject();
        Project basicProject2 = CoreObjectFactory.getProject();

        // set the properties of a project in the database
        basicProject1.setPersistanceId(1);
        basicProject1.setCode("PR1");
        basicProject1.setName("PM Project");
        basicProject1.setPersistanceVersion(1);
        
        // set the properties of a project in the database
        basicProject2.setPersistanceId(1);
        basicProject2.setCode("PR1");
        basicProject2.setName("PM Project");
        basicProject2.setPersistanceVersion(1);

        // Project is a proxy, so we need to get the target
        TargetSource targetSource1 = ((Advised) basicProject1).getTargetSource();        
        Object target1 = ((SingletonTargetSource) targetSource1).getTarget();
        
        TargetSource targetSource2 = ((Advised) basicProject2).getTargetSource();        
        Object target2 = ((SingletonTargetSource) targetSource2).getTarget();
        
        basicProjectMapper.delete((Project) target1);
        
        try {
            basicProjectMapper.delete((Project) target2);
            fail("should throw ConcurrencyFailureException");
        } catch (ConcurrencyFailureException e) {
        }

    }

    public final void testCountAllWithBasicProjectFound() throws Exception {
	    
	    Integer numberOfProjects = basicProjectMapper.countAll();
	   
		Integer rowCount = new Integer(getConnection().getRowCount("PROJECT"));

	    assertEquals("Number of project found", numberOfProjects, rowCount);
	    
	}
    
    public final void testFindAllWithoutBasicProjectsFound() {
        
        List list = basicProjectMapper.findAll();
        
        assertEquals(2, list.size());
        
    }
    
    
    
}
