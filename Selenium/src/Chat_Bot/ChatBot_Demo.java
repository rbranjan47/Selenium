package Chat_Bot;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ChatBot_Demo 
{
	public static WebDriver driver;
	public static long timeout = 10;
	public static long pageload = 20;

	public static void main(String[] args) throws InterruptedException
	{
		//diabling the notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		// driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload, TimeUnit.SECONDS);
		driver.get("https://mobilemonkey.com/");
		
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'close-button')]"))).build().perform();
		
		driver.findElement(By.xpath("//div[contains(@class,'close-button')]")).click();
	}
}
