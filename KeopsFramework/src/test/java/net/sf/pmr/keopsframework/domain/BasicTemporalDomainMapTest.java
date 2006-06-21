/*
 * Copyright ou © ou Copr. Arnaud Prost, 16 janv. 2005
 *
 * arnaud.prost@free.fr
 *
 * Ce logiciel est un programme informatique servant à faciliter le travail
 * collaboratif. 
 *
 * Ce logiciel est régi par la licence CeCILL soumise au droit français et
 * respectant les principes de diffusion des logiciels libres. Vous pouvez
 * utiliser, modifier et/ou redistribuer ce programme sous les conditions
 * de la licence CeCILL telle que diffusée par le CEA, le CNRS et l'INRIA 
 * sur le site "http://www.cecill.info".
 *
 * En contrepartie de l'accessibilité au code source et des droits de copie,
 * de modification et de redistribution accordés par cette licence, il n'est
 * offert aux utilisateurs qu'une garantie limitée.  Pour les mêmes raisons,
 * seule une responsabilité restreinte pèse sur l'auteur du programme,  le
 * titulaire des droits patrimoniaux et les concédants successifs.
 *
 * A cet égard  l'attention de l'utilisateur est attirée sur les risques
 * associés au chargement,  à l'utilisation,  à la modification et/ou au
 * développement et à la reproduction du logiciel par l'utilisateur étant 
 * donné sa spécificité de logiciel libre, qui peut le rendre complexe à 
 * manipuler et qui le réserve donc à des développeurs et des professionnels
 * avertis possédant  des  connaissances  informatiques approfondies.  Les
 * utilisateurs sont donc invités à charger  et  tester  l'adéquation  du
 * logiciel à leurs besoins dans des conditions permettant d'assurer la
 * sécurité de leurs systèmes et ou de leurs données et, plus généralement, 
 * à l'utiliser et l'exploiter dans les mêmes conditions de sécurité. 

 * Le fait que vous puissiez accéder à cet en-tête signifie que vous avez 
 * pris connaissance de la licence CeCILL, et que vous en avez accepté les
 * termes.
 */

package net.sf.pmr.keopsframework.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
import net.sf.pmr.keopsframework.domain.collection.temporal.BasicTemporalDomainMapImpl;
import net.sf.pmr.keopsframework.domain.collection.temporal.TemporalDomainMap;
import net.sf.pmr.keopsframework.domain.object.MockDomainObject;

/**
 * @author Arnaud
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class BasicTemporalDomainMapTest extends TestCase {

    private TemporalDomainMap temporalDomainMap;
    
    private MockDomainObject mockDomainObject;
    
    private Calendar calendar;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // initialized calendar
        calendar = GregorianCalendar.getInstance();
        
        // mock domain object
        mockDomainObject = new MockDomainObject();
        
        // instanciate temporal map
        temporalDomainMap = new BasicTemporalDomainMapImpl(new HashMap(), mockDomainObject);
        
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * test qu'un object positionné à la même date (en miliseconde)
     * écrase le précédent object. 
     */
    public final void testPutVersionAtTheSameDate()  {

        // date
        calendar.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND) + 1);
        Date date = calendar.getTime();
        
        MockDomainObject mockDomainObject1 = new MockDomainObject();
        MockDomainObject mockDomainObject2 = new MockDomainObject();

        temporalDomainMap.putVersion(date, mockDomainObject1);
        
        temporalDomainMap.putVersion(date, mockDomainObject2);
        
        assertEquals("putVersion", 2, temporalDomainMap.getMap().size());
        assertEquals("getVersion", mockDomainObject2, temporalDomainMap.getVersion(date));
        
    }
    
    
    /**
     * test du put version avec des dates différentes
     * l'object doit s'ajouter à la liste
     */
    public final void testPutVersionWithDifferentDate() {

        //date
        calendar.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND) + 1);
        Date date = calendar.getTime();
        
        // domainOject
        MockDomainObject mockDomainObject = new MockDomainObject();
        
        temporalDomainMap.putVersion(date,mockDomainObject);
        
        assertEquals("putVersion", 2, temporalDomainMap.getMap().size());
        
    }
    
    
    /**
     * Test de la méthode getLatest après l'instanciation de la temporalMap
     */
    public final void testGetLatestAfterInstanciation() throws Exception {
        
      // the object given to the constructor should be the latest object in history
        assertEquals("getLatest", mockDomainObject, temporalDomainMap.getLatest());
        
    }
    
    /**
     * Test de la méthode get latest avec deux objects dans la map
     * @throws Exception
     */
    public final void testGetLatestWithTwoRecords() throws Exception {

        calendar.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND) + 1);
        
        Date date = calendar.getTime();
        
        MockDomainObject mockDomainObject = new MockDomainObject();
        
        temporalDomainMap.putVersion(date, mockDomainObject);
        
        assertEquals("getLatest", mockDomainObject, temporalDomainMap.getLatest());
        assertEquals("getMapSize", 2, temporalDomainMap.getMap().size());
        
        
    }
    

    /**
     * Test de la méthode get latest avec deux objects dans la map
     * @throws Exception
     */
    public final void testGetLatestWithThreeRecords() throws Exception {

        calendar.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND) + 1);
        Date date1 = calendar.getTime();
        
        calendar.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND) + 1);
        Date date2 = calendar.getTime();
        
        MockDomainObject mockDomainObject1 = new MockDomainObject();
        MockDomainObject mockDomainObject2 = new MockDomainObject();
        
        temporalDomainMap.putVersion(date1, mockDomainObject1);
        temporalDomainMap.putVersion(date2, mockDomainObject2);
        
        assertEquals("getLatest", mockDomainObject2, temporalDomainMap.getLatest());
        assertEquals("getMapSize", 3, temporalDomainMap.getMap().size());
        
    }

	/**
	 * test du get Version
	 */
    public final void testGetVersion() {

        //date
        calendar.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND) + 1);
        Date date1 = calendar.getTime();

        calendar.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND) + 1);
        Date date2 = calendar.getTime();

        calendar.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND) + 1);
        Date date3 = calendar.getTime();
        
        MockDomainObject mockDomainObject1 = new MockDomainObject();
        MockDomainObject mockDomainObject2 = new MockDomainObject();
        MockDomainObject mockDomainObject3 = new MockDomainObject();
        
        
        temporalDomainMap.putVersion(date1, mockDomainObject1);
        temporalDomainMap.putVersion(date2, mockDomainObject2);
        temporalDomainMap.putVersion(date3, mockDomainObject3);
        
        assertEquals("getMapSize", 4, temporalDomainMap.getMap().size());
        
        assertEquals("getObjectVersion", mockDomainObject1, temporalDomainMap.getVersion(date1));
        assertEquals("getObjectVersion", mockDomainObject2, temporalDomainMap.getVersion(date2));
        assertEquals("getObjectVersion", mockDomainObject3, temporalDomainMap.getVersion(date3));
        
    }
    
    
    /**
     * sur le get map la list n'est pas modifiable. Elle est en read-only
     * car on utilise Collections.unmodifiableMap
     */
    public final void testGetMapAndModifyMap() {
        
        Map map = temporalDomainMap.getMap();
        
        try {
            map.put(new Date(), new MockDomainObject());
            fail("should throw a UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
        
    }


}
