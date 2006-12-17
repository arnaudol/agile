/*
 * Copyright ou � ou Copr. Arnaud Prost, 26 f�vr. 2005
 *
 * arnaud.prost@gmail.com
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

 * Le fait que vous puissiez acc�der � cet en-t�te signifie que vous avez
 * pris connaissance de la licence CeCILL, et que vous en avez accept� les
 * termes.
 */

package net.sf.pmr.keopsframework.domain.validation;


import java.util.List;
import java.util.Locale;

import junit.framework.TestCase;

import org.springframework.context.MockMessageSource;

import de.abstrakt.mock.MockCore;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class ErrorsTest extends TestCase {

    private Errors errors;
    
    private MockMessageSource mockmessageSource;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        
        super.setUp();
        
        mockmessageSource = new MockMessageSource();
        
        errors = new ErrorsImpl(mockmessageSource);
        
        MockCore.reset();
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
    // TODO finir les tests !!
    
//    /**
//     * test la bonne prise en compte de la locale
//     *
//     */
//    public void testLocalewithReject() {
//        fail();
//    }
//
//    public void testLocaleWithRejectValue() {
//        fail();
//    }

//    /**
//     * test que le message par d�faut est bien pris en compte
//     * quand il n'y a pas de message trouv�
//     */
//    public void testRejectWhenNoMessageResourceFound() {
//        
//        errors.reject("1", Locale.FRANCE, "pas de message !!");
//        
//        assertEquals("pas de message !!", errors.getGlobalError());
//        
//    }
//
//    public void testRejectValueWhenNoMessageResourceFound() {
//        fail();
//    }
//
//    public void testRejectWhenMessageNotFoundInResource() {
//        fail();
//    }
//
//    public void testRejectValueWhenMessageNotFoundInResource() {
//        fail();
//    }
//
//    /**
//     * test reject value quand le nom du champs sp�cifi� n'existe pas 
//     * dans l'object
//     */
//    public void testRejectValueWhenFieldDoesNotExist() {
//        fail();
//    }
    
    
    /**
     * Test la m�thode GetAllErrorsMessageParameters
     * Avec des erreurs globales et de champs sans parametres  
     */
    public void testGetAllErrorsMessageParametersWithoutParameters() {
        
        errors.reject("my.error");
        errors.reject("my.super.error");
        errors.rejectValue("scooby", "error.scooby");
        errors.reject("my.mega.error");
        errors.rejectValue("doo", "error.doo");
        
        List list = errors.getAllErrorsMessageParameters();
        
        assertEquals("my.error", ((MessageParameters) list.get(0)).getErrorCode());
        assertEquals("my.super.error", ((MessageParameters) list.get(1)).getErrorCode());
        assertEquals("my.mega.error", ((MessageParameters) list.get(2)).getErrorCode());
        assertEquals("error.scooby", ((MessageParameters) list.get(3)).getErrorCode());
        assertEquals("error.doo", ((MessageParameters) list.get(4)).getErrorCode());
        
    }
    
    /**
     * Test la m�thode GetAllErrorsMessageParameters
     * Avec des erreurs globales et de champs avec parametres  
     */
    public void testGetAllErrorsMessageParametersWithParameters() {


        Object[] errorParameters1 = new Object[] {"param1"};
        
        errors.reject("my.error", errorParameters1);
        
        Object[] errorParameters2 = new Object[] {"param2", "param3"};
        
        errors.reject("my.super.error", errorParameters2);
        
        Object[] errorParameters3 = new Object[] {"param4"};
        
        errors.rejectValue("scooby", "error.scooby", errorParameters3);
        
        Object[] errorParameters4 = new Object[] {"param5", "param6"};
        
        errors.rejectValue("scooby", "error.super.scooby", errorParameters4);
        
        List list = errors.getAllErrorsMessageParameters();
        
        assertEquals("my.error", ((MessageParameters) list.get(0)).getErrorCode());
        assertEquals("param1", ((MessageParameters) list.get(0)).getErrorArguments()[0]);
        
        assertEquals("my.super.error", ((MessageParameters) list.get(1)).getErrorCode());
        assertEquals("param2", ((MessageParameters) list.get(1)).getErrorArguments()[0]);
        assertEquals("param3", ((MessageParameters) list.get(1)).getErrorArguments()[1]);
        
        assertEquals("error.scooby", ((MessageParameters) list.get(2)).getErrorCode());
        assertEquals("param4", ((MessageParameters) list.get(2)).getErrorArguments()[0]);

        assertEquals("error.super.scooby", ((MessageParameters) list.get(3)).getErrorCode());
        assertEquals("param5", ((MessageParameters) list.get(3)).getErrorArguments()[0]);
        assertEquals("param6", ((MessageParameters) list.get(3)).getErrorArguments()[1]);
        
//        
//        for (int i = 0; i < objects.length; i++) {
//        }
//        
//        Object o = objects[1];
        
        
    }

        
    
    
    
    /**
     * test la m�thode getAllErrors
     * quand la la validation a trouv�e une erreurs
     */
    public void testgetAllErrorsWithOneGlobalErrors() {
        
        errors.reject("1");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "L'object est incoh�rent");
        
        assertEquals("L'object est incoh�rent", errors.getAllErrors(Locale.FRENCH).get(0));
        
        assertEquals(1, errors.getGlobalErrorCount());
        
        MockCore.verify();

    }

    /**
     * test la m�thode getAllErrors
     * quand la la validation a trouv�e des erreurs
     */
    public void testgetAllErrorsWithSeveralGlobalErrors() {

        errors.reject("1");
        errors.reject("2");

        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "L'object est incoh�rent");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "L'object est super incoh�rent");
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "L'object est incoh�rent");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "L'object est super incoh�rent");
        
        
        assertTrue(errors.getAllErrors(Locale.FRENCH).contains("L'object est incoh�rent"));
        assertTrue(errors.getAllErrors(Locale.FRENCH).contains("L'object est super incoh�rent"));
        
        assertEquals(2, errors.getErrorCount());
        
        MockCore.verify();

    }

    /**
     * test la m�thode getAllErrors
     * quand la la validation a trouv�e une erreurs
     */
    public void testgetAllErrorsWithOneFieldErrors() {

        errors.rejectValue("name", "1");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "Le nom est incorrect");

        assertEquals("Le nom est incorrect", errors.getAllErrors(Locale.FRENCH).get(0));
        
        assertEquals(1, errors.getErrorCount());
        
        MockCore.verify();

    }

    /**
     * test la m�thode getAllErrors
     * quand la la validation a trouv�e des erreurs
     */
    public void testgetAllErrorsWithSeveralFieldErrors() {

        errors.rejectValue("name", "1");
        errors.rejectValue("e-mail", "2");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "Le nom est incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "L'email est incorrect");
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "Le nom est incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "L'email est incorrect");

        assertTrue("", errors.getAllErrors(Locale.FRENCH).contains("Le nom est incorrect"));
        assertTrue("", errors.getAllErrors(Locale.FRENCH).contains("L'email est incorrect"));
        
        assertEquals(2, errors.getErrorCount());
        
        MockCore.verify();

    }

    /**
     * test la m�thode getAllErrors
     * Avec des erreurs globales et field
     */
    public void testgetAllErrorsWithGlobalAndFieldErrors() {

        errors.rejectValue("name", "1");
        errors.rejectValue("e-mail", "2");
        errors.reject("3");

        MockCore.startBlock();
      
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "L'email est incorrect");
        mockmessageSource.expectGetMessage("3", null, Locale.FRENCH, "L'object est incoh�rent");
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "Le nom est incorrect");
        
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "L'email est incorrect");
        mockmessageSource.expectGetMessage("3", null, Locale.FRENCH, "L'object est incoh�rent");
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "Le nom est incorrect");
        
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "L'email est incorrect");
        mockmessageSource.expectGetMessage("3", null, Locale.FRENCH, "L'object est incoh�rent");
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "Le nom est incorrect");
              
        MockCore.endBlock();

        assertTrue("nom", errors.getAllErrors(Locale.FRENCH).contains("Le nom est incorrect"));
        assertTrue("email", errors.getAllErrors(Locale.FRENCH).contains("L'email est incorrect"));
        assertTrue("object", errors.getAllErrors(Locale.FRENCH).contains("L'object est incoh�rent"));

        assertEquals("nombre total d'erreur", 3, errors.getErrorCount());
    }

    /**
     * test la m�thode getAllErrors
     * quand la la validation n'a pas trouv�e d'erreurs
     */
    public void testgetAllErrorsWithoutErrors() {

        assertEquals(0, errors.getErrorCount());

    }

    /**
     * test la m�thode hasErrors quand des erreurs
     * sont d�tect�es en field
     */
    public void testHasErrorswithFieldErrors() {

        errors.rejectValue("nom", "1");

        assertTrue(errors.hasErrors());

    }

    /**
     * test la m�thode hasErrors quand des erreurs
     * sont d�tect�es en Global
     */
    public void testHasErrorswithGlobaldErrors() {

        errors.reject("1");

        assertTrue(errors.hasErrors());

    }

    /**
     * test la m�thode hasErrors quand des erreurs
     * sont d�tect�es en global et Field
     */
    public void testHasErrorswithGlobaldAndFieldErrors() {

        errors.rejectValue("nom", "1");
        errors.reject("1");

        assertTrue(errors.hasErrors());

    }

    /**
     * test la m�thode hasErrors quand il
     * n'y a pas d'erreur
     */
    public void testHasErrorswithoutErrors() {

        assertFalse(errors.hasErrors());

    }

    /**
     * test de la m�thode quand il y a une
     * erreur globale
     */
    public void testGetErrorCountWithOneGlobalError() {

        errors.reject("1");

        assertEquals(1, errors.getErrorCount());

    }

    /**
     * test de la m�thode quand il n'y a des
     * erreurs globales
     */
    public void testGetErrorCountWithSeveralGlobalErrors() {

        errors.reject("1");
        errors.reject("2");

        assertEquals(2, errors.getErrorCount());

    }

    /**
     * test de la m�thode quand il n'y a des
     * erreurs field
     */
    public void testGetErrorCountWithOneFieldError() {

        errors.rejectValue("nom", "1");

        assertEquals(1, errors.getErrorCount());

    }

    /**
     * test de la m�thode quand il n'y a des
     * erreurs field
     */
    public void testGetErrorCountWithSeveralFieldErrors() {

        errors.rejectValue("nom", "1");
        errors.rejectValue("nom", "2");

        assertEquals(2, errors.getErrorCount());

    }

    /**
     * test de la m�thode quand il n'y a des
     * erreurs globale et field
     */
    public void testGetErrorCountWithGlobalAndFieldErrors() {

        errors.reject("1");
        errors.rejectValue("nom", "1");
        errors.rejectValue("nom", "2");

        assertEquals(3, errors.getErrorCount());

    }

    /**
     * test de la m�thode quand il n'y a pas
     * d'erreur
     */
    public void testGetErrorCountWithoutErrors() {

        assertEquals(0, errors.getErrorCount());

    }

    /**
     * test quand il y a une erreurs
     */
    public void testGetFieldErrorWithOneError() {

        errors.rejectValue("name", "1");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "nom incorrect");
      
        assertEquals("nom incorrect", errors.getFieldError("name", Locale.FRENCH));
       
       MockCore.verify();

    }

    /**
     * test quand il y a plusieurs erreurs
     */
    public void testGetFieldErrorWithSeveralErrors() {

        errors.rejectValue("name", "1");
        errors.rejectValue("email", "1");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "nom incorrect");
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "email incorrect");

        assertEquals("nom incorrect", errors.getFieldError("name", Locale.FRENCH));
        assertEquals("email incorrect", errors.getFieldError("email", Locale.FRENCH));
        
        MockCore.verify();

    }

    /**
     * test quand il y a une erreur globale
     */
    public void testGetFieldErrorWithGlobalError() {

        errors.reject("1");
        
        assertNull(errors.getFieldError("name", Locale.FRENCH));
        
        MockCore.verify();

    }

    /**
     * test quand il n'y a pas d'erreurs correspondante pour le champs
     * 
     */
    public void testGetFieldErrorWithoutErrorForTheField() {

        assertNull(errors.getFieldError("name", Locale.FRENCH));

    }

    /**
     * test quand il n'y a pas d'erreurs
     */
    public void testGetFieldErrorsWithoutErrors() {

        assertNull(errors.getFieldErrors("name", Locale.FRENCH));

    }

    /**
     * test avec une erreur sur le champs
     */
    public void testGetFieldErrorsWithOneErrorOnField() {

        errors.rejectValue("name", "1");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "nom incorrect");

        assertEquals("nom incorrect", errors.getFieldErrors("name", Locale.FRENCH).get(0));
        
        MockCore.verify();	

    }

    /**
     * test avec plusieurs erreurs sur le champs
     */
    public void testGetFieldErrorsWithSeveralErrorsOnField() {

        errors.rejectValue("name", "1");
        errors .rejectValue("name", "2");

        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "nom incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "mais alors pas du tout");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "nom incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "mais alors pas du tout");
        
        
        assertTrue(errors.getFieldErrors("name", Locale.FRENCH).contains("nom incorrect"));
        assertTrue(errors.getFieldErrors("name", Locale.FRENCH).contains("mais alors pas du tout"));
        
        assertEquals(2, errors.getFieldErrorCount("name"));
        
        MockCore.verify();

    }

    /**
     * test avec plusieurs erreurs sur le champs
     */
    public void testGetFieldErrorsWithSeveralErrorsOnDifferentField() {

        errors.rejectValue("name", "1");
        errors.rejectValue("name", "2");
        errors.rejectValue("email", "3");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "nom incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "mais alors pas du tout");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "nom incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "mais alors pas du tout");
        
        assertTrue(errors.getFieldErrors("name", Locale.FRENCH).contains("nom incorrect"));
        assertTrue(errors.getFieldErrors("name", Locale.FRENCH).contains("mais alors pas du tout"));
        
        assertEquals(2, errors.getFieldErrorCount("name"));
        
        MockCore.verify();

    }

    /**
     * test sans erreurs sur le champs
     */
    public void testGetFieldErrorsWithoutErrorsOnField() {

        assertNull(errors.getFieldErrors("name", Locale.FRENCH));

    }

    /**
     * test sans erreurs sur le champs mais avec une erreur global
     */
    public void testGetFieldErrorsWithGlobalError() {

        errors.reject("1");

        assertNull(errors.getFieldErrors("name", Locale.FRENCH));

    }

    /**
     * test quand il y a une erreur
     */
    public void testGetFieldErrorCountWithOneError() {

        errors.rejectValue("name", "1");

        assertEquals(1, errors.getFieldErrorCount("name"));

    }

    /**
     * test quand il y a plusieurs erreurs
     */
    public void testGetFieldErrorCountWithSeveralErrors() {

        errors.rejectValue("name", "1");
        errors.rejectValue("name", "1");

        assertEquals(2, errors.getFieldErrorCount("name"));

    }

    /**
     * test quand il y a plusieurs erreurs sur des champs diff�rents
     */
    public void testGetFieldErrorCountWithSeveralErrorsOnDifferentField() {

        errors.rejectValue("name", "1");
        errors.rejectValue("name", "1");
        errors.rejectValue("email", "1");

        assertEquals(1, errors.getFieldErrorCount("email"));

    }

    /**
     * test quand il n'y a pas d'erreurs
     */
    public void testGetFieldErrorCountWithoutErrors() {

        assertEquals(0, errors.getFieldErrorCount("name"));

    }

    /**
     * test quand il n'y a pas aussi des erreurs globales
     */
    public void testGetFieldErrorCountWithGlobalErrors() {

        errors.rejectValue("name", "1");
        errors.reject("3");

        assertEquals(1, errors.getFieldErrorCount("name"));

    }

    /**
     * test avec une erreur
     */
    public void testGetGlobalErrorWithOneError() {

        errors.reject("1");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "object incorrect");
       
        assertEquals("object incorrect", errors.getGlobalError(Locale.FRENCH));
       
        MockCore.verify();

    }

    /**
     * test avec plusieurs ne erreur
     */
    public void testGetGlobalErrorWithSeveralErrors() {

        errors.reject("1");
        errors.reject("2");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "object incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "object super incorrect");
        
        assertEquals("object incorrect", errors.getGlobalError(Locale.FRENCH));

    }

    /**
     * test sans erreurs
     */
    public void testGetGlobalErrorWithoutErrors() {

        assertNull(errors.getGlobalError(Locale.FRENCH));

    }

    /**
     * test sans erreurs globale mais avec des erreurs de champs
     */
    public void testGetGlobalErrorWithoutErrorsButWithFieldErrors() {

        errors.rejectValue("name", "1");

        assertNull(errors.getGlobalError(Locale.FRENCH));

    }

    /**
     * test quand il y a une erreur
     */
    public void testGetGlobalErrorCountWithOneError() {

        errors.reject("1");

        assertEquals(1, errors.getGlobalErrorCount());

    }

    /**
     * test quand il y a plusieurs erreurs
     */
    public void testGetGlobalErrorCountWithSeveralErrors() {

        errors.reject("1");
        errors.reject("2");

        assertEquals(2, errors.getGlobalErrorCount());

    }

    /**
     * test quand il n'y a pas d'erreurs
     */
    public void testGetGlobalErrorCountWithoutErrors() {

        assertEquals(0, errors.getGlobalErrorCount());

    }

    /**
     * test quand il n'y a pas des erreurs globales et des erreurs field
     */
    public void testGetGlobalErrorCountWithFieldErrors() {

        errors.reject("1");
        errors.reject("2");
        errors.rejectValue("name", "1");

        assertEquals(2, errors.getGlobalErrorCount());

    }

    /**
     * test quand il y a une seule erreur
     */
    public void testGetGlobalErrorsWithOneError() {

        errors.reject("1");

        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "object incorrect");
        
        assertEquals("object incorrect", errors.getGlobalErrors(Locale.FRENCH).get(0));
        
        MockCore.verify();

    }

    /**
     * test quand il y a plusieurs erreurs
     */
    public void testGetGlobalErrorsWithSeveralErrors() {

        errors.reject("1");
        errors.reject("2");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "object incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "object lui aussi incorrect");
        
        mockmessageSource.expectGetMessage("1", null, Locale.FRENCH, "object incorrect");
        mockmessageSource.expectGetMessage("2", null, Locale.FRENCH, "object lui aussi incorrect");
        
        
        assertTrue(errors.getGlobalErrors(Locale.FRENCH).contains("object incorrect"));
        assertTrue(errors.getGlobalErrors(Locale.FRENCH).contains("object lui aussi incorrect"));
        
        assertEquals(2, errors.getGlobalErrorCount());
        
        MockCore.verify();

    }

    /**
     * test quand il n'y a pas d'erreurs
     */
    public void testGetGlobalErrorsWithoutErrors() {

        assertEquals(0, errors.getGlobalErrors(Locale.FRENCH).size());

    }

    /**
     * test avec une erreur sur un champs
     */
    public void testGetGlobalErrorsWithErrorOnField() {

        errors.rejectValue("name", "1");

        assertEquals(0, errors.getGlobalErrorCount());

    }

    /**
     * test la m�thode hasFieldErrors quand des erreurs
     * sont d�tect�es
     */
    public void testHasFieldErrorsWithErrors() {

        errors.rejectValue("name", "1");
        errors.rejectValue("name", "1");

        assertTrue(errors.hasFieldErrors("name"));

    }

    /**
     * test la m�thode hasFieldErrors quand des erreurs
     * sont d�tect�es
     */
    public void testHasFieldErrorsWithErrorsOnDifferentField() {

        errors.rejectValue("name", "1");
        errors.rejectValue("name", "1");
        errors.rejectValue("email", "1");

        assertTrue(errors.hasFieldErrors("email"));

    }

    /**
     * test la m�thode hasFieldErrors quand il
     * n'y a pas d'erreur
     */
    public void testHasFieldErrorsWithoutErrors() {

        assertFalse(errors.hasFieldErrors("email"));

    }

    /**
     * test la m�thode hasFieldErrors quand il
     * n'y a des erreurs globales
     */
    public void testHasFieldErrorsWithGlobalErrors() {

        errors.reject("1");

        assertFalse(errors.hasFieldErrors("email"));

    }

    /**
     * test la m�thode hasGlobalErrors quand des erreurs
     * sont d�tect�es
     */
    public void testHasGlobalErrorsWithErrors() {

        errors.reject("1");
        errors.reject("1");

        assertTrue(errors.hasGlobalErrors());

    }

    /**
     * test la m�thode hasFieldErrors quand il
     * n'y a pas d'erreur
     */
    public void testHasGlobalErrorsWithoutErrors() {

        assertFalse(errors.hasGlobalErrors());

    }

    /**
     * test la m�thode hasGlobalErrors quand il
     * n'y a des erreurs field
     */
    public void testHasGlobalErrorsWithFieldErrors() {

        errors.rejectValue("name", "1");

        assertFalse(errors.hasGlobalErrors());

    }

}