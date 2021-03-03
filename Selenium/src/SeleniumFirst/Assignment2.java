package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// getting clear-trip web-page
		driver.get("https://www.cleartrip.com/");

		Thread.sleep(3000);

		// selecting current date
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// select adults 2 from drop down
		driver.findElement(By.cssSelector("select[id='Adults']")).click();
		System.out.println(driver.findElement(By.cssSelector("select[id='Adults'] option[value='2']")).isSelected());
		driver.findElement(By.cssSelector("select[id='Adults'] option[value='2']")).click();
		System.out.println(driver.findElement(By.cssSelector("select[id='Adults'] option[value='2']")).isSelected());

		// selecting children 1 from drop down
		driver.findElement(By.cssSelector("select[id='Childrens']")).click();
		System.out.println(driver.findElement(By.cssSelector("select[id='Childrens'] option[value='1']")).isSelected());
		driver.findElement(By.cssSelector("select[id='Childrens'] option[value='1']")).click();
		System.out.println(driver.findElement(By.cssSelector("select[id='Childrens'] option[value='1']")).isSelected());

		// selecting infants 0 from drop down
		driver.findElement(By.cssSelector("select[id='Infants']")).click();
		driver.findElement(By.cssSelector("select[id='Infants'] option[value='0']")).click();

		// clicking on more option
		driver.findElement(By.cssSelector("a[id='MoreOptionsLink']")).click();
		driver.findElement(By.cssSelector("input[name='airline']")).sendKeys("Indigo");

		// clicking on search flight
		driver.findElement(By.cssSelector("input[id='SearchBtn']")).click();

		// getting alert message 
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
