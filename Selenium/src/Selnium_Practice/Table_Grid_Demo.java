package Selnium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Grid_Demo 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30494/rcb-vs-csk-44th-match-indian-premier-league-2020");
	
	//table count
	WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	//getting row count
	int row_count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	System.out.println(row_count);
	
	//getting column count
	int col_count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	System.out.println(col_count);
	
	int sum=0;
	//reading each column of score
	for (int i=0;i<=col_count-3;i++)
	{
		String score=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		System.out.println(score);
		int scores=Integer.parseInt(score);
	 sum=sum+scores;
	}
	
	String extra=driver.findElement(By.xpath("//div[@id='innings_1']/div/div[11]/div[2]")).getText();
	System.out.println(extra);
	int extra_score=Integer.parseInt(extra);
	
	
	String total=driver.findElement(By.xpath("//div[@id='innings_1']/div/div[12]/div[2]")).getText();
	System.out.println(total);
	int total_score=Integer.parseInt(total);
	
	int sum_score=sum+extra_score;
	if (sum_score==total_score)
		System.out.println("matched");
	else
		System.out.println("not matched");
	

	}

}
