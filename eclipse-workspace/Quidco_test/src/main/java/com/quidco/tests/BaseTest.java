/**
 * 
 */
package com.quidco.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.quidco.configuration.DriverConfiguration;
import com.quidco.pages.HomePage;
import com.quidco.pages.JoinNowPage;

/**
 * @author sharath
 *
 */
public class BaseTest {

	public WebDriver driver;
	public HomePage home;
	public JoinNowPage joinnow;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver" ,DriverConfiguration.CHROME_DRIVER_WINDOWS_EXE_LOCATION);
		driver= new ChromeDriver();
		System.out.println("Launching browser");
		driver.manage().window().maximize();
										 
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.quit(); 
	}

}
