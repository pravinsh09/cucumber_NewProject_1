package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




	
	@RunWith(Cucumber.class)
	@CucumberOptions(

				//format = {"pretty", "json:target/"},
			 monochrome = false, 
			 
			 //format = {"pretty", "json:target/cucumber.json"},
			 plugin={"html:target/cucumber-html-report"},
			 	//plugin = {"pretty", "html:target/cucumber-htmlreport","pretty:target/cucumber-report.json"},
		        features = {"features"},
				glue = {"stepDefination"}
		    )
	public class Runner{
		
		
	}


