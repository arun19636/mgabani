package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks {
	//declaration
	public WebDriver driver;
 @FindBy(xpath = "//div[.='Add New']")
 private WebElement addnew;
 
 @FindBy(xpath = "//div[@class='item createNewCustomer']")
 private WebElement newcustomer;
 
 @FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
 private WebElement customername;
 
 @FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
 private WebElement customerdescription;
 
 @FindBy(xpath = "//div[contains(text(),'Copy Projects')]/..//div[@class='dropdownButton']")
 private WebElement selectcustomer;
 
 @FindBy(xpath = "//div[@class='customerImportDivTitle']/..//div[@class='itemRow cpItemRow ']")
 private List<WebElement>dropdownList;
 
 @FindBy(xpath = "//div[.='Create Customer']")
 private WebElement createCustomer;
 
 //@FindBy(xpath = "//div[@id='customerLightBoxCloseButton']")
// private WebElement closeButton;
 
 //initialization
 public Tasks(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 //utilization
 public void addnewMethod()
 {
((JavascriptExecutor)driver).executeScript("arguments[0].click()",addnew);
 }
 public void newcustomerMethod() throws InterruptedException
 {
((JavascriptExecutor)driver).executeScript("arguments[0].click()",newcustomer);
Thread.sleep(6000);
 }
 
 public void customernameMethod() throws InterruptedException
 {
	 customername.sendKeys("arun");
	 Thread.sleep(2000);
 }
 public void customerdescriptionMethod() throws InterruptedException
 {
	 customerdescription.sendKeys("focouse on time");
	 Thread.sleep(1000);
 }
 public void  selectcustomerMethod() throws InterruptedException
 {
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",selectcustomer);
	Thread.sleep(2000);
 }
 public void dropdownListMethod() throws InterruptedException
 {
	 for(int i=0;i<dropdownList.size();i++)
	 {
		 if(dropdownList.get(i).getText().equalsIgnoreCase("Big Bang Company"))
		 {
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",dropdownList.get(i));
		break;
		 }
	 }
	 Thread.sleep(2000);
 }
 
 public void createCustomerMethod() throws InterruptedException
{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",createCustomer);
		Thread.sleep(5000);
}
 
 
 
 
 
 
 
 
 
 //for close new create customerpage.
// public void closeButtonMethod()
// {
//		((JavascriptExecutor)driver).executeScript("arguments[0].click()",closeButton);
// }
 
 }

