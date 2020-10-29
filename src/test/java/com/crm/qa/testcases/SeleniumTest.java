package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtils;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumTest {
	WebDriver driver;
	@BeforeSuite(alwaysRun = true)
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", TestUtils.WORKSAPCE_PATH + "//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test
	public void TC001_CheckifLogoisPresent() {
		try {
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
