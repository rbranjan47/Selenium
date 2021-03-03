package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/bangalore/shanmukha-marathahalli/order");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section[4]/section/section[2]/section[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/div")).click();
		
	}

}
