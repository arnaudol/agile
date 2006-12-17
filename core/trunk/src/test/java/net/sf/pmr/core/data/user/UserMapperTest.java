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

package net.sf.pmr.core.data.user;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.MapperTestCase;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.core.domain.user.company.Company;

import org.dbunit.dataset.ITable;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.dao.ConcurrencyFailureException;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class UserMapperTest extends MapperTestCase {

    
    private UserMapper userMapper;
    
    
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {

        super.setUp();
        
        // getUserMapper        
        userMapper = CoreObjectFactory.getUserMapper();
        
    }
    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * test if object is a singleton
     *
     */
    public final void testSingleton() {
        
        assertTrue("singleton", CoreObjectFactory.isSingleton("userMapper"));

    }
    
    public final void testfindByIdWithUserFound() {
	
		User user = (User) userMapper.findById(2);

		assertEquals("id", new Integer(2), new Integer(user.getPersistanceId()));
		assertEquals("login", "aprost", user.getLogin());
		assertEquals("password", "password", user.getPassword());
		assertEquals("firstname", "Arnaud", user.getFirstName());
		assertEquals("lastname", "Prost", user.getLastName());
		assertEquals("email", "aprost@worldcompany.com", user.getEmail());
		assertTrue("company",  user.getCompany() instanceof Company);
		assertEquals("version", 1, user.getPersistanceVersion());

	}
    
    
    public final void testfindByidWithouthUserFound() {

		User user = (User) userMapper.findByLogin("665");

		assertEquals("user", null, user);

	}
    
	public final void testfindByLoginWithUserFound() {

		User user = (User) userMapper.findByLogin("aprost");

		assertEquals("id", new Integer(2), new Integer(user.getPersistanceId()));
		assertEquals("login", "aprost", user.getLogin());
		assertEquals("password", "password", user.getPassword());
		assertEquals("firstname", "Arnaud", user.getFirstName());
		assertEquals("lastname", "Prost", user.getLastName());
		assertEquals("email", "aprost@worldcompany.com", user.getEmail());
		assertTrue("company",  user.getCompany() instanceof Company);
		assertEquals("version", 1, user.getPersistanceVersion());

	}
	
	
	public final void testfindByLoginWithouthUserFound() {

		User user = (User) userMapper.findByLogin("marcel");

		assertEquals("user", null, user);

	}

	public final void testAddWithoutConcurrencyFailureException()
			throws Exception {

		// get a new User
		User user = CoreObjectFactory.getUser();

		user.setLogin("sdoo");
		user.setPassword("password");
		user.setFirstName("scooby");
		user.setLastName("doo");
		user.setEmail("scooby@worldCompany.com");
		
		//add
		userMapper.addOrUpdate(user);

		//check
		String query = "select * FROM PMUSER WHERE login='sdoo'";

		ITable databaseData = getConnection().createQueryTable("ExpectedData",
				query);

		assertEquals("number of row", 1, databaseData.getRowCount());

		assertEquals("login", "sdoo", databaseData.getValue(0, "login"));
		assertEquals("password", "password", databaseData.getValue(0, "pwd"));
		assertEquals("firstname", "scooby", databaseData.getValue(0,"firstname"));
		assertEquals("lastname", "doo", databaseData.getValue(0, "lastname"));
		assertEquals("email", "scooby@worldCompany.com", databaseData.getValue(0, "email"));
		assertEquals("Version", new Long(0), (Long) databaseData.getValue(0,
				"Version"));

	}

	public final void testAddShouldNotThrowConcurrencyFailureException() throws Exception {

		// get a new User
		User user = CoreObjectFactory.getUser();
		User user2 = CoreObjectFactory.getUser();

		user.setLogin("sdoo");
		user.setPassword("password");
		user.setFirstName("scooby");
		user.setLastName("doo");
		user.setEmail("scooby@worldCompany.com");

		user2.setLogin("sdoo");
		user2.setPassword("password2");
		user2.setFirstName("scooby2");
		user2.setLastName("doo2");
		user2.setEmail("scooby2@worldCompany.com");

		//add
		userMapper.addOrUpdate(user);

		try {
			userMapper.addOrUpdate(user2);
		} catch (ConcurrencyFailureException e) {
		    fail("should throw ConcurrencyFailureException");
		}

		//		check
		String query = "select * FROM PMUSER WHERE login='sdoo'";

		ITable databaseData = getConnection().createQueryTable("ExpectedData",
				query);

		assertEquals("number of row", 2, databaseData.getRowCount());

	}

	public final void testUpdateWithoutConcurrencyFailureException()
			throws Exception {

		// load a user
		User user = (User) userMapper.findById(2);

		// change password
		user.setPassword("motdepasse");

		//save user
		userMapper.addOrUpdate(user);

		//		check
		String query = "select * FROM PMUSER WHERE id=2";

		ITable databaseData = getConnection().createQueryTable("ExpectedData",
				query);

		assertEquals("number of row", 1, databaseData.getRowCount());

		assertEquals("id", new Integer("2"), (Integer) databaseData.getValue(0, "id"));
		assertEquals("login", "aprost", databaseData.getValue(0, "login"));
		assertEquals("password", "motdepasse", databaseData.getValue(0, "pwd"));
		assertEquals("firstname", "Arnaud", databaseData.getValue(0,
				"firstname"));
		assertEquals("lastname", "Prost", databaseData.getValue(0, "lastname"));
		assertEquals("email", "aprost@worldcompany.com", databaseData.getValue(0, "email"));
		assertEquals("Version", new Long(2), (Long) databaseData.getValue(0,
				"Version"));

	}
	

	/**
	 * test l'ajout de la relation user <- (member) -> basicProject
	 * @throws Exception
	 */
	public final void testAddWithAProject() throws Exception {
		
		User user = new UserImpl();
		Project basicProject = new ProjectImpl();
		
		user.setLogin("sdoo");
		user.setPassword("password");
		user.setFirstName("scooby");
		user.setLastName("doo");
		user.setEmail("scooby@worldCompany.com");
	
		
		basicProject.setPersistanceId(1);
		basicProject.setCode("PR1");
		basicProject.setName("PM Project");
		basicProject.setPersistanceVersion(1);
		
		user.setProjects(new HashSet<Project>());
		user.getProjects().add(basicProject);

		// add
		userMapper.addOrUpdate(user);
				
		// check
		String query = "select * FROM MEMBER WHERE id=1";

		ITable databaseData = getConnection().createQueryTable("ExpectedData",
				query);

		assertEquals("number of row", 1, databaseData.getRowCount());


	}

	public final void testUpdateWithConcurrencyFailureException()
			throws Exception {

	
		// load a user
		User user1 = (User) userMapper.findById(2);
		User user2 = (User) userMapper.findById(2);

		// change password
		user1.setPassword("motdepasse");
		user2.setPassword("monpassword");

		//save user
		userMapper.addOrUpdate(user1);

		try {

			userMapper.addOrUpdate(user2);
			fail("should throw ConcurrencyFailureException");

		} catch (ConcurrencyFailureException e) {

		}

		//		check
		String query = "select * FROM PMUSER WHERE id=2";

		ITable databaseData = getConnection().createQueryTable("ExpectedData",
				query);

		assertEquals("number of row", 1, databaseData.getRowCount());
		
		assertEquals("id", new Integer("2"), (Integer) databaseData.getValue(0, "id"));
		assertEquals("login", "aprost", databaseData.getValue(0, "login"));
		assertEquals("password", "motdepasse", databaseData.getValue(0, "pwd"));
		assertEquals("firstname", "Arnaud", databaseData.getValue(0,
				"firstname"));
		assertEquals("lastname", "Prost", databaseData.getValue(0, "lastname"));
		assertEquals("email", "aprost@worldcompany.com", databaseData.getValue(0, "email"));
		assertEquals("Version", new Long(2), (Long) databaseData.getValue(0,
				"Version"));

	}

	public final void testDeleteWithoutConcurrencyFailureException()
			throws Exception {

	

		// load a user
		User user = (User) userMapper.findById(2);

		//delete user
		userMapper.delete(user);

		//		check
		String query = "select * FROM PMUSER WHERE id=2";

		ITable databaseData = getConnection().createQueryTable("ExpectedData",
				query);

		assertEquals("number of row", 0, databaseData.getRowCount());

	}

	public final void testDeleteWithConcurrencyFailureException()
			throws Exception {
	

		// load a user
		User user1 = (User) userMapper.findById(2);
		User user2 = (User) userMapper.findById(2);

		//delete user
		userMapper.delete(user1);

		try {

			userMapper.delete(user2);
			fail("should throw ConcurrencyFailureException");
		} catch (ConcurrencyFailureException e) {

		}

		//		check
		String query = "select * FROM PMUSER WHERE login='aprost'";

		ITable databaseData = getConnection().createQueryTable("ExpectedData",
				query);

		assertEquals("number of row", 0, databaseData.getRowCount());
	}
	
	
	public final void testfindAllWithUsersFound() throws Exception {
	
		
		// find all user data from database
		List list = userMapper.findAll();
		
		User user = (User) list.get(0);
		
		user.getCompany();
		
		
		// check
		String query = "select * FROM PMUSER";

		ITable databaseData = getConnection().createQueryTable("ExpectedData",query);

	    assertEquals("Number of user Found", databaseData.getRowCount(), list.size());
	   
	   
	}

	// TODO testfindAllWithNoUsersFound
	
//	public final void testfindAllWithNoUsersFound() throws Exception  {
//
//		// get the user mapper
//		UserMapper userMapper = (UserMapper) CoreObjectFactory
//				.getApplicationContext().getBean("userMapper");
//
//		// delete all data from table user and company
//		String query = "delete FROM PMUser";
//		String query2 = "delete FROM Company";
//		String query3 = "select *  FROM PMUser";
//		
//		PreparedStatement statement = getConnection().getConnection().
//		statement.execute(query);
//		statement.execute(query2);
//		
//		ITable databaseData = getConnection().createQueryTable("ExpectedData",query);
//		
//		List list = userMapper.findAll();
//		
//	    assertEquals("Number of user Found", 0, list.size());
//	}
	
	
	public final void testCountAllWithUsersFound() throws Exception {
	    
	    int numberOfUsers = userMapper.countAll().intValue();
	   
		int rowCount = getConnection().getRowCount("PMUSER");

	    assertEquals("Number of user Found", numberOfUsers, rowCount);
	    
	}
	
	
	/**
	 * Test le bon fonctionnement de la m�thode findCollectionForObject
	 * quand l'object pass� est un project (cad trouver les membre d'un projet, 
	 * utilis� par le lazy loading sur la m�thode Project.getMembers)
	 * 
	 * Si des users sont trouv�s
	 *
	 */
	public final void testFindCollectionForProjectWithUserFound() {
	    
	    // R�cup�ration d'un project qui a des membres...
	    //... le project avec l'ID 2
	    Project basicProject = CoreObjectFactory.getProject();
	    
	    basicProject.setPersistanceId(2);
	    basicProject.setCode("PR2");
	    basicProject.setName("PM Project 2");
	    basicProject.setPersistanceVersion(2);
	    
	    // Project is a proxy, so we need to get the target
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
        Object target = ((SingletonTargetSource) targetSource).getTarget();
	    
	    // appel de la m�thode
	    Collection collection = userMapper.findCollectionForObject((Project) target);
	    
	    // la collection doit contenir une ligne
	    assertEquals(1, collection.size());
	    
	}
	

	/**
	 * Test le bon fonctionnement de la m�thode findCollectionForObject
	 * quand l'object pass� est un project (cad trouver les membre d'un projet, 
	 * utilis� par le lazy loading sur la m�thode Project.getMembers)
	 * 
	 * Si des users ne sont pas trouv�s
	 *
	 */
	public final void testFindCollectionForProjectWithoutUserFound() {
	    
        // R�cup�ration d'un project qui n'a pas de membre...
	    //... le project avec l'ID 2
	    Project basicProject = CoreObjectFactory.getProject();
	    
	    basicProject.setPersistanceId(1);
	    basicProject.setCode("PR1");
	    basicProject.setName("PM Project");
	    basicProject.setPersistanceVersion(1);

	    // Project is a proxy, so we need to get the target
        TargetSource targetSource = ((Advised) basicProject).getTargetSource();        
        Object target = ((SingletonTargetSource) targetSource).getTarget();
	    
	    // appel de la m�thode
        Collection collection = userMapper.findCollectionForObject((Project) target);
    		    
	    // la collection doit contenir une ligne
	    assertEquals(0, collection.size());
	    
	}
	
	
	
	// TODO estCountAllWithoutUsersFound(
	
//	public final void testCountAllWithoutUsersFound() throws Exception {
//	    
//	}

}