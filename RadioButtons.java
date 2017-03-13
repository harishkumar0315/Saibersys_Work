package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

//Method 1: Directly by inspecting Element
//driver.findElement(By.xpath(".//*[@id='u_0_k']")).click();

//Method 2: Displayed -> Enabled -> Selected -> click
WebElement female = driver.findElement(By.xpath(".//*[@id='u_0_k']"));
boolean status = female.isDisplayed();
System.out.println("female radio button is displayed>>" +status);

boolean enabledstatus = female.isEnabled();
System.out.println("female radio button is enabled>>" +enabledstatus);

boolean selectedstatus = female.isSelected();
System.out.println("female radio button is selected>>" +selectedstatus);

female.click();
boolean selected_status_new = female.isSelected();
System.out.println("female radio button is selected>>" +selected_status_new);

/*//Method 3: Find elements and storing is list and check which is selected
java.util.List<WebElement> list = driver.findElements(By.name("sex"));

//Create a boolean variable to store true/false
boolean is_selected = list.get(0).isSelected();

if (is_selected == true)
{
	list.get(1).click();
}
else
{
	list.get(0).click();
}*/
	}

}
