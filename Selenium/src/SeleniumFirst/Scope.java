package SeleniumFirst;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.get("https://www.facebook.com/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1.getting ALL LINKS present on this page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.to Get link of particular portion in web-page
		//for this we have limit the scope of that web-page by creating a new web-driver
		
		WebElement footer_driver=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footer_driver.findElements(By.tagName("a")).size());
		
		//3.link of one portion
		WebElement portion_driver=driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		
		System.out.println(portion_driver.findElements(By.tagName("a")).size());
		
		
		//4.check each link
		for (int i=1;i<portion_driver.findElements(By.tagName("a")).size();i++)
		{
			String clickoneachlink=Keys.chord(Keys.SHIFT,Keys.ENTER);
			
			//5.clicking to each link by passing ctrl+enter key
			portion_driver.findElements(By.tagName("a")).get(i).sendKeys(clickoneachlink);
			
		}
	
		
			//6.getting text of each title
			Set<String> id=driver.getWindowHandles();
			
			Iterator<String> itr=id.iterator();
			
			//using method of iterator
			while(itr.hasNext())
			{
				driver.switchTo().window(itr.next());
				System.out.println(driver.getTitle());
			}
	}

} //mostly in HTML the LINK code start with "a"--->ANCHOR
