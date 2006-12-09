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
package net.sf.pmr.keopsframework.domain.collection;

import java.util.Collection;

import net.sf.pmr.keopsframework.data.DomainListMapper;
import net.sf.pmr.keopsframework.domain.LoadStatusEnum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author arnaud.prost@gmail.com
 */

public class GhostDomainCollectionImpl implements GhostDomainCollection {

    /**
     * Logger for this class.
     */
    private static final Log LOGGER = LogFactory.getLog(GhostDomainCollectionImpl.class);

    /**
     * Status of the domain object.
     */
    private LoadStatusEnum status = LoadStatusEnum.GHOST;

    /**
     * Collection.
     */
    private Collection collection;

    /**
     * Loader to user for the list.
     */
    private DomainListMapper mapper;

    /**
     * constructor made private.
     */
    private GhostDomainCollectionImpl() {
    }

    /**
     * constructor.
     * @param loader to use for the list
     * @deprecated use aspect instead
     */
    public GhostDomainCollectionImpl(final DomainListMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * mark the object as loading.
     */
    protected final void markLoading() {
        status = LoadStatusEnum.LOADING;
    }

    /**
     * mark the object as loaded: list and each object in the list.
     */
    protected final void markLoaded() {
        // marke as loaded
        status = LoadStatusEnum.LOADED;
    }

    /**
     * Is the object a ghost (ie no data have been loaded ).
     * @return boolean
     */
    protected final boolean isGhost() {
        LOGGER.debug("isGhost() - start");

        if (status.equals(LoadStatusEnum.GHOST)) {
            LOGGER.debug("isGhost() - end - return value = " + true);
            return true;
        } else {
            LOGGER.debug("isGhost() - end - return value = " + false);
            return false;
        }
    }

    /**
     * @return loadStatus
     * @deprecated use aspect instead
     */
    public final LoadStatusEnum getStatus() {
        return status;
    }

    /**
     * @param enum
     *            enumeration of status
     */
    protected final void setStatus(final LoadStatusEnum enu) {
        status = enu;
    }

    /**
     * @return collection collection
     * @deprecated use aspect instead
     */
    public final Collection loadForObject(Object objectToLoadFor) {

        if (isGhost()) {
            markLoading();
            collection = mapper.findCollectionForObject(objectToLoadFor);
            markLoaded();
        }

        return collection;
    }

    /**
     * @param collection The list to set.
     * @deprecated use aspect instead
     */
    public void setCollection(final Collection collection) {
        this.collection = collection;
        // sur un setter la collection est marqu�e comme load�e uniquement si la taille est > 1
        if (collection.size() > 0) markLoaded();
    }
}
