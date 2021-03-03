 package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Check_box 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm'] ")).isSelected());
		
		//here through assert method, it is checking it is returning false or not   (If it return true, test will fail)

		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm'] ")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm'] ")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm'] ")).isSelected());
		
		//here through assert method, it is checking it is returning true or not   (If it return false, test will fail)
		
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm'] ")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("div[id='discount-checkbox']")).size());
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Patna (PAT)']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[6]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		 driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).sendKeys("2");
		 
		 
		 
	}

}
