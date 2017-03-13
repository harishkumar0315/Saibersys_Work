package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://www.ironspider.ca/forms/checkradio.htm");		
	
JavascriptExecutor javascript = (JavascriptExecutor) driver;
//By using the page pixel dimensions
//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

//By using the locators of the page
//WebElement element = driver.findElement(By.linkText("control name"));
//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

//WebElement element = driver.findElement(By.linkText("control name"));
//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

//To go to bottom of the page
//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

//To find the height of a button in a website
WebElement button = driver.findElement(By.xpath(".//*[@id='MenuOther']/div[2]/center/div[1]/a"));
int buttonheight = button.getSize().getHeight();
System.out.println("button height Is "+buttonheight+" pixels");

//To find the height of a button in a website
int buttonwidth = button.getSize().getWidth();
System.out.println("button width Is "+buttonwidth+" pixels");

//To print both the height and width in same line
System.out.println("button height Is "+buttonheight+" pixels" +"button width Is "+buttonwidth+" pixels");

	}

}
