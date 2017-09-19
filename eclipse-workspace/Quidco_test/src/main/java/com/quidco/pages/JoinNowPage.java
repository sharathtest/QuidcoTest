/**
 * 
 */
package com.quidco.pages;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quidco.locators.WebsiteLocators;

/**
 * @author sharath
 *
 */
public class JoinNowPage extends WebsiteLocators{

	public WebDriver driver;
	
	public JoinNowPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	/**
	 * This method will submit for JoinNow 
	 * @param strFirstName - FirstName
	 * @param strLastName - Last name
	 * @param strEmail    - Email address
	 * @param strPassword  -Password
	 */
	public void joinQuidco(String strFirstName, String strLastName, String strEmail, String strPassword) {
		
		waitFor(firstNameLoc).sendKeys(strFirstName);
		waitFor(lastNameLoc).sendKeys(strLastName);
		waitFor(emailLoc).sendKeys(strEmail);
		waitFor(passwordLoc).sendKeys(strPassword);
		waitFor(termsAndConditionCheckbocLoc).submit();
		waitFor(termsAndConditionCheckbocLoc).click();
		waitFor(offersLabelCheckBocLoc).click();
		waitFor(joinQuidcoButtonLoc).click();
		String strTitle= driver.getTitle();
		System.out.println(strTitle);
		if (strTitle.contains("Quidco - The UK's #1 Cashback Site")) {
			
			String strMessage = waitFor(welcomeMessageLoc).getText();
			System.out.println(strMessage);
			
		}
		
		//This will get the validation messages and print them.
		else {
			
			System.out.println("registration Failed due to:");
			String strMessage1=waitFor(firstNameErrorMessage).getText();
			System.out.println(strMessage1);
			String strMessage2=waitFor(lastNameErrorMessage).getText();
			System.out.println(strMessage2);
			String strMessage3=waitFor(emailErrorMessage).getText();
			System.out.println(strMessage3);
			String strMessage4=waitFor(passwordErrorMessage).getText();
			System.out.println(strMessage4);
			
			
			
		}
		
	}
	
	/**
	 * Generate random email address
	 * @return
	 */
	public static String randomEmail() {
        return "sampletest-" + UUID.randomUUID() + "@test.com";
    }
	
	
	public WebElement waitFor(WebElement element) {
		
		return new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
	}
	
}
