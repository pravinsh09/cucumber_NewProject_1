package stepDefination;

import org.openqa.selenium.WebDriver;

import Utility.Connector;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Logintest {

	
	Connector c = Connector.getinstance();
	public static WebDriver driver;
	
	@Before
	public WebDriver beforeclass(){
		
		 driver=c.openBrowser("chrome");
		 return driver;
	}
	//Need to work on below by passing url parameter from feature file
	@Given("^I go to \"([^\"]*)\"")
	public void I_Go_To_Salesforce(String URL){
		
		System.out.println();
		c.navigate(driver, URL);
	}
	
	//NOTE need to work on sign and datatable feature of cucumber
	@And ("I click on \"([^\"]*)\"")
	public void I_click_on(String object) throws InterruptedException{
		Thread.sleep(2000);
		c.click(object, "Xpath");
		
	}
	
	@And ("I enter \"([^\"]*)\" as \"([^\"]*)\"")
	public void I_enter(String object,String text) throws InterruptedException{
		
		c.TypeText(object, text, "Xpath");
		
	}
	
	@Then("^login should be \"([^\"]*)\"$")
	public void Then_login_should_be(String expectedResult){
		System.out.println("Login - "+ expectedResult);
	}
	
}
