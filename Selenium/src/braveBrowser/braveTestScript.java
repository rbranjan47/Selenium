package braveBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class braveTestScript {
	public static void main(String[] args) {

		// By setting up chrome driver path
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		// OR
		
		// By WebDriverManager
//        WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.setBinary("Path of Brave browser application/brave-browser/brave.exe");

		WebDriver driver = new ChromeDriver(option);

	}
}
