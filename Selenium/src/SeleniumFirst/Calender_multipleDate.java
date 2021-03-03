package SeleniumFirst;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_multipleDate 
{

	public static void main(String[] args)  throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//waiting for not getting fail 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(5000);
		driver.findElement(By.id("travel_date")).click();
		
		
		//month
		
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']"))
				.getText().contains("October"))
		{
			driver.findElement(By.className("next")).click();
		}
		//First selecting DATE
		//clicking a date 31st OCTOBER 2020 in calendar option
		@SuppressWarnings("unused")
		List<WebElement> dates =driver.findElements(By.className("datepicker-days"));
		
		int count=driver.findElements(By.className("day")).size();
		for (int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("31"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		driver.findElement(By.className(""));
		
		
		
		

	}

}
