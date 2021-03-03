package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateAlert_Js
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
		
		WebElement logn_btn=driver.findElement(By.xpath("//body/div[@class='wrapper']/header/div[@class='container']"
				+ "/ul[@class='control-bar']/li/a[@class='btn border']/span[1]"));
		clickable_js(logn_btn, driver);
		
		//passing the method to generate alert actions
		generat_alert(driver, "Enter EmailID and Password for Successful Login!");
 }
    public static void clickable_js(WebElement element, WebDriver driver)
    {
    js=((JavascriptExecutor) driver);
    js.executeScript("arguments[0].click()", element);
    }
    
    public static void generat_alert(WebDriver driver, String message)
    {
    	js=((JavascriptExecutor) driver);
    	js.executeScript("alert (' "+ message + "')");
    }   
}
