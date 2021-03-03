package SeleniumFirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//applying some time wait for not getting fail test
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//entering into web-page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		//checking option 2
		driver.findElement(By.id("checkBoxOption2")).click();
		//getting text 
		System.out.println(driver.findElement(By.cssSelector("label[for='benz']")).getText());
		//making text as variable
		String text=driver.findElement(By.cssSelector("label[for='benz']")).getText();
		
		//As many options are there so searching option 2 from all web-element in drop down
		WebElement drop_options=	driver.findElement(By.id("dropdown-class-example"));
	//creating select class to perform select operations
		Select s=new Select(drop_options);
		//now selecting it, when text available like as variable 'text'
		s.selectByVisibleText(text);
	
		//sending text in alert box
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		String popup=driver.switchTo().alert().getText();
		

		if(text.contains(popup))
				{
			System.out.println("yes it is present");
				}
		else
		{
			System.out.println("it is not present");
		}	
	}

}
