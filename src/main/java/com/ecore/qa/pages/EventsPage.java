package com.ecore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecore.qa.base.TestBase;

public class EventsPage extends TestBase {
	
	
	
	 // Page Factory - OR:
	@FindBy(xpath = "//input[@id='txtemail']")
	WebElement email;

	@FindBy(xpath = "//input[@id='txtpassword']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;
	
	@FindBy(xpath = "//span[contains(text(),'Events')]")
	WebElement EventsMenuBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Events')]")
	WebElement EventsMenuBtn1;
	
	@FindBy(xpath = "//input[@id='suggestion_venue']")
	WebElement filterEnterText;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement filterBtn;
	
	@FindBy(xpath = "//tr//td[1]")
	WebElement eventName;
	
	@FindBy(xpath = "//select[@id='search_type_0']//option[contains(text(),'Begins With')]")
	WebElement beginsWith;
	
	@FindBy(xpath = "//select[@id='search_type_0']//option[contains(text(),'Ends With')]")
	WebElement endsWith;
	
	@FindBy(xpath = "//select[@id='search_type_0']//option[contains(text(),'Exact Match')]")
	WebElement exactMatch;
	
	
	@FindBy(xpath = "//Select//option[@value='user_type']")
	WebElement userType;
	
	
	
	
	
	
	// Initializing the Page Objects:
			public EventsPage() {
				PageFactory.initElements(driver, this);
			}
					
			public void login() {
				email.sendKeys(prop.getProperty("validEmail"));
				password.sendKeys(prop.getProperty("validPassword"));
				login.click();

			}

			public String validateEventsNameAfterFilterWithSearchTypeAsContains() throws InterruptedException {
				login();
				EventsMenuBtn.click();
				EventsMenuBtn1.click();
				filterEnterText.sendKeys(prop.getProperty("eventsContain"));
				Thread.sleep(2000);
				filterBtn.click();
				Thread.sleep(2000);
				String name = eventName.getText();
				return name;

			}
			
			public String validateEventsNameAfterFilterWithSearchTypeAsBeginsWith() throws InterruptedException {
				login();
				EventsMenuBtn.click();
				EventsMenuBtn1.click();
				beginsWith.click();
				filterEnterText.sendKeys(prop.getProperty("eventsNameBeginWith"));
				Thread.sleep(2000);
				filterBtn.click();
				Thread.sleep(2000);
				String name = eventName.getText();
				return name;

			}
			
			public String validateEventsNameAfterFilterWithSearchTypeAsEndsWith() throws InterruptedException {
				login();
				EventsMenuBtn.click();
				EventsMenuBtn1.click();
				endsWith.click();
				filterEnterText.sendKeys(prop.getProperty("eventNameEndsWith"));
				Thread.sleep(2000);
				filterBtn.click();
				Thread.sleep(2000);
				String name = eventName.getText();
				return name;

			}
			
			public String validateEventsNameAfterFilterWithSearchTypeAsExactMatch() throws InterruptedException {
				login();
				EventsMenuBtn.click();
				EventsMenuBtn1.click();
				exactMatch.click();
				filterEnterText.sendKeys(prop.getProperty("eventNameExactMatch"));
				Thread.sleep(2000);
				filterBtn.click();
				Thread.sleep(2000);
				String name = eventName.getText();
				return name;

			}
			
			public String validateEventsNameAfterFilterWithSearchInUserType() throws InterruptedException {
				login();
				EventsMenuBtn.click();
				EventsMenuBtn1.click();
				userType.click();
				filterEnterText.sendKeys(prop.getProperty("eventNameExactMatch"));
				Thread.sleep(2000);
				filterBtn.click();
				Thread.sleep(2000);
				String name = eventName.getText();
				return name;

			}		
}
