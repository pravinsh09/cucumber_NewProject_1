package stepDefination;

import org.openqa.selenium.WebDriver;

import Utility.Connector;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;


public class SearchProduct {
	
	Connector p = Connector.getinstance();
	public static WebDriver driver;
	
	@Before
	public WebDriver beforeclass(){
		
		 driver=p.openBrowser("chrome");
		 return driver;
	}

	
	@And("^Enter the \"([^\"]*)\" in \"([^\"]*)\" field")
	public void  Enter_the_productname_in_ProductSearch_field(String productname ,String object ) throws Throwable {
		
		Thread.sleep(4000);
		p.TypeText(object, productname, "Xpath");
		System.out.println(productname+"---"+object);
	}

	
	@And("^I_click_on \"(.*?)\" Button$")
	public void i_click_on_Button(String object) throws Throwable {
		Thread.sleep(2000);
		p.click(object, "xpath");;
		Thread.sleep(2000);
	}



}
