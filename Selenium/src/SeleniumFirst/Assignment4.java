package SeleniumFirst;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implivit wait for not getting fail
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//entering into url
		driver.get("http://the-internet.herokuapp.com/");
		
		//maximizing t full screen
		driver.manage().window().maximize();
		
		//clicking on multiple windows
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		System.out.println("before handling the child window");
		System.out.println(driver.getTitle());
		//getting text written in parent window
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		//clicking on 'click here' option
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//handling(getting) tab using iterator interface
		Set<String> id=driver.getWindowHandles();
		
		//creating a reference of iterator
		Iterator<String> itr=id.iterator();
		
		//creating parent reference to get parent id from set 
		String parentid=itr.next();
		//creating child reference to get child id from set
		String childid=itr.next();
		
		driver.switchTo().window(childid);
		System.out.println("after handling the child window");
		System.out.println(driver.getTitle());
		//getting text of child window
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		
		driver.switchTo().window(parentid);
		System.out.println("coming back to parent window");
		System.out.println(driver.getTitle());
		
		

	}

}
