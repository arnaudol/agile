/*
* Copyright 2006 Arnaud Prost
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

package net.sf.pmr.toDo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.dbunit.DatabaseTestCase;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.XmlDataSet;
import org.dbunit.operation.DatabaseOperation;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public abstract class MapperTestCase extends DatabaseTestCase {

	/**
	 * Database connection.
	 */
	protected IDatabaseConnection connection;

	/*
	 * @see DatabaseTestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * @see DatabaseTestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.dbunit.DatabaseTestCase#getConnection()
	 */
	protected IDatabaseConnection getConnection() throws Exception {

//		Class driverClass = Class.forName("org.hsqldb.jdbcDriver");

//        Connection jdbcConnection = DriverManager.getConnection(
//                "jdbc:hsqldb:hsql://localhost/pm", "sa", "");
//  			   "jdbc:hsqldb:hsql://localhost/", "sa", "");
	    
		
		Class driverClass = Class.forName("org.hsqldb.jdbcDriver");
		
	      Connection jdbcConnection = DriverManager.getConnection(
	    "jdbc:hsqldb:hsql://localhost/xdb", "sa", "");
		
//		Class driverClass = Class.forName("com.mysql.jdbc.Driver");
//
//		Connection jdbcConnection = DriverManager.getConnection(
//				"jdbc:mysql://localhost:3306/pm_tu", "pm", "pm");

		// connection (+ schema à utiliser éventuellement)
	      
	      IDatabaseConnection databaseConnection = new DatabaseConnection( jdbcConnection );
	      
		  DatabaseConfig config = databaseConnection.getConfig();
		  
		  config.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new HsqlDataTypeFactory());
		   
	      
	    return databaseConnection;   
		     
		//return new DatabaseConnection(jdbcConnection);

		 
		 
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.dbunit.DatabaseTestCase#getDataSet()
	 */
	protected IDataSet getDataSet() throws Exception {
        
		return new XmlDataSet( getClass().getResourceAsStream("/ToDoDataSet.xml"));

	}

	protected DatabaseOperation getSetUpOperation() throws Exception {
		// remove everything from the table(s) in the seed and insert data
		return DatabaseOperation.CLEAN_INSERT;
	}

	protected DatabaseOperation getTearDownOperation() throws Exception {
		return DatabaseOperation.DELETE_ALL;
	}

}
