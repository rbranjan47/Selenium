package TestNG_Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parameters 
{
	//passing parameters from in testNG.xml file
	WebDriver driver;
	@Test
	@org.testng.annotations.Parameters({"url", "first_name", "last_name", "email", "password", "month"})
	public void parameters(String url, String name, String email, String password, String first_name, String last_name, String month)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		driver.findElement(By.id("createacc")).click();
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(first_name);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(last_name);
		
		driver.findElement(By.id("usernamereg-yid")).sendKeys(email);
		driver.findElement(By.id("usernamereg-password")).sendKeys(password);
		
		Select select_tag=new Select(driver.findElement(By.id("usernamereg-month")));
		select_tag.selectByVisibleText(month);
		
		driver.findElement(By.id("usernamereg-day")).sendKeys("03");
		
		driver.findElement(By.id("usernamereg-year")).sendKeys("1997");
		
		driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("Male");
		
		driver.findElement(By.id("reg-submit-button")).click();
	}
	
	@BeforeTest
	public void test_before()
	{
		System.out.println("before test the yahoo");
	}
	
	@AfterTest
	public void test_after()
	{
		System.out.println("test ran successful ");
	}
}
