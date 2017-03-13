package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PassdataWithoutUsingSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		
		RemoteWebDriver r= (RemoteWebDriver) driver;
		String c = "document.getElementById('email').value='admin'";
		r.executeScript(c);
		
	}

}
