package download_file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class download_file {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
	
		
		//creating folder
		//UUID, 88999-909090-989888-09909
		 File folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		
		//
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		
		//chrome options to set chrome download path
		ChromeOptions options = new ChromeOptions();
		
		//Creating hashmap to pass path as key value pair
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		
		options.setExperimentalOption("prefs", prefs);
		
		//defined desired capabilities
		//DesiredCapabilities cap = DesiredCapabilities.chrome();
	    //cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/download']")).click();
		driver.findElement(By.cssSelector("a[href='download/loremipsum.txt']")).click();
		
		Thread.sleep(4000);
		//storing the files
		 File listofFiles[] = folder.listFiles();
		
		//make sure it is present in library
		if (listofFiles.length>0)
		{
			System.out.println("file is present");
		}
		else
		{
			System.out.println(" file is not present");
		}
		
		Thread.sleep(5000);
		
		
		for(File file: folder.listFiles())
		{
			file.canRead();
			file.canWrite();
			file.delete();
			
			driver.quit();
		}
	}
}
