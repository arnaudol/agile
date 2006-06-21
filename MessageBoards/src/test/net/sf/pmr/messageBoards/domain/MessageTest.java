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

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.messageBoards.MessageBoardsObjectFactory;

/**
 * @author Arnaud
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MessageTest extends TestCase {

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

    public final void testObjectCreation() throws Exception {

        Message message = MessageBoardsObjectFactory.getMessage();

        // to check Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
        Date date = dateFormat.parse("01/01/2000 00:00");

        assertEquals("id", 0, message.getId());
        assertTrue("topic", message.getTopic() instanceof Topic);
        assertEquals("content", null, message.getContent());
        assertTrue("postedBy", message.getPostedBy() instanceof User);
        assertEquals("postedDate", date, message.getPostedDate());
        assertEquals("version", 0, message.getPersistanceVersion());

    }

    /**
     * test if object is not a singleton
     *
     */
    public final void testSingleton() {

        assertFalse("not singleton", MessageBoardsObjectFactory
                .isSingleton("message"));

    }

    /**
     * Equality is made on id + topic + content
     */
    public final void testEquals() {

        Message message1 = new MessageImpl();
        Message message2 = new MessageImpl();

        assertTrue(message1.equals(message2));

        message1.setId(1);

        assertFalse(message1.equals(message2));

        message1.setId(0);
        message1.setTopic(new TopicImpl());

        assertFalse(message1.equals(message2));

        message1.setTopic(null);
        message1.setContent("scooby!");

        assertFalse(message1.equals(message2));

    }

    public final void testHashCode() {

        Message message1 = new MessageImpl();
        Message message2 = new MessageImpl();

        assertTrue(message1.hashCode() == message2.hashCode());

        message1.setId(1);

        assertFalse(message1.hashCode() == message2.hashCode());

        message1.setId(0);
        message1.setTopic(new TopicImpl());

        assertFalse(message1.hashCode() == message2.hashCode());

        message1.setTopic(null);
        message1.setContent("scooby!");

        assertFalse(message1.hashCode() == message2.hashCode());

    }

}
