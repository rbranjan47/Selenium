package SeleniumSecond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certification 
{
//Capabilities are options that you can use to customize and configure a ChromeDriver session
	
	public static void main(String[] args) 
	{
		//we are switching to JAVASCript for SSL certification page
		//SSL Certification- Security search authentication
		
		DesiredCapabilities ch=new DesiredCapabilities();
		//  ch.acceptInsecureCerts(); // it will accept all insecure sites 
		
		
		// we can also accept Insecure Certification by this two ways
		// 2 types of INSECURE certifications----SSL_Certification & INSECURE_Certification
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);   //it will merge with both windows
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		
		
		//visit  any SSL based sites and perform your task
		driver.get("ANY_SITES_URL");
	}

}
