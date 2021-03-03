package TestNG;

import org.testng.annotations.Test;

public class Car_Loan 
{
	@Test
	public void  CarLoanweb()
	{
		System.out.println("Car loan in web application");
	}
	
	@Test
	public void CarLoanMobile()
	{
		System.out.println("Car loan in mobile application");
	}
	
	@Test
	public void CarLoanAPI()
	{
		System.out.println("Car loan in api based appliaction");
	}

}
