package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	
	@Test(dataProvider = "inputKeys")
	
	public void loginform(String username, String password){
		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");

		
		WebDriver dd = new FirefoxDriver();
		
		dd.get("https://www.facebook.com/");
		
		WebElement username1 = dd.findElement(By.xpath(".//*[@id='email']"));
		WebElement password1 = dd.findElement(By.xpath(".//*[@id='pass']"));
		username1.sendKeys(username);
		password1.sendKeys(password);
		
	}
	
	@DataProvider
	
	public  Object[][] inputKeys(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0]= "chandu63";
		data[0][1] = "dgdg123";
		data[1][0] ="madhu1211";
		data[1][1]= "cghd12";
		
		return data;
	}
	

}
