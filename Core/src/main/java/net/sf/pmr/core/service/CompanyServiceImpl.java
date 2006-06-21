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

import net.sf.pmr.core.CoreObjectFactory;
import net.sf.pmr.core.domain.user.company.Company;
import net.sf.pmr.core.domain.user.company.CompanyRepository;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class CompanyServiceImpl implements CompanyService {

    /**
     * Company repository
     */
    private CompanyRepository companyRepository;

    /**
     * company validator
     */
    private Validator companyValidator;

    /**
     * address validator
     */
    private Validator addressValidator;

    /**
     * @param companyRepository
     * @param companyValidator
     * @param addressValidator
     */
    public CompanyServiceImpl(final CompanyRepository companyRepository,
            final Validator companyValidator, final Validator addressValidator) {
        super();
        this.companyRepository = companyRepository;
        this.companyValidator = companyValidator;
        this.addressValidator = addressValidator;
    }

    /**
     * @see net.sf.pmr.core.service.CompanyService#addOrUpdate(int,
     *      java.lang.String, java.lang.String, java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String, long)
     */
    public Errors addOrUpdate(final int id, final String name,
            final String streetNumber, final String streetName,
            final String postalCode, final String city, final String country,
            final long persistanceVersion) {

        // get the company to update
        Company company = CoreObjectFactory.getCompany();

        // populate
        company.setPersistanceId(id);
        company.setName(name);
        company.getAddress().setStreetNumber(streetNumber);
        company.getAddress().setStreetNumber(streetName);
        company.getAddress().setPostalCode(postalCode);
        company.getAddress().setCity(city);
        company.getAddress().setCountry(country);
        company.setPersistanceVersion(persistanceVersion);

        // validate
        Errors errors = companyValidator.validate(company);

        // if no errors are found
        if (!errors.hasErrors()) {

            // validate addresse
            errors = addressValidator.validate(company);

            if (!errors.hasErrors()) {

                companyRepository.addOrUpdate(company);
            }

        }

        return errors;

    }

}
