package SeleniumFirst;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParenChild_window 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("a.gb_g")).click();
		
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		
		//handling CHILD tab
	Set<String> id=driver.getWindowHandles();

	//reading the child tab
	Iterator <String> itr=id.iterator();
	String parentid=itr.next();
	String childid=itr.next();
	
	//switch to child tab
	
	driver.switchTo().window(childid);
	System.out.println(driver.getTitle());
	
	//switching back parent
	driver.switchTo().window(parentid);
		

	}

}
