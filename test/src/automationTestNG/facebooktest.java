package automationTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class facebooktest {
	public WebDriver driver;
	
	@Test /*(invocationCount = 10)*/
  
  public <FirefoxProfiles> void main() throws InterruptedException{
	  FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  driver.get("http://www.fb.com");
	  //Email
	  WebElement emailClick = driver.findElement(By.xpath(".//*[@id=\"email\"]"));
	  emailClick.click();
	  emailClick.sendKeys("0935550601");
	  //Password
	  WebElement passwordClick = driver.findElement(By.xpath(".//*[@id=\"pass\"]"));
	  passwordClick.click();
	  passwordClick.sendKeys("zFounders97@!z");
	  //Login button
	  driver.findElement(By.xpath(".//*[@id=\"u_0_2\" or @id=\"u_0_3\" or @id=\"u_0_8\"]")).click();
	  //Check login
	  
	  String checkTitle = driver.getTitle();
	  String checkTitleLogin = "Facebook";
	  Assert.assertEquals(checkTitle, checkTitleLogin);
	  System.out.println("Login Succes!");
	  //Log out
	  
	  WebElement dropbtnLogout = driver.findElement(By.xpath(".//*[@class='_5lxr']//*[@id='logoutMenu']"));
	  dropbtnLogout.click();
	  
	  WebElement logOutbtn = driver.findElement(By.xpath(".//*[@class='_64kz ']//*[@class='_54nh']"));
	  logOutbtn.click();
	  
	  
	  
//	  //Send messages
//	  final String randompost = RandomStringUtils.randomNumeric(10);
//	  String testpost = "Test post "+randompost;
//	  WebElement testne = driver.findElement(By.xpath(".//*[@class='_3en1 _480e navigationFocus']"));
//	  testne.sendKeys(testpost);
//	  WebElement listRadio = driver.findElement(By.className("_1se_"));
//	  boolean radioBtnIsDisplayed = listRadio.isSelected();
//      System.out.println("Default Radio button selection Status: "+radioBtnIsDisplayed);
//      //chooses kind of post
//      WebElement choosespostKind = driver.findElement(By.xpath(".//*[@class='_5dd8 _3-wg']//*[@class='_6a uiPopover']"));
//      choosespostKind.click();
//      //chooses kind
//      WebElement chooseskind = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='_54nf']//*[@class='_54ni _4mwj _4h7j _k_c _k_e _2932 _6419 _54nd __MenuItem']")));
//      chooseskind.click();
//      //Share
//      WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='_6c0o']//*[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")));
//      myDynamicElement.click();
      
//      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      WebElement profilesicon = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='_4kny']//*[@class='_1k67 _cy7']")));
//      profilesicon.click();
//      //assert  
//      WebElement textcheck = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='_5pbx userContent _3ds9 _3576']//*[@class='_5_jv _58jw']")));
//      String checktext = textcheck.getText();
//      do {
//    	  WebElement clicktamptamptamp = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='_6a uiPopover _5pbi _cmw _b1e _1wbl']//*[@class='_4xev _p']")));
//    	  clicktamptamptamp.click();
//          WebElement clickdeletebutton = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='_54ni __MenuItem']//*[text()='Delete']")));
//          clickdeletebutton.click();
//          WebElement deletebutton = (new WebDriverWait (driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='_5lnf uiOverlayFooter _5a8u']//*[@class='_42ft _4jy0 layerConfirm uiOverlayButton _4jy3 _4jy1 selected _51sy']")));
//          deletebutton.click();
//          System.out.println("Delete Done!");
//      }while(checktext != "Test post");
      
      
//      WebElement poststt = driver.findElement(By.xpath(".//*[@class='_5pbx userContent _3ds9 _3576' //*[@class='_5_jv _58jw']"));
//      String checkSTTwall = poststt.getText();
//      String checkSTT = testpost;
//      Assert.assertEquals(checkSTTwall, checkSTT);
//      System.out.println("Get Post STT Success");
          
  	}

}
  
