//
package SeleniumSecond;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugggestive_dropDown
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://booking.kayak.com/?sid=fd5683836394c5a0824254485de9c97e&aid=397594");
		
		//clear the previous data
		driver.findElement(By.id("H0-1-origin-airport-display-inner")).clear();
		
		//passing the value
		driver.findElement(By.id("H0-1-origin-airport-display-inner")).sendKeys("RANC");
		Thread.sleep(2000);
		//pressing the enter keyword
		driver.findElement(By.id("H0-1-origin-airport-display-inner")).sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.id("H0-1-destination-airport"));
		
		destination.sendKeys("banglo");
		destination.sendKeys(Keys.ENTER);
		
	}

}
