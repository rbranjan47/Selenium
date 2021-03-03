package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://new-content-admin.embibe.com/");
		
		driver.findElement(By.cssSelector("button.button-signin:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".fadeIn > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("rabi.ranjan@embibe.com");
		driver.findElement(By.cssSelector(".fadeIn > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Rabi9090@#");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/form/div/button[1]/span[1]")).click();
		driver.findElement(By.cssSelector("#side-menu > li:nth-child(3) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.metric:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("123456");
	
		Select s1=new Select(driver.findElement(By.cssSelector(".MuiSelect-root-28")));
		s1.selectByVisibleText("Multiple Choice");
		
		Select s2=new Select (driver.findElement(By.cssSelector("div.metric:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")));
		s2.selectByVisibleText("Rabi Ranjan  Kumar");
	}

}
