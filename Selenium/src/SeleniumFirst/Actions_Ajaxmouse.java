package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Ajaxmouse 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		
		//creating action class
		Actions a=new Actions(driver);
		
		//entering any letter in capital letter and also selecting it by double clicking on it
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
		.click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//Actions for those which comes after just placing cursor of mouse
		a.moveToElement(driver.findElement(By.cssSelector(".nav-line-2.nav-long-width"))).build().perform();
		
		//right click on just placing cursor of mouse, icon
		WebElement right_click=driver.findElement(By.cssSelector(".nav-line-2.nav-long-width"));
		a.moveToElement(right_click).contextClick().build().perform();
		
		//Drag and Drop will explain in frame work
		
		
	}

}
