package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Bangalore Airport, Bangalore");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Shivaji Nagar, Pune");
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		driver.findElement(By.cssSelector(".current.day")).click();
		driver.findElement(By.cssSelector("button[id='search_btn']")).click();
		
		
	}

}
