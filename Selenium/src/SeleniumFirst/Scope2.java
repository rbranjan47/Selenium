package SeleniumFirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.get("https://www.google.com/");
		
		//all links in google web-page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//links in footer
		WebElement footer_driver=driver.findElement(By.cssSelector("div[class='EvHmz f6F9Be hRvfYe']"));
		System.out.println(footer_driver.findElements(By.tagName("a")).size());
		
		/*  //links in footer up part
		WebElement footup_driver=driver.findElement(By.cssSelector("div[class='b0KoTc']"));
		System.out.println(footup_driver.findElements(By.tagName("a")).size()); */
		
		//checking all links
		for (int i=0;i<footer_driver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer_driver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		}
		
		
		
		
	}
}
