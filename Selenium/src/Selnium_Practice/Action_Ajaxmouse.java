package Selnium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Ajaxmouse
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		  driver.get("https://www.amazon.in/");
		  
		  //creating a class
		  Actions a=new Actions(driver);
		  
		  //performing actions on driver
		 a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
		 .click().keyDown(Keys.SHIFT).sendKeys("Boult speaker").doubleClick().build().perform();
		
		 
		 //moving mouse cursor to any elements
		 a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).click().build().perform();
		 
		 //moving and right clicking on options come after clicking that element
		 a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().click().build().perform();
		 
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 
	}

}
