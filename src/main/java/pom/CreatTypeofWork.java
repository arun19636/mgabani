package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreatTypeofWork {
	public WebDriver driver;
@FindBy(xpath = "//span[.='Create Type of Work']")
private WebElement creatTypeofWorkButton;

@FindBy(xpath = "//a[.='paap']")
private WebElement editTypeOfWork;
 
public CreatTypeofWork(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void CreatTypeofWorkMethod() 
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",creatTypeofWorkButton);
}

public void editTypeOfWorkMethod() throws InterruptedException 
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",editTypeOfWork);
	Thread.sleep(2000);
}
}
