package com.ecore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecore.qa.base.TestBase;

public class FeedsPage extends TestBase{
	
	
	    // Page Factory - OR:
		@FindBy(xpath = "//input[@id='txtemail']")
		WebElement email;

		@FindBy(xpath = "//input[@id='txtpassword']")
		WebElement password;

		@FindBy(xpath = "//input[@value='Login']")
		WebElement login;

		@FindBy(xpath = "//span[contains(text(),'Feeds')]")
		WebElement feedsMenuBtn;
		
		@FindBy(xpath = "//a[contains(text(),'Feeds')]")
		WebElement feedBtn;
			
		@FindBy(xpath = "//input[@id='suggestion_venue']")
		WebElement filterEnterText;
		
		@FindBy(xpath = "//button[@type='submit']")
		WebElement filterBtn;
		
		@FindBy(xpath = "//tr//td[1]")
		WebElement feedName;
		
		@FindBy(xpath = "//select[@id='search_in_0']//option[@value='user_type']")
		WebElement searchInUserType;
		
		@FindBy(xpath = "//select//option[@value='created_datetime']")
		WebElement SearchInPublishedOn;
		
		@FindBy(xpath = "//input[@class='form-control date-range-piker-field date_range0']")
		WebElement dateRange;
		
		@FindBy(xpath = "//th[@class='prev available']")
		WebElement clickBackButton;
		
		@FindBy(xpath = "//td[@data-title='r2c4'][contains(text(),'18')]")
		WebElement startDate;
		
		@FindBy(xpath = "//td[@data-title='r2c4'][contains(text(),'18')]")
		WebElement endDate;
		
		@FindBy(xpath = "//button[@class='applyBtn btn btn-sm btn-primary'][contains(text(),'Apply')]")
		WebElement applyButton;
		
		
			
		@FindBy(xpath = "//tr//td[3]")
		WebElement UserType;
		
		@FindBy(xpath = "//tr//td[6]")
		WebElement publishedOn;
		
		
		
		@FindBy(xpath = "//select[@id='search_type_0']//option[contains(text(),'Begins With')]")
		WebElement beginsWith;
		
		@FindBy(xpath = "//select[@id='search_type_0']//option[contains(text(),'Ends With')]")
		WebElement endsWith;
		
		@FindBy(xpath = "//select[@id='search_type_0']//option[contains(text(),'Exact Match')]")
		WebElement exactMatch;
		
		@FindBy(xpath = "//Select//option[@value='club owner']")
		WebElement selectUserClubOwner;
		
		@FindBy(xpath = "//Select//option[@value='admin']")
		WebElement selectUserAdmin;
		
		@FindBy(xpath = "//input[@type='search']")
		WebElement searchField;
		
//		@FindBy(xpath = "//td[1]//span[@class='mr-2'][contains(text(),'Abcd Post')]")
//		WebElement feedName;
//		
		@FindBy(xpath = "//td[2]//span[@class='mr-2']")
		WebElement postedBy;
		
		@FindBy(xpath = "//i[@aria-expanded='true']")
		WebElement threeDots;
		
		@FindBy(xpath = "//ul[@id='dropdown_content_255']//span[@class='mr-2'][normalize-space()='View feed']")
		WebElement viewFeeds;
		
		@FindBy(xpath = "//h3[normalize-space()='View Feed - Abcd Post']")
		WebElement viewFeedsTitle;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Initializing the Page Objects:
		public FeedsPage() {
			PageFactory.initElements(driver, this);
		}
				
		public void login() {
			email.sendKeys(prop.getProperty("validEmail"));
			password.sendKeys(prop.getProperty("validPassword"));
			login.click();

		}
		
		public String validateFeedsNameAfterFilterWithSearchTypeAsContains() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			filterEnterText.sendKeys(prop.getProperty("feedsContain"));
			Thread.sleep(2000);
			filterBtn.click();
			Thread.sleep(2000);
			String name = feedName.getText();
			return name;

		}
		

		public String validateFeedsNameAfterFilterWithSearchTypeAsBeginWith() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			beginsWith.click();
			filterEnterText.sendKeys(prop.getProperty("feedNameBeginWith"));
			Thread.sleep(2000);
			filterBtn.click();
			Thread.sleep(2000);
			String name = feedName.getText();
			return name;

		}

		
		public String validateFeedsNameAfterFilterWithSearchTypeAsEndsWith() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			endsWith.click();
			filterEnterText.sendKeys(prop.getProperty("feedNameEndsWith"));
			Thread.sleep(2000);
			filterBtn.click();
			Thread.sleep(2000);
			String name = feedName.getText();
			return name;

		}


		public String validateFeedsNameAfterFilterWithSearchTypeAsExactMatch() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			exactMatch.click();
			filterEnterText.sendKeys(prop.getProperty("feedNameExactMatch"));
			Thread.sleep(2000);
			filterBtn.click();
			Thread.sleep(2000);
			String name = feedName.getText();
			return name;

		}
		
		public String validateFeedsAfterFilterWithSelectUserAsClubOwner() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			Thread.sleep(2000);
			searchInUserType.click();
			selectUserClubOwner.click();
			Thread.sleep(2000);
			filterBtn.click();
			Thread.sleep(2000);
			String name = UserType.getText();
			return name;

		}


		public String validateFeedsAfterFilterWithSelectUserAsAdmin() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			Thread.sleep(2000);
			searchInUserType.click();
			selectUserAdmin.click();
			Thread.sleep(2000);
			filterBtn.click();
			Thread.sleep(2000);
			String name = UserType.getText();
			return name;

		}

		public String validateFeedsAfterFilterWithPublishedOn() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			Thread.sleep(2000);
			SearchInPublishedOn.click();
			dateRange.click();
			clickBackButton.click();
			startDate.click();
			endDate.click();
			applyButton.click();
			Thread.sleep(2000);
			filterBtn.click();
			Thread.sleep(2000);
			String name = publishedOn.getText();
			return name;

		}	
		
		public String validateFeedNameAfterSearchWithFeedName() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			Thread.sleep(2000);
			searchField.sendKeys(prop.getProperty("searchFeedName"));
			String name = feedName.getText();
			return name;
			
			
		}
		
		public String validatePostedByAfterSearchWithPostedBy() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			Thread.sleep(2000);
			searchField.sendKeys(prop.getProperty("searchPostedBy"));
			String name = postedBy.getText();
			return name;
			
			
		}
		
		public String validateUserTypeAfterSearchWithUserType() throws InterruptedException {
			login();
			feedsMenuBtn.click();
			feedBtn.click();
			Thread.sleep(2000);
			searchField.sendKeys(prop.getProperty("searchUserType"));
			String name = UserType.getText();
			return name;
			
			
		}
		
}
