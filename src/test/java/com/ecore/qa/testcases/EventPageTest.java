package com.ecore.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecore.qa.base.TestBase;
import com.ecore.qa.pages.EventsPage;

public class EventPageTest extends TestBase{
	
	
	EventsPage eventPage;

	
	public EventPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		eventPage = new EventsPage();	
	}
	
	@Test(priority = 1, description = "Validate the result after selecting the Event Name in Search In dropdown and Contains in Search Type dropdown and enter valid feeds name in Enter Text field and click on filter button.")
	public void validateEventsNameAfterFiltersWithSearchTypeAsContains() throws InterruptedException {
		String msg = eventPage.validateEventsNameAfterFilterWithSearchTypeAsContains();
		System.out.println(msg);
		Assert.assertEquals(msg, "Testing Event 1");

	}

	@Test(priority = 2, description = "Validate the result after selecting the Event Name in Search In dropdown and Begins With in Search Type dropdown and enter valid feeds name in Enter Text field and click on filter button.")
	public void validateEventsNameAfterFiltersWithSearchTypeAsBeginsWith() throws InterruptedException {
		String msg = eventPage.validateEventsNameAfterFilterWithSearchTypeAsBeginsWith();
		System.out.println(msg);
		Assert.assertEquals(msg, "Friday night");

	}


	@Test(priority = 3, description = "Validate the result after selecting the Event Name in Search In dropdown and Ends With in Search Type dropdown and enter valid feeds name in Enter Text field and click on filter button.")
	public void validateEventsNameAfterFiltersWithSearchTypeAsEndsWith() throws InterruptedException {
		String msg = eventPage.validateEventsNameAfterFilterWithSearchTypeAsEndsWith();
		System.out.println(msg);
		Assert.assertEquals(msg, "Friday night");

	}

	@Test(priority = 4, description = "Validate the result after selecting the Event Name in Search In dropdown and Exact Match in Search Type dropdown and enter valid feeds name in Enter Text field and click on filter button.")
	public void validateEventsNameAfterFiltersWithSearchTypeAsExactMatch() throws InterruptedException {
		String msg = eventPage.validateEventsNameAfterFilterWithSearchTypeAsExactMatch();
		System.out.println(msg);
		Assert.assertEquals(msg, "Friday night");

	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	



}
