package Window_AuthenticationPopup;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popup_autoIT {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		
		String download_path = System.getProperty("user.dir");
		//chromeOptions
		ChromeOptions options = new ChromeOptions();
		
		//hashmap to set download path
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", download_path);
		options.setExperimentalOption(download_path, chromePrefs);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://smallpdf.com/pdf-to-jpg");
		
		WebElement choose_file = driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 ejRuwW']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(choose_file));
		
		choose_file.click();
		Thread.sleep(3000);
		//calling AutoIT script
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Test_Data\\pdf_upload.exe");
		
		WebElement convrt_optn = driver.findElement(By.xpath("//div[@class='sc-1m6pvee-7 eJDYuH']"));
		wait.until(ExpectedConditions.elementToBeClickable(convrt_optn));
		convrt_optn.click();
		driver.findElement(By.xpath("//span[normalize-space()='Choose option']")).click();
		
		WebElement download_btn = driver.findElement(By.xpath("//span[@class='wnolmd-2 etrSPs']"));
		wait.until(ExpectedConditions.elementToBeClickable(download_btn));
		download_btn.click();
		
		//checking file in download_path
		File fs = new File(download_path+"\\sample-images.zip");
		if(fs.exists()){
			System.out.println("file found");
		}
		else {
			System.out.println("file not found");
		}
		
		driver.close();
	
	}

}
