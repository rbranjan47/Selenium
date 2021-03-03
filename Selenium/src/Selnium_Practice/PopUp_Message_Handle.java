package Selnium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Message_Handle 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//getting blank spaces
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys("Rabi Ranjan");
		
		//clicking on alert tab
		driver.findElement(By.cssSelector("input[value='Alert']")).click();
		
		//switching to pop-up window and getting text
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys("Rabi Ranjan");
		driver.findElement(By.cssSelector("input[value='Confirm']")).click();
		
		String s1=driver.switchTo().alert().getText();
		System.out.println(s1);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();

	}

}
