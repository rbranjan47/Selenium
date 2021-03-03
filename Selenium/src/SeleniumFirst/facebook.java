package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{

	public static void main(String[] args)
	{
		String s="rbranjan47@gmail.com";
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(s);
		
		driver.manage().window().maximize(); //maximize the size
		driver.manage().deleteAllCookies(); //delete all cookies
	}

}
