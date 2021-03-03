package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Border2_JS 
{
	public static WebDriver driver;
	public static WebElement element;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/");
		Thread.sleep(4000);
		//register
		WebElement rgtn = driver.findElement(By.xpath("//body/div[@class='wrapper']/header/div[@class='container']/ul[@class='control-bar']/"
				+ "li/a[@class='btn green']/span[1]"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(rgtn));
		rgtn.click();
		
		//facebook
		WebElement fb=driver.findElement(By.xpath("//a[@class='facebook-btn']"));
		//mail address
		WebElement mailID=driver.findElement(By.xpath("//input[@id='signInEmail']"));
		//password
		WebElement pass=driver.findElement(By.xpath("//input[@id='signInPassword']"));
		
		//passing the element in the border_js method
		border_js(fb, driver);
		border_js(mailID, driver);
		border_js(pass, driver);	
	}
	
	public static void border_js(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '5px solid red ' ", element);
	}

}
