/*
 * Copyright ou � ou Copr. Arnaud Prost, 3 d�c. 2004
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

package net.sf.pmr.messageBoards.data;

import java.util.List;

import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import net.sf.pmr.messageBoards.MapperTestCase;
import net.sf.pmr.messageBoards.MessageBoardsObjectFactory;
import net.sf.pmr.messageBoards.domain.Board;
import net.sf.pmr.messageBoards.domain.BoardImpl;

import org.dbunit.dataset.ITable;
import org.springframework.dao.ConcurrencyFailureException;

/**
 * @author Arnaud
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class BoardMapperTest extends MapperTestCase {

    private BoardMapper boadMapper;

    private Board boardToUpdateOrDelete;

    private BasicProject basicProject;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();

        // get the mapper
        boadMapper = MessageBoardsObjectFactory.getBoardMapper();

        // create a project idem to the one in database
        basicProject = new BasicProjectImpl();
        basicProject.setId(1);
        basicProject.setCode("PR1");
        basicProject.setName("PM Project");
        basicProject.setPersistanceVersion(1);

        // create a board idem to the one in the database
        boardToUpdateOrDelete = new BoardImpl();
        boardToUpdateOrDelete.setId(1);
        boardToUpdateOrDelete.setName("Discuss about latest movies");
        boardToUpdateOrDelete
                .setDescription("Board where we discuss about latest movies");
        boardToUpdateOrDelete.setBasicProject(basicProject);
        boardToUpdateOrDelete.setPersistanceVersion(1);
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public final void testAddWithoutConcurrencyFailureException()
            throws Exception {

        // create board
        Board board = new BoardImpl();

        board.setBasicProject(basicProject);
        board.setName("Formula one");
        board.setDescription("Discussion about latest news from formula One");

        // add
        boadMapper.addOrUpdate(board);

        //check
        String query = "select * from BOARD WHERE name='Formula one'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("name", "Formula one", databaseData.getValue(0, "name"));
        assertEquals("description",
                "Discussion about latest news from formula One", databaseData
                        .getValue(0, "description"));
        assertEquals("projectID", new Integer(1), (Integer) databaseData
                .getValue(0, "pro_id"));
        assertEquals("version", new Long(0), (Long) databaseData.getValue(0,
                "version"));

    }

    public final void testFindByIdWithboardFound() {

        // find a board
        Board board = (Board) boadMapper.findById(1);

        assertEquals("name", "Discuss about latest movies", board.getName());
        assertEquals("description",
                "Board where we discuss about latest movies", board
                        .getDescription());
        assertTrue("project", board.getBasicProject() instanceof BasicProject);
        assertEquals("version", 1, board.getPersistanceVersion());

    }

    public final void testFindByIdWithoutboardFound() {

        // find a board
        Board board = (Board) boadMapper.findById(999);

        assertEquals("board", null, board);

    }

    public final void testFindAllWithboardsFound() {

        // find
        List list = boadMapper.findAll();

        assertEquals("number of boards found", 2, list.size());

    }

    public final void testUpdateWithoutConcurrencyFailureException()
            throws Exception {

        boardToUpdateOrDelete.setDescription("coucou!");
        boadMapper.addOrUpdate(boardToUpdateOrDelete);

        // check
        String query = "select * from BOARD WHERE id=1";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0,
                "id"));
        assertEquals("name", "Discuss about latest movies", databaseData
                .getValue(0, "name"));
        assertEquals("description", "coucou!", databaseData.getValue(0,
                "description"));
        assertEquals("projectId", new Integer(1), (Integer) databaseData
                .getValue(0, "pro_id"));
        assertEquals("version", new Long(2), (Long) databaseData.getValue(0,
                "version"));

    }

    public final void testUpdateWithConcurrencyFailureException() {

        boadMapper.addOrUpdate(boardToUpdateOrDelete);

        try {
            boadMapper.delete(boardToUpdateOrDelete);
            fail("should throw concurrency failure exception");
        } catch (ConcurrencyFailureException e) {
        }

    }

    /**
     * test if object is a singleton
     */
    public final void testSingleton() {

        assertTrue("singleton", MessageBoardsObjectFactory
                .isSingleton("boardMapper"));

    }

}
