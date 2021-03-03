package JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Js 
{
	public static JavascriptExecutor js;
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
		
		//title of the Page, Using Selenium method
		System.out.println(driver.getTitle());
		//title using JavaScript
		String title=title_js(driver);
		System.out.println(title);
	}
	
	//mathod for the title
	public static String title_js(WebDriver driver)
	{
		js=((JavascriptExecutor)  driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
		
	}
}
