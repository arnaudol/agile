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
package net.sf.pmr.core.domain.user;

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

import org.apache.commons.validator.EmailValidator;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 *
 * Validate user
 */
public class UserValidatorImpl implements Validator {

    private UserRepository userRepository;

    /**
     * @param userRepository
     */
    public UserValidatorImpl(final UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    /**
     * Validation de l'object m�tier User.<br>
     * Les r�gles sont les suivantes: 
     * <ul>
     * <li>le login est obligatoire</li>
     * <li>le login est unique</li>
     * <li>le mot de passse est obligatoire</li>
     * <li>le nom est obligatoire</li>
     * <li>le pr�nom est obligatoire</li>
     * <li>l'email est obligatoire </li>
     * <li>Le login doit avoir entre 5 et 10 carat�res.</li>
     * <li>Le mot de passe doit avoir entre 5 et 10 caract�res.</li>
     * <li>Le format de l'adresse email doit �tre valide</li>
     * </ul>
     * @param object user � valider
     */
    public Errors validate(final Object object) {

        User user = (User) object;

        Errors errors = CoreObjectFactory.getErrors();
        
        
        if (user.getLogin() == null
                || user.getLogin().trim() == "") {

            errors.rejectValue("login", "user.loginMandatory");
            
        } else if (user.getLogin().length() < 5 || user.getLogin().length() > 10) {
            
            // le login doit avoir entre 5 et 10 caract�res
            errors.rejectValue("login", "user.loginIncorrectSize");
            
        } else if (user.getPersistanceId() == 0 && userRepository.findUserByLogin(user.getLogin()) != null ) {
            
            // le login doit �tre unique
            errors.rejectValue("login", "user.loginAlreadyExists");
            
        }
        
        if (user.getPassword() == null
                || user.getPassword().trim() == "") {

            errors.rejectValue("password", "user.passwordMandatory");

            
        }  else if (user.getPassword().length() < 5 || user.getPassword().length() > 10) {
            
            // le password doit avoir entre 5 et 10 caract�res
            errors.rejectValue("password", "user.passwordIncorrectSize");
        }

        if (user.getLastName() == null
                || user.getLastName().trim() == "") {

            errors.rejectValue("lastName", "user.lastNameMandatory");
            
        } 

        if (user.getFirstName() == null
                || user.getFirstName().trim() == "") {

            errors.rejectValue("firstName", "user.firstNameMandatory");
            
        } 
        
        if (user.getEmail() == null
                || user.getEmail().trim() == "") {

            errors.rejectValue("email", "user.emailMandatory");
            
        } else if (!EmailValidator.getInstance().isValid(user.getEmail())) {
            
            //Le format de l'adresse email doit �tre valide
            
            errors.rejectValue("email", "user.incorrectEmail");
            
        }

         
        return errors;
        
    }

}