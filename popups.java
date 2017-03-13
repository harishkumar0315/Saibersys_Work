package Training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HarishKumar/Desktop/Text1.html"); 
		
		driver.findElement(By.xpath("html/body/form/input")).click(); //xpath of click me button
		
		Alert a = driver.switchTo().alert(); //alert we use for pop-ups in Selenium
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		a.sendKeys("Harish");
		
		a.accept(); // accept = OK, dismiss= cancel
		
		Thread.sleep(5000);
			
	}

}
