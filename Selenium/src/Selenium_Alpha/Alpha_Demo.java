package Selenium_Alpha;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alpha_Demo {
	public long timeout = 20;
	public long pageout = 20;

	@Test
	public void Screenshot_test() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageout, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img"));

		File file_logo = logo.getScreenshotAs(OutputType.FILE);
		File destn_logo = new File("Logo1.png");
		// using files utils methods
		FileUtils.copyDirectory(file_logo, destn_logo);

		driver.quit();
	}
}
