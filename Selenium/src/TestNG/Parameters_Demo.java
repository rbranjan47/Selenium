package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parameters_Demo 
{
	WebDriver driver;
	
	@Test
	public void yahoo()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		driver.findElement(By.id("createacc")).click();
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Rabi Ranjan");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Kumar");
		
		driver.findElement(By.id("usernamereg-yid")).sendKeys("rbranjan47");
		driver.findElement(By.id("usernamereg-password")).sendKeys("Raabi8936@#");
		
		Select select_tag=new Select(driver.findElement(By.id("usernamereg-month")));
		select_tag.selectByVisibleText("October");
		
		driver.findElement(By.id("usernamereg-day")).sendKeys("03");
		
		driver.findElement(By.id("usernamereg-year")).sendKeys("1997");
		
		driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("Male");
		
		driver.findElement(By.id("reg-submit-button")).click();
	}
	
	@BeforeTest
	public void test()
	{
		System.out.println("testing the yahoo registration page ");
	}
}
