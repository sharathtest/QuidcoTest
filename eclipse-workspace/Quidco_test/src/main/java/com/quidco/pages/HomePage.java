/**
 * 
 */
package com.quidco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quidco.locators.WebsiteLocators;



/**
 * @author sharath
 *
 */
public class HomePage extends WebsiteLocators{

	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	
		
	/**
	 * This method will load Quidco Home page.
	 */
	public void launchWebSite(){
		
		System.out.println("Launching website");
		driver.get("https://www.quidco.com/");
	}
	
	/**
	 * This method will navigate to JoinNow Page.
	 */
	public void joinNow(){
		
		waitFor(joinNowButtonLoc).click();
				
	}
	
	//waitFor is a webelement which will wait for a max of 20 seconds till the element the located. 
	public WebElement waitFor(WebElement element){
		
		return new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
	}
	
}
