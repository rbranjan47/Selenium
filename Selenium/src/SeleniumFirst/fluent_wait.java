package SeleniumFirst;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluent_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// IMPLICIT WAIT
		// driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();

		// EXPLICIT WAIT
		/* WebDriverWait w = new WebDriverWait(driver, 7);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Hello World!']"))); */
		
		//FLUENT WAIT
		
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		@SuppressWarnings("unused")
		WebElement foo = w.until(new Function<WebDriver, WebElement>() {
			
		     public WebElement apply(WebDriver driver) 
		     {
		    	if ( driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed())
		    	{
		       return driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		    	}
		    	else 
		    	{
		    		return null;
		    	}
		   }});
		System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());

	}

}
