package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) 
	{
		 // tested on chrome driver 
		
		//create driver object for chrome browser
		//we will strictly implement methods of webdriver
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");  //hit/go to url what you entered
		
		//System.out.println(driver.getTitle()); //validate if your page is correct 
		
		//System.out.println(driver.getCurrentUrl()); //validate if you landed on correct url
		
		//System.out.println(driver.getPageSource()); //validate if you landed on correct page/url
		
		//driver.get("https://www.yahoo.com");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.close(); //closes current browser
		
		//driver.quit();
		
		driver.findElement(By.id("email")).sendKeys("rbranjan47@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Rabi89360@#");
		driver.findElement(By.linkText("Forgotten account?")).click();
		
	}

}
