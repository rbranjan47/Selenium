package Selnium_Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_window {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		//declaring parent and child window
		String parent_window = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		//iterating
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext())
		{
			String child_window = itr.next();
			
			if(!parent_window.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				WebElement search_box = driver.findElement(By.xpath("//input[@type='text']"));
				search_box.sendKeys("india");
				search_box.sendKeys(Keys.ENTER);
			}
		}
		driver.switchTo().window(parent_window);
		
		driver.quit();
	}
}
