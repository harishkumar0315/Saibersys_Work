package Training;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public WebDriver driver = null;
  @Test
  public void f() {
	  
	  
	WebElement harish = driver.findElement(By.id("email"));
	  harish.sendKeys("abc");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	 
  }

}
