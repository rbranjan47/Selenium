package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Scroll_JS 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY , "true");
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver\\\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		//before we are going for JavaScript Executor, create an Object for the javaScript executor
		//we are converting this into Javascript variable
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollTo(0,1500)");
		jse.executeScript("window.scrollTo.(0, document.body.scrollHeight)");
	}
}
