package StaleElements_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_Elements_Demo 
{
	public static WebDriver driver;
	public static long timeout=10;
	public static long pageload=20;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("rbranjan47@gmail.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Rabi8936@#");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
}
