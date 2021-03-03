package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_check 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//FOR 1ST CHECK BOX
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		//it will return false
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		//test will pass here as it returning  false(not checked)
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		//test will pass here as it is returning true(checked)
		
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		//it will return true
		
		
		//FOR 2ND CHECK BOX
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		
		
		
		//FOR 3RD CHECK BOX
		
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		
		Thread.sleep(5000);
		//SIZE
		System.out.println(driver.findElements(By.cssSelector("div[id='checkbox-example']")).size());
		

	}

}
