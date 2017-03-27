package all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class PracDay8 {
	@BeforeSuite

		public void Mydriver(){

		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ebay.com/");
		
		
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
	WebElement element=	driver.findElement(By.xpath("html/body/div[4]/div"));
		
		
		for(int i=0; i<driver.findElements(By.tagName("a")).size(); i++){
			
			
			
			System.out.println(element.findElements(By.tagName("a")).get(i).getText());
		}
		
	
	}
}
