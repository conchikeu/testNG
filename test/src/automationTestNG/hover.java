package automationTestNG;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class hover {

private static WebDriver driver;

public Logger Log = Logger.getLogger(getClass());
@Test


public void main() throws InterruptedException {
	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(new FirefoxProfile());
	options.addPreference("dom.webnotifications.enabled", false);
	driver = new FirefoxDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String homepage = "https://fptshop.com.vn/";
    
	driver.get(homepage);
	Actions builder = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	
	 WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[2]/a"));
	 Thread.sleep(3000);
	 builder.moveToElement(element).build().perform();
	 
	 driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[2]/div/div/div[1]/ul[1]/li[7]/a")).click();
	 
	 driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/div[3]/div[1]/div/div[1]/h3/a")).click();
	 
	 driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div[2]/ul[2]/li[2]/a")).click();
	 
	 driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/div[2]/ul[2]/li[12]/div/button")).click();
	 
	 driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/div[2]/div[2]/div[3]/div[2]/ul[1]/li[1]/label/span")).click();
	 // First Name
	 driver.findElement(By.xpath("//*[@id=\"txtNameHo\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"txtNameHo\"]")).sendKeys("Test First Name");
	 //Middle Name
	 driver.findElement(By.xpath("//*[@id=\"txtNameLot\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"txtNameLot\"]")).sendKeys("Test Middle Name");
	 //Last Name
	 driver.findElement(By.xpath("//*[@id=\"txtNameTen\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"txtNameTen\"]")).sendKeys("Test Last Name");
	 //CMND
	 driver.findElement(By.xpath("//*[@id=\"txtCmd\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"txtCmd\"]")).sendKeys("123456789");
	 //Day Birth
	 driver.findElement(By.xpath("//*[@id=\"num1\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"num1\"]")).sendKeys("06");
	 //Month Birth
	 driver.findElement(By.xpath("//*[@id=\"num2\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"num2\"]")).sendKeys("01");
	 //Year Birth
	 driver.findElement(By.xpath("//*[@id=\"num3\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"num3\"]")).sendKeys("1997");
	 //Phone number
	 driver.findElement(By.xpath("//*[@id=\"txtPhone\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"txtPhone\"]")).sendKeys("0905090909");
	 //Choose City
	 driver.findElement(By.xpath("//*[@id=\"CityIDShop\"]")).click();
	 WebElement city = driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/div[2]/div[2]/div[3]/div[2]/ul[8]/li[1]/select/option[30]"));
	 js.executeScript("arguments[0].scrollIntoView();", city);
	 driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/div[2]/div[2]/div[3]/div[2]/ul[8]/li[1]/select/option[30]")).click();
	 //choose capital
	 driver.findElement(By.xpath("//*[@id=\"DistrictIDShop\"]")).click();
	 driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/div[2]/div[2]/div[3]/div[2]/ul[8]/li[2]/select/option[2]")).click();
	 //Choose address
	 driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/div[2]/div[2]/div[3]/div[2]/div/ul/li[4]/label/span")).click();
	 //Create
	 driver.findElement(By.xpath("//*[@id=\"AddOrderRecurring\"]")).click();
	 String myWindowHandle = driver.getWindowHandle();
	 driver.switchTo().window(myWindowHandle);
	 Thread.sleep(1500);
	 //Handle Pop-up after create
	 WebElement email_id = driver.findElement(By.xpath("/html/body/div/main/div[2]/div[2]/nav/button"));
	 email_id.click();
	 
	 	}
 	} 

