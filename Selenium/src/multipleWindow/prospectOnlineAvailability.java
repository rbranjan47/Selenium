package multipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prospectOnlineAvailability {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	// page load strategy
	ChromeOptions option = new ChromeOptions();
	option.setPageLoadStrategy(PageLoadStrategy.NORMAL);

	driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("https://qa.myresman.com/");
	driver.findElement(By.id("Username")).sendKeys("sjadmin");
	driver.findElement(By.id("Password")).sendKeys("tester2");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	JavascriptExecutor js = ( JavascriptExecutor) driver;
	js.executeScript("document.getElementById('LoadingImage').style.display='none'", true);
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@id=\"CloseAdvisor\"]"))));
	
	WebElement account = driver.findElement(By.xpath("//ul[@id='main-menu']/li[3]"));
	Actions action = new Actions(driver);
	action.moveToElement(account).build().perform();
	
	WebElement prospect = driver.findElement(By.xpath("//a[contains(text(),'Prospects')]"));
	wait.until(ExpectedConditions.elementToBeClickable(prospect));

	prospect.click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Online Availability')]"));
}
}
