package Selnium_Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_child_windows
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.get("https://the-internet.herokuapp.com/windows");
	    
	    driver.findElement(By.cssSelector("//a[text()='Multiple Windows']")).click();
	    
	    driver.findElement(By.cssSelector("//a[text()='Click Here']")).click();
	    
	    Set<String> windows=driver.getWindowHandles();
	    
	    Iterator<String> itr=windows.iterator();
	    
	    String parent_window=itr.next();
	    String child_window=itr.next();
	    
	    //switching to child window
	    driver.switchTo().window(child_window);
	    System.out.println(driver.getTitle());
	    
	    //switching back to parent window
	    driver.switchTo().window(parent_window);
	    System.out.println(driver.getTitle());

	}

}
