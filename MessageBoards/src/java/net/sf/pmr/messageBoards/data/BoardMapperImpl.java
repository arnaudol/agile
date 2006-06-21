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

package net.sf.pmr.messageBoards.data;

import java.util.List;

import net.sf.pmr.messageBoards.domain.Board;
import net.sf.pmr.messageBoards.domain.BoardImpl;

import org.springframework.dao.ConcurrencyFailureException;

/**
 * @author Arnaud
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public final class BoardMapperImpl extends
        org.springframework.orm.hibernate3.support.HibernateDaoSupport
        implements BoardMapper {

    /*
     * (non-Javadoc)
     * 
     * @see com.pm.core.data.EntityMapperForRootAgregate#add(com.pm.core.domain.Entity)
     */
    public void add(final Object entity) {

        Board board = (Board) entity;
        // version is set to one
        board.setPersistanceVersion(1);
        getHibernateTemplate().save(board);

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.pm.core.data.EntityMapperForRootAgregate#delete(com.pm.core.domain.Entity)
     */
    public void delete(final Object entity) {

        throw new ConcurrencyFailureException("m�thode non impl�ment�e");

    }

    /**
     * @see net.sf.pmr.keopsframework.data.EntityMapper#findById(int)
     */
    public Object findById(final int id) {

        return getHibernateTemplate().get(BoardImpl.class, new Integer(id));

    }

    /**
     * @see net.sf.pmr.keopsframework.data.EntityRootAgregateMapper#addOrUpdate(java.lang.Object)
     */
    public void addOrUpdate(final Object entity) {

        getHibernateTemplate().saveOrUpdate((Board) entity);

    }

    /**
     * @see net.sf.pmr.messageBoards.data.BoardMapper#findAll()
     */
    public List findAll() {

        return getHibernateTemplate().loadAll(BoardImpl.class);

    }
}