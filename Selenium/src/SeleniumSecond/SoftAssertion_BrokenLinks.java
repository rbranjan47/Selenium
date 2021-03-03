package SeleniumSecond;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_BrokenLinks
{
		public static void main(String[] args) throws MalformedURLException, IOException 
		{

			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			//getting all the links
		List <WebElement> links_list=	driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		
		//soft assert for not getting fail for other test link's
		SoftAssert a= new SoftAssert();
		
		for (WebElement link : links_list )
		{

			String url_soapui=link.getAttribute("href");
			HttpURLConnection connection=(HttpURLConnection)new URL(url_soapui).openConnection(); //as HTTP is parent class of URL-connections
			
			connection.setRequestMethod("HEAD");
			connection.connect();
			int respn_code=connection.getResponseCode();
			System.out.println(respn_code); 
			
			
			a.assertTrue(respn_code<400, "The link having text "+ link.getText()+" is failed and its response code is "+respn_code);
		}
			
			
			
			
		
			
		
			//getting  1 links
	   //   String url_soapui=driver.findElement(By.cssSelector("a[href*=\'brokenlink\']")).getAttribute("href");
			
			/*The openConnection() method of URL class opens the connection to specified URL and URLConnection
			  instance that represents a connection to the remote object referred by the URL.*/
			
			
	 /*		HttpURLConnection connection=(HttpURLConnection)new URL(url_soapui).openConnection(); //as HTTP is parent class of URL-connections
			
			connection.setRequestMethod("HEAD");
			connection.connect();
			int respn_code=connection.getResponseCode();
			System.out.println(respn_code);      */
		}


	}

