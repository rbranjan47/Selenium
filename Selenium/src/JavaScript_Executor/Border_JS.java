package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Border_JS 
{
	
	public static JavascriptExecutor js;
	public static WebDriver driver;
	public static WebElement element;
	
	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe ");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://freecrm.co.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rbranjan47@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");

		WebElement lgnbtn=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		//Passing border drawing method
		border_draw(lgnbtn, driver);
	}
	
	//Drawing border around the element
	public static void border_draw(WebElement element, WebDriver driver)
	{
		js=((JavascriptExecutor) driver);
		//getting border of length 10px
		js.executeScript("arguments[0].style.border=' 10px solid red' ", element);
	}
}
