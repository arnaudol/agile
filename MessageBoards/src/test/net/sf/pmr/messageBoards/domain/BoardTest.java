/*
 * Copyright ou © ou Copr. Arnaud Prost, 4 déc. 2004
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

package net.sf.pmr.messageBoards.domain;

import junit.framework.TestCase;
import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.messageBoards.MessageBoardsObjectFactory;

/**
 * @author Arnaud
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class BoardTest extends TestCase {

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testObjectCreation() {

        Board board = MessageBoardsObjectFactory.getBoard();

        assertEquals("id", 0, board.getId());
        assertEquals("version", 0, board.getPersistanceVersion());
        assertEquals("name", null, board.getName());
        assertTrue("basicProject",
                board.getBasicProject() instanceof BasicProject);
        assertEquals("descripton", null, board.getDescription());

    }

    /**
     * test if object is not a singleton
     *
     */
    public final void testSingleton() {

        assertFalse("not singleton", MessageBoardsObjectFactory
                .isSingleton("board"));

    }

    /**
     * id + name + description
     *
     */
    public final void testEquals() {

        Board board1 = new BoardImpl();
        Board board2 = new BoardImpl();

        assertTrue(board1.equals(board2));

        board1.setId(1);

        assertFalse(board1.equals(board2));

        board1.setId(0);
        board1.setName("name");

        assertFalse(board1.equals(board2));

        board1.setName(null);
        board1.setDescription("description");

        assertFalse(board1.equals(board2));

    }

    public final void testHasCode() {

        Board board1 = new BoardImpl();
        Board board2 = new BoardImpl();

        assertTrue(board1.hashCode() == board2.hashCode());

        board1.setId(1);

        assertFalse(board1.hashCode() == board2.hashCode());

        board1.setId(0);
        board1.setName("name");

        assertFalse(board1.hashCode() == board2.hashCode());

        board1.setName(null);
        board1.setDescription("description");

        assertFalse(board1.hashCode() == board2.hashCode());

    }

}
