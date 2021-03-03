package SeleniumFirst;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adding_Items 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		String[] item= {"Brocolli","Cauliflower","Beetroot","Pumpkin"};
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0;i<products.size();i++)
		{
		
			/*  [ IF YOU SELECT ONLY ONE ITEM] 
			 
			 getting name of each product
			 String name=products.get(i).getText();
			 
			 //finding specific product name
			 if (name.contains("Beetroot - 1 Kg"))
			 {
				//add to the cart
				 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				 break;   */
			
			// [IF YOU SELECT MULTIPLE ITEMS]
			// SWITCH IT FOR ARRAY_LIST(collection)
			
			String[] pro_name=products.get(i).getText().split("-");
			String arranged_name=pro_name[0].trim();
			
			 List<String> alitem = Arrays.asList(item);
			 int j=0;
			 
			 if (alitem.contains(arranged_name))
				
			 {
				 j++;
				 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				 
				 if (j==3);
				 break;
			 }
			
		}

	}

}
