package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://www.mmts.in/timetable.html");

List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='timingsTable']/tbody/tr"));

for (int i=1;i<rows.size();i++)
{

	List<WebElement> columns = driver.findElements(By.xpath(".//*[@id='timingsTable']/tbody/tr["+i+"]/td"));

	for (int j=1;j<columns.size();j++)
	{
		WebElement city = driver.findElement(By.xpath(".//*[@id='timingsTable']/tbody/tr["+i+"]/td["+j+"]"));
		
		if (city.getText().equals("Hyderabad"))
				{
			System.out.println("HL4 value is" +driver.findElement(By.xpath(".//*[@id='timingsTable']/tbody/tr["+i+"]/td[5]")).getText()); 
			
			
				}
	}
}

	}

}
