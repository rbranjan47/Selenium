package TestNG;

import org.testng.annotations.Test;

public class Innvocaation_Timeout 
{
	@Test(invocationCount = 2000, expectedExceptions = NumberFormatException.class)
	
	public void InnvocationTimeout()
	{
		System.out.println("using unlimited for loop, ");
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
}
