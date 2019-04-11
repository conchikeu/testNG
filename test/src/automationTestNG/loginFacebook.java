package automationTestNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class loginFacebook {
	public WebDriver driver;
	public Logger Log = Logger.getLogger(getClass());
  @Test
  
  public <FirefoxProfiles> void main() throws InterruptedException{
	  PropertyConfigurator.configure("Log4j.properties");
	  driver.get("http://www.fb.com");
	  Log.info("Open Brownser success");
	  
	  driver.findElement(By.xpath(".//*[@id=\"email\"]")).click();
	  driver.findElement(By.xpath(".//*[@id=\"email\"]")).sendKeys("0935550601");
	  Log.info("Input Email success");
	  driver.findElement(By.xpath(".//*[@id=\"pass\"]")).click();
	  driver.findElement(By.xpath(".//*[@id=\"pass\"]")).sendKeys("zFounders97@!z");
	  Log.info("Input Password success");
	  driver.findElement(By.xpath(".//*[@id=\"u_0_2\" or @id=\"u_0_3\" or @id=\"u_0_8\"]")).click();
	  Reporter.log("Loggin Succes");
	  driver.findElement(By.id("userNavigationLabel")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div/div[1]/div/div/ul/li[16]/a/span/span")).click();
	  Reporter.log("Logout Succes");
  }
  @BeforeTest
  public void beforeTest() {
	  FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  }
  @AfterTest
  public void afterTest() {
	  System.out.println(" LogOut Successfully, now it is the time to Log Off buddy.");
	  driver.quit();
  }

}
