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

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class CompanyServiceTest extends TestCase {

//    private CompanyService companyService;
//    
//    private MockCompanyRepository mockCompanyRepository;
//    
//    private MockValidator mockCompanyValidator;
//    
//    private MockValidator mockAddressValidator;
//    
//    private MockErrors mockCompanyErrors;
//    
//    private MockErrors mockAddressErrors;
//
//    
//    /*
//     * @see TestCase#setUp()
//     */
//    protected void setUp() throws Exception {
//        super.setUp();
//        
//        mockCompanyRepository = new MockCompanyRepository();
//        
//        mockCompanyValidator = new MockValidator();
//        
//        mockAddressValidator = new MockValidator();
//        
//        companyService = new CompanyServiceImpl(mockCompanyRepository, mockCompanyValidator, mockAddressValidator);
//        
//        mockCompanyErrors = new MockErrors();
//        
//        mockAddressErrors = new MockErrors();
//        
//        MockCore.reset();
//
//    }
//
//    /*
//     * @see TestCase#tearDown()
//     */
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }
//    
//    /**
//     * test qu'il s'agit d'un singleton
//     */
//    public void testIsASingleton() {
//        
//        assertTrue(CoreObjectFactory.isSingleton("companyService"));
//    }
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