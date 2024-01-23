package expiredCertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class insecureSiteScript {
	public static void main(String[] args) {

		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOpt = new ChromeOptions();
		chromeOpt.setAcceptInsecureCerts(true);
		chromeOpt.addArguments("--remote-allow-origins=*");
		//chromeOpt.merge(cap);
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("http://www.cacert.org/");
	}
}
