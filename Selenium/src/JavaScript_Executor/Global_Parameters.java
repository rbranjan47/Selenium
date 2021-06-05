package JavaScript_Executor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Global_Parameters 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Properties proptr=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\src\\JavaScript_Executor\\Properties_transfer.properties");
		
		//to read the files as Input Stream i.e. Files into a Stream Combinations
		proptr.load(fis);
		proptr.getProperty("browser");
		
		System.out.println(proptr.getProperty("browser"));
		
		//We can also modify the value by passing method "SET"
		proptr.setProperty("browser", "firefox");
		System.out.println(proptr.getProperty("browser"));
		
		//to print value in the file
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\src\\JavaScript_Executor\\Properties_transfer.properties");
		
		proptr.store(fout, null);
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		String link=proptr.getProperty("url");
		driver.get(link);
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
