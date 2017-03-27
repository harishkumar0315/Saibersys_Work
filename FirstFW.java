package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstFW {
	
	@Test(enabled = false)
	
	public void loginform(){
		
        System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.molinahealthcare.com/en-US/Pages/home.aspx");
		/*driver.findElement(By.cssSelector("#email")).sendKeys("jdhsjdhsjhd");
		driver.findElement(By.cssSelector("#pass")).sendKeys("shdjshj");
		driver.findElement(By.cssSelector("#u_0_t")).submit();*/
		driver.findElement(By.xpath(".//*[@id='ctl00_headerUC_txtKeywords']")).sendKeys("sjfhsdjfhjsd");
		driver.findElement(By.xpath(".//*[@id='ctl00_headerUC_btnSubmit']")).click();
		driver.get("http://www.molinahealthcare.com/members/common/Search/results.aspx?k=Searchsjfhsdjfhjsd");
		driver.getWindowHandles().iterator().next();
	     System.out.println(driver.findElement(By.xpath(".//*[@id='TopFilters_MessageREF_g_97784756_c766_426b_9c5d_8c42b5b75816_']/li/span")).getText());
		
		
	}
	
	@Test(enabled = false)
	
	public void weblinks(){
        System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.molinahealthcare.com/en-US/Pages/home.aspx");
		System.out.println(driver.getPageSource());
		List<WebElement> elemnt =driver.findElements(By.xpath(".//*[@id='s4-bodyContainer']/div/div[5]/div[2]/div[1]"));
		System.out.println(elemnt.size());
		System.out.println("empty");
		
		
		
	}
	
	@BeforeMethod
	
	public void heading(){
		
		System.out.println("Directing to Facebook Automation");
	}

	@Test
	public void frames(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://fantasycricket.dream11.com/IN/");
		
		//File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);		
		
		
	}
	
	
}
