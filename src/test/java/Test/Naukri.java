package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Generics.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri extends BasePage
{
	public WebDriver driver;
	@Test
	public void setup() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID')]")).sendKeys("arunjena.test@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("arun@123");
		WebElement login=driver.findElement(By.xpath("//button[.='Login']"));
		javascriptclick(driver, login);
		
//		WebElement chatbot=driver.findElement(By.xpath("//div[contains(@class,'crossIcon chatBot chatBot-ic-cross')]"));
//		Thread.sleep(2000);
//		javascriptclick(driver, chatbot);

		Thread.sleep(9000);
		WebElement profileClick=driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']/.."));
		javascriptclick(driver, profileClick);
		Thread.sleep(4000); 
		WebElement viewprofile=driver.findElement(By.xpath("//a[.='View & Update Profile']"));
		javascriptclick(driver, viewprofile);
		Thread.sleep(4000);

//		driver.findElement(By.xpath("//a[.='DELETE RESUME']"));
//		javascriptclick(driver, driver.findElement(By.xpath("//a[.='DELETE RESUME']")));
//		Thread.sleep(4000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='file'])[1]")));
		
		WebElement updateResume=driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		mousedoubleclick(driver, updateResume);
		//updateResume.click();
		
		StringSelection ss=new StringSelection("C:\\\\Users\\\\arunk\\\\OneDrive\\\\Desktop");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(6000);
		
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_TAB);
		//r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		//javascriptenter(driver, updateResume, "C:\\Users\\arunk\\OneDrive\\Desktop");




		//driver.findElement(By.xpath("//a[.='DELETE RESUME']")).click();
	}
}
