/*
 * Copyright ou � ou Copr. Arnaud Prost, 16 janv. 2005
 *
 * arnaud.prost@free.fr
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
     * test qu'un object positionn� � la m�me date (en miliseconde)
     * �crase le pr�c�dent object. 
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
     * test du put version avec des dates diff�rentes
     * l'object doit s'ajouter � la liste
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
     * Test de la m�thode getLatest apr�s l'instanciation de la temporalMap
     */
    public final void testGetLatestAfterInstanciation() throws Exception {
        
      // the object given to the constructor should be the latest object in history
        assertEquals("getLatest", mockDomainObject, temporalDomainMap.getLatest());
        
    }
    
    /**
     * Test de la m�thode get latest avec deux objects dans la map
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
     * Test de la m�thode get latest avec deux objects dans la map
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
