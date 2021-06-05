package Cloud_Testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class sauce_labs {
	public static WebDriver driver;
	public static  String USERNAME = "oauth-rabipatel1997-57a23";
	  public static  String ACCESS_KEY = "f2922c7d-4ae7-4582-961b-1d14970c291c";
	  //https://oauth-rabipatel1997-57a23:f2922c7d-4ae7-4582-961b-1d14970c291c@ondemand.eu-central-1.saucelabs.com:443/wd/hub
	  public static  String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	  //public static final String URL = "https://oauth-rabipatel1997-57a23:f2922c7d-4ae7-4582-961b-1d14970c291c@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
			
	  
	  public static void main(String[] args) throws MalformedURLException, InterruptedException
	  {
			@SuppressWarnings("static-access")
			DesiredCapabilities caps = new DesiredCapabilities().chrome();
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "55.0");
		
			WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	
		
		String get_url = "https://www.flipkart.com/";
		driver.get(get_url);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement cross_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		wait.until(ExpectedConditions.elementToBeClickable(cross_button));
		cross_button.click();
		
		WebElement search_box = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		String search_item = "Bluetooth Earphone";
		search_box.sendKeys(search_item);
		Thread.sleep(2000);
		search_box.sendKeys(Keys.ENTER);
		//scrolling page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("boat");
		driver.findElement(By.xpath("//div[@class='_3879cV'][normalize-space()='boAt']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]"));
		int count = elements.size();
		System.out.println(count);
		System.out.println(driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]")).getText());
		
		Thread.sleep(3000);
		driver.close();	
	}
}
