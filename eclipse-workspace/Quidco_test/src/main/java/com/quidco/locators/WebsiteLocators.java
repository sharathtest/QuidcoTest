package com.quidco.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebsiteLocators {
	
	public WebDriver driver;
	
	
	//Home page locators.
	@FindBy(css=".btn.secondary")
	public static WebElement joinNowButtonLoc;
	
	//Join Now page locators
	@FindBy(id="first_name_join")
	public static WebElement firstNameLoc;
		
	@FindBy(id="last_name_join")
	public static WebElement lastNameLoc;
		
	@FindBy(id="new_email_join")
	public static WebElement emailLoc;
		
	@FindBy(id="new_password_join")
	public static WebElement passwordLoc;
		
	@FindBy(css=".form-group.form-item.control-group.terms-and-conditions .checkbox")
	public static WebElement termsAndConditionCheckbocLoc;
		
	@FindBy(css=" .textbox-alert.help-block.error .type")
	public static WebElement termsAndConditionsWarningMessageLoc;
		
	@FindBy(id="agree_to_offers_label")
	public static WebElement offersLabelCheckBocLoc;
		
	@FindBy(id="join-quidco-submit-button")
	public static WebElement joinQuidcoButtonLoc;
		
	@FindBy(css=".super.ng-binding")
	public static WebElement welcomeMessageLoc;
		
	@FindBy(css="#join-quidco-form > fieldset > div:nth-child(1) > div")
	public static WebElement firstNameErrorMessage;
	
	@FindBy(css="#join-quidco-form > fieldset > div:nth-child(2) > div")
	public static WebElement lastNameErrorMessage;
	
	@FindBy(css="#join-quidco-form > fieldset > div:nth-child(3) > div")
	public static WebElement emailErrorMessage;
	
	@FindBy(css="#join-quidco-form > fieldset > div:nth-child(4) > div")
	public static WebElement passwordErrorMessage;
		

}
