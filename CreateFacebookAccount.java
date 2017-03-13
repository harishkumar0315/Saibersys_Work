package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

driver.findElement(By.name("firstname")).sendKeys("Harish");

driver.findElement(By.name("lastname")).sendKeys("Kumar");

driver.findElement(By.name("reg_email__")).sendKeys("1234567890");

Select abc = new Select(driver.findElement(By.id("month")));
abc.selectByVisibleText("Jun");

Select pqr = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
pqr.selectByIndex(20);

Select xyz = new Select(driver.findElement(By.id("year")));
xyz.selectByVisibleText("2010");

driver.findElement(By.xpath(".//*[@id='u_0_f']")).click();

	}

}
