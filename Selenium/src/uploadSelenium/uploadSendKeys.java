package uploadSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadSendKeys {
	@Test
	public void testUploadFIle() throws InterruptedException {
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
		// C:\Users\rbran\Downloads\times-now-indian_xstr.1248.webp

		driver.findElement(By.id("file-upload"))
				.sendKeys("C:\\Users\\rbran\\Downloads\\times-now-indian_xstr.1248.webp");

		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.xpath("//div/h3[contains(text(),'File Uploaded!')]")).getText(),
				"File Uploaded!");
		driver.quit();
	}
}
