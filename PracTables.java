package WebTables;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracTables {
	
	
	public static void main(String[] args) throws IOException {
		
		PracTables bharat	= new PracTables ();
	
		tablemathod();
		
		bharat.bharath();
		
		
	}
	
	
	public static void tablemathod() throws IOException{
		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.espncricinfo.com/rankings/content/page/211271.html");
		
		WebElement tabs= driver.findElement(By.xpath(".//*[@id='ciHomeContentlhs']/div[2]/div"));
		
		List<WebElement> elements= tabs.findElements(By.tagName("tr"));
		
		System.out.println("Out of table records" + elements.size());
		
		for(int i=0; i<elements.size(); i++){
			
			System.out.println(elements.get(i).getText());
			
			if(i==6){
				
				
				System.out.println("ganthe");
				break;
			}
			
			
		}
			
		File bomma = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(bomma, new File("C:\\Users\\chandu\\Desktop\\PDF\\bomma.png)"));		

		
	}

	public void bharath(){
		
		System.out.println("hey here i am");
		
	}
}
