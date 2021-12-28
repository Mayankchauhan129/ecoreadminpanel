package com.ecore.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecore.qa.base.TestBase;



public class LoginPage extends TestBase {

	// Page Factory - OR:
	@FindBy(xpath = "//input[@id='txtemail']")
	WebElement email;

	@FindBy(xpath = "//input[@id='txtpassword']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement validateErrorMessageIfUserInvalidEmailOrPasswordAndClickOnSignInBtn() {
		email.sendKeys(prop.getProperty("validEmail"));
		password.sendKeys(prop.getProperty("invalidPassword"));
		login.click();
		WebElement element = driver.findElement(By.xpath("//span[@aria-hidden='true']"));
		return element;
		

	}

	
	public WebElement validateErrorMessageIfUserEnterValidEmailAndPasswordAndClickOnSignInBtn() {
		email.sendKeys(prop.getProperty("validEmail"));
		password.sendKeys(prop.getProperty("validPassword"));
		login.click();
		WebElement element = driver.findElement(By.xpath("//img[@src=\"http://3.20.116.19/public/assets/images/icon96.png\"]"));
		return element;
		

	}	 
}
