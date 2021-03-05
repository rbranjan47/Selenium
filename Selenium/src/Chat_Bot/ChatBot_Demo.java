package Chat_Bot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatBot_Demo {
	public static WebDriver driver;
	public static long timeout = 10;
	public static long pageload = 20;

	public static void main(String[] args) throws InterruptedException
	{
		//diabling the notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver_89\\chromedriver.exe");
		// driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		Actions act=new Actions(driver);
		WebElement plus=driver.findElement(By.xpath("//div[contains(text(),'Leave a Message')]"));
		act.moveToElement(plus).build().perform();
		WebDriverWait wait=new WebDriverWait(driver, 10);

		if (wait.until(ExpectedConditions.elementToBeClickable(plus)) != null)
		{
			plus.click();
			
			driver.findElement(By.xpath("//input[@class='mylivechat_offline_name_box mylivechat_offline_box']")).sendKeys("Rabi Ranjan Kumar");
			driver.findElement(By.xpath("//input[@class='mylivechat_offline_email_box mylivechat_offline_box']")).sendKeys("rbranjan47@gmail.com");
			driver.findElement(By.xpath("//input[@class='mylivechat_offline_custom_box mylivechat_offline_box']")).sendKeys("7991129678");
			driver.findElement(By.xpath("//textarea[@class='mylivechat_offline_question_box mylivechat_offline_box']")).sendKeys("Hey this is rabi here");
			WebElement file=driver.findElement(By.xpath("//input[@type='file']"));
			file.sendKeys("C:\\Users\\Lenovo\\Documents\\Resume Rule.txt");
			
			driver.findElement(By.xpath("//button[@class='mylivechat_offline_submit_button']"));
			System.out.println("This means we registered");
		}
		
		else
		{
			driver.findElement(By.xpath("//div[@class='mylivechat_closebtn']//*[local-name()='svg']"
					+ "//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
			System.out.println("This means we are not registered");
		}
		Thread.sleep(5000);
		
		driver.quit();
	}
}
