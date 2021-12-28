package com.ecore.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecore.qa.base.TestBase;
import com.ecore.qa.pages.UsersPage;

public class UserPageTest extends TestBase {

	UsersPage<Object> userPage;

	public UserPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		userPage = new UsersPage<Object>();
	}

	@Test(priority = 1, description = "Validate the result after selecting the Name in Search In dropdown and Contains in Search Type dropdown and enter valid registered name in Enter Text field and click on filter button.")
	public void validateUserNameAfterFiltersWithSearchTypeAsContains() throws InterruptedException {
		String msg = userPage.validateUserNameAfterFilterWithSearchTypeAsContains();
		Assert.assertEquals(msg, "Eshita Pathak");

	}

	@Test(priority = 2, description = "Validate the result after selecting the Name in Search In dropdown and Begins With in Search Type dropdown and enter valid registered name in Enter Text field and click on filter button.")
	public void validateUserNameAfterFiltersWithSearchTypeAsBeginsWith() throws InterruptedException {
		String msg = userPage.validateUserNameAfterFilterWithSearchTypeAsBeginsWith();
		System.out.println(msg);
		Assert.assertEquals(msg, "E Core");

	}

	@Test(priority = 3, description = "Validate the result after selecting the Name in Search In dropdown and Begins With in Search Type dropdown and enter valid registered name in Enter Text field and click on filter button.")
	public void validateUserNameAfterFiltersWithSearchTypeAsEndsWith() throws InterruptedException {
		String msg = userPage.validateUserNameAfterFilterWithSearchTypeAsEndsWith();
		System.out.println(msg);
		Assert.assertEquals(msg, "Shantanu Tiwari");

	}

	@Test(priority = 4, description = "Validate the result after selecting the Name in Search In dropdown and Begins With in Search Type dropdown and enter valid registered name in Enter Text field and click on filter button.")
	public void validateUserNameAfterFiltersWithSearchTypeAsExactMatch() throws InterruptedException {
		String msg = userPage.validateUserNameAfterFilterWithSearchTypeAsExactMatch();
		System.out.println(msg);
		Assert.assertEquals(msg, "Shantanu Tiwari");

	}

	@Test(priority = 5, description = "Validate the result after selecting the Phone Number in Search In dropdown and Contains in Search Type dropdown and enter valid phone number in Enter Text field and click on filter button.")
	public void validatePhoneNumberAfterFiltersWithSearchTypeAsContains() throws InterruptedException {
		String msg = userPage.validatePhoneNumberAfterFilterWithSearchTypeAsContains();
		System.out.println(msg);
		Assert.assertEquals(msg, "+915656565656");

	}

	@Test(priority = 6, description = "Validate the result after selecting the Phone Number in Search In dropdown and Begins With in Search Type dropdown and enter valid phone number in Enter Text field and click on filter button.")
	public void validatePhoneNumberAfterFiltersWithSearchTypeAsBeginsWith() throws InterruptedException {
		String msg = userPage.validatePhoneNumberAfterFilterWithSearchTypeAsBeginsWith();
		System.out.println(msg);
		Assert.assertEquals(msg, "+915656565656");

	}

	@Test(priority = 7, description = "Validate the result after selecting the Phone Number in Search In dropdown and Ends With in Search Type dropdown and enter valid phone number in Enter Text field and click on filter button.")
	public void validatePhoneNumberAfterFiltersWithSearchTypeAsEndsWith() throws InterruptedException {
		String msg = userPage.validatePhoneNumberAfterFilterWithSearchTypeAsBeginsWith();
		System.out.println(msg);
		Assert.assertEquals(msg, "+915656565656");

	}

	@Test(priority = 8, description = "Validate the result after selecting the Phone Number in Search In dropdown and Exact Match in Search Type dropdown and enter valid phone number in Enter Text field and click on filter button.")
	public void validatePhoneNumberAfterFiltersWithSearchTypeAsExatchMatch() throws InterruptedException {
		String msg = userPage.validatePhoneNumberAfterFilterWithSearchTypeAsExactMatch();
		System.out.println(msg);
		Assert.assertEquals(msg, "+915656565656");

	}

	@Test(priority = 9, description = "Validate the result after selecting the User Type in Search In dropdown and Visitor in Select Users dropdown and click on filter button.")
	public void validateUsersAfterFiltersWithSelectUsersAsVisitor() throws InterruptedException {
		String msg = userPage.validateUsersAfterFilterWithSelectUserAsVisitor();
		System.out.println(msg);
		Assert.assertEquals(msg, "Visitor");

	}

	@Test(priority = 10, description = "Validate the result after selecting the User Type in Search In dropdown and Customer in Select Users dropdown and click on filter button.")
	public void validateUsersAfterFiltersWithSelectUsersAsCustomer() throws InterruptedException {
		String msg = userPage.validateUsersAfterFilterWithSelectUserAsCustomer();
		System.out.println(msg);
		Assert.assertEquals(msg, "Customer");

	}

	@Test(priority = 11, description = "Validate the result after selecting the User Type in Search In dropdown and Ambassador in Select Users dropdown and click on filter button.")
	public void validateUsersAfterFiltersWithSelectUsersAsAmbassador() throws InterruptedException {
		String msg = userPage.validateUsersAfterFilterWithSelectUserAsAmbassador();
		System.out.println(msg);
		Assert.assertEquals(msg, "Ambassador");

	}

	@Test(priority = 12, description = "Validate the result after selecting the User Type in Search In dropdown and Guide in Select Users dropdown and click on filter button.")
	public void validateUsersAfterFiltersWithSelectUsersAsGuide() throws InterruptedException {
		String msg = userPage.validateUsersAfterFilterWithSelectUserAsGuide();
		System.out.println(msg);
		Assert.assertEquals(msg, "Guide");

	}

	@Test(priority = 13, description = "Validate the result after selecting the User Type in Search In dropdown and Admin in Select Users dropdown and click on filter button.")
	public void validateUsersAfterFiltersWithSelectUsersAsAdmin() throws InterruptedException {
		String msg = userPage.validateUsersAfterFilterWithSelectUserAsAdmin();
		System.out.println(msg);
		Assert.assertEquals(msg, "Admin");

	}

	@Test(priority = 14, description = "Validate the result after selecting the Is Blocked in Search In dropdown and Yes in Select Admin dropdown and click on filter button.")
	public void validateIsBlockedUsersAfterFilterWithSelectYes() throws InterruptedException {
		String colorRGBA = userPage.validateIsBlockedUsersAfterFilterWithSelectYes();
		System.out.println(colorRGBA);
		Assert.assertEquals(colorRGBA, "rgba(237, 85, 101, 1)");

	}

	@Test(priority = 15, description = "Validate the result after selecting the Is Blocked in Search In dropdown and No in Select Admin dropdown and click on filter button.")
	public void validateIsBlockedUsersAfterFilterWithSelectNo() throws InterruptedException {
		String colorRGBA = userPage.validateIsBlockedUsersAfterFilterWithSelectNo();
		System.out.println(colorRGBA);
		Assert.assertEquals(colorRGBA, "rgba(103, 106, 108, 1)");

	}
	
	  @Test(priority=16, description = "Validate the result after selecting the Registered On in Search In dropdown and select the date in Date Range Dropdown and click on filter button.")
	  public void validateDateOfUsersAfterFilterWithDateRange() throws InterruptedException { 
	      String date = userPage.validateRegisteredOnUsersAfterFilterWithDateRange();
	      System.out.println(date);
	      Assert.assertEquals(date, "11/29/2021 03:50 PM");
	  }
	  
	  
	  @Test(priority=17, description = "Validate ten entries is shown after selecting the 10 Entries In Show Entries Dropdown.")
	  public void validateTenEntriesShownAfterSelectingTen() throws InterruptedException { 
	      String text = userPage.validateTenEntriesShownAfterSelectingTen();
	      System.out.println(text);
	      Assert.assertEquals(text, "Showing 1 to 10 of 403 entries");
	  }
	  
	  @Test(priority=18, description = "Validate 25 entries is shown after selecting the 25 Entries In Show Entries Dropdown.")
	  public void validateTwentyFiveEntriesShownAfterSelectingTwentyFive() throws InterruptedException { 
	      String text = userPage.validateTwentyFiveEntriesShownAfterSelectingTwentyFive();
	      System.out.println(text);
	      Assert.assertEquals(text, "Showing 1 to 25 of 403 entries");
	  }
	  
	  @Test(priority=19, description = "Validate 50 entries is shown after selecting the 50 Entries In Show Entries Dropdown.")
	  public void validateFiftyEntriesShownAfterSelectingFifty() throws InterruptedException { 
	      String text = userPage.validateFiftyEntriesShownAfterSelectingFifty();
	      System.out.println(text);
	      Assert.assertEquals(text, "Showing 1 to 50 of 403 entries");
	  }
	  
	  @Test(priority=20, description = "Validate 100 entries is shown after selecting the 100 Entries In Show Entries Dropdown.")
	  public void validateHundredEntriesShownAfterSelectingHundred() throws InterruptedException { 
	      String text = userPage.validateHundredEntriesShownAfterSelectingHundred();
	      System.out.println(text);
	      Assert.assertEquals(text, "Showing 1 to 100 of 403 entries");
	  }
	  
	  @Test(priority=21, description = "Validate the user after view the User Profile")
	  public void validateViewUserProfileDetails() throws InterruptedException { 
	      String text = userPage.validateViewUserProfileDetails();
	      System.out.println(text);
	      Assert.assertEquals(text, "View Profile - Tushar");
	  }
	  
	  @Test(priority=22, description = "After blocking the user validate that user is blocked or not.")
	  public void validateBlockedUser() throws InterruptedException { 
	      String color = userPage.validateBlockedUser();
	      System.out.println("Blocked Color is : "+color);
	      Assert.assertEquals(color, "rgba(237, 85, 101, 1)");
	  }
	  
	  @Test(priority=23, description = "After Unblocking the blocked User validate that user is blocked or not.")
	  public void validateUnBlockedUser() throws InterruptedException { 
	      String color = userPage.validateUnBlockedUser();
	      System.out.println("UnBlocked Color is : "+color);
	      Assert.assertEquals(color, "rgba(103, 106, 108, 1)");
	  }
	  
	  @Test(priority=24, description = "Validate the Phone Number of user after search with Phone Number. ")
	  public void validateSearchWithPhoneNumer() throws InterruptedException { 
	      String name = userPage.validateSearchWithPhoneNumer();
	      System.out.println("Phone Number is : "+name);
	      Assert.assertEquals(name, "+919988998899");
	  }
	  
	  @Test(priority=25, description = "Validate the Full Name of user after search with Name. ")
	  public void validateSearchWithName() throws InterruptedException { 
	      String name = userPage.validateSearchWithName();
	      System.out.println("Name is : "+name);
	      Assert.assertEquals(name, "Tushar Sharma");
	  }
	 
	  @Test(priority=26, description = "Validate the DOB of user after search with DOB.")
	  public void validateSearchWithDOB() throws InterruptedException { 
	      String name = userPage.validateSearchWithDOB();
	      System.out.println("DOB is : "+name);
	      Assert.assertEquals(name, "11/23/2021 11:43 AM");
	  }
	  
	  
	  @Test(priority=27, description = "Validate the Referral Code of user after search with Referral Code. ")
	  public void validateSearchWithReferral() throws InterruptedException { 
	      String name = userPage.validateSearchWithReferral();
	      System.out.println("Referral is : "+name);
	      Assert.assertEquals(name, "EP9MFWOO");
	  }
	  
	  @Test(priority=28, description = "Validate the Joining Referral Code of user after search with Joining Referral Code. ")
	  public void validateSearchWithJoiningReferral() throws InterruptedException { 
	      String name = userPage.validateSearchWithJoiningReferral();
	      System.out.println("Referral is : "+name);
	      Assert.assertEquals(name, "CNSBIPWE");
	  }
	  
	  
	  
	  
	  
	@AfterMethod
	public void Close() {
		driver.close();
	}
}
