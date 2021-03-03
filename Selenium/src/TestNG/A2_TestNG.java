package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A2_TestNG
{
	@Test
	public void Demo()
	{
		System.out.println("Hello world");
	}
	
	@BeforeTest
	public void before_Test()
	{
		System.out.println("Before all Tests");
	}
	
	@AfterTest
	public void After_Test()
	{
		System.out.println("After all Tests");
	}
	
	@Test
	public void Demo_Sec()
	{
		System.out.println("Hello TestNG");
	}
	
	
	
}
