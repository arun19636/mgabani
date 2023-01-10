package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatNewLeaveType {
	public WebDriver driver;
	
	@FindBy(id = "leaveTypeLightBox_nameField")
	private WebElement leavetypeName;

	@FindBy(id = "processLeaveTimeCheckbox_createPopup")
	private WebElement leavetimecheckbox;

	@FindBy(xpath = "//*[@id=\"leaveTypeLightBox_commitBtn\"]/div/span")
	private WebElement creattypeofLeavesubmit;

	@FindBy(xpath = "//span[.='jaja']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement typeofLeaveDelet;
	
	//initialization
	public CreatNewLeaveType(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public void creatleaveNameMethod()
	{
		leavetypeName.sendKeys("jaja");
	}
	
	public void leavetimecheckboxMethod()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",leavetimecheckbox);
	}
	
	public void creattypeofLeavesubmitMethod() throws InterruptedException
	{
  ((JavascriptExecutor)driver).executeScript("arguments[0].click()",creattypeofLeavesubmit);
  Thread.sleep(6000);
	}
	
	public void typeofLeaveDeletMethod() throws InterruptedException
	{
  ((JavascriptExecutor)driver).executeScript("arguments[0].click()",typeofLeaveDelet);
  Thread.sleep(3000);
	}
	
}
