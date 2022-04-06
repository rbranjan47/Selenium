package multipleWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindowHandle {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// page load strategy
		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);

		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement SocialIcons = driver.findElement(By.id("footer"));
		js.executeScript("arguments[0].scrollIntoView(true);", SocialIcons);

		String parentWindow = driver.getWindowHandle();

		// twitter
		String Twiter = "//img[@alt='OrangeHRM on twitter']";
		ElementClick(Twiter);

		String Facebook = "//img[@alt='OrangeHRM on Facebook']";
		ElementClick(Facebook);

		String Youtube = "//img[@alt='OrangeHRM on youtube']";
		ElementClick(Youtube);

		String LinkedIn = "//img[@alt='LinkedIn OrangeHRM group']";
		ElementClick(LinkedIn);

		Set<String> sChild = driver.getWindowHandles();
		List<String> lChild = new ArrayList<String>(sChild);

		switchToFacebook(lChild, "Facebook");

		closeOtherTab(lChild, parentWindow);

		switchToParentWindow(parentWindow);

		closeOtherTab(lChild, parentWindow);
	}

	public static void ElementClick(String path) {
		driver.findElement(By.xpath(path)).click();
	}

	public static boolean switchToFacebook(List<String> windowList, String windowTitle) {

		for (String e : windowList) {
			String currentWindowTitle = driver.switchTo().window(e).getTitle();
			if (currentWindowTitle.contains(windowTitle)) {
				return true;
			}
		}
		return false;
	}

	public static void closeOtherTab(List<String> windowList, String parenWindow) {
		for (String e : windowList) {
			if (!e.equals(parenWindow)) {
				driver.switchTo().window(e).close();
			}
		}
	}

	public static void switchToParentWindow(String parentWindow) {
		driver.switchTo().window(parentWindow);
	}
}
