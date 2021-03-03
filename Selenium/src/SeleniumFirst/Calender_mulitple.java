package SeleniumFirst;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_mulitple
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/default.aspx");
		
		Thread.sleep(4000);
		
		//clicking on month
		while(!driver.findElement(By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-first'] div[class='ui-datepicker-title'] span[class='ui-datepicker-month']"))
		.getText().equalsIgnoreCase("October"))
		{
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		//clicking date  in calendar 
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		@SuppressWarnings("unused")
		List<WebElement> dates=driver.findElements(By.className("ui-state-default ui-state-hover"));
		
		int count=driver.findElements(By.className("ui-state-default ui-state-hover")).size();
		for (int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("ui-state-default ui-state-hover")).get(i).getText();
			if (text.equalsIgnoreCase("31"))
			{
				driver.findElements(By.className("ui-state-default ui-state-hover")).get(i).click();
				break;
			}
			
		}

	}

}
