package all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pracday10 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("545f454hhfh");
		driver.findElement(By.cssSelector("#u_0_t")).submit();
		
		WebElement element = driver.findElement(By.xpath("//input[@id='pass']"));
		
		
		
			
		
		
		
	}

}
