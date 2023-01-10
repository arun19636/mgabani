package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{
	public WebDriver driver;

	 @FindBy(xpath = "(//div[.='Switch to actiPLANS'])[1]")
	 private WebElement switchtoactiPlans;
	 
	 @FindBy(xpath = "Time-Track")
	 private WebElement timeTrack;
	 
	 @FindBy(xpath = "//div[.='Tasks']")
	 private WebElement tasks;
	 
	 @FindBy(xpath = "//div[.='Reports']")
	 private WebElement reports;
	 
	 @FindBy(xpath = "//div[.='Users']")
	 private WebElement users;
	 
	 @FindBy(xpath = "(//div[@class=\"menu_icon\"])[1]")
	 private WebElement calander;
	 
	 @FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/div/div[1]/div/div")
	 private WebElement setttings;
	 
	 @FindBy(xpath = "(//div[@class=\"menu_icon\"])[3]")
	 private WebElement intigrations;
	 
	 @FindBy(xpath = "(//div[@class=\"menu_icon\"])[4]")
	 private WebElement creatAccountforyourcolleague;
	 
	 @FindBy(xpath = "//a[.='Logout']")
	 private WebElement logoutlink;
	 
	 

public ActitimeHomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	public void setttingsMethod() throws InterruptedException
	{
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",setttings);
	Thread.sleep(3000);
	}
	public void logoutLinkMethod()
	{
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",logoutlink);
	
	}
	public void tasksMethod()
	{
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",tasks);
	
	}
	
}