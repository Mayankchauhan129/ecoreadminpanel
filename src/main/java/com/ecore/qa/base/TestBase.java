package com.ecore.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ecore.qa.util.TestUtil;



public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\qa-ecore\\src\\main\\java\\com\\ecore\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
//		String downloadFilePath = "D:\\qa-healthGroup\\src\\main\\resources\\DownloadFile"; 
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\qa-ecore\\src\\test\\resources\\chromedriver.exe" );
//			HashMap<String, Object> chromeprefs = new HashMap<String, Object>();
//			chromeprefs.put("profile.default_content_settings.popups", 0);
//			chromeprefs.put("download.default.directory", downloadFilePath);
//			ChromeOptions options = new ChromeOptions();
//			options.setExperimentalOption("prefs", chromeprefs);
////			DesiredCapabilities cap = DesiredCapabilities.chrome();
//			cap.setCapability(ChromeOptions.CAPABILITY, options);
//			driver = new ChromeDriver(options);
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "D:\\qa-ecore\\src\\test\\resources\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
		


}
