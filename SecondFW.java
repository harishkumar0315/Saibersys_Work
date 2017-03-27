package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SecondFW {

	
	
	@Test
	public void waits(){
		
System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		driver.findElement(By.xpath(".//*[@id='organization']/div/div[1]")).click();
		
		//WebElement path = driver.findElement(By.xpath(".//*[@id='email']"));
		//WebDriverWait wait = new WebDriverWait(driver, 5);

		//wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='email']"), cha));
		
		
		
		
	}
	
	
	
}
