package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo 
{
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setup the system property ");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch the browser ");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("enter the url");
	}
	
	@Test
	public void keyboard()
	{
		System.out.println("i purchased keyboard ");
	}
	
	
	@BeforeTest
	public void login()
	{
		System.out.println("login to application ");
	}
	
	@Test
	public void googletitleTest()
	{
		System.out.println("Google title Test ");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout from application ");
	}
	
	@AfterTest
	public void deleteallcookies()
	{
		System.out.println("delete all the cookies ");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close the browser ");
	}
	
	@AfterSuite
	public void testreport()
	{
		System.out.println("generate the test report ");
	}
}

