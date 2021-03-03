package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_basic_drop 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector(".react-autosuggest__input")).click();
		driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".react-autosuggest__input")).click();
		driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)")).click();
		
		driver.findElement(By.cssSelector("div.fsw_inputBox:nth-child(4) > label:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.DayPicker-Month:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > p:nth-child(1)")).click();
		
		driver.findElement(By.cssSelector("div.fsw_inputBox:nth-child(5) > div:nth-child(1) > label:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".DayPicker-Day--end > div:nth-child(1)")).click();
		
		driver.findElement(By.cssSelector(".primaryBtn")).click();

	}

}
