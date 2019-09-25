package p1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver bo;
String bpath="http://apps.qaplanet.in/qahrm/login.php";
	
  @Test
  
  public void tc1()
  {
	   bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1"); 
	   bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	   bo.findElement(By.xpath("//input[@name='Submit']")).click();
	 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\QA26\\Downloads\\geckodriver.exe");
	  bo=new FirefoxDriver();
	  bo.get(bpath);
 
  }

  
 

}
