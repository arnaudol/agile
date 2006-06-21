/*
 * Copyright ou © ou Copr. Arnaud Prost, 18 sept. 2004
 *
 * arnaud.prost@free.fr
 *
 * Ce logiciel est un programme informatique servant à faciliter le travail
 * collaboratif.
 *
 * Ce logiciel est régi par la licence CeCILL soumise au droit français et
 * respectant les principes de diffusion des logiciels libres. Vous pouvez
 * utiliser, modifier et/ou redistribuer ce programme sous les conditions
 * de la licence CeCILL telle que diffusée par le CEA, le CNRS et l'INRIA
 * sur le site "http://www.cecill.info".
 *
 * En contrepartie de l'accessibilité au code source et des droits de copie,
 * de modification et de redistribution accordés par cette licence, il n'est
 * offert aux utilisateurs qu'une garantie limitée.  Pour les mêmes raisons,
 * seule une responsabilité restreinte pèse sur l'auteur du programme,  le
 * titulaire des droits patrimoniaux et les concédants successifs.
 *
 * A cet égard  l'attention de l'utilisateur est attirée sur les risques
 * associés au chargement,  à l'utilisation,  à la modification et/ou au
 * développement et à la reproduction du logiciel par l'utilisateur étant
 * donné sa spécificité de logiciel libre, qui peut le rendre complexe à
 * manipuler et qui le réserve donc à des développeurs et des professionnels
 * avertis possédant  des  connaissances  informatiques approfondies.  Les
 * utilisateurs sont donc invités à charger  et  tester  l'adéquation  du
 * logiciel à leurs besoins dans des conditions permettant d'assurer la
 * sécurité de leurs systèmes et ou de leurs données et, plus généralement,
 * à l'utiliser et l'exploiter dans les mêmes conditions de sécurité.
 *
 * Le fait que vous puissiez accéder à cet en-tête signifie que vous avez
 * pris connaissance de la licence CeCILL, et que vous en avez accepté les
 * termes.
 */

package net.sf.pmr.messageBoards;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import org.dbunit.DatabaseTestCase;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.XmlDataSet;
import org.dbunit.operation.DatabaseOperation;

/**
 * @author Arnaud
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public abstract class MapperTestCase extends DatabaseTestCase {

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

        Class driverClass = Class.forName("com.mysql.jdbc.Driver");

        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pm", "pm", "pm");

        // connection (+ schema à utiliser éventuellement)
        return new DatabaseConnection(jdbcConnection);

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.dbunit.DatabaseTestCase#getDataSet()
     */
    protected IDataSet getDataSet() throws Exception {
        return new XmlDataSet(
                new FileInputStream(
                        "C:\\Documents and Settings\\Arnaud\\Mes documents\\projets\\pmJava\\sources\\MessageBoards\\src\\conf\\test\\MessageBoardsDataSet.xml"));

    }

    protected DatabaseOperation getSetUpOperation() throws Exception {
        //connection.
        // remove everything from the table(s) in the seed and insert data
        return DatabaseOperation.CLEAN_INSERT;
    }

    protected DatabaseOperation getTearDownOperation() throws Exception {
        return DatabaseOperation.DELETE_ALL;
    }

}