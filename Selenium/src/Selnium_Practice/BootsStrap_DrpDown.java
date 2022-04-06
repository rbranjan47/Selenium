package Selnium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootsStrap_DrpDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.id("menu1")).click();
		
		//getting the text present in the li tag, using loops
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(int i=0;i<elements.size();i++)
		{
			WebElement drop_element = elements.get(i);
			String drop_element_text = drop_element.getAttribute("innerHTML");
			System.out.println(drop_element_text);
			
			//clicking the elements
			if(drop_element_text.contentEquals("JavaScript"))
			{
				drop_element.click();
			}
		}
		
		//closing the window
		Thread.sleep(5000);
		driver.close();
	}
}
