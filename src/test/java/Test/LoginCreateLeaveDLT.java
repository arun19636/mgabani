package Test;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import Generics.BaseTest;
import pom.ActitimeHomePage;
import pom.CreatLeaveType;
import pom.CreatNewLeaveType;
import pom.SettingsHomepage;

public class LoginCreateLeaveDLT extends BaseTest 
{
	@Test
	public void createLeave() throws InterruptedException
	{
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.setttingsMethod();
		SettingsHomepage settingspage=new SettingsHomepage(driver);
		settingspage.leaveTypesMethod(); 
		CreatLeaveType leave=new CreatLeaveType(driver); 
		leave.creatleavetypeMethod();
		CreatNewLeaveType newleave=new CreatNewLeaveType(driver);
		newleave.creatleaveNameMethod(); 
		newleave.leavetimecheckboxMethod();
		newleave.creattypeofLeavesubmitMethod(); 
	}
	
	@Test
	public void deleteLeave() throws InterruptedException
	{
		CreatNewLeaveType newleave=new CreatNewLeaveType(driver);
		newleave.typeofLeaveDeletMethod();
		Alert alert=driver.switchTo().alert(); 
		alert.accept();
	}
}