package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_js 
{
	public static WebElement element;
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
    public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/");
		Thread.sleep(4000);
		
		//calling the Refresh method of Javascript
		refresh(driver);
 }
    
    public static void refresh(WebDriver driver)
    {
    	js=((JavascriptExecutor) driver);
    	js.executeScript("history.go(0)");
    }
}
