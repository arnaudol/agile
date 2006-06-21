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

package net.sf.pmr.keopsframework.domain.collection.temporal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * @author arnaud.prost@gmail.com
 *
 * Cette classe permet d'implementer les pattern "temporal object" et
 * "temporal properties" tel qu'expliqu� par Martin Fowler
 * http://martinfowler.com/ap2/timeNarrative.html
 * Dans cette implementation particuli�re, il est imposible de modifier
 * une version pr�c�dente
 */

// TODO Prendre en compte la locale, la time zone ....

public class ArchivalTemporalDomainMapImpl implements
        TemporalDomainMap {

    /**
     * Logger for this class
     */
    private static final Log LOGGER = LogFactory
            .getLog(ArchivalTemporalDomainMapImpl.class);


    /**
     * history of the versions
     */
    private Map<Date, Object> history;


    /**
     * Initialized the temporal collection with a map implementation
     *  and the initial object to put in history
     * @param history history
     * @param initialObjectVersion initialObjectVersion
     */
    public ArchivalTemporalDomainMapImpl(final Map<Date, Object> history, final Object initialObjectVersion) {
        this.history = history;
        this.history.put(new Date(), initialObjectVersion);
    }


    /**
     * @see com.pm.requirementsManagement.domain.TemporalDomainMap#putRequirementVersion(com.pm.requirementsManagement.domain.RequirementVersion)
     */
    public void putVersion(final Date date, final Object objectVersion) //throws ObjectAtTheSameDateAlreadyExistsException
    {

        // TODO vérifier que la date n'est pas futur -> impossible

       if (history.containsKey(date)) {
            // throw new ObjectAtTheSameDateAlreadyExistsException();
        } else {
            history.put(date, objectVersion);
        }

    }

    /**
     * @see com.pm.requirementsManagement.domain.TemporalDomainMap#getRequirementVersion(java.util.Date)
     */
    public Object getVersion(final Date date) {

        Date previousDate = null;
        Object objectVersionToReturn = null;

        for (Iterator i = history.entrySet().iterator(); i.hasNext();) {

            Map.Entry entry = (Map.Entry) i.next();

            // if previous date is null, initialize it with the first date found
            if (previousDate == null) {

                previousDate = (Date) entry.getKey();
                objectVersionToReturn = entry.getValue();
            }

            // find the closest date
            if (date.equals((Date) entry.getKey())
                    || date.compareTo((Date) entry.getKey()) >= 0
                    & previousDate.compareTo((Date) entry.getKey()) <= 0) {

                previousDate = (Date) entry.getKey();
                objectVersionToReturn = entry.getValue();

            }

        }

        return objectVersionToReturn;

    }

    /**
     * @see com.pm.requirementsManagement.domain.TemporalDomainMap#getLatest()
     */
    public Object getLatest() {

        LOGGER.debug("getCurrent() - start");

        Date previousDate = null;
        Object objectVersionToReturn = null;

        for (Iterator i = history.entrySet().iterator(); i.hasNext();) {

            LOGGER.debug("getCurrent() - interate in history");

            Map.Entry entry = (Map.Entry) i.next();

            // if previous date is null, initialize it with the first date found
            if (previousDate == null) {

                LOGGER.debug("getCurrent() - inistalized the previous date");

                previousDate = (Date) entry.getKey();
                objectVersionToReturn = entry.getValue();
            }

            // find the most recent date
            if (previousDate.compareTo((Date) entry.getKey()) < 0) {

                LOGGER.debug("getCurrent() - find the more recent date");

                previousDate = (Date) entry.getKey();
                objectVersionToReturn = entry.getValue();
            }

        }

        LOGGER.debug("getCurrent() - end - return value = "
                + objectVersionToReturn);

        return objectVersionToReturn;
    }

    /*
     * @see com.keops.domain.TemporalDomainMap#getMap()
     */
    public Map getMap() {
        return  Collections.unmodifiableMap(history);
    }

}