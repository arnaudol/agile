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
import net.sf.pmr.core.domain.user.company.Address;
import net.sf.pmr.core.domain.user.company.AddressImpl;
import net.sf.pmr.core.domain.user.company.Company;
import net.sf.pmr.core.domain.user.company.CompanyImpl;
import net.sf.pmr.core.domain.user.company.CompanyRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;

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
    
    private IMocksControl mocksControl;

    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // create mocks
        mocksControl = EasyMock.createStrictControl();
        
        mockCompanyRepository = mocksControl.createMock(CompanyRepository.class);
        mockCompanyValidator = mocksControl.createMock(Validator.class);
        mockAddressValidator = mocksControl.createMock(Validator.class);
        
        companyService = new CompanyServiceImpl(mockCompanyRepository, mockCompanyValidator, mockAddressValidator);
        
        // create error mocks
        mockCompanyErrors = mocksControl.createMock(Errors.class);
        mockAddressErrors = mocksControl.createMock(Errors.class);

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
    	
    	mocksControl.reset();
    	
        super.tearDown();
    }
    
    /**
     * test qu'il s'agit d'un singleton
     */
    public void testIsASingleton() {
        
        assertTrue(CoreObjectFactory.isSingleton("companyService"));
    }

    /**
     * Test de l'ajout d'une entreprise
     * La validation de l'entreprise echoue :
     * - la validation de l'adresse ne doit pas être faite
     * - l'enregistrement n'est pas réalisée
     */
    public void testAddCompanyAndCompanyValidationFailed() {  

        // set expectations
        EasyMock.expect(mockCompanyValidator.validate(EasyMock.isA(Company.class))).andReturn(mockCompanyErrors) ;
        EasyMock.expect(mockCompanyErrors.hasErrors()).andReturn(true);
        mocksControl.checkOrder(true);
        
        // set mock in replay mode
        mocksControl.replay();
        
        // test 
        companyService.addOrUpdate(0, "world company", "1", "world street", "001", "world city", "world Country", 0);
       
        // verify mock calls
        mocksControl.verify();
        
    }

    /**
     * Test de l'ajout d'une entreprise
     * La validation de l'adresse echoue
     * - l'enregistrement ne doit pas être fait
     */
    public void testAddCompanyAndAddressValidationFailed() {
        
        // set expectations
        EasyMock.expect(mockCompanyValidator.validate(EasyMock.isA(Company.class))).andReturn(mockCompanyErrors);
        EasyMock.expect(mockCompanyErrors.hasErrors()).andReturn(false);
        
        EasyMock.expect(mockAddressValidator.validate(EasyMock.isA(Company.class))).andReturn(mockAddressErrors);
        EasyMock.expect(mockAddressErrors.hasErrors()).andReturn(true);
        
        // check calls order
        mocksControl.checkOrder(true);

        // set mock in replay mode
        mocksControl.replay();

        // test
        companyService.addOrUpdate(0, "world company", "1", "world street", "001", "world city", "world Country", 0);

        // verify mock calls
        mocksControl.verify();
        
    }
    
    /**
     * Test de l'ajout d'une entreprise
     * La validation réussie :
     * - l'enregistrement peut avoir lieu
     */
    public void testAddCompanyAndValidationSucceed() {
        
        // set expectations
        EasyMock.expect(mockCompanyValidator.validate(EasyMock.isA(Company.class))).andReturn(mockCompanyErrors);
        EasyMock.expect(mockCompanyErrors.hasErrors()).andReturn(false);
        
        EasyMock.expect(mockAddressValidator.validate(EasyMock.isA(Company.class))).andReturn(mockAddressErrors);
        EasyMock.expect(mockAddressErrors.hasErrors()).andReturn(false);
        
        mockCompanyRepository.addOrUpdate(EasyMock.isA(Company.class));

        // check calls order
        mocksControl.checkOrder(true);

        // set mock in replay mode
        mocksControl.replay();

        // test
        companyService.addOrUpdate(0, "world company", "1", "world street", "001", "world city", "world Country", 0);
       
        // verify mock calls
        mocksControl.verify();
        
    }
    
    /**
     * Test de la mise � jour d'une entreprise
     * La validation de l'entreprise echoue
     * - pas de validaton de l'adresse
     * - pas de mise à jour
     */
    public void testUpdateCompanyAndCompanyValidationFailed() {

        Company company =  new CompanyImpl();
        Address address = new AddressImpl();
        company.setAddress(address);
        
        EasyMock.expect(mockCompanyValidator.validate(EasyMock.isA(Company.class))).andReturn(mockCompanyErrors);
        EasyMock.expect(mockCompanyErrors.hasErrors()).andReturn(true);
        
         // check calls order
        mocksControl.checkOrder(true);

        // set mock in replay mode
        mocksControl.replay();
        
        companyService.addOrUpdate(1, "world company", "1", "world street", "001", "world city", "world Country", 0);
       
        // verify mock calls
        mocksControl.verify();
        
    }
    
    /**
     * Test de la mise � jour d'une entreprise
     * La validation de l'adresse echoue
     * - pas de mise � jour
     */
    public void testUpdateCompanyAndAddressValidationFailed() {

        Company company =  new CompanyImpl();
        Address address = new AddressImpl();
        company.setAddress(address);
        
        // set expectations
        EasyMock.expect(mockCompanyValidator.validate(EasyMock.isA(Company.class))).andReturn(mockCompanyErrors);
        EasyMock.expect(mockCompanyErrors.hasErrors()).andReturn(false);
        
        EasyMock.expect(mockAddressValidator.validate(EasyMock.isA(Company.class))).andReturn(mockAddressErrors);
        EasyMock.expect(mockAddressErrors.hasErrors()).andReturn(true);
        
         // check calls order
        mocksControl.checkOrder(true);

        // set mock in replay mode
        mocksControl.replay();
        
        companyService.addOrUpdate(1, "world company", "1", "world street", "001", "world city", "world Country", 0);
       
        // verify mock calls
        mocksControl.verify();
        
    }
    
    
    /**
     * Test de la mise à jour d'une entreprise
     * La validation réussie
     * - l'enregistrement peut avoir lieu
     */
    public void testUdapteCompanyAndValidationSucceed() {
        
        Company company =  new CompanyImpl();
        Address address = new AddressImpl();
        company.setAddress(address);
        
        // set expectations
        EasyMock.expect(mockCompanyValidator.validate(EasyMock.isA(Company.class))).andReturn(mockCompanyErrors);
        EasyMock.expect(mockCompanyErrors.hasErrors()).andReturn(false);
        
        EasyMock.expect(mockAddressValidator.validate(EasyMock.isA(Company.class))).andReturn(mockAddressErrors);
        EasyMock.expect(mockAddressErrors.hasErrors()).andReturn(true);
        
        // check calls order
        mocksControl.checkOrder(true);

        // set mock in replay mode
        mocksControl.replay();
        
        companyService.addOrUpdate(1, "world company", "1", "world street", "001", "world city", "world Country", 0);
       
        // verify mock calls
        mocksControl.verify();
        
    }
    
   
}