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

package net.sf.pmr.core;

import net.sf.pmr.core.data.project.ProjectMapper;
import net.sf.pmr.core.data.reference.CountryMapper;
import net.sf.pmr.core.data.user.UserMapper;
import net.sf.pmr.core.data.user.company.CompanyMapper;
import net.sf.pmr.core.domain.project.DomainCollectionLasyLoadingInterceptor;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectRepository;
import net.sf.pmr.core.domain.reference.Country;
import net.sf.pmr.core.domain.user.User;
import net.sf.pmr.core.domain.user.UserRepository;
import net.sf.pmr.core.domain.user.company.Address;
import net.sf.pmr.core.domain.user.company.Company;
import net.sf.pmr.core.service.ProjectService;
import net.sf.pmr.core.service.SecurityService;
import net.sf.pmr.core.service.UserService;
import net.sf.pmr.keopsframework.domain.validation.Errors;
import net.sf.pmr.keopsframework.domain.validation.Validator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;


/**
 * @author Arnaud
 */
public final class CoreObjectFactory {
    
    private CoreObjectFactory() {
        super();
    }
    
    /**
     * get an object from the Spring application context
     * @param objectName
     * @return object
     */
    private static Object getObject(final String objectName) {
        
        return ContextSingletonBeanFactoryLocator.getInstance().useBeanFactory(
                "net.sf.pmr").getFactory().getBean(objectName);
        
    }
    
    /**
     * get the bean factory
     * @return beanFactory
     */
    private static BeanFactory getBeanFactory() {
        
        return ContextSingletonBeanFactoryLocator.getInstance().useBeanFactory(
                "net.sf.pmr").getFactory();
    }
    
    /**
     * is an object singleton ?
     * @param object
     * @return boolean
     */
    public static boolean isSingleton(final String object) {
        
        return CoreObjectFactory.getBeanFactory().isSingleton(object);
        
    }
    
    
    /**
     * get the address
     * @return address
     */
    public static Errors getErrors() {
        
        return (Errors) CoreObjectFactory.getObject("coreErrors");
    }
    
    
    /**
     * get the address
     * @return address
     */
    public static Address getAddress() {
        
        return (Address) CoreObjectFactory.getObject("address");
    }
    
    
    /**
     * get Company validator
     * @return validator
     */
    public static Validator getAddressValidator() {
        
        return (Validator) CoreObjectFactory.getObject("addressValidator");
        
    }
    
    
    /**
     * get the company
     * @return company
     */
    public static Company getCompany() {
        
        return (Company) CoreObjectFactory.getObject("company");
    }
    
    /**
     * get Company validator
     * @return validator
     */
    public static Validator getCompanyValidator() {
        
        return (Validator) CoreObjectFactory.getObject("companyValidator");
        
    }
    
    
    
    /**
     * get the companyMapper
     * @return companyMapper
     */
    public static CompanyMapper getCompanyMapper() {
        
        return (CompanyMapper) CoreObjectFactory.getObject("companyMapper");
    }
    
    /**
     * get the user
     * @return user
     */
    public static User getUser() {
        
        return (User) CoreObjectFactory.getObject("user");
    }
    
    
    public static Validator getUserValidator() {
        
        return (Validator) CoreObjectFactory.getObject("userValidator");
        
    }
    
    /**
     * get the userService
     * @return userService
     */
    public static UserService getUserService() {
        
        return (UserService) CoreObjectFactory.getObject("userService");
        
    }
    
    
    /**
     * get the userMapper
     * @return userMapper
     */
    public static UserMapper getUserMapper() {
        
        return (UserMapper) CoreObjectFactory.getObject("userMapper");
    }
    
    
    /**
     * get the basicProject
     * @return basicProject
     */
    public static Project getProject() {
        
        return (Project) CoreObjectFactory.getObject("project");
    }
    
    
    /**
     * get the basicProjectMapper
     * @return basicProject
     */
    public static ProjectMapper getProjectMapper() {
        
        return (ProjectMapper) CoreObjectFactory.getObject("projectMapper");
    }
    
    
    /**
     * get the basicProjectRepository
     * @return basicProjectRepository
     */
    public static ProjectRepository getProjectRepository() {
        
        return (ProjectRepository) CoreObjectFactory.getObject("projectRepository");
    }
    
    /**
     * get the basicProjectValidator
     * @return basicProjectValidator
     */
    public static Validator getProjectValidator() {
        
        return (Validator) CoreObjectFactory.getObject("projectValidator");
    }
    
    /**
     * get the basicProjectService
     * @return basicProjectService
     */
    public static ProjectService getProjectService() {
        
        return (ProjectService) CoreObjectFactory.getObject("projectService");
    }
    
    
    
    public static DomainCollectionLasyLoadingInterceptor getMembersLasyLoadingAdvice() {
        
        return (DomainCollectionLasyLoadingInterceptor) CoreObjectFactory.getObject("membersLasyLoadingAdvice");
        
    }
    
    
    /**
     * get the country
     * @return country
     */
    public static Country getCountry() {
        
        return (Country) CoreObjectFactory.getObject("country");
    }
    
    
    /**
     * get the countryMapper
     * @return countryMapper
     */
    public static CountryMapper getCountryMapper() {
        
        return (CountryMapper) CoreObjectFactory.getObject("countryMapper");
    }
    
    /**
     * get the securityService
     * @return securityService
     */
    public static SecurityService getSecurityService() {
        
        return (SecurityService) CoreObjectFactory.getObject("securityService");
    }
    
    
    /**
     * get the userRepository
     * @return userRepository
     */
    public static UserRepository getUserRepository() {
        
        return (UserRepository) CoreObjectFactory.getObject("userRepository");
    }
    
}