package automationTestNG;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.testng.Reporter;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Shopee {
	public WebDriver driver;
	public Logger Log = Logger.getLogger(getClass());

	@Parameters({"sURL", "sUsername","sPassword"})
  
  public <FirefoxProfiles> void main() throws InterruptedException{
	  FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  PropertyConfigurator.configure("Log4j.properties");
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
//	  WebElement Element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/div[3]/div/div/div[1]/ul/li[4]/li/a/div/div[2]/div[1]"));
//	  js.executeScript("arguments[0].scrollIntoView()");
	  

	}
}
