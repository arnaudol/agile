/*
 * Copyright ou � ou Copr. Arnaud Prost, 18 sept. 2004
 *
 * arnaud.prost@free.fr
 *
 * Ce logiciel est un programme informatique servant � faciliter le travail
 * collaboratif.
 *
 * Ce logiciel est r�gi par la licence CeCILL soumise au droit fran�ais et
 * respectant les principes de diffusion des logiciels libres. Vous pouvez
 * utiliser, modifier et/ou redistribuer ce programme sous les conditions
 * de la licence CeCILL telle que diffus�e par le CEA, le CNRS et l'INRIA
 * sur le site "http://www.cecill.info".
 *
 * En contrepartie de l'accessibilit� au code source et des droits de copie,
 * de modification et de redistribution accord�s par cette licence, il n'est
 * offert aux utilisateurs qu'une garantie limit�e.  Pour les m�mes raisons,
 * seule une responsabilit� restreinte p�se sur l'auteur du programme,  le
 * titulaire des droits patrimoniaux et les conc�dants successifs.
 *
 * A cet �gard  l'attention de l'utilisateur est attir�e sur les risques
 * associ�s au chargement,  � l'utilisation,  � la modification et/ou au
 * d�veloppement et � la reproduction du logiciel par l'utilisateur �tant
 * donn� sa sp�cificit� de logiciel libre, qui peut le rendre complexe �
 * manipuler et qui le r�serve donc � des d�veloppeurs et des professionnels
 * avertis poss�dant  des  connaissances  informatiques approfondies.  Les
 * utilisateurs sont donc invit�s � charger  et  tester  l'ad�quation  du
 * logiciel � leurs besoins dans des conditions permettant d'assurer la
 * s�curit� de leurs syst�mes et ou de leurs donn�es et, plus g�n�ralement,
 * � l'utiliser et l'exploiter dans les m�mes conditions de s�curit�.
 *
 * Le fait que vous puissiez acc�der � cet en-t�te signifie que vous avez
 * pris connaissance de la licence CeCILL, et que vous en avez accept� les
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

        // connection (+ schema � utiliser �ventuellement)
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