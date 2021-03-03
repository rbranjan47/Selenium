package TestNG;

import org.testng.annotations.Test;

public class TestNG_Features 
{
	@Test
	public void login()
	{
		System.out.println("login test");
	}
	
	//if let suppose dependency between login page and home-page then, it will execute based on their dependencies 
	//for this we have to prepare the dependencies
	@Test(dependsOnMethods = "login")
	public void homepage()
	{
		System.out.println("home page test");
	}
	
	
	@Test(dependsOnMethods = "homepage")
	public void logout()
	{
		System.out.println("logout test");
	}
}
