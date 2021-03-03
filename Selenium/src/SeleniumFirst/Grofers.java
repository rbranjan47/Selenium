package SeleniumFirst;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grofers {

	public static void main(String[] args) 
	{
		String[] items= {"Onion","Potato","Brown Coconut"};
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://grofers.com/");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/a/div[1]/div/div/span")).click();
		
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='plp-product__name--box']"));
		
		for (int i=0;i<products.size();i++)
		{
			int j=0;
			String[] split=products.get(i).getText().split(" ");
			String arrang_name=split[0].trim();
			
			List<String> alitem=Arrays.asList(items);
			
			if (alitem.contains(arrang_name))
			{
				j++;
				driver.findElement(By.xpath("//button[@data-test-id='add-button']/span")).click();
				
				if (j==items.length)
				{
					break;
				}
			}
			
		}
		

	}

}
