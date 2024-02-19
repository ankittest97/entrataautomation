package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import pageobjects.ContactCredentialspom;
import pageobjects.RegisterPagepom;
import utils.TestContextSetup;

public class ContactCredentialsStepDefinition  {

public WebDriver driver;
TestContextSetup testContextSetup;
public ContactCredentialspom contactCredentialspom;

public ContactCredentialsStepDefinition(TestContextSetup testContextSetup) // here we are just passing the instance of testcontext setup
{
	
	this.testContextSetup = testContextSetup;
	
}
	
	@Given("^User is on Application Home Page \"([^\"]*)\"$")
	public void user_is_on_Application_Home_Page(String arg1) 
 {
		   
	}

	@When("^Application Page Tittle is Property Management Software \"([^\"]*)\"$")
	public void application_Page_Tittle_is_Property_Management_Software(String arg1) 
 {
		

		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		String actualTitle = contactCredentialspom.actualTitle();
	    String expectedTitle = "Property Management Software | Entrata";
	    Assert.assertEquals(expectedTitle, actualTitle);

	}
	
	@Then("^user clicks on Sign In button \"([^\"]*)\"$")
	public void user_clicks_on_Sign_In_button(String arg1) throws Throwable {
		
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.SignIn();
		
	}

	@Then("^user clicks on Residents Login button \"([^\"]*)\"$")
	public void user_clicks_on_Residents_Login_button(String arg1) throws Throwable {
	    
	    testContextSetup.genericUtils.ResidentLoginBtn();
	}

	@Then("^user is directed to Resident portal page \"([^\"]*)\"$")
	public void user_is_directed_to_Resident_portal_page(String arg1)  {
		
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		String actualTitle = contactCredentialspom.residentPortalTitle();
	    String expectedTitle = "Welcome to the Resident Portal App";
	    Assert.assertEquals(expectedTitle, actualTitle);
	  
	}


	@Then("^user clicks on view the website button \"([^\"]*)\"$")
	public void user_clicks_on_view_the_website_button(String arg1)  {
		
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.Websitebtn();
	}

	

	@Then("^user clicks on view the App button \"([^\"]*)\"$")
	public void user_clicks_on_view_the_App_button(String arg1)  {
		
		
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.Applicationbtn();
		
	}

	@Then("^user fills the contact us form \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_fills_the_contact_us_form(String TcNo, String name, String email, String propertyname, String propertyUrl, String category, String message)  {
		
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.NameTextBox(name);
		contactCredentialspom.Email(email);
		contactCredentialspom.Propertyname(propertyname);
		contactCredentialspom.PropertyUrl(propertyUrl);
		contactCredentialspom.Category();
		contactCredentialspom.Message(message);
		testContextSetup.genericUtils.CloseBrowser();
	}

	@Then("^user clicks on Property Manager LoginButton \"([^\"]*)\"$")
	public void user_clicks_on_Property_Manager_LoginButton(String arg1)  {
		
		
		  testContextSetup.genericUtils.ClientLoginBtn();
		
	    
	}

	@Then("^user enters username and password \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_username_and_password(String arg1, String username, String password)  {
		
		ContactCredentialspom contactCredentialspom = testContextSetup.pageObjectManager.getContactCredentialspom();
		contactCredentialspom.Username(username);
		contactCredentialspom.Password(password);
		testContextSetup.genericUtils.CloseBrowser();
		
		
	}

	     


	
}
