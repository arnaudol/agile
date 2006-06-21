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


package net.sf.pmr.core.domain.user.company;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 */
public class AddressImpl implements Address {

    private String country;

    private String postalCode;

    private String streetName;

    private String streetNumber;

    private String city;


    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.Address#getCountry()
     */
    public String getCountry() {
        return country;

    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.Address#setCountry(java.lang.String)
     */
    public void setCountry(final String country) {
        this.country = country;

    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.Address#getPostalCode()
     */
    public String getPostalCode() {
        return postalCode;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.Address#setPostalCode(java.lang.String)
     */
    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.Address#getStreetName()
     */
    public String getStreetName() {
        return streetName;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.Address#setStreetName(java.lang.String)
     */
    public void setStreetName(final String streetName) {
        this.streetName = streetName;

    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.Address#getStreetNumber()
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.sf.pmr.core.domain.user.Address#setStreetNumber(java.lang.String)
     */
    public void setStreetNumber(final String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * @see net.sf.pmr.core.domain.user.company.Address#getCity()
     */
    public String getCity() {
        return city;
    }

    /**
     * @see net.sf.pmr.core.domain.user.company.Address#setCity(java.lang.String)
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(final Object object) {
        if (!(object instanceof AddressImpl)) {
            return false;
        }
        AddressImpl rhs = (AddressImpl) object;
        return new EqualsBuilder().append(this.postalCode, rhs.postalCode)
                .append(this.streetName, rhs.streetName).append(this.country,
                        rhs.country)
                .append(this.streetNumber, rhs.streetNumber).append(this.city,
                        rhs.city).isEquals();
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(-2032099061, -487020811).append(
                this.postalCode).append(this.streetName).append(this.country)
                .append(this.streetNumber).append(this.city).toHashCode();
    }
}