package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	WebDriver driver;
	
  @Test
  public void launchTest() {
	  String Expected = "Google";
	  String Actual = driver.getTitle();
	  Assert.assertEquals(Expected, Actual);
	  
  }
  @BeforeTest
  public void LaunchAppTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Program files\\Selenium\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
  }

  @AfterTest
  public void BrowserCloseTest() {
	  driver.quit();
  }

}
