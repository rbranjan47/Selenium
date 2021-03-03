package SeleniumSecond;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Hover 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY	, "true");
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions act=new Actions(driver);
		WebElement flipkart=driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='_1kfTjk']/div[@class='_1rH5Jn']/div[@class='_2Xfa2_']/div[4]/div[1]/div[1]"));
		act.moveToElement(flipkart).build().perform();
		
		List<WebElement> links=driver.findElements(By.xpath("//body/div[@id='container']/div/div[@class='_1kfTjk']/div[@class='_1rH5Jn']/div[@class='_2Xfa2_']/div[4]/div[1]/div[1]"));
		int count=links.size();
		System.out.println(count);
		
		for (int i=0; i<count; i++)
		{
			WebElement element=links.get(i);
			String html_code=element.getAttribute("innerHTML");
			
			System.out.println("html code is "+html_code);
		}
		
		driver.close();
		
	}

}
