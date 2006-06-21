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

import net.sf.pmr.core.domain.project.Project;
import de.abstrakt.mock.expectable.ExpectableParameter;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * Classe utilis� dans par mock dans les test unitaires
 *  pour tester le bon passage d'un param�tre de type B	asicProject
 */
public class ExpectBasicProject implements ExpectableParameter {

    /* (non-Javadoc)
     * @see de.abstrakt.mock.expectable.ExpectableParameter#isExpected(java.lang.Object)
     */
    public boolean isExpected(Object object) {
        
        if (object instanceof Project) {
            return true;
        } else {
            return false;
        }

    }

}