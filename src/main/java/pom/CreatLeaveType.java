package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatLeaveType {
	public WebDriver driver;
	
@FindBy(xpath = "//span[.='Create Leave Type']")
private WebElement creatleavetype;

@FindBy(xpath = "class=\"contactSupportButtonPlaceholder\"")
private WebElement GotaQuestion;

//initialization
public CreatLeaveType(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//Utilization
public void creatleavetypeMethod()
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",creatleavetype);
}

public void GotaQuestionMethod()
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",GotaQuestion);
}
}
