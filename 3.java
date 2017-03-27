package all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PracDay3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:/Users/IEDriverServer.exe");
				
		WebDriver test= new InternetExplorerDriver();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		test.get("http://google.com");
		test.get("http://gmail.com");
		test.navigate().back();
		test.navigate().forward();
		
	}

}
