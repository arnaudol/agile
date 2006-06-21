/*
 * Copyright ou © ou Copr. Arnaud Prost, 3 déc. 2004
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

package net.sf.pmr.messageBoards.data;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.pmr.core.domain.basicProject.BasicProject;
import net.sf.pmr.core.domain.basicProject.BasicProjectImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.messageBoards.MapperTestCase;
import net.sf.pmr.messageBoards.MessageBoardsObjectFactory;
import net.sf.pmr.messageBoards.domain.Board;
import net.sf.pmr.messageBoards.domain.BoardImpl;
import net.sf.pmr.messageBoards.domain.Message;
import net.sf.pmr.messageBoards.domain.MessageImpl;
import net.sf.pmr.messageBoards.domain.Topic;
import net.sf.pmr.messageBoards.domain.TopicImpl;

import org.dbunit.dataset.ITable;
import org.springframework.dao.ConcurrencyFailureException;

/**
 * @author Arnaud
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class MessageMapperTest extends MapperTestCase {

    private MessageMapper messageMapper;

    private User user;

    private Board board;

    private BasicProject basicProject;

    private Message messageToUpdateOrDelete;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();

        // get the message mapper
        messageMapper = MessageBoardsObjectFactory.getMessageMapper();

        // create a user idem to the one in the database
        user = new UserImpl();
        user.setId(1);
        user.setLogin("ponfel");
        user.setPassword("password");
        user.setFirstName("Pon");
        user.setLastName("Fel");
        user.setEmail("ponfel@worldcompany.com");
        user.setPersistanceVersion(2);

        // create a project idem to the one in database
        basicProject = new BasicProjectImpl();
        basicProject.setId(1);
        basicProject.setCode("PR1");
        basicProject.setName("PM Project");
        basicProject.setPersistanceVersion(1);

        // create a board idem to the one in the database
        board = new BoardImpl();
        board.setId(1);
        board.setName("Discuss about latest movies");
        board.setDescription("Board where we discuss about latest movies");
        board.setBasicProject(basicProject);
        board.setPersistanceVersion(1);

        // topic
        Topic topic = new TopicImpl();
        topic.setTitle("les clés de bagnole");

        // create a message idem to the one in the database
        messageToUpdateOrDelete = new MessageImpl();
        messageToUpdateOrDelete.setId(1);
        messageToUpdateOrDelete.setBoard(board);
        messageToUpdateOrDelete.setTopic(topic);
        messageToUpdateOrDelete.setPostedBy(user);

        // to test Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
        Date date = dateFormat.parse("01/01/2001 13:24");

        messageToUpdateOrDelete.setPostedDate(date);
        messageToUpdateOrDelete
                .setContent("les clés de bagnole est vraiement un excellent film malgrès une ou deux longueurs. Il est unique !");
        messageToUpdateOrDelete.setPersistanceVersion(1);

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public final void testFindByIdWithMessageFound() throws Exception {

        Message message = (Message) messageMapper.findById(1);

        // to test Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
        Date date = dateFormat.parse("01/01/2001 13:24");

        assertEquals("id", 1, message.getId());
        assertEquals(
                "content",
                "les clés de bagnole est vraiement un excellent film malgrès une ou deux longueurs. Il est unique !",
                message.getContent());
        assertEquals("topic title", "les clés de bagnole", message.getTopic()
                .getTitle());
        assertTrue("postedBy", message.getPostedBy() instanceof User);
        assertEquals("postedDate", date, message.getPostedDate());
        assertEquals("version", 1, message.getPersistanceVersion());

    }

    public final void testFindByIdWithoutMessageFound() {

        Message message = (Message) messageMapper.findById(999);

        assertEquals("message", null, message);
    }

    public final void testAddWithoutConcurrencyFailureException()
            throws Exception {

        // topic
        Topic topic = new TopicImpl();
        topic.setTitle("my title");

        // create a message idem to the one in the database
        Message message = new MessageImpl();
        message.setBoard(board);
        message.setTopic(topic);
        message.setPostedBy(user);

        // to test Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
        Date date = dateFormat.parse("01/01/2001 13:24");

        message.setPostedDate(date);
        message.setContent("super movie! great work");
        message.setPersistanceVersion(1);

        messageMapper.addOrUpdate(message);

        // check
        String query = "select * from MESSAGE where CONTENT='super movie! great work'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("user", new Integer(1), (Integer) databaseData.getValue(0,
                "pmu_id"));
        assertEquals("board", new Integer(1), (Integer) databaseData.getValue(
                0, "boa_id"));
        assertEquals("topic", "my title", databaseData.getValue(0, "title"));
        assertEquals("content", "super movie! great work", databaseData
                .getValue(0, "content"));
        assertEquals("version", new Long(1), (Long) databaseData.getValue(0,
                "version"));

    }

    public final void testUpdateForObjectWithoutConcurrencyFailureException()
            throws Exception {

        // to test Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
        Date date = dateFormat.parse("01/01/2003 18:24");

        messageToUpdateOrDelete.setContent("nouveau contenu");
        messageToUpdateOrDelete.setPostedDate(date);

        messageMapper.addOrUpdate(messageToUpdateOrDelete);

        // check
        String query = "select * from MESSAGE where id=1";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0,
                "id"));
        assertEquals("user", new Integer(1), (Integer) databaseData.getValue(0,
                "pmu_id"));
        assertEquals("board", new Integer(1), (Integer) databaseData.getValue(
                0, "boa_id"));
        assertEquals("topic", "les clés de bagnole", databaseData.getValue(0,
                "title"));
        assertEquals("content", "nouveau contenu", databaseData.getValue(0,
                "content"));
        assertTrue("postedDate", date.equals((Date) databaseData.getValue(0,
                "postedDate"))); // date is updated
        assertEquals("version", new Long(2), (Long) databaseData.getValue(0,
                "version"));

    }

    public final void testUpdateForObjectWithConcurrencyFailureExceptionBecauseOfVersion()
            throws Exception {

        messageToUpdateOrDelete.setContent("nouveau contenu");
        messageToUpdateOrDelete.setPersistanceVersion(4);

        try {
            messageMapper.addOrUpdate(messageToUpdateOrDelete);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException e) {
        }

        // check
        String query = "select * from MESSAGE where id=1";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        // to test Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
        Date date = dateFormat.parse("01/01/2001 13:24");

        assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0,
                "id"));
        assertEquals("user", new Integer(1), (Integer) databaseData.getValue(0,
                "pmu_id"));
        assertEquals("board", new Integer(1), (Integer) databaseData.getValue(
                0, "boa_id"));
        assertEquals("topic", "les clés de bagnole", databaseData.getValue(0,
                "title"));
        assertEquals(
                "content",
                "les clés de bagnole est vraiement un excellent film malgrès une ou deux longueurs. Il est unique !",
                databaseData.getValue(0, "content"));
        assertEquals("postedDate", date, (Date) databaseData.getValue(0,
                "postedDate"));
        assertEquals("version", new Long(1), (Long) databaseData.getValue(0,
                "version"));

    }

    public final void testUpdateForObjectWithConcurrencyFailureExceptionBecauseObjectDoesntExistInDatabase()
            throws Exception {

        messageToUpdateOrDelete.setId(999);
        messageToUpdateOrDelete.setContent("mega message");
        messageToUpdateOrDelete.setPersistanceVersion(4);

        try {
            messageMapper.addOrUpdate(messageToUpdateOrDelete);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException e) {
        }

        // check
        String query = "select * from MESSAGE where content='mega message'";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 0, databaseData.getRowCount());
    }

    public final void testDeleteForObjectWithoutConcurrencyFailureException()
            throws Exception {

        messageMapper.delete(messageToUpdateOrDelete);

        // check
        String query = "select * from MESSAGE where id=1";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 0, databaseData.getRowCount());

    }

    public final void testDeleteForObjectWithConcurrencyFailureExceptionBecauseOfVersion()
            throws Exception {

        messageToUpdateOrDelete.setPersistanceVersion(4);

        try {
            messageMapper.delete(messageToUpdateOrDelete);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException e) {
        }

        // check
        String query = "select * from MESSAGE where id=1";

        ITable databaseData = getConnection().createQueryTable("ExpectedData",
                query);

        assertEquals("number of row", 1, databaseData.getRowCount());

        // to test Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
        Date date = dateFormat.parse("01/01/2001 13:24");

        assertEquals("id", new Integer(1), (Integer) databaseData.getValue(0,
                "id"));
        assertEquals("user", new Integer(1), (Integer) databaseData.getValue(0,
                "pmu_id"));
        assertEquals("board", new Integer(1), (Integer) databaseData.getValue(
                0, "boa_id"));
        assertEquals("topic", "les clés de bagnole", databaseData.getValue(0,
                "title"));
        assertEquals(
                "content",
                "les clés de bagnole est vraiement un excellent film malgrès une ou deux longueurs. Il est unique !",
                databaseData.getValue(0, "content"));
        assertEquals("postedDate", date, (Date) databaseData.getValue(0,
                "postedDate"));
        assertEquals("version", new Long(1), (Long) databaseData.getValue(0,
                "version"));
    }

    public final void testDeleteForObjectWithConcurrencyFailureExceptionBecauseObjectDoesntExistInDatabase()
            throws Exception {

        messageToUpdateOrDelete.setId(999);
        messageToUpdateOrDelete.setPersistanceVersion(4);

        try {
            messageMapper.delete(messageToUpdateOrDelete);
            fail("should throw a concurrency failure exception");
        } catch (ConcurrencyFailureException e) {
        }

    }

    //    public final void testCountListRowForObjectWithMessageFound() {
    //
    //        // new topic
    //        Topic topic = new TopicImpl();
    //        topic.setId(1);
    //        
    //        // find for topic
    //        int count = messageMapper.countListRowForObject(topic);
    //        
    //        assertEquals("number of row", 2, count);
    //        
    //    }
    //    
    //    public final void testCountListRowForObjectWithoutMessageFound() {
    //        
    //        // new topic
    //        Topic topic = new TopicImpl();
    //        topic.setId(866);
    //        
    //        // find for topic
    //        int count = messageMapper.countListRowForObject(topic);
    //        
    //        assertEquals("number of row", 0, count);
    //        
    //    }
    //
    //
    //    public final void testFindListForObjectWithMessageFound() throws
    // Exception {
    //        
    //        // new topic
    //        Topic topic = new TopicImpl();
    //        topic.setId(1);
    //        
    //        // find for topic
    //        List list = messageMapper.findListForObject(topic);
    //        
    //        assertEquals("list", 2, list.size());
    //        
    //        Message message = (Message) list.get(0);
    //        
    //		// to test Date
    //        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
    //        Date date = dateFormat.parse("01/01/2001 13:24");
    //
    //        
    //        // check
    //        assertEquals("id", 1, message.getId());
    //        assertTrue("Posted By", message.getPostedBy() instanceof User);
    //        assertEquals("content", "les clés de bagnole est vraiement un excellent
    // film malgrès une ou deux longueurs. Il est unique !",
    // message.getContent());
    //        assertEquals("postedDate", date, message.getPostedDate());
    //        assertEquals("version", 1, message.getVersion());
    //        
    //        
    //    }
    //    
    //    public final void testFindListForObjectWithoutMessageFound() {
    //        
    //        // new topic
    //        Topic topic = new TopicImpl();
    //        topic.setId(1987);
    //        
    //        // find for topic
    //        List list = messageMapper.findListForObject(topic);
    //
    //        // check
    //        assertEquals("list", 0, list.size());
    //        
    //    }

    /**
     * test if object is a singleton
     */
    public final void testSingleton() {

        assertTrue("singleton", MessageBoardsObjectFactory
                .isSingleton("messageMapper"));

    }

}
