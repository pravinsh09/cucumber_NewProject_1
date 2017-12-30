package Utility;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Connector {
	
	
	 static Connector base;
	 Properties OR=null;
	 Properties CONFIG=null;
	 WebDriver driver=null;
	 WebDriver mozilla=null;
	 WebDriver chrome=null;
	 WebDriver ie=null;
	 
	public Connector() {

		if (OR == null) {
			try {
				OR = new Properties();
				FileInputStream fs = new  FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Config\\OR.properties");
				OR.load(fs);
				CONFIG = new Properties();
				fs = new  FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Config\\testenv.properties");
				CONFIG.load(fs);
			} catch (Exception e) {
				System.out.println("Invalid path");	
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	public WebDriver openBrowser(String browserType) {

			System.out.println("In openbrowser--->" + driver);
		    if (driver == null){
		    	if(browserType.equalsIgnoreCase("Chrome")){
		    		System.out.println("test");
		    	System.setProperty("webdriver.chrome.driver", "E:\\project\\Cucumber_Project4\\Cucumber_Project4\\Libraries\\chromedriver.exe");
		    	System.out.println("test1");                   
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				ChromeOptions options = new ChromeOptions();
				System.out.println("test3");
				options.addArguments("test-type");
				options.addArguments("disable-infobars");
				options.setExperimentalOption("useAutomationExtension", false);
				options.addArguments("--disable-extensions"); 
				options.addArguments("--start-maximized");
				/*Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("credentials_enable_service", false);
			    prefs.put("profile.password_manager_enabled", false);
			    options.setExperimentalOption("prefs", prefs);*/
				    
				capabilities
						.setCapability("chrome.binary",
								"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);	
				driver = new ChromeDriver();
				System.out.println("test4");
				return driver;
		    }else if(browserType.equalsIgnoreCase("firefox")){
		    	driver= new FirefoxDriver();
		      return driver;
		    }
		    	driver.manage().deleteAllCookies();		
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   }
			return driver; 
		
	}
	
	
	public static Connector getinstance(){
		
		if(base==null)
			base = new Connector();
		
		return base;
	}
	
	public void navigate(WebDriver driver,String Url){
		
		driver.get(CONFIG.getProperty(Url));
	}
	
	public void navigateModule(WebDriver driver,String Url) throws InterruptedException{
		
		Thread.sleep(2000);
		String navigateUrl=CONFIG.getProperty(Url)+"post-air/catalog";
		driver.get(navigateUrl);
		System.out.println(navigateUrl);
	}
	
	public void click(String ObjectName,String locatorType) throws InterruptedException{
		Thread.sleep(5000);
		if(locatorType.equalsIgnoreCase("Xpath")){
			driver.findElement(By.xpath(OR.getProperty(ObjectName))).click();
		}else if(locatorType.equalsIgnoreCase("Css")){
			driver.findElement(By.cssSelector(OR.getProperty(ObjectName))).click();	
		}
		
	}
	
	public void webdriverwait(){
		
		
	}
	
	public void TypeText(String ObjectName,String Value,String locatorType) throws InterruptedException{
		Thread.sleep(2000);
		if(locatorType.equalsIgnoreCase("Xpath")){
			driver.findElement(By.xpath(OR.getProperty(ObjectName))).sendKeys(Value);
		}else if(locatorType.equalsIgnoreCase("Css")){
			driver.findElement(By.cssSelector(OR.getProperty(ObjectName))).sendKeys(Value);
		}
		
	}

	

}
