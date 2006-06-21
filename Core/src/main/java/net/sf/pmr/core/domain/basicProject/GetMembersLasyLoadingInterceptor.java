/*
* Copyright 2005 Arnaud Prost
* 
* Arnaud.prost@gmail.com
* 
* This software is a computer program whose purpose is to ease the 
* management of software project.
* 
* This software is governed by the CeCILL  license under French law and
* abiding by the rules of distribution of free software.  You can  use, 
* modify and/ or redistribute the software under the terms of the CeCILL
* license as circulated by CEA, CNRS and INRIA at the following URL
* "http://www.cecill.info". 
* 
* As a counterpart to the access to the source code and  rights to copy,
* modify and redistribute granted by the license, users are provided only
* with a limited warranty  and the software's author,  the holder of the
* economic rights,  and the successive licensors  have only  limited
* liability. 
* 
* In this respect, the user's attention is drawn to the risks associated
* with loading,  using,  modifying and/or developing or reproducing the
* software by the user in light of its specific status of free software,
* that may mean  that it is complicated to manipulate,  and  that  also
* therefore means  that it is reserved for developers  and  experienced
* professionals having in-depth computer knowledge. Users are therefore
* encouraged to load and test the software's suitability as regards their
* requirements in conditions enabling the security of their systems and/or 
* data to be ensured and,  more generally, to use and operate it in the 
* same conditions as regards security. 
* 
* The fact that you are presently reading this means that you have had
* knowledge of the CeCILL license and that you accept its terms.
*/

package net.sf.pmr.core.domain.basicProject;

import java.util.HashSet;
import java.util.Set;

import net.sf.pmr.keopsframework.data.DomainListMapper;

import org.aopalliance.intercept.MethodInvocation;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * réalise un lasy loading sur la liste des membres d'un projet.
 */
public class GetMembersLasyLoadingInterceptor implements
        DomainCollectionLasyLoadingInterceptor {

    private DomainListMapper domainListMapper;

    /**
     * set the DomainListMapper
     *
     * @param domainListMapper
     *            domainListMapper
     */
    public void setDomainListMapper(final DomainListMapper domainListMapper) {
        this.domainListMapper = domainListMapper;
    }

    /**
     * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
     */
    public Object invoke(final MethodInvocation invocation) throws Throwable {

        // invocation
        Object returnValue = invocation.proceed();

        // BasicProject est un proxy, il faut r�cup�rer la target
        BasicProject basicProject = (BasicProject) invocation.getThis();
        
        // apr�s invocation si l'oject est null (la collection), interrogation
        // de la base
        // ATTENTION : l'object doit exister en base !!!! Sinon exception hibernate. Donc l'Id doit �tre > � 0
        if (returnValue == null && basicProject.getPersistanceId() > 0 ) {

            returnValue = domainListMapper.findCollectionForObject(basicProject);
              
            // la valeur de retour est donn�e � l'object
            basicProject.setMembers((Set) returnValue);
            
        } else if (returnValue == null ){
            // si non ne va pas chercher en base et si la collection est null, cr�ation d'une collection
            // histoire d'�viter plus tard une NullPointerException....
            returnValue = new HashSet();
            basicProject.setMembers((Set) returnValue);
        }
        
        // sinon on ne fait rien...

        return returnValue;

    }

}