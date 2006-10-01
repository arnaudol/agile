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
package net.sf.pmr.keopsframework.domain.validation;

import java.util.List;
import java.util.Locale;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * Interface de la structure d'erreur
 * Elle est largement inspirée de celle du framework Spring à différence:
 * - elle a été simplifiée en supprimant certaines méthodes
 *
 */
public interface Errors {


    /**
     * Reject the current object, using the given error description.
     * @param errorCode
     */
    void reject(final String errorCode);

    /**
     * Reject the current object, using the given error description.
     * @param errorCode
     * @param errorArguments
     */
    void reject(final String errorCode, final Object[] errorArguments);

    /**
    * Reject the given field of the current object, using the given error description.
     * @param field
     * @param errorCode
    */
    void rejectValue(final String field, final String errorCode);

    /**
     * Reject the given field of the current object, using the given error description.
     * @param field
     * @param errorCode
     * @param errorArguments
     */
     void rejectValue(final String field, final String errorCode, final Object[] errorArguments);


    /**
     * public boolean hasErrors()
     * @return boolean
     */
      boolean hasErrors();

      /**
       * Return the total number of errors.
       * @return int
       */
      int getErrorCount();

     
     /**
      * Get all errors, both global and field ones.
      * @param locale locale
      * @return List of errors
      */
      List getAllErrors(Locale locale);
      
      /**
       * Get all the message parameters for all errors, both global and field ones.
       * @param locale locale
       * @return List of errors
       */
       List getAllErrorsMessageParameters();


    /**
     * Return if there were any global (i.e. not field-specific) errors.
     * @return boolean
     */
     boolean hasGlobalErrors();

     /**
      * Return if there are any errors associated with the given field.
      * @param field
      * @return boolean
      */
      boolean hasFieldErrors(final String field);

    /**
     * Return the number of global (i.e. not field-specific) errors.
     * @return number of errors
     */
     int getGlobalErrorCount();
    
    /**
     * Get the first global error, if any.
     * @param locale locale
     * @return number of errors 
     */
     String getGlobalError(Locale locale);

    
    /**
     *  Get all global errors.
     * @param locale locale
     * @return list list
     */
    List getGlobalErrors(Locale locale);


    /**
     * Return the number of errors associated with the given field.
     * @param field name of the field
     * @return int number or errors for the field
     */
     int getFieldErrorCount(final String field);

    
    /**
     * Get the first error associated with the given field, if any.
     * @param field field
     * @param locale locale
     * @return String
     */
     String getFieldError(final String field, final Locale locale);

     
    /**
     * Get all errors associated with the given field.
     * @param field field
     * @param locale locale
     * @return List list 
     */
    List getFieldErrors(final String field, final Locale locale);

}