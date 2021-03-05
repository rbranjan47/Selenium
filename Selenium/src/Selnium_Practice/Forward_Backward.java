package Selnium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forward_Backward 
{
	public static WebDriver driver;
	public long timeout=20;
	public long pageout=20;
	
	@Test
	public void forward_backward() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver_89\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageout, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.get("https://facebook.com");
		//back
		driver.navigate().back();
		Thread.sleep(2000);
		//forward
		driver.navigate().forward();
		
		//refreshing the Page
		driver.navigate().refresh();
}
}
