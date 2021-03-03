package StaleElements_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stale_element_back 
{
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static long timeout = 10;
	public static long pageload = 20;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload, TimeUnit.SECONDS);
		driver.get("https://www.pavantestingtools.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
		WebElement online=driver.findElement(By.xpath("//a[normalize-space()='Online']"));
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(online));
		online.click();
		
		Thread.sleep(4000);
		
		refresh(driver);
		driver.navigate().back();
		//handling that elements, by TRY & CATCH
		try
		{
			online.click();
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
			WebElement online2=driver.findElement(By.xpath("//a[normalize-space()='Online']"));
			online2.click();
		}
		driver.quit();
	}
	
	public static void refresh(WebDriver driver)
	{
		js=((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
}
