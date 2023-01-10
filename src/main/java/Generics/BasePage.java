package Generics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage 
{
	public void selectbyvisibletext(WebElement element , String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void mousehover(WebDriver driver, WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void mousedoubleclick(WebDriver driver, WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
	}
	
	public void javascriptclick(WebDriver driver , WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void validatetitle(WebDriver driver, String exptitle)
	{
		String actualTitle=driver.getTitle();
		String expectedTitle=exptitle;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void validatetext(WebElement element)
	{
		String actualText=element.getText();
		System.out.println("text is" +actualText);
	}
	
	public void explicitwaitvisibilityofelementlocated(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void explicitwaitvisibilityofelementlocatedbylocator(WebDriver driver, By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void javascriptenter(WebDriver driver , WebElement element , String parameter)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(parameter, element);
	}
	
	public void javascriptscroll(WebDriver driver ,String parameter)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(parameter);
	}
}