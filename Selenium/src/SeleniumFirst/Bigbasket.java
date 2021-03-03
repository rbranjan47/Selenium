package SeleniumFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		Thread.sleep(3000);
		
	
		driver.findElement(By.cssSelector("img[css='1']")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> products=driver.findElements(By.cssSelector("a[class='ng-binding']"));
		
		for (int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i).getText());
		}

	}

}
