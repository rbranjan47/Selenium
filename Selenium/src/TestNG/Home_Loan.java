package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home_Loan 
{
	@Test
	public void  HomeLoanweb()
	{
		System.out.println("home loan in web application");
	}
	
	@AfterTest
	public void HomeLoanMobile()
	{
		System.out.println("home loan in mobile application");
	}
	
	@BeforeTest
	public void HomeLoanAPI()
	{
		System.out.println("home loan in api based appliaction");
	}

}
