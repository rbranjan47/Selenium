package SeleniumFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demofirefox {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
