package PageObjectModel_BY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration_Function 
{
	public WebDriver driver;
	
	//we will use the BY class,where can declare the object first and then we can use it later
	//Used to locate their own elements
	By RegLink=By.partialLinkText("Register here");
	By FirstName=By.name("firstName");
	By LastName=By.name("lastName");
	By Phone=By.name("phone");
	By Email=By.name("userName");
	By Address=By.name("address1");
	By City=By.name("city");
	By State=By.name("state");
	By Postal_code=By.name("postalCode");
	By Country=By.name("country");
	By Username=By.name("email");
	By Password=By.name("password");
	By ConfirmPassword=By.name("confirmPassword");
	By Regstrnbtn=By.name("submit");
	
	public Registration_Function(WebDriver d)
	{
		driver=d;
	}
	
	//for each operation/functionality we have to create that number of Methods
	public void regstnClick()
	{
		driver.findElement(RegLink).click();
	}
	
	public void setfirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	public void setlastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	
	public void setphone(String phn)
	{
		driver.findElement(Phone).sendKeys(phn);
	}
	
	public void setEmail(String eml)
	{
		driver.findElement(Email).sendKeys(eml);
	}
	
	public void SetAddress(String addrs)
	{
		driver.findElement(Address).sendKeys(addrs);
	}
	
	public void setcity(String cty)
	{
		driver.findElement(City).sendKeys(cty);
	}
	
	public void setstate(String state)
	{
		driver.findElement(State).sendKeys(state);
	}
	
	public void setPostal_code(String pstcde)
	{
		driver.findElement(Postal_code).sendKeys(pstcde);
	}
	
	public void setCountry(String cntry)
	{
		WebElement coun=driver.findElement(Country);
		//using select class
		Select s=new Select(coun);
		s.selectByVisibleText(cntry);
	}
	
	public void setUsername(String uname)
	{
		driver.findElement(Username).sendKeys(uname);
	}
	
	public void setPassword(String pswd)
	{
		driver.findElement(Password).sendKeys(pswd);
	}
	
	public void cnfrmpassword(String cnfrmpass)
	{
		driver.findElement(ConfirmPassword).sendKeys(cnfrmpass);
	}
	//clicking on the Registeration button
	public void Regstrnbtn()
	{
		driver.findElement(Regstrnbtn).click();
	}
}
