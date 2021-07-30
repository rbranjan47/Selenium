package Selnium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title_demo 
{
	public static void main(String[] args)
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		// driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.orangecrm.com/");
		
		
		boolean status = driver.getPageSource().contains("CRM Web Based Enterprise Solution | OrangeCRM");
		System.out.println(status);
	
	}
}
