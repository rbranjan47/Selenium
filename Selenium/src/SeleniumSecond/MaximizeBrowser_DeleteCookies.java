package SeleniumSecond;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser_DeleteCookies 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//for maximize window
		driver.manage().window().maximize();
		
		//to delete all the cookies
		driver.manage().deleteAllCookies();
		
		//delete particular cookies
		driver.manage().deleteCookieNamed("facebook");

				
		driver.get("https://google.com/");
		
		//closing particular browser
		driver.close();
		
		//closing all browser associated with Selenium
		driver.quit();
		
	}

}
