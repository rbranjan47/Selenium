package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_xpath 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("rbranjan47@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("Ragwwdwwdwde");
		driver.findElement(By.cssSelector("#u_0_b")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div")).getText());
		
		driver.close();
	}

}
