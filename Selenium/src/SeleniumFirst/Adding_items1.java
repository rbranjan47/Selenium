package SeleniumFirst;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adding_items1 
{


	public static void main(String[] args) throws InterruptedException
	{
		String[] items= {"Carrot","Mushroom","Potato","Cauliflower","Onion"};
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		method1(driver,items);
		//here 'method' is utility method which accept any input from method
		
		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();

		//explicit wait
		WebDriverWait w=new WebDriverWait(driver,7);
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
		
	}
	
		public static void method1(WebDriver driver, String[] items)
		{
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for (int i=0;i<products.size();i++)
		{
			int j=0;
			
			String[] split_name=products.get(i).getText().split("-");
			String arranged_name=split_name[0].trim();
			
			
			List<String> itemAl= Arrays.asList(items);
			
			
			//String name=products.get(i).getText();    { it give only one name, whatever written}
			
			if (itemAl.contains(arranged_name))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				j++;
				if (j==items.length)
				{
					break;
				}
			}
		}
		}
}

