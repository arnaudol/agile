/*
 * Copyright ou � ou Copr. Arnaud Prost, 4 d�c. 2004
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

package net.sf.pmr.messageBoards.domain;

import net.sf.pmr.messageBoards.MessageBoardsObjectFactory;
import net.sf.pmr.messageBoards.domain.Topic;
import net.sf.pmr.messageBoards.domain.TopicImpl;
import junit.framework.TestCase;


/**
 * @author Arnaud
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TopicTest extends TestCase {

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
    
    public final void testObjectCreation () {
     
        Topic topic = MessageBoardsObjectFactory.getTopic();
       
        assertEquals("title", null, topic.getTitle());
        
    }
    
    
    /**
     * test if object is not a singleton
     *
     */
    public final void testSingleton() {
        
        assertFalse("not singleton", MessageBoardsObjectFactory.isSingleton("topic"));

    }
    
    public final void testEquals () {
        
        Topic topic1 = new TopicImpl();
        Topic topic2 = new TopicImpl();
        
        assertTrue(topic1.equals(topic2));
        
        topic1.setTitle("titre");
        topic2.setTitle("titre");
        
        assertTrue(topic1.equals(topic2));
        
        topic2.setTitle("super title");
        
        assertFalse(topic1.equals(topic2));
        
    }
    
    public final void testHashCode () {
        
        
        Topic topic1 = new TopicImpl();
        Topic topic2 = new TopicImpl();
        
        assertTrue(topic1.hashCode() ==	topic2.hashCode());
        
        topic1.setTitle("titre");
        topic2.setTitle("titre");
        
        assertTrue(topic1.hashCode() ==	topic2.hashCode());
        
        topic2.setTitle("super title");
        
        assertFalse(topic1.hashCode() ==	topic2.hashCode());
        
        
    }

}

