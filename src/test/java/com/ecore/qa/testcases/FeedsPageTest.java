package com.ecore.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecore.qa.base.TestBase;
import com.ecore.qa.pages.FeedsPage;

public class FeedsPageTest extends TestBase {
	
	FeedsPage feedsPage;

	
	public FeedsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		feedsPage = new FeedsPage();	
	}
	
	@Test(priority = 1, description = "Validate the result after selecting the Feed Name in Search In dropdown and Contains in Search Type dropdown and enter valid feeds name in Enter Text field and click on filter button.")
	public void validateFeedsNameAfterFiltersWithSearchTypeAsContains() throws InterruptedException {
		String msg = feedsPage.validateFeedsNameAfterFilterWithSearchTypeAsContains();
		System.out.println(msg);
		Assert.assertEquals(msg, "Butterfly");

	}

	@Test(priority = 2, description = "Validate the result after selecting the Feed Name in Search In dropdown and Begins With in Search Type dropdown and enter valid feeds name in Enter Text field and click on filter button.")
	public void validateFeedsNameAfterFiltersWithSearchTypeAsBeginsWith() throws InterruptedException {
		String msg = feedsPage.validateFeedsNameAfterFilterWithSearchTypeAsBeginWith();
		System.out.println(msg);
		Assert.assertEquals(msg, "Butterfly");

	}


	@Test(priority = 3, description = "Validate the result after selecting the Feed Name in Search In dropdown and Ends With in Search Type dropdown and enter valid feeds name in Enter Text field and click on filter button.")
	public void validateFeedsNameAfterFiltersWithSearchTypeAsEndsWith() throws InterruptedException {
		String msg = feedsPage.validateFeedsNameAfterFilterWithSearchTypeAsEndsWith();
		System.out.println(msg);
		Assert.assertEquals(msg, "Butterfly");

	}

	@Test(priority = 4, description = "Validate the result after selecting the Feed Name in Search In dropdown and Exact Match in Search Type dropdown and enter valid feeds name in Enter Text field and click on filter button.")
	public void validateFeedsNameAfterFiltersWithSearchTypeAsExactMatch() throws InterruptedException {
		String msg = feedsPage.validateFeedsNameAfterFilterWithSearchTypeAsExactMatch();
		System.out.println(msg);
		Assert.assertEquals(msg, "Butterfly");

	}
	
	@Test(priority = 5, description = "Validate the result after selecting the User Type in Search In dropdown and ClubOwner in Select User dropdown and click on filter button.")
	public void validateFeedAfterFiltersWithSelectUsersAsClubOwner() throws InterruptedException {
		String msg = feedsPage.validateFeedsAfterFilterWithSelectUserAsClubOwner();
		System.out.println(msg);
		Assert.assertEquals(msg, "Club Owner");

	}
	

	@Test(priority = 6, description = "Validate the result after selecting the User Type in Search In dropdown and Admin in Select User dropdown and click on filter button.")
	public void validateFeedAfterFiltersWithSelectUsersAsAdmin() throws InterruptedException {
		String msg = feedsPage.validateFeedsAfterFilterWithSelectUserAsAdmin();
		System.out.println(msg);
		Assert.assertEquals(msg, "Admin");

	}
	
	@Test(priority = 7, description = "Validate the result after selecting the Published On in Search In dropdown and select the date in Date Range Dropdown and click on filter button.")
	public void validateFeedsAfterFilterWithPublishedOn() throws InterruptedException {
		String msg = feedsPage.validateFeedsAfterFilterWithPublishedOn();
		System.out.println(msg);
		Assert.assertEquals(msg, "11/18/2021 11:07 AM");

	}
	
	@Test(priority = 8, description = "Validate the result after searching with the feed name in search field.")
	public void validateFeedsNameAfterSearchingWithFeedName() throws InterruptedException {
		String msg = feedsPage.validateFeedNameAfterSearchWithFeedName();
		System.out.println(msg);
		Assert.assertEquals(msg, "Abcd Post");

	}
	
	@Test(priority = 9, description = "Validate the result after searching with the feed name in search field.")
	public void validatePostedByAfterSearchWithPostedBy() throws InterruptedException {
		String msg = feedsPage.validatePostedByAfterSearchWithPostedBy();
		System.out.println(msg);
		Assert.assertEquals(msg, "E Core");

	}
	
	@Test(priority = 10, description = "Validate the result after searching with the feed name in search field.")
	public void validateUserTypeAfterSearchWithUserType() throws InterruptedException {
		String msg = feedsPage.validateUserTypeAfterSearchWithUserType();
		System.out.println(msg);
		Assert.assertEquals(msg, "Super Admin");

	}
	
	

	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	


}
