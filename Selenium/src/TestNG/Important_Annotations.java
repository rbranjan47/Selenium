package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Important_Annotations 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//opening URL
		driver.get("https://google.com/");
	}
	
	@Test(priority=1,groups = "Title")
	public void google_Test()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2, groups = "logo")
	public void logoTest()
	{
		Boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=3, groups = "Link")
	public void mail_Test()
	{
		String gmail_text=driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
		System.out.println(gmail_text);
	}
	
	@Test(priority=4, groups = "Test")
	public void test_demo1()
	{
		System.out.println("this is test demo 1");
	}
	
	@Test(priority=5,groups = "Test")
	public void test_demo2()
	{
		System.out.println("this is test demo 2");
	}
	
	@Test(priority=6,groups = "Test")
	public void test_demo3()
	{
		System.out.println("this is test demo 3");
	}
	
	@Test(priority=7,groups = "Test")
	public void test_demo4()
	{
		System.out.println("this is test demo 4");
	}
	
	//Priority helps TestNG to run Test based on priority, it helps to run test cases sequentially
	//since, priority is keyword so it start with small letter 'p'
	
	
	//groups is the property in which we allow our same groups test cases to execute at particular time
	//groups is the keyword, so it start with small letter 'g'
		@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(70000);
		driver.close();
	}
}
