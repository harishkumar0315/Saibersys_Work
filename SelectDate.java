package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.redbus.in/");
driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click();
driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
//driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[8]/td[2]")).click();

	}

}
