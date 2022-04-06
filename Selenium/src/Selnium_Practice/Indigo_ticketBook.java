package Selnium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Indigo_ticketBook {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.goindigo.in/");
		Thread.sleep(5000);
		WebElement cookies_accept = driver
				.findElement(By.xpath("//button[contains(text(),'Accept cookies')]"));
		try 
		{
			cookies_accept.click();
		} catch (Exception e) {
			System.out.println("not found");

		}

		driver.findElement(By.xpath("//i[@class='icon-close close-pass-tooltip']")).click();
		WebElement from_city = driver.findElement(By.cssSelector("input[class='form-control or-src-city']"));

		Actions action = new Actions(driver);
		action.moveToElement(from_city).click().build().perform();
		from_city.clear();
		from_city.sendKeys("ranchi");
		from_city.sendKeys(Keys.ENTER);
		
		
	}
}
