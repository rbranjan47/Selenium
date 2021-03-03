package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HighLights 
{
	
    public static 	JavascriptExecutor js;
    
	public static void main(String[] args ) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://freecrm.co.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rbranjan47@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");

		WebElement lgnbtn=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		//Now, We can pass the Webelement into flash method as it is static
		flash(lgnbtn, driver);
		
	}
	
	public static void flash(WebElement element, WebDriver driver)
	{
		//to use the JAVASCRIPTEXECUTOR, we have to cast driver into JAVASCRIPTEXECUTOR 
		 js=((JavascriptExecutor) driver);
		
		String bgcolor=element.getCssValue("backgroundColor");
		
		//highlightining 20 times
		for (int i=0; i<20;i++)
		{
			//changing colour by RGB
			changeColour("rgb(239, 7, 247)", element, driver); //Voilet
			changeColour("rgb(191, 7, 247)", element, driver); //Indigo
			changeColour("rgb(15, 7, 247)", element, driver); //Blue
			changeColour("rgb(7, 247, 39)", element, driver); //Green
			changeColour("rgb(247, 247, 7)", element, driver); //yellow
			changeColour("rgb(247, 127, 7)", element, driver); //Orange
			changeColour("rgb(247, 47, 7)", element, driver); //red
			changeColour(bgcolor, element, driver);  //default
		}
		
	}
	
	//method for change colour
	public static void changeColour(String color, WebElement element, WebDriver driver)
	{
		 js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+ color +"'", element );
		
		try
		{
			Thread.sleep(200);
		}
		catch(Exception e)
		{
		}
		}
}
