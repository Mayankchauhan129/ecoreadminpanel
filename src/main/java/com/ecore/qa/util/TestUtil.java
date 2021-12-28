package com.ecore.qa.util;

import com.ecore.qa.base.TestBase;

public class TestUtil  extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 30;
	
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element-id")));
	
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("element-id")));

	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
//	public static void takeScreenshotAtEndOfTest() throws IOException {
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String currentDir = System.getProperty("user.dir");
//		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
//	}

}
