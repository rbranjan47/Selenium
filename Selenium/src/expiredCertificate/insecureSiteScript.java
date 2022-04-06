package expiredCertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class insecureSiteScript {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cap);

		driver.get("http://www.cacert.org/");
	}
}
