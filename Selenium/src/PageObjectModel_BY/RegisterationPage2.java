package PageObjectModel_BY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage2 
{
	public WebDriver driver;
	
	@FindBy(partialLinkText = "Register here")
	WebElement reglink;
	
	@FindBy(name = "firstName")
	WebElement firstname;
	
	@FindBy(name ="lastName")
	WebElement lastName;
	
	@FindBy(name ="phone")
	WebElement phne;
	
	@FindBy(name = "userName")
	WebElement email;
	
	@FindBy(name = "address1")
	WebElement addrss;
	
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(name = "state")
	WebElement State;
	
	@FindBy(name = "postalCode")
	WebElement postal;
	
	@FindBy(name = "country")
	WebElement country;
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement pass;
	
	@FindBy(name = "confirmPassword")
	WebElement Cnfrmpass;
	
	@FindBy(name = "submit")
	WebElement regsnbtn;
	
	public RegisterationPage2(WebDriver d)
	{
		driver=d;
		//to intitiate all the elements present on the Web-Page
		PageFactory.initElements(d, this);
	}
	
	//for each operation/functionality we have to create that number of Methods
		public void regstnClick()
		{
			reglink.click();
		}
		
		public void setfirstName(String fname)
		{
			firstname.sendKeys(fname);
		}
		
		public void setlastName(String lname)
		{
			lastName.sendKeys(lname);
		}
		
		public void setphone(String phn)
		{
			phne.sendKeys(phn);
		}
		
		public void setEmail(String eml)
		{
			email.sendKeys(eml);
		}
		
		public void SetAddress(String addrs)
		{
			addrss.sendKeys(addrs);
		}
		
		public void setcity(String cty)
		{
			city.sendKeys(cty);
		}
		
		public void setstate(String state)
		{
			State.sendKeys(state);
		}
		
		public void setPostal_code(String pstcde)
		{
			postal.sendKeys(pstcde);
		}
		
		public void setCountry(String cntry)
		{
			//using select class
			Select s=new Select(country);
			s.selectByVisibleText(cntry);
		}
		
		public void setUsername(String uname)
		{
			username.sendKeys(uname);
		}
		
		public void setPassword(String pswd)
		{
			pass.sendKeys(pswd);
		}
		
		public void cnfrmpassword(String cnfrmpass)
		{
			Cnfrmpass.sendKeys(cnfrmpass);
		}
		//clicking on the Registeration button
		public void Regstrnbtn()
		{
			regsnbtn.click();
		}

}
