package Selnium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Demo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait for not failed
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//getting into link
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//printing size/number of frames present in that window
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//entering into frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame lazyloaded']")));
		//performing actions on it
		Actions a=new Actions(driver);
		
		WebElement pic1=driver.findElement(By.cssSelector("img[alt='The peaks of High Tatras']"));
		WebElement pic2=driver.findElement(By.cssSelector("img[alt='The chalet at the Green mountain lake']"));
		WebElement pic3=driver.findElement(By.cssSelector("img[alt='Planning the ascent']"));
		WebElement pic4=driver.findElement(By.cssSelector("img[alt='On top of Kozi kopka']"));
		
		WebElement target=driver.findElement(By.cssSelector("div[class='ui-widget-content ui-state-default ui-droppable']"));
		
		a.dragAndDrop(pic1, target).build().perform();
		Thread.sleep(3000);
		
		a.dragAndDrop(pic2, target).build().perform();
		Thread.sleep(3000);
		
		a.dragAndDrop(pic3, target).build().perform();
		Thread.sleep(3000);
		
		a.dragAndDrop(pic4, target).build().perform();
		

	}

}
