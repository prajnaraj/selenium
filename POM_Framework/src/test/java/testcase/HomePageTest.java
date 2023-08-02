package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import pages.HomePage;
public class HomePageTest {
	WebDriver driver;
	HomePage homePage = new HomePage(driver);
  @Test
  public void TC1() 
  {
	  homePage.clickCartButton();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  homePage.LaunchUrl();
  }

  @AfterMethod
  public void afterMethod() 
  {
	 // homePage.closeBrowser();
  }

}
