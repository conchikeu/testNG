package automationTestNG;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class test {


private static WebDriver driver;

public Logger Log = Logger.getLogger(getClass());
@Test


public void main() throws InterruptedException {
	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(new FirefoxProfile());
	options.addPreference("dom.webnotifications.enabled", false);
	driver = new FirefoxDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String homepage = "http://live.guru99.com/";
    
	driver.get(homepage);
	 //Click on Account button
	 WebElement accountButton = driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a"));
	 accountButton.click();
	 
	 driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[5]/a")).click();
	 
	 // First Name
	 final String randomFirst = RandomStringUtils.randomNumeric(4);
	 WebElement firstnamme = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
	 String randomfirstname = ("Van"+randomFirst);
	 firstnamme.sendKeys(randomfirstname);
	 System.out.println("First Name is: " + randomfirstname);
	 
	 //Middle Name
	 final String randomMiddle = RandomStringUtils.randomAlphabetic(4);
	 WebElement secondName = driver.findElement(By.xpath("//*[@id=\"middlename\"]"));
	 secondName.sendKeys(randomMiddle);
	 System.out.println("Middle Name is: " + randomMiddle);
	 
	 //Last Name
	 final String randomLast = RandomStringUtils.randomNumeric(4);
	 WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
	 String randomname = ("Vu" + randomLast);
	 lastname.sendKeys(randomname);
	 System.out.println("Last Name is: " + randomname + "\n");
	 
	 //Email
	 final String randomemail = RandomStringUtils.randomAlphabetic(10);
	 WebElement addresemail = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
	 String randomeaddresemail = randomemail+"@gmail.com";
	 addresemail.sendKeys(randomeaddresemail);
	 //Print
	 String fullname = "Hello, " + "Van" + randomFirst + " " + randomMiddle + " " +"Vu" + randomLast + "!";
	 System.out.println(fullname);
	 System.out.println("Email is: "+randomemail+"@gmail.com" + "=>" + "Mark" + "\n");
	 
	 //Password
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("FDWuixcnioa3*@dshaa2");
	 //Confirm password
	 driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("FDWuixcnioa3*@dshaa2");
	 //CheckBox
	 driver.findElement(By.xpath("//*[@id=\"is_subscribed\"]")).click();
	 //Register
	 driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button")).click();

	 System.out.println("== Register Success! Continue to check Infomations" + "\n");
	 
	 //Check full name
	 String checkFull = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[2]/p[1]/strong")).getText();
	 String checkFullName = checkFull;
	 String checkafterlogin = fullname;
	 Assert.assertEquals(checkafterlogin, checkFullName);
	 System.out.println(checkafterlogin);
	 System.out.println("==Checked Full Name PASSED==" + "\n");
	 
	 //Check
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/a")).click();
	 
	//Check First Name
	 String checkFirstName = driver.findElement(By.xpath("//*[@id=\"firstname\"]")).getAttribute("value");
	 String firstNameAfterRegister = checkFirstName;
	 String firstNameBeforeRegister = randomfirstname;
	 Assert.assertEquals(firstNameBeforeRegister, firstNameAfterRegister);
	 System.out.println(firstNameBeforeRegister);
	 System.out.println("==Checked First Name PASSED==" + "\n");
	 
	//Check Middle Name
	 String checkMiddleName = driver.findElement(By.xpath("//*[@id=\"middlename\"]")).getAttribute("value");
	 String middleNameAfterRegister = checkMiddleName;
	 String middleNameBeforeRegister = randomMiddle;
	 Assert.assertEquals(middleNameBeforeRegister, middleNameAfterRegister);
	 System.out.println(middleNameBeforeRegister);
	 System.out.println("==Checked Middle Name PASSED==" + "\n");
 
	 //Check LastName
	 String checkLastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]")).getAttribute("value");
	 String lastNameAfterRegister = checkLastName;
	 String lastNameBeforeRegister = randomname;
	 Assert.assertEquals(lastNameBeforeRegister, lastNameAfterRegister);
	 System.out.println(lastNameBeforeRegister);
	 System.out.println("==Checked Last Name PASSED==" + "\n");
	 
	//Check Email
	 String checkEmail = driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("value");
	 String emailafterRegister = checkEmail;
	 String firstnameAfterRegister = randomeaddresemail;
	 Assert.assertEquals(firstnameAfterRegister, emailafterRegister);
	 System.out.println(randomeaddresemail);
	 System.out.println("==Checked Email PASSED==" + "\n");
	 
	 //Return My Account section and print
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[1]/a")).click();
	 String getRegisterResult = driver.getTitle();
	 String registerSuccess = "My Account";
	 Assert.assertEquals(getRegisterResult, registerSuccess);
	 System.out.println("==Compeleted Register==" + "\n");
	 
	 //Check Log out
	 driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a")).click();
	 driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[5]/a")).click();
	 WebDriverWait wait = new WebDriverWait(driver, 7);
	 wait.until(ExpectedConditions.titleContains("Home page"));
	 String logOutCheck = driver.getTitle();
	 String tittleLogut = "Home page";
	 Assert.assertEquals(logOutCheck, tittleLogut);
	 System.out.println("==Checked Log Out!!!  Completed==");
	 
	}
}


