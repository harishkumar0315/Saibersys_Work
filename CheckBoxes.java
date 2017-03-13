package Training;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://www.ironspider.ca/forms/checkradio.htm");

//Method 1: Directly by inspecting element and clicking it
driver.findElement(By.xpath(".//*[@id='Content']/div[1]/blockquote[1]/form/input[1]")).click();


//Method2: Find element and store it in a list and select by common name or index
//List<WebElement> CheckBoxList = (List<WebElement>) driver.findElement(By.name("color"));

List<WebElement> CheckBoxList = driver.findElements(By.name("color"));
/*CheckBoxList.get(0);
CheckBoxList.get(1);
*/

for( int i=0;i<4;i++)
{
CheckBoxList.get(i).click();
}

	}

}
