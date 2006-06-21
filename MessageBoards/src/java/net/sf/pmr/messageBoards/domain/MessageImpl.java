/*
 * Copyright ou � ou Copr. Arnaud Prost, 28 nov. 2004
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

import java.util.Date;

import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.keopsframework.domain.object.AbstractDomainObject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
/**
 * @author Arnaud
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MessageImpl extends AbstractDomainObject implements Message {

    private Board board;

    private Topic topic;

    private String content;

    private Date postedDate;

    private User sender;

    /**
     * @return Returns the board.
     */
    public Board getBoard() {
        return board;
    }

    /**
     * @param board The board to set.
     */
    public void setBoard(final Board board) {
        this.board = board;
    }
    /**
     * @return Returns the topic.
     */
    public Topic getTopic() {
        return topic;
    }
    /**
     * @param topic The topic to set.
     */

    public void setTopic(final Topic topic) {
        this.topic = topic;
    }
    /* (non-Javadoc)
     * @see com.pm.forum.domain.Message#getContent()
     */
    public String getContent() {
        return this.content;
    }

    /* (non-Javadoc)
     * @see com.pm.forum.domain.Message#setContent(java.lang.String)
     */
    public void setContent(final String content) {
        this.content = content;

    }

    /**
     * @return Returns the date.
     */
    public Date getPostedDate() {
        return postedDate;
    }

    /**
     * @param date The date to set.
     */
    public void setPostedDate(final Date postedDate) {
        this.postedDate = postedDate;
    }

    /* (non-Javadoc)
     * @see com.pm.forum.domain.Message#getPostedBy()
     */
    public User getPostedBy() {
        // TODO Auto-generated method stub
        return this.sender;
    }
    /* (non-Javadoc)
     * @see com.pm.forum.domain.Message#setPostedBy(com.pm.forum.domain.Member)
     */
    public void setPostedBy(final User user) {
        // TODO Auto-generated method stub
        this.sender = user;
    }

    
   
    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(1449048593, -1578963675).append(this.topic).append(
                this.content).toHashCode();
    }
    /**
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(final Object object) {
        if (!(object instanceof MessageImpl)) {
            return false;
        }
        MessageImpl rhs = (MessageImpl) object;
        return new EqualsBuilder()
                .append(this.topic, rhs.topic)
                .append(this.content, rhs.content).isEquals();
    }
}