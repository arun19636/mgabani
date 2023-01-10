package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditTypeOfWork {
	
public WebDriver driver;

@FindBy(xpath = "//input[@id='name']")
private WebElement editName;

@FindBy(xpath = "//input[contains(@value,' Save Changes')]")
private WebElement savechanges;

//initialization
public EditTypeOfWork(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//utilization
public void editNameMethod()
{
	editName.sendKeys("arun");
}
public void savechangesMethod() throws InterruptedException
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",savechanges);
	Thread.sleep(5000);
}


}
