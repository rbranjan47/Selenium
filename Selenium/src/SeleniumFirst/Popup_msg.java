package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_msg 
{
	public static void main(String[] args) throws InterruptedException
	{
		String text="Rabi Ranjan";
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(text);
		driver.findElement(By.cssSelector("input[value='Alert']")).click();
		
		//to handle ALERT we have to handle it by switch
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		// to accept
		//driver.switchTo().alert().accept();
		//to dimiss
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
	}

}
