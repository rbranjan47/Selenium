package Selnium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class titile_verify {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		// driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://qa.workmarket.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement Login_homePage = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
		wait.until(ExpectedConditions.elementToBeClickable(Login_homePage));
		Login_homePage.click();
		
		WebElement Login_loginPage = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		wait.until(ExpectedConditions.elementToBeClickable(Login_loginPage));
		Login_loginPage.click();
		
		Thread.sleep(4000);
		WebElement error_message = driver.findElement(By.xpath("//div[@class='jss643 jss652 jss641 jss641--error']"));
		String text_error = error_message.getText();
		System.out.println(text_error);
		Thread.sleep(3000);
		driver.close();
	}
}
