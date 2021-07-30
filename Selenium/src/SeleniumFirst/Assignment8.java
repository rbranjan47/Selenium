package SeleniumFirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//applying some time wait for not getting fail test
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//entering into web-page
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		//waiting
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement india_option = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(india_option));
		
		String option_text = india_option.getText();
		//System.out.println(option_text);
		india_option.click();
		
	    driver.findElement(By.xpath("//legend[contains(text(),'Suggession Class Example')]")).click();
		
		WebElement feild_text = driver.findElement(By.xpath("//div[@id='select-class-example']/fieldset/input"));
		String req_text = feild_text.getText();
		System.out.println(req_text);
		//Assert.assertEquals(option_text, req_text);
		//also implementing if else conditions
		if (option_text.equalsIgnoreCase(req_text)) {
			System.out.println("Character matched");
		}
		Thread.sleep(3000);
		driver.close();
	}
}
