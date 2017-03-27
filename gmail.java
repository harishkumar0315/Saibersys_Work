package all;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracDay1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");
		
		WebDriver auto = new FirefoxDriver();
		
	/*auto.get("http://google.com");
	auto.get("http://gmail.com");
	auto.navigate().back();
	auto.navigate().forward();
	auto.navigate().refresh();
	Dimension window = auto.manage().window().getSize();
	
	System.out.println(window);
		*/
		
		auto.get("http://www.seleniumhq.org/projects/webdriver/");
		
		List<WebElement> kia = auto.findElements(By.xpath(".//*[@id='header']"));
		
		System.out.println(kia.size());
		
		for(int i=0; i < kia.size(); i++){
			
			System.out.println(kia.get(i).getAttribute("href"));
		}
		
	}

}
