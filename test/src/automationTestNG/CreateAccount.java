package automationTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAccount {
	public WebDriver driver;
	
  @Test
  //@Parameters({ "FirstName", "LastName", "Email", "Password" })
  //public void main(String FirstName, String LastName, String Email, String Password ) {
  public void main() throws InterruptedException {
	  //PropertyConfigurator.configure("Log4j.properties");
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  driver.findElement(By.xpath(".//*[@id='u_0_j']")).click();
	  driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("vu");
	  
	  driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
	  driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("van");
	  
	  driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
	  driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("dad.vu.van.gl.qa@gmail.com");
	  
	  driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();
	  driver.findElement(By.xpath(".//*[@id='u_0_r']")).sendKeys("dad.vu.van.gl.qa@gmail.com");
	  
	  driver.findElement(By.xpath(".//*[@id='u_0_v']")).click();
	  driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("ZXasqw12");
	  
	  driver.findElement(By.xpath(".//*[@id='day']")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[1]/option[7]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"month\"]")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[2]/option[3]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
	  WebElement Element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[3]/option[51]"));
	  
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[3]/option[51]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"u_0_11\"]")).click();
	 
	  driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div/div[2]/div[4]/div[2]/button")).click();
	  
	  
	  
  }
  @BeforeTest
  public void BeforeTest() {
	  
	  FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
  }
  @AfterTest
  public void AfterTest() {
	  System.out.println("Create Succes");
  }
}
