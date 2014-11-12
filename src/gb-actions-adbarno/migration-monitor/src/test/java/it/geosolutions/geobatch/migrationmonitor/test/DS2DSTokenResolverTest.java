/*
 *  Copyright (C) 2007-2012 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.geosolutions.geobatch.migrationmonitor.test;

import static org.junit.Assert.*;
import it.geosolutions.geobatch.migrationmonitor.model.MigrationMonitor;
import it.geosolutions.geobatch.migrationmonitor.utils.DS2DSTokenResolver;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Test;

public class DS2DSTokenResolverTest {
    
	private static final Logger LOGGER = Logger.getLogger(DS2DSTokenResolverTest.class);

	private static final String SERVER_IP = "192.168.1.1";
	private static final Integer SERVER_PORT = 51052;
	private static final String INSTANCE_NAME = "test_instance_name";
	private static final String SCHEMA_NAME = "test_SCHEMA_name";
	private static final String TABLE_NAME = "test_table_name";
	private static final String EPSG_STRING = "EPSG:1234";
	
	/**
     * Simple test to display the generated XML from a given index table record
     * This test simply confirms that the process does not fail with a NULL input directory
     */
    @Test
	public void testNullConfigDir() {

    	// Prepare the input object    	
    	MigrationMonitor mm = new MigrationMonitor();
    	
    	mm.setActive(true);
    	mm.setServerIp(SERVER_IP);
    	mm.setServerPort(SERVER_PORT);
    	mm.setDatabase(INSTANCE_NAME);
    	mm.setSchemaName(SCHEMA_NAME);
    	mm.setTableName(TABLE_NAME);
    	mm.setEpsg(EPSG_STRING);
    	
		// Passing null as configDir will force the class to get the default values
        try {
			DS2DSTokenResolver dtc = new DS2DSTokenResolver(mm, null);
			
			System.out.println(dtc.getOutputFileContent());
			
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
			fail();
		}
	}

}
