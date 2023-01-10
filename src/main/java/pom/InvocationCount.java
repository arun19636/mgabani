package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	public WebDriver driver;

	@Test(invocationCount = 2)
	public void loginlogout() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/user/submit_tt.do");

		ActiTimeLoginpage loginpage=new ActiTimeLoginpage(driver);
		loginpage.loginMethod();
		Thread.sleep(4000);

	}	

	@Test(invocationCount = 3)
	public void createCustomer() throws InterruptedException
	{

		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.tasksMethod();
		Tasks tasks=new Tasks(driver);
		tasks.addnewMethod();
		tasks.newcustomerMethod();
		tasks.customernameMethod();
		tasks.customerdescriptionMethod();
		tasks.selectcustomerMethod();
		tasks.dropdownListMethod();
		tasks.createCustomerMethod();

	}
	@Test(invocationCount = 3)
	public void deletecustomer() throws InterruptedException
	{

		CustomerDeletePage delet=new CustomerDeletePage(driver);
		delet.customereditButtonMethod();
		delet.clickonActionMethod();
		delet.clickdeletMethod();
		delet.deletPermanentlyMethod();
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.logoutLinkMethod();
	}
}
