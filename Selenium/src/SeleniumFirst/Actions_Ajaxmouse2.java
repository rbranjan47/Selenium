package SeleniumFirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Ajaxmouse2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://jac.jharkhand.gov.in/jac/");
		
		//to do anything we have to create an Actions class
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Affiliation']"))).build().perform();
		
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Examination']"))).build().perform();
		
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.id("menu-item-2414"))).build().perform();
		a.moveToElement(driver.findElement(By.id("menu-item-2414"))).click().build().perform();
	}

}
