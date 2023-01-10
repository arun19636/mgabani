package Generics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.ActiTimeLoginpage;
import pom.ActitimeHomePage;

public class BaseTest 
	{
		public WebDriver driver;
		
		@BeforeSuite
		public void executionstart()
		{
			Reporter.log("execution started" , true);
		}
		
		@BeforeTest
		public void setup()
		{
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com");
		}
		
		@BeforeClass
		public void logintoapp() throws InterruptedException
		{
			ActiTimeLoginpage loginpage=new ActiTimeLoginpage(driver);
			loginpage.loginMethod();
		}
		
		@AfterClass
		public void logoutfromapp() throws InterruptedException
		{
			ActitimeHomePage homePage=new ActitimeHomePage(driver);
			homePage.logoutLinkMethod();
		}
		
		@AfterClass
		public void teardown()
		{
			driver.quit();
		}
		
		@AfterSuite
		public void executioncomplete()
		{
			Reporter.log("execution completed" , true);
		}
	}

