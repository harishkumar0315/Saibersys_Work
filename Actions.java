package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public Actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.in/");
driver.manage().window().maximize();
Thread.sleep(5000);
WebElement MainMenu = driver.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a"));
WebElement SubMenu = driver.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/div[2]/div[1]/ul[2]/li[1]/a"));
Actions action = new Actions(driver);

action.moveToElement(MainMenu).build().perform();
Thread.sleep(5000);

action.moveToElement(SubMenu).click().perform();



		
	}

}
