package stepDefinition;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobjects.ContactCredentialspom;
import pageobjects.PageObjectManager;
import pageobjects.RegisterPagepom;
import utils.TestContextSetup;

public class RegisterStepDefinition {

	//public WebDriver driver;
	
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public RegisterStepDefinition(TestContextSetup testContextSetup) // here we are just passing the instance of testcontext setup
	{
		
		this.testContextSetup = testContextSetup;
		
	}
	
	@Then("^user clicks on Base Camp icon \"([^\"]*)\"$")
	public void user_clicks_on_Base_Camp_icon(String arg1)  {
		
		
		RegisterPagepom registerPagepom = testContextSetup.pageObjectManager.getRegisterPagepom();
		
		registerPagepom.BaseCampIcon();
	}

	@When("^user is on Base Camp Home page \"([^\"]*)\"$")
	public void user_is_on_Base_Camp_Home_page(String arg1)  {
		
			testContextSetup.genericUtils.SwitchWindowToChild();
			
		String actualTitle = testContextSetup.driver.getTitle();
	    String expectedTitle = "Base Camp 2024 | Entrata";
	    Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^user clicks on Register now icon \"([^\"]*)\"$")
	public void user_clicks_on_Register_now_icon(String arg1)  {
	   
		RegisterPagepom registerPagepom = testContextSetup.pageObjectManager.getRegisterPagepom();
		registerPagepom.RegisterNowBtn();
	
	}

	@Then("^user provides necessary info in personal info section \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_provides_necessary_info_in_personal_info_section(String TcNo, String firstname, String lastname, String company, String title ,  String email, String mobile)  {
	    
		invokePersonalInfo(TcNo,  firstname,  lastname,  company,  title ,   email,  mobile);
	
		testContextSetup.genericUtils.CloseBrowser();
		
	}
	
	public void invokePersonalInfo(String TcNo, String firstname, String lastname, String company, String title ,  String email, String mobile)
	
	{
		
		RegisterPagepom registerPagepom = testContextSetup.pageObjectManager.getRegisterPagepom();
		registerPagepom.FirstName(firstname);
		registerPagepom.LastName(lastname);
		registerPagepom.Company(company);
		registerPagepom.Title(title);
		registerPagepom.Email(email);
		registerPagepom.Mobile(mobile);
	
	}
	
	
}
