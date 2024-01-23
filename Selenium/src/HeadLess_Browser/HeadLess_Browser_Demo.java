package HeadLess_Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLess_Browser_Demo
{
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static long timeout = 10;
	public static long pageload = 20;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		//chromeoptions
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
		driver = new ChromeDriver(chromeOptions);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");

		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement login = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
		driver.getTitle();
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		driver.getTitle();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("rbranjan47@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rabi8936@#");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='settings icon']/../../div/i")).click();
		WebElement logout=driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();
		driver.quit();
	}
}
