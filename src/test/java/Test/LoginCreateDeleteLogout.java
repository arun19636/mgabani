package Test;

import org.testng.annotations.Test;

import Generics.BaseTest;
import pom.ActitimeHomePage;
import pom.CustomerDeletePage;
import pom.Tasks;

public class LoginCreateDeleteLogout extends BaseTest
{

	@Test(priority = 1)
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
	@Test(priority = 3)
	public void deletecustomer() throws InterruptedException
	{

		CustomerDeletePage delet=new CustomerDeletePage(driver);
		delet.customereditButtonMethod();
		delet.clickonActionMethod();
		delet.clickdeletMethod();
		delet.deletPermanentlyMethod();
	}
}
