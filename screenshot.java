package Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		// command to be used for taking screenshot
		EventFiringWebDriver e = new EventFiringWebDriver(driver);
		
		//to save the screenshot in a file format
		File srcfile = e.getScreenshotAs(OutputType.FILE); 
		
		// destination folder for the screenshot to be saved
		File destinationfile = new File("C:\\Users\\HarishKumar\\Desktop\\Harish.png"); 
		
		// copy the file from source file to destination file
		FileUtils.copyFile(srcfile, destinationfile);
	}

}
