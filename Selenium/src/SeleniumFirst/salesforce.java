package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		//driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("rabi ranjan");
		
		//we can not use compound class name
		//compound means space between class name
		
		driver.findElement(By.id("username")).sendKeys("rabi ranjan"); 
		driver.findElement(By.id("password")).sendKeys("1234567890"); 
		
		driver.findElement(By.id("Login")).click();
	}

}
