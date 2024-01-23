package uploadSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadToolKit {
	@Test
	public void uploadFileToolKit() throws AWTException, InterruptedException {
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://resume.naukri.com/resume-quality-score?fftid=101003");
	
		//C:\Users\rbran\OneDrive\Desktop\rabiranjan_resume.pdf

		// click upload file
		WebElement fileUpload = driver.findElement(By.xpath("//span[contains(text(),'Browse')]"));
		fileUpload.click();
		Thread.sleep(2000);
		try {
			Robot rb = new Robot();
			StringSelection strPath = new StringSelection("C:\\Users\\rbran\\OneDrive\\Desktop\\rabiranjan_resume.pdf");

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strPath, null);

			// cntrl + v
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);

			// release cntrl + v
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);

			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

			//driver.findElement(By.cssSelector("button[class='fetchFromNaukriBtn']")).click();
			Thread.sleep(5000);
			WebElement scoreTitle = driver.findElement(By.xpath("//div[@class='title']"));
			WebElement score = driver.findElement(By.xpath("//div[@class='subtitle']"));
			System.out.println(scoreTitle.getText() + ": "+ score.getText());
			
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
