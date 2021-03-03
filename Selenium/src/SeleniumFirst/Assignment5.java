package SeleniumFirst;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		//System.out.println(driver.findElements(By.tagName("frameset")).size());
		
		//first enter into parent frame
		driver.switchTo().parentFrame();
		
		//we have to move sequentially, so first frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-top']")));
		
		//then in middle frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		//also we can move right frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-right']")));
		
		//text of middle frame
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}