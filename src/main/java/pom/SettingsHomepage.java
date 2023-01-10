package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsHomepage {
	public WebDriver driver;
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typeofWorkLink;
	
	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement leaveTypes;
	
	public SettingsHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	public void typesofWorkMethod()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",typeofWorkLink);
	}
	public void leaveTypesMethod()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",leaveTypes);
	}
	}
