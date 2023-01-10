package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatNewTypeofWork {
	public WebDriver driver;
	@FindBy(name = "name")
	private WebElement nameTextfield;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement creattypeofworkbutton;

	@FindBy(xpath ="//a[.='paap']/../..//a[contains(text(),'delete')]")

	private WebElement deletWorkType;


	public CreatNewTypeofWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void nameMethod()
	{
		nameTextfield.sendKeys("paap");
		//((JavascriptExecutor)driver).executeScript("arguments[0].click()",creatnewtyeofWork);
	}
	public void creattypeofworksumitMethod() throws InterruptedException
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",creattypeofworkbutton);
		Thread.sleep(6000);
	}
	public void deletWorkTypeMethod()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",deletWorkType);
	}

}


