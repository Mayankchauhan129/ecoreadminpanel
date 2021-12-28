package com.ecore.qa.testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecore.qa.base.TestBase;
import com.ecore.qa.pages.LoginPage;




public class LoginPageTest  extends TestBase{
	LoginPage loginPage;

	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "E Core | Admin Panel");
	}
	
	@Test(priority=2, description = "After enter valid email and password click on Login button and user get redirect to Admin dashboard ")
	public void loginWithInvalidEmailOrPassword() {
		 WebElement Heading = loginPage.validateErrorMessageIfUserInvalidEmailOrPasswordAndClickOnSignInBtn();
		 Assert.assertEquals(Heading.getText(), "×");
		
	}
	
	@Test(priority=3, description = "After enter valid email and password click on Login button and user get redirect to Admin dashboard ")
	public void loginWithValidEmailAndPassword() {
		 WebElement Heading = loginPage.validateErrorMessageIfUserEnterValidEmailAndPasswordAndClickOnSignInBtn();
		 Assert.assertEquals(Heading.getTagName(), "img");
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
