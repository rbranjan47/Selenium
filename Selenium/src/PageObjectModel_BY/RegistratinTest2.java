package PageObjectModel_BY;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegistratinTest2 
{
	//Creating a logger file with Class name
	Logger logger=(Logger) LogManager.getLogger(RegistratinTest2.class.getName());
	
	@Test
	public void verifyFlightTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		RegisterationPage2 rgn=new RegisterationPage2(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		WebElement register=driver.findElement(By.xpath("//a[contains(text(),'Register ')]"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(register));
		
		//calling all the methods of the Registration_Function 
		//Performing all actions
		
		logger.info("Broswer Opened");
		rgn.regstnClick();
		logger.info("Entering values in the given fields");
		rgn.setfirstName("Rabi");
		rgn.setlastName("Ranjan");
		rgn.setphone("7991129678");
		rgn.setEmail("rbranjan47@gmail.com");
		rgn.SetAddress("Bhuli C block Q.no. 441");
		rgn.setcity("Dhanbad");
		rgn.setstate("Jharkhand");
		rgn.setPostal_code("828104");
		logger.info("selecting country from the drop down");
		rgn.setCountry("ALGERIA");
		rgn.setUsername("rbranjan47");
		rgn.setPassword("Rabi1234@#");
		rgn.cnfrmpassword("Rabi1234@#");
		logger.info("Clicking on Registeration Button");
		rgn.Regstrnbtn();
		
		Thread.sleep(4000);
		//driver.close();
		
	}
}
