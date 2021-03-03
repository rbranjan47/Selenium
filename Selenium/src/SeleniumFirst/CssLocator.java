package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("abscgdhdj");

		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 password']")).sendKeys("12345678");
		
		driver.findElement(By.cssSelector("input[class='button r4 wide primary']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}

}
