package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginpage 
{
	@FindBy(id="username")
	private WebElement usernameTextField;
	 
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;

	@FindBy(xpath="//input[@name='remember']")
	private WebElement keepmeloggedincheckbox;

	@FindBy(id ="loginButton")
	private WebElement loginButton;

	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement forgotYourPasswordLink;

	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;

 public ActiTimeLoginpage(WebDriver driver) 
	{
	 PageFactory.initElements(driver,this);
	}

	public  void loginMethod() throws InterruptedException 
	{
		usernameTextField.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepmeloggedincheckbox.click();
		loginButton.click();
		Thread.sleep(5000);
	}

	public void forgotyourpasswordMethod() 
	{
		forgotYourPasswordLink.click();
		}
	 

	 public void actitimeincMethod() 
	 { 
		 actitimeincLink.click(); 
	 }
}
