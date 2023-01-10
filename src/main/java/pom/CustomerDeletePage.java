package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDeletePage {
	public WebDriver driver;
@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/div/div[2]")
private WebElement customereditButton;

@FindBy(xpath = "(//div[@class='action'])[1]")
private WebElement clickonAction;

@FindBy(xpath = "(//div[@class='deleteButton'])[1]")
private WebElement clickdelet;

@FindBy(xpath = "//span[.='Delete permanently']")
private WebElement deletPermanently;

public CustomerDeletePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void customereditButtonMethod() throws InterruptedException
{
((JavascriptExecutor)driver).executeScript("arguments[0].click()",customereditButton);
Thread.sleep(2000);
}

public void clickonActionMethod()
{
((JavascriptExecutor)driver).executeScript("arguments[0].click()",clickonAction);
}

public void clickdeletMethod()
{
((JavascriptExecutor)driver).executeScript("arguments[0].click()",clickdelet);
}

public void deletPermanentlyMethod() throws InterruptedException
{
((JavascriptExecutor)driver).executeScript("arguments[0].click()",deletPermanently);
Thread.sleep(2000);
}


}
