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
package net.sf.pmr.core.domain.project;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserImpl;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ProjectValidatorTest extends TestCase {

    private Validator basicProjectValidator;
    
    private Project basicProject;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        
        basicProjectValidator = CoreObjectFactory.getProjectValidator();
        
        basicProject = new ProjectImpl();
        basicProject.setMembers(new HashSet());
        
        super.setUp();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    
    /**
     * test que le validator est bien un singleton
     * (c'est une classe de service)
     */
    public void testIsSingleton() {
        
        assertTrue("singleton", CoreObjectFactory.isSingleton("projectValidator"));
        
    }
    
    /**
     * test Validator sur les champs obligatoire 
     * avec la local FRENCH
     */
    public void testValidateMandatoryFieldWithLocaleFrench() {
        
        
        Errors errors = basicProjectValidator.validate(basicProject);
        
        assertEquals("le nom est obligatoire", errors.getFieldError("name", Locale.FRENCH));
        assertEquals("le code est obligatoire", errors.getFieldError("code", Locale.FRENCH));
        assertEquals("un project doit avoir au moins un membre", errors.getGlobalError(Locale.FRENCH));
        
    }
    
    
    /**
     * test Validator sur les champs obligatoire avec la locale ENGLISH
     */
    public void testValidateMandatoryFieldWithLocaleEnglish() {
        
        
        Errors errors =  basicProjectValidator.validate(basicProject);
        
        assertEquals("name is mandatory", errors.getFieldError("name", Locale.ENGLISH));
        assertEquals("code is mandatory", errors.getFieldError("code", Locale.ENGLISH));
        
    }
    
    /**
     * test Validator sur la taille des champs quand elle est correcte
     */
    public void testValidateFieldWhenSizeIsOk() {

    // 10 caract�res
    basicProject.setCode("AAAAAAAAAA");
    // 100 caract�re
    basicProject.setName("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        
    Errors errors = basicProjectValidator.validate(basicProject);
    
    assertFalse("pas d'erreur sur le nom", errors.hasFieldErrors("name"));
    assertFalse("pas d'erreur sur le code", errors.hasFieldErrors("code"));
    
    }
    
    /**
     * test validator sur la taille des champs avec la locale ENGLISH
     */
    public void testValidateWrongFieldSizeWithLocaleEnglish() {
    
    basicProject.setCode("AAAAAAAAAAA");
    basicProject.setName("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
    
    Errors errors = basicProjectValidator.validate(basicProject);

    assertEquals("name is too long", errors.getFieldError("name", Locale.ENGLISH));
    assertEquals("code is too long", errors.getFieldError("code", Locale.ENGLISH));
    
    }

    
    /**
     * test validator sur la taille des champs avec la locale FRENCH
     */
    public void testValidateWrongFieldSizeWithLocaleFrench() {
    
    basicProject.setCode("AAAAAAAAAAA");
    basicProject.setName("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
    
    Errors errors = basicProjectValidator.validate(basicProject);
    
    assertEquals("le nom est trop long", errors.getFieldError("name", Locale.FRENCH));
    assertEquals("le code est trop long", errors.getFieldError("code", Locale.FRENCH));

    
    }

    /**
     * test validator sur la pr�sence d'au moins
     *  moins un membre (dans le projet) avec la locale FRENCH)
     */
    public void testValidateProjectMustHaveAtLeastOneMemberwithLocaleFrench() {
        
        Errors errors = basicProjectValidator.validate(basicProject);
        
        assertEquals("un project doit avoir au moins un membre", errors.getGlobalError(Locale.FRENCH));
        
    }
    
    
    /**
     * test validator sur la pr�sence d'au moins
     *  moins un membre (dans le projet) avec la locale ENGLISH)
     */
    public void testValidateProjectMustHaveAtLeastOneMemberwithLocaleEnglish() {
        
        
        Errors errors = basicProjectValidator.validate(basicProject);
        
        assertEquals("project must have at least one member", errors.getGlobalError(Locale.ENGLISH));
        
    }
    
    
    /**
     * test validator sur la pr�sence d'au moins
     *  moins un membre (dans le projet) avec la locale FRENCH)
     */
    public void testValidateProjectMustHaveAtLeastOneNotNullMemberwithLocaleFrench() {
        
        Set set = new HashSet();
        set.add(null);
        basicProject.setMembers(set);
        
        Errors errors = basicProjectValidator.validate(basicProject);
        
        assertEquals("un project doit avoir au moins un membre", errors.getGlobalError(Locale.FRENCH));
        
    }
    
    /**
     * test validator sur la pr�sence d'au moins
     *  moins un membre (dans le projet) avec la locale ENGLISH)
     */
    public void testValidateProjectMustHaveAtLeastOneNotNullMemberwithLocaleEnglish() {

        Set set = new HashSet();
        set.add(null);
        basicProject.setMembers(set);
        
        Errors errors = basicProjectValidator.validate(basicProject);
        
        assertEquals("project must have at least one member", errors.getGlobalError(Locale.ENGLISH));
        
    }



    /**
     * test validator quand un project a un membre
     */
    public void testValidateProjectMustHaveAtLeastOneMemberAndHaveOneMember() {

        User user = new UserImpl();
        Set set = new HashSet();
        set.add(user);
        
        basicProject.setMembers(set);
        
        Errors errors = basicProjectValidator.validate(basicProject);
        
        assertFalse(errors.hasGlobalErrors());
        
    }
 
    
    /**
     * test validator quand un project a plusieurs membres
     */
    public void testValidateProjectMustHaveAtLeastOneMemberAndHaveSeveralMembers() {

        User user1 = new UserImpl();
        User user2 = new UserImpl();
        Set set = new HashSet();
        set.add(user1);
        set.add(user2);
        
        basicProject.setMembers(set);
        
        Errors errors = basicProjectValidator.validate(basicProject);
        
        assertFalse(errors.hasGlobalErrors());
        
    }
    
}