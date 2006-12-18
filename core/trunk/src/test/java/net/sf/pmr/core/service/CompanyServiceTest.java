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

package net.sf.pmr.core.service;

import junit.framework.TestCase;
import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.user.company.CompanyRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

import org.easymock.EasyMock;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class CompanyServiceTest extends TestCase {

    private CompanyService companyService;
    
    private CompanyRepository mockCompanyRepository;
    
    private Validator mockCompanyValidator;
    
    private Validator mockAddressValidator;
    
    private Errors mockCompanyErrors;
    
    private Errors mockAddressErrors;

    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        mockCompanyRepository = EasyMock.createMock(CompanyRepository.class);
        
        mockCompanyValidator = EasyMock.createMock(Validator.class);
        
        mockAddressValidator = EasyMock.createMock(Validator.class);
        
        companyService = new CompanyServiceImpl(mockCompanyRepository, mockCompanyValidator, mockAddressValidator);
        
        mockCompanyErrors = EasyMock.createMock(Errors.class);
        
        mockAddressErrors = EasyMock.createMock(Errors.class);
        

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
    	
    	EasyMock.reset(mockCompanyRepository);
    	EasyMock.reset(mockCompanyValidator);
    	EasyMock.reset(mockAddressValidator);
    	EasyMock.reset(mockCompanyErrors);
    	EasyMock.reset(mockAddressErrors);
    	
        super.tearDown();
    }
    
    /**
     * test qu'il s'agit d'un singleton
     */
    public void testIsASingleton() {
        
        assertTrue(CoreObjectFactory.isSingleton("companyService"));
    }
//
//    /**
//     * Test de l'ajout d'une entreprise
//     * La validation de l'entreprise echoue :
//     * - la validation de l'adresse ne doit pas �tre faite
//     * - l'enregistrement n'est pas r�alis�e
//     */
//    public void testAddCompanyAndCompanyValidationFailed() {
//        
//        mockCompanyValidator.acceptValidate(new Ignore(), mockCompanyErrors);
//        mockCompanyErrors.expectHasErrors(true);
//        
//        companyService.addOrUpdate(0, "world company", "1", "world street", "001", "world city", "world Country", 0);
//       
//        MockCore.verify();
//        
//    }
//    
//    /**
//     * Test de l'ajout d'une entreprise
//     * La validation de l'adresse echoue
//     * - l'enregistrement ne doit pas �tre fait
//     */
//    public void testAddCompanyAndAddressValidationFailed() {
//        
//        mockCompanyValidator.acceptValidate(new Ignore(), mockCompanyErrors);
//        mockCompanyErrors.expectHasErrors(false);
//        mockAddressValidator.acceptValidate(new Ignore(), mockAddressErrors);
//        mockAddressErrors.expectHasErrors(true);
//        
//        companyService.addOrUpdate(0, "world company", "1", "world street", "001", "world city", "world Country", 0);
//       
//        MockCore.verify();
//        
//    }
//    
//    
//    /**
//     * Test de l'ajout d'une entreprise
//     * La validation r�ussie
//     * - l'enregistrement peut avoir lieu
//     */
//    public void testAddCompanyAndValidationSucceed() {
//        
//        mockCompanyValidator.acceptValidate(new Ignore(), mockCompanyErrors);
//        mockCompanyErrors.expectHasErrors(false);
//        mockAddressValidator.acceptValidate(new Ignore(), mockAddressErrors);
//        mockAddressErrors.expectHasErrors(false);
//        mockCompanyRepository.acceptAddOrUpdate(new Ignore());
//        
//        companyService.addOrUpdate(0, "world company", "1", "world street", "001", "world city", "world Country", 0);
//       
//        MockCore.verify();
//        
//    }
//    
//    /**
//     * Test de la mise � jour d'une entreprise
//     * La validation de l'entreprise echoue
//     * - pas de validaton de l'adresse
//     * - pas de mise � jour
//     */
//    public void testUpdateCompanyAndCompanyValidationFailed() {
//
//        Company company =  new CompanyImpl();
//        Address address = new AddressImpl();
//        company.setAddress(address);
//        
//        mockCompanyValidator.acceptValidate(new Ignore(), mockCompanyErrors);
//        mockCompanyErrors.expectHasErrors(true);
//        
//        companyService.addOrUpdate(1, "world company", "1", "world street", "001", "world city", "world Country", 0);
//       
//        MockCore.verify();
//        
//    }
//    
//    /**
//     * Test de la mise � jour d'une entreprise
//     * La validation de l'adresse echoue
//     * - pas de mise � jour
//     */
//    public void testUpdateCompanyAndAddressValidationFailed() {
//
//        Company company =  new CompanyImpl();
//        Address address = new AddressImpl();
//        company.setAddress(address);
//        
//        mockCompanyValidator.acceptValidate(new Ignore(), mockCompanyErrors);
//        mockCompanyErrors.expectHasErrors(false);
//        mockAddressValidator.acceptValidate(new Ignore(), mockAddressErrors);
//        mockAddressErrors.expectHasErrors(true);
//        
//        companyService.addOrUpdate(1, "world company", "1", "world street", "001", "world city", "world Country", 0);
//       
//        MockCore.verify();
//        
//    }
//    
//    
//    /**
//     * Test de la mise � jour d'une entreprise
//     * La validation r�ussie
//     * - l'enregistrement peut avoir lieu
//     */
//    public void testUdapteCompanyAndValidationSucceed() {
//        
//        Company company =  new CompanyImpl();
//        Address address = new AddressImpl();
//        company.setAddress(address);
//        
//        mockCompanyValidator.acceptValidate(new Ignore(), mockCompanyErrors);
//        mockCompanyErrors.expectHasErrors(false);
//        mockAddressValidator.acceptValidate(new Ignore(), mockAddressErrors);
//        mockAddressErrors.expectHasErrors(false);
//        mockCompanyRepository.acceptAddOrUpdate(new Ignore());
//        
//        companyService.addOrUpdate(1, "world company", "1", "world street", "001", "world city", "world Country", 0);
//       
//        MockCore.verify();
//        
//    }
    
   
}