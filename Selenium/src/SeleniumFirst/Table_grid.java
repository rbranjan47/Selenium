//here we are working on table grid on CRICBUZZ web-site and adding final score

package SeleniumFirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_grid 
{

	public static void main(String[] args) throws InterruptedException
	{
		int sum=0;
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30230/eng-vs-aus-2nd-odi-australia-tour-of-england-2020");
		
		Thread.sleep(4000);
		
		WebElement table=driver.findElement(By.xpath("//div[@id='innings_1'] /div[1]"));
		
		//counting row
		@SuppressWarnings("unused")
		int row_count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		//counting column:- we can move 3rd element of that row by CSS selector formula
		//"parent_tagname[.......] child_name:nth-child(n)"
		int col_count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int i=0;i<col_count-2;i++)
		{
			//getting score of all players
			     //System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			
			//printing total things, i.e player name , score, 4,6,.....
			     /*  System.out.print(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).get(i).getText());
		              System.out.println(); //(space)  */
			
			//getting sum of all score
			String score=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			//now it is STRING format, to convert into INTEGER we have to do AUTO-UNBOXING
			
			int score_sum=Integer.parseInt(score);
			//adding
			sum=sum+score_sum;
			
		}
		//printing EXTRAS score
		     //System.out.println(driver.findElement(By.xpath("//div[@id='innings_1']/div/div[14]/div[2]")).getText());
		
		String extra=driver.findElement(By.xpath("//div[@id='innings_1']/div/div[14]/div[2]")).getText();
		int extra_score=Integer.parseInt(extra);
		
		//printing TOTAL score 
		     //System.out.println(driver.findElement(By.xpath("//div[@id='innings_1']/div/div[15]/div[2]")).getText());
		String total=driver.findElement(By.xpath("//div[@id='innings_1']/div/div[15]/div[2]")).getText();
		int total_score=Integer.parseInt(total); 
		
		
		//sum all the score and check with total score
		int sum_total=sum+extra_score;
		if (total_score==sum_total)
		{
		System.out.println("scores sum equal to total sum");
		}
		else
		{
			System.out.println("score sum not equal to total sum");
		}
	}

}
