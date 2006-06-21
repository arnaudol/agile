/*
 * Copyright ou © ou Copr. Arnaud Prost, 29 mai 2004
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
import net.sf.pmr.messageBoards.data.BoardMapper;
import net.sf.pmr.messageBoards.data.MessageMapper;
import net.sf.pmr.messageBoards.domain.Board;
import net.sf.pmr.messageBoards.domain.BoardRepository;
import net.sf.pmr.messageBoards.domain.Message;
import net.sf.pmr.messageBoards.domain.MessageRepository;
import net.sf.pmr.messageBoards.domain.Topic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;


/**
 * @author Arnaud
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
public final class MessageBoardsObjectFactory {

    private MessageBoardsObjectFactory() {
    }

    /**
     * get the message
     * @return message
     */
    public static Message getMessage() {

        return (Message) MessageBoardsObjectFactory.getObject("message");
    }

    /**
     * get the messageRepository
     * @return messagerepository
     */
    public static MessageRepository getMessageRepository() {

        return (MessageRepository) MessageBoardsObjectFactory.getObject("messageRepository");
    }


    /**
     * get the messageMapper
     * @return messageMapper
     */
    public static MessageMapper getMessageMapper() {

        return (MessageMapper) MessageBoardsObjectFactory.getObject("messageMapper");
    }

    /**
     * get the topic
     * @return topic
     */
    public static Topic getTopic() {

        return (Topic) MessageBoardsObjectFactory.getObject("topic");
    }

    /**
     * get the board
     * @return board
     */
    public static Board getBoard() {

        return (Board) MessageBoardsObjectFactory.getObject("board");
    }

    /**
     * get the boardRepository
     * @return boardrepository
     */
    public static BoardRepository getBoardRepository() {

        return (BoardRepository) MessageBoardsObjectFactory.getObject("boardRepository");
    }


    /**
     * get the boardMapper
     * @return boardMapper
     */
    public static BoardMapper getBoardMapper() {

        return (BoardMapper) MessageBoardsObjectFactory.getObject("boardMapper");
    }


    /**
     * get an object from the Spring application context
     * @param objectName
     * @return object
     */
    private static Object getObject(final String objectName) {

        return ContextSingletonBeanFactoryLocator.getInstance().useBeanFactory(
                "net.sf.pmr.messageBoards").getFactory().getBean(objectName);

    }

    /**
     * get the bean factory
     * @return beanFactory
     */
    private static BeanFactory getBeanFactory() {

        return ContextSingletonBeanFactoryLocator.getInstance().useBeanFactory(
                "net.sf.pmr.messageBoards").getFactory();
    }

    /**
     * is an object singleton ?
     * @param object
     * @return boolean
     */
    public static boolean isSingleton(final String object) {

        return MessageBoardsObjectFactory.getBeanFactory().isSingleton(object);

    }

}