/**
 * 
 */
package com.quidco.configuration;

import java.io.File;


/**
 * @author sharath
 *
 */
public class DriverConfiguration {
	
	
		/**
		 *  The directory where the project is located
		 */
		private static String workingDir = System.getProperty("user.dir");
		
		/**
		 *  The file separator used on the system 
		 */
		private static String fileSeparator = File.separator;
		
		/**
		 *  Default path to drivers
		 */
		public static String driverLocation= workingDir + fileSeparator + "drivers" + fileSeparator;
		
		/**
		 * The Location of the Chrome driver for Windows
		 */
		public static final String CHROME_DRIVER_WINDOWS_EXE_LOCATION= driverLocation+ "chromedriver_windows" + fileSeparator + "chromedriver.exe";
		
}
