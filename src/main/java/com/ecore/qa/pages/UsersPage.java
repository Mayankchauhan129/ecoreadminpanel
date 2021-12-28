package com.ecore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecore.qa.base.TestBase;

public class UsersPage<WebElements> extends TestBase{

	static WebDriverWait wait;

	// Page Factory - OR:
	@FindBy(xpath = "//input[@id='txtemail']")
	WebElement email;

	@FindBy(xpath = "//input[@id='txtpassword']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;

	@FindBy(xpath = "//input[@type='text']")
	WebElement enterText;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement filterButton;
	
	//tr/td/a/u/span[@class='mr-2']
	@FindBy(xpath = "//tr/td/a[@data-name='Eshita']")
	WebElement fullNameContainsSearch;
	
	@FindBy(xpath= "//a/u/span[@class='mr-2']")
	WebElement fullNameBeginsWithSearch;
	
	@FindBy(xpath= "//a/u/span[@class='mr-2']")
	WebElement fullNameEndsWithSearch;
	
	@FindBy(xpath= "//a/u/span[@class='mr-2']")
	WebElement fullNameExactMatchSearch;
	
	@FindBy(xpath= "//select/option[@value='phone_number']")
	WebElement searchInPhoneNumber;
	
	@FindBy(xpath= "//select/option[@value='user_type']")
	WebElement searchInUserType;
	
	@FindBy(xpath= "//select/option[@value='block_flag']")
	WebElement searchInBlocked;
	
	@FindBy(xpath= "//select/option[@value='date_created']")
	WebElement searchInRegisteredOn;
	
	@FindBy(xpath = "//td[contains(text(),'+915656565656')]")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//select//option[@value='begins_with']")
	WebElement beginsWith;
	
	@FindBy(xpath = "//select//option[@value='ends_with']")
	WebElement endsWith;
	
	@FindBy(xpath = "//select//option[@value='exact_match']")
	WebElement exactMatch;
	
	
	@FindBy(xpath = "//select//option[@value='visitor']")
	WebElement selectUserVisitor;
	
	@FindBy(xpath = "//Select//option[@value='customer']")
	WebElement selectUserCustomer;
	
	@FindBy(xpath = "//select//option[@value='ambassador']")
	WebElement selectUserAmbassador;
	
	@FindBy(xpath = "//select//option[@value='guide']")
	WebElement selectUserGuide;
	
	@FindBy(xpath = "//select//option[@value='club_owner']")
	WebElement selectUserClubOwner;
	
	@FindBy(xpath = "//select//option[@value='admin']")
	WebElement selectUserAdmin;
	
	@FindBy(xpath = "//tr//td[contains(text(),'Visitor')]")
	WebElement filterAfterVisitor;

	@FindBy(xpath = "//tr//td[contains(text(),'Customer')]")
	WebElement filterAfterCustomer;
	
	@FindBy(xpath = "//tr//td[contains(text(),'Ambassador')]")
	WebElement filterAfterAmbassador;
	
	@FindBy(xpath = "//tr//td[contains(text(),'Guide')]")
	WebElement filterAfterGuide;
	
	@FindBy(xpath = "//tr//td[contains(text(),'Admin')]")
	WebElement filterAfterAdmin;
	
	@FindBy(xpath = "//tr[@class='text-danger odd']")
	WebElement blockedUsers;
	
	@FindBy(xpath = "//tr[@class='odd']")
	WebElement unblockedUsers;
	
	
	@FindBy(xpath = "//Select//option[@value='1']")
	WebElement selectYes;
	
	@FindBy(xpath = "//Select//option[@value='0']")
	WebElement selectNo;
	
	@FindBy(xpath = "//input[@class='form-control date-range-piker-field date_range0']")
	WebElement dateRangeField;
	
	@FindBy(xpath = "//th[@class='prev available']")
	WebElement clickBackButton;
	
	
	@FindBy(xpath = "//tr[5]//td[@class='weekend available']")
	WebElement startDate;
	
	@FindBy(xpath = "//tr[5]//td[@class='available'][@data-title='r4c1']")
	WebElement endDate;
	
	@FindBy(xpath = "//button[@class='applyBtn btn btn-sm btn-primary']")
	WebElement applyButton;
	
	@FindBy(xpath = "//select[@class='form-control form-control-sm']//option[@value='10']")
	WebElement selectTenEntries;
	
	@FindBy(xpath = "//select[@class='form-control form-control-sm']//option[@value='25']")
	WebElement selectTwentyFiveEntries;
	
	@FindBy(xpath = "//select[@class='form-control form-control-sm']//option[@value='50']")
	WebElement selectFiftyEntries;
	
	@FindBy(xpath = "//select[@class='form-control form-control-sm']//option[@value='100']")
	WebElement selectHundredEntries;
	
	@FindBy(xpath = "//div[@class='col-sm-12 col-md-5']//div[@id='DataTables_Table_0_info']")
	WebElement selectedEntriesText;
	
	@FindBy(xpath = "//div[@class='btn-group']")
	WebElement actionThreeDots;
	
	@FindBy(xpath = "//a//span[@class='mr-2'][contains(text(),'View User Profile')]")
	WebElement viewUserProfileButton;
	
	@FindBy(xpath = "//h3[@class='modal-title'][contains(text(),'View Profile - Tushar')]")
	WebElement titleOfViewUser;
	
	@FindBy(xpath = "//span[@class='mr-2'][contains(text(),'Block this User')]")
	WebElement blockThisUserButton;
	
	@FindBy(xpath = "//span[@class='mr-2'][contains(text(),'Unblock this User')]")
	WebElement unblockThisUserButton;
	
	@FindBy(xpath = "//button[@id='confirm-handler'][contains(text(),'Yes')]")
	WebElement yesInBlockedPopUp;
	
	@FindBy(xpath = "//tr//td[8]")
	WebElement userAfterDateFilter;
	
	@FindBy(xpath = "//input[@type='search'][@class='form-control form-control-sm']")
	WebElement searchField;
	
	@FindBy(xpath = "//span[@class='mr-2']")
	WebElement searchName;
	
	@FindBy(xpath = "//tr//td[3]")
	WebElement searchPhoneNumber;
	
	@FindBy(xpath = "//tr//td[8]")
	WebElement searchDOB;
	
	@FindBy(xpath = "//tr//td[7]")
	WebElement searchReferral;
	
	@FindBy(xpath = "//tr//td[7]")
	WebElement searchJoiningReferral;
	
	

	
	@FindBy(xpath = "//select//option[contains(text(),'All')]")
	WebElement limitAll;
	
	
	// Initializing the Page Objects:
		public UsersPage() {
			PageFactory.initElements(driver, this);
		}

		public void login() {
			email.sendKeys(prop.getProperty("validEmail"));
			password.sendKeys(prop.getProperty("validPassword"));
			login.click();

		}
		
		public String validateUserNameAfterFilterWithSearchTypeAsContains() throws InterruptedException {
			login();
			enterText.sendKeys(prop.getProperty("fullNameContains"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(2000);
			String name = fullNameContainsSearch.getText();
			return name;

		}

		public String validateUserNameAfterFilterWithSearchTypeAsBeginsWith() throws InterruptedException {
			login();
			beginsWith.click();
			enterText.sendKeys(prop.getProperty("fullNameBeginsWith"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(2000);
			String name1 = fullNameBeginsWithSearch.getText();
			return name1;
		}
		
		public String validateUserNameAfterFilterWithSearchTypeAsEndsWith() throws InterruptedException {
			login();
			endsWith.click();
			enterText.sendKeys(prop.getProperty("fullNameEndsWith"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(2000);
			String name1 = fullNameEndsWithSearch.getText();
			return name1;
		}
		
		public String validateUserNameAfterFilterWithSearchTypeAsExactMatch() throws InterruptedException {
			login();
			exactMatch.click();
			enterText.sendKeys(prop.getProperty("fullNameExactMatch"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = fullNameExactMatchSearch.getText();
			return name1;
		}
		
		public String validatePhoneNumberAfterFilterWithSearchTypeAsContains() throws InterruptedException {
			login();
			searchInPhoneNumber.click();
			enterText.sendKeys(prop.getProperty("phoneNumberContains"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = phoneNumber.getText();
			return name1;
		}
		
		public String validatePhoneNumberAfterFilterWithSearchTypeAsBeginsWith() throws InterruptedException {
			login();
			searchInPhoneNumber.click();
			beginsWith.click();
			enterText.sendKeys(prop.getProperty("phoneNumberContains"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = phoneNumber.getText();
			return name1;
		}
		
		public String validatePhoneNumberAfterFilterWithSearchTypeAsEndsWith() throws InterruptedException {
			login();
			searchInPhoneNumber.click();
			endsWith.click();
			enterText.sendKeys(prop.getProperty("phoneNumberContains"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = phoneNumber.getText();
			return name1;
		}
		
		public String validatePhoneNumberAfterFilterWithSearchTypeAsExactMatch() throws InterruptedException {
			login();
			searchInPhoneNumber.click();
			exactMatch.click();
			enterText.sendKeys(prop.getProperty("phoneNumberExactMatch"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = phoneNumber.getText();
			return name1;
		}
		
		public String validateUserTypeAfterFilterWithSearchTypeAsExactMatch() throws InterruptedException {
			login();
			searchInUserType.click();
			selectUserVisitor.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = phoneNumber.getText();
			return name1;
		}
		
		
		//tr/td[2]/a/u/span[@class='mr-2']
	
		public String validateUsersAfterFilterWithSelectUserAsVisitor() throws InterruptedException {
			login();
			searchInUserType.click();
			selectUserVisitor.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = filterAfterVisitor.getText();
			return name1;
		}
		
		public String validateUsersAfterFilterWithSelectUserAsCustomer() throws InterruptedException {
			login();
			searchInUserType.click();
			selectUserCustomer.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = filterAfterCustomer.getText();
			return name1;
		}
		
		public String validateUsersAfterFilterWithSelectUserAsAmbassador() throws InterruptedException {
			login();
			searchInUserType.click();
			selectUserAmbassador.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = filterAfterAmbassador.getText();
			return name1;
		}
		
		
		public String validateUsersAfterFilterWithSelectUserAsGuide() throws InterruptedException {
			login();
			searchInUserType.click();
			selectUserGuide.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = filterAfterGuide.getText();
			return name1;
		}
		
		public String validateUsersAfterFilterWithSelectUserAsAdmin() throws InterruptedException {
			login();
			searchInUserType.click();
			selectUserAdmin.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String name1 = filterAfterAdmin.getText();
			return name1;
		}
		
		public String validateIsBlockedUsersAfterFilterWithSelectYes() throws InterruptedException {
			login();
			searchInBlocked.click();
			selectYes.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String colorRGBA = blockedUsers.getCssValue("color");
			return colorRGBA;
		}
		
		public String validateIsBlockedUsersAfterFilterWithSelectNo() throws InterruptedException {
			login();
			searchInBlocked.click();
			selectNo.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String colorRGBA = unblockedUsers.getCssValue("color");
			return colorRGBA;
		}
		
		public String validateRegisteredOnUsersAfterFilterWithDateRange() throws InterruptedException {
			login();
			searchInRegisteredOn.click();
			dateRangeField.click();
			Thread.sleep(2000);
			clickBackButton.click();
			Thread.sleep(2000);
			startDate.click();
			Thread.sleep(2000);
			endDate.click();
			Thread.sleep(2000);
			applyButton.click();
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			String date = userAfterDateFilter.getText();
			return date;
		}
		
		
		public String validateTenEntriesShownAfterSelectingTen() throws InterruptedException {
			login();
			selectTenEntries.click();
		    String text = selectedEntriesText.getText();
			return text;
		}
		
		public String validateTwentyFiveEntriesShownAfterSelectingTwentyFive() throws InterruptedException {
			login();
			selectTwentyFiveEntries.click();
		    String text = selectedEntriesText.getText();
			return text;
		}
		
		public String validateFiftyEntriesShownAfterSelectingFifty() throws InterruptedException {
			login();
			selectFiftyEntries.click();
		    String text = selectedEntriesText.getText();
			return text;
		}
		
		public String validateHundredEntriesShownAfterSelectingHundred() throws InterruptedException {
			login();
			selectHundredEntries.click();
		    String text = selectedEntriesText.getText();
			return text;
		}

		public String validateViewUserProfileDetails() throws InterruptedException {
			login();
			searchInPhoneNumber.click();
			enterText.sendKeys(prop.getProperty("phoneNumberViewUserProfile"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			actionThreeDots.click();
			viewUserProfileButton.click();
			Thread.sleep(2000);
			String name1 = titleOfViewUser.getText();
			return name1;
		}
		

		public String validateBlockedUser() throws InterruptedException {
			login();
			searchInPhoneNumber.click();
			enterText.sendKeys(prop.getProperty("phoneNumberViewUserProfile"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			actionThreeDots.click();
			blockThisUserButton.click();
			yesInBlockedPopUp.click();
			Thread.sleep(2000);
			String colorRGBA = blockedUsers.getCssValue("color");
			return colorRGBA;
		}

		public String validateUnBlockedUser() throws InterruptedException {
			login();
			searchInPhoneNumber.click();
			enterText.sendKeys(prop.getProperty("phoneNumberViewUserProfile"));
			Thread.sleep(2000);
			filterButton.click();
			Thread.sleep(4000);
			actionThreeDots.click();
			unblockThisUserButton.click();
			yesInBlockedPopUp.click();
			Thread.sleep(2000);
			String colorRGBA = unblockedUsers.getCssValue("color");
			return colorRGBA;
		}
		
		public String validateSearchWithPhoneNumer() throws InterruptedException {
			login();
			searchField.sendKeys(prop.getProperty("searchPhoneNumber"));
			Thread.sleep(2000);
			String phoneNumber = searchPhoneNumber.getText();
			return phoneNumber;
		}
		
		public String validateSearchWithName() throws InterruptedException {
			login();
			searchField.sendKeys(prop.getProperty("searchName"));
			Thread.sleep(2000);
			String name = searchName.getText();
			return name;
		}
		
		public String validateSearchWithDOB() throws InterruptedException {
			login();
			searchField.sendKeys(prop.getProperty("searchDOB"));
			Thread.sleep(2000);
			String name = searchDOB.getText();
			return name;
		}
		
		public String validateSearchWithReferral() throws InterruptedException {
			login();
			searchField.sendKeys(prop.getProperty("referralCode"));
			Thread.sleep(2000);
			String name = searchReferral.getText();
			return name;
		}
		
		public String validateSearchWithJoiningReferral() throws InterruptedException {
			login();
			searchField.sendKeys(prop.getProperty("joiningReferralCode"));
			Thread.sleep(2000);
			String name = searchJoiningReferral.getText();
			return name;
		}
	
}
		
