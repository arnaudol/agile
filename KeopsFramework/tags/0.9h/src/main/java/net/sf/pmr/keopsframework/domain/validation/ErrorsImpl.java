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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 * 
 * TODO : sur les opération sur les field utiliser les commons-beanUtils pour vérifier les champs et accéder à leur valeur et renvoyer une exception s'il le champs n'est pas trouvé
 * TODO : supprimer la dépendance avec Spring. Ne dépendre que du JDK voir des commons
 */
public class ErrorsImpl implements Errors {

    // TODO  ce n'est pas terrible de dépendre d'une classe de spring....
    private MessageSource messageSource;

    private List<MessageParameters> globalErrors;

    private Map<String, List<MessageParameters>> fieldErrors;

    private List<String> allErrors;

    /**
     * @param resourceBundleMessageSource
     */
    public ErrorsImpl(final MessageSource messageSource) {
        super();
        this.messageSource = messageSource;
        this.globalErrors = new ArrayList<MessageParameters>();
        this.fieldErrors = new HashMap<String, List<MessageParameters>>();
        this.allErrors = new ArrayList<String>();
    }

    /**
     * Inner class containing message parameters 
     * @author Arnaud Prost (arnaud.prost@gmail.com)
     *
     */
    private class MessageParametersImpl implements MessageParameters {
        
        private String errorCode;
        
        private Object[] errorArguments;
        
        /**
         * @param errorCode
         * @param errorArguments
         */
        public MessageParametersImpl(final String errorCode,
                final Object[] errorArguments) {
            this.errorCode = errorCode;
            this.errorArguments = errorArguments;
        }
        
        public Object[] getErrorArguments() {
            return errorArguments;
        }
        public String getErrorCode() {
            return errorCode;
        }
    }
    

    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#hasErrors()
     */
    public boolean hasErrors() {
        if (globalErrors.size() == 0 & fieldErrors.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#getErrorCount()
     */
    public int getErrorCount() {

        int totalErrors = globalErrors.size();

        for (Iterator i = fieldErrors.values().iterator(); i.hasNext();) {

            Object object = i.next();

            if (object instanceof List) {
                List list = (List) object;
                totalErrors = totalErrors + list.size();
            } else {
                totalErrors = totalErrors + 1;
            }
        }

        return totalErrors;

    }

    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#getAllErrors(java.util.Locale)
     */
    public List<String> getAllErrors(Locale locale) {
        
        allErrors.clear();
        
        for (MessageParameters messageParameters : globalErrors) {
            String message = getMessage(messageParameters.getErrorCode(), messageParameters.getErrorArguments(), locale);
            allErrors.add(message);
        }
        
        for (List<MessageParameters> list : fieldErrors.values()) {
            for (MessageParameters messageParameters : list) {
                String message = getMessage(messageParameters.getErrorCode(), messageParameters.getErrorArguments(), locale);
                allErrors.add(message);
            }
        }
        return allErrors;
    }
    
    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#getAllErrorsMessageParameters()
     */
    public List getAllErrorsMessageParameters() {

        List<MessageParameters> listToreturn = new ArrayList<MessageParameters>();
        
        listToreturn.addAll(globalErrors);
       
        for (List<MessageParameters> list : fieldErrors.values()) {
            listToreturn.addAll(list);
        }
                
        return listToreturn;
    }
    
    
    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#hasGlobalErrors()
     */
    public boolean hasGlobalErrors() {
        if (globalErrors.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#hasFieldErrors(String)
     */
    public boolean hasFieldErrors(final String field) {
        if (this.getFieldErrorCount(field) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @see com.keops.domain.validation#getGlobalErrorCount()
     */
    public int getGlobalErrorCount() {
        return globalErrors.size();
    }


    public String getGlobalError(Locale locale) {
        
        String errorToReturn = null;

        for (MessageParameters messageParameters : globalErrors) {
            
            errorToReturn = getMessage(messageParameters.getErrorCode(), messageParameters.getErrorArguments(), locale);

            break;
        }

        return errorToReturn;
      
    }
    
    
    /**
     * @see net.sf.pmr.keopsframework.domaon.validation.Errors#getGlobalErrors()
     */
    // TODO unmodifiable liste ?
    public List getGlobalErrors() {
        return globalErrors;
    }
 
    public List<String> getGlobalErrors(final Locale locale) {

        List<String> listToReturn = new ArrayList<String>();
        
        for (MessageParameters messageParameters : globalErrors) {
            
            String message = getMessage(messageParameters.getErrorCode(), messageParameters.getErrorArguments(), locale);

            listToReturn.add(message);

        }
        
        return listToReturn;

        
    }
    /**
     * @see com.keops.domain.validation#getFieldErrorCount(java.lang.String)
     */
    public int getFieldErrorCount(final String field) {

        int fieldErrorsToReturn = 0;

        List list = (List) fieldErrors.get(field);

        if (list != null) {
            fieldErrorsToReturn = list.size();
        }

        return fieldErrorsToReturn;

    }

    /**
     * @see come.keops.domain.validation.Errors#getFieldError(java.lang.String)
     */
    public String getFieldError(final String field, final Locale locale) {

        String fieldErrorToReturn = null;

        List<MessageParameters> list = (List<MessageParameters>) fieldErrors.get(field);

        if (list != null) {

            for (MessageParameters messageParameters : list) {
                
                fieldErrorToReturn = getMessage(messageParameters.getErrorCode(), messageParameters.getErrorArguments(), locale);
                
                break;
            }
        }

        return fieldErrorToReturn;

    }
    
    
    /**
     * @see come.keops.domain.validation.Errors#getFieldErrors(java.lang.String,
     *      java.util.Locale)
     */
    public List<String> getFieldErrors(final String field, final Locale locale) {

        List<String> listToReturn = null;

        List<MessageParameters> list = (List<MessageParameters>) fieldErrors.get(field);

        if (list != null) {
            
            listToReturn = new ArrayList<String>();

            for (MessageParameters messageParameters : list) {
                
                String message = getMessage(messageParameters.getErrorCode(), messageParameters.getErrorArguments(), locale);
                
                listToReturn.add(message);
                
            }
        }

        return listToReturn;
        
    }
  
    /**
     * @see com.keops.domain.validation.Errors#rejectValue(String, String,
     *      Locale String)
     */
    public void rejectValue(final String field, final String errorCode,
            final Object[] errorArguments) {

        
        MessageParameters messageParameters = new MessageParametersImpl(errorCode, errorArguments);
        
        if (fieldErrors.containsKey(field)) {

            List<MessageParameters> list = (List<MessageParameters>) fieldErrors.get(field);
            list.add(messageParameters);

        } else {
            List<MessageParameters> list = new ArrayList<MessageParameters>();
            list.add(messageParameters);
            fieldErrors.put(field, list);
        }

    }

    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#rejectValue(String, String)
     */
    public void rejectValue(final String field, final String errorCode) {

        rejectValue(field, errorCode, null);

    }
    
    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#reject(String, Object[])
     */
    public void reject(final String errorCode, final Object[] errorArguments) {

        MessageParameters messageParameters = new MessageParametersImpl(errorCode, errorArguments);

        globalErrors.add(messageParameters);

    }
    
    /**
     * @see net.sf.pmr.keopsframework.domain.validation.Errors#rejectValue(String, String)
     */
    public void reject(final String errorCode) {

        reject(errorCode, null);

    }

    private String getMessage(final String errorCode,
            final Object[] errorArguments, final Locale locale) {

        String messageToReturn = null;

        try {
            messageToReturn = messageSource.getMessage(errorCode,
                    errorArguments, locale);
        } catch (NoSuchMessageException e) {
            messageToReturn = e.getMessage();
        }

        return messageToReturn;

    }

}