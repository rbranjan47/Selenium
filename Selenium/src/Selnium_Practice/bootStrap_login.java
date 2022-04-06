package Selnium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootStrap_login {
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://imastartesting.com/a/merabi");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		//scroll
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 Thread.sleep(3000);
		WebElement subscribe_button = driver.findElement(By.xpath("//div[@class='userprofile-subsbtn']/a[2]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(subscribe_button));
		subscribe_button.click();
		
		//switching to frame
		//driver.switchTo().frame("ssIFrame_google");
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//a[contains(text(),'Click here to login')]")).click();
		//driver.findElement(By.linkText("Click here to login")).click();
		
		driver.findElement(By.id("email")).sendKeys("kumar.rabi+1948@thinksys.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='close']")).click();
		driver.findElement(By.xpath("//div[@class='asideMenuWrap']/ul/li[1]")).click();
		Thread.sleep(5000);
		
		WebElement search_away = driver.findElement(By.xpath("//input[@placeholder='Search Away....']"));
		search_away.click();
		search_away.sendKeys("pankaj");
		
		List<WebElement> search_list = driver.findElements(By.xpath("//div[@class='search-dropdown-sec1 search-user-list']/ul/li/a/div/div[2]/h5"));
		for(WebElement search_lists : search_list)
		{
			String username = search_lists.getAttribute("innerHTML");
			System.out.println(username);
			
			
			String required_username = "Pankaj _Kumar";
			if(username.contentEquals(required_username))
			{
				search_lists.click();
			}
		}
		
		js.executeScript("window.scrollBy(0,1000)");
		WebElement chat_button = driver.findElement(By.xpath("//a[contains(text(),'Chat now')]"));
		Thread.sleep(3000);
		chat_button.click();
		
		Thread.sleep(20000);
		WebElement type_message = driver.findElement(By.xpath("//textarea[@placeholder='Type a message']"));
		for (int i=0; i<50; i++)
		{
			type_message.sendKeys("Hello Sir!");
			type_message.sendKeys(Keys.ENTER);
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}
