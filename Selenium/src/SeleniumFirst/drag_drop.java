package SeleniumFirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame lazyloaded']")));
		
		Actions a=new Actions(driver);
		WebElement src1=driver.findElement(By.cssSelector("img[alt='The peaks of High Tatras']"));
		WebElement src2=driver.findElement(By.cssSelector("img[alt='The chalet at the Green mountain lake']"));
		WebElement src3=driver.findElement(By.cssSelector("img[alt='Planning the ascent']"));
		WebElement src4=driver.findElement(By.cssSelector("img[alt='On top of Kozi kopka']"));
		
		WebElement tar=driver.findElement(By.cssSelector("div[class='ui-widget-content ui-state-default ui-droppable']"));
		
		a.dragAndDrop(src1, tar).build().perform();
		Thread.sleep(4000);
		a.dragAndDrop(src2, tar).build().perform();
		Thread.sleep(4000);
		a.dragAndDrop(src3, tar).build().perform();
		Thread.sleep(4000);
		a.dragAndDrop(src4, tar).build().perform();
		

	}

}
