package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender_check 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.spicejet.com/");
	 
	 Thread.sleep(2000);
	 
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/input")).isEnabled());
	
	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	 driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/input")).click();
	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	 
	
	System.out.println(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/input")).isEnabled());
	
	
	if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	{
		System.out.println("it is enabled");
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);  
		
		//it will fail the test case because it already giving true in both condition 
	    //i.e. Showing it is enabled even clicking on only one way
		
	}
	
}
}
