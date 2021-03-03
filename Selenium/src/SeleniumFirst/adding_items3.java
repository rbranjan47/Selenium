package SeleniumFirst;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adding_items3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String[] items= {"Cucumber","Beetroot","Apple","Orange"};
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(5000);
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for (int i=0;i<products.size();i++)
		{
			int j=0;
			
			String[] split_name=products.get(i).getText().split("-");
			String arrag_name=split_name[0].trim();
			
			//String name=products.get(i).getText();
			
			List<String> itemAl= Arrays.asList(items);
			
			if (itemAl.contains(arrag_name))
			{
				driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				
			Thread.sleep(4000);
			j++;
		if (j==items.length)
			{
				break;
			}
		}

	}
	}
}
