package TestNG;

import org.testng.annotations.Test;

public class Innvocation_Count_Test 
{
	//Invocation count is used for repeating the same test case without writing it again and again.
	
	@Test(invocationCount = 10)
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum is "+c);
	}
}
