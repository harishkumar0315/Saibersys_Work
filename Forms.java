package Training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.yelp.com/signup");
driver.findElement(By.xpath(".//*[@id='super-container']/div[3]/div[1]/div/div/div[1]/div[1]/p[1]/button")).click();

Thread.sleep(5000);
String handle = driver.getWindowHandle();
Set<String> handles = driver.getWindowHandles();

for (String handle1 : driver.getWindowHandles()) {
driver.switchTo().window(handle1);
//driver.manage().window().maximize();
}
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("harish");
driver.findElement(By.id("u_0_2")).click();

driver.switchTo().window(handle);
driver.findElement(By.xpath(".//*[@id='zip']")).sendKeys("12345");

Thread.sleep(5000);
driver.close();
driver.quit();

}
	}


