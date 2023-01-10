package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactActiTimeSupport {
	public WebDriver driver;
	@FindBy(xpath = "//div[.='Contact actiTIME Support']/..//textarea[@placeholder='Type your message here...']")
	private WebElement actiTimeSupport;

	@FindBy(xpath = "//div[.='Contact actiTIME Support']/..//div[.='Send Message']")
	private WebElement sendmsg;

	public ContactActiTimeSupport(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void actiTimeSupportMethod() 
	{
		actiTimeSupport.sendKeys("hi");
	}

	public void sendmsgMethod()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",sendmsg);
	}
}
