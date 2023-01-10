package Test;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Generics.BaseTest;
import pom.ActitimeHomePage;
import pom.CreatNewTypeofWork;
import pom.CreatTypeofWork;
import pom.SettingsHomepage;

public class LoginCreateTypeOfWorkDlt extends BaseTest
{
	@Test(priority = 1)
	public void createNewTypeofWorkInWebapp() throws InterruptedException
	{
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.setttingsMethod();

		SettingsHomepage settingspage=new SettingsHomepage(driver);
		settingspage.typesofWorkMethod();

		CreatTypeofWork typeofwork=new CreatTypeofWork(driver);
		typeofwork.CreatTypeofWorkMethod();

		CreatNewTypeofWork creattypeofnewWork=new CreatNewTypeofWork(driver);
		creattypeofnewWork.nameMethod();
		creattypeofnewWork.creattypeofworksumitMethod();
	}
	@Test(priority = 2)
	public void deleteTypeOfWorkInWebapp()
	{
		CreatNewTypeofWork creattypeofnewWork=new CreatNewTypeofWork(driver);
		creattypeofnewWork.deletWorkTypeMethod(); 

		Alert alert1=driver.switchTo().alert();  
		alert1.accept();
	}
}
