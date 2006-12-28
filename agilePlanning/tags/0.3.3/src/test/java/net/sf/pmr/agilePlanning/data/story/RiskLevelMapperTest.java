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

package net.sf.pmr.agilePlanning.data.story;

import net.sf.pmr.agilePlanning.AgilePlanningObjectFactory;
import net.sf.pmr.agilePlanning.MapperTestCase;
import net.sf.pmr.agilePlanning.data.story.RiskLevelMapper;
import net.sf.pmr.agilePlanning.domain.story.RiskLevel;

import org.dbunit.dataset.ITable;


/**
 * @author Arnaud Prost (arnaud.prost@gmail.com)
 * 
 * $Header
 */
public class RiskLevelMapperTest extends MapperTestCase {

    private RiskLevelMapper riskLevelMapper;
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        // get the riskLevel mapper
        riskLevelMapper = AgilePlanningObjectFactory.getRiskLevelMapper();

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test findAll RiskLevel
     * @throws Exception
     */
    public final void testFindAll() throws Exception {

        ITable databaseData = getConnection().createQueryTable("ExpectedData", "SELECT * FROM RISKLEVEL");
        
        assertEquals("RiskLevel", databaseData.getRowCount(), riskLevelMapper.findAll().size());

    }
    
    /**
     * Test quand le RiskLevel est trouv�e. 
     */
    public final void testFindByIdWhenRiskLevelIsFound() {
        
        RiskLevel riskLevel = riskLevelMapper.findById(2);
        
        assertNotNull(riskLevel);
        assertEquals(2, riskLevel.getId());
        assertEquals("MEDIUM", riskLevel.getDescription());
        
    }

    /**
     * Test quand le RiskLevel n'est pas trouv�.
     * La m�thode doit retourner null. 
     */
    public final void testFindByIdWhenRiskLevelIsNotFound() {
        
        RiskLevel riskLevel = riskLevelMapper.findById(999);
        
        assertNull(riskLevel);
        
    }

}