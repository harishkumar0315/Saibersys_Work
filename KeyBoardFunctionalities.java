package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardFunctionalities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

//Method 1: To enter text and using TAB to go to next line		
/*driver.findElement(By.name("firstname")).sendKeys("Harish");
driver.findElement(By.id("u_0_3")).sendKeys(Keys.TAB);
driver.findElement(By.name("lastname")).sendKeys("Kumar");
driver.findElement(By.id("u_0_5")).sendKeys(Keys.TAB);*/

//Method 2: To enter number text and using delete it using backspace
/*driver.findElement(By.name("firstname")).sendKeys(Keys.NUMPAD5);
Thread.sleep(5000);
driver.findElement(By.name("firstname")).sendKeys(Keys.BACK_SPACE);*/

//Method 3: To enter two words and space between them
/*driver.findElement(By.name("firstname")).sendKeys("Harish");
driver.findElement(By.name("firstname")).sendKeys(Keys.SPACE);
driver.findElement(By.name("firstname")).sendKeys("Kumar");*/

//Method 4: using loop for the month selection from drop down table

for (int i=0;i<11;i++)
{
driver.findElement(By.name("birthday_month")).sendKeys(Keys.ARROW_RIGHT);
if (i==5)
{
	driver.findElement(By.name("birthday_month")).sendKeys(Keys.TAB);
	break;
}
}
for (int i=0; i<31; i++) //Question: Using same variable "i" for both month and day.. how can we use that?
{
driver.findElement(By.name("birthday_day")).sendKeys(Keys.ARROW_DOWN);
if (i==2)
{
	driver.findElement(By.name("birthday_day")).sendKeys(Keys.TAB);	
	break; 
}
}
for (int j=0; j<112; j++)
{
driver.findElement(By.name("birthday_year")).sendKeys(Keys.ARROW_DOWN);
if (j==0)
{
	/*driver.findElement(By.name("birthday_year")).sendKeys(Keys.TAB);	*/
	break; 
}
}	
	
	}

	}


