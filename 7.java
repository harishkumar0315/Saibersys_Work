package all;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PracDay7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");

     WebDriver act = new FirefoxDriver();
     
     act.get("http://www.ysu.edu/penguin-portal");
     System.out.println("Before swithicng"+act.getTitle());

     act.findElement(By.xpath(".//*[@id='main-content']/div/div[2]/div/div/div[2]/div/ul/li[3]/div/div[2]/div/a")).click();
     System.out.println("after swithicng"+act.getTitle());

    // act.get("https://my.ysu.edu/cp/home/displaylogin");
    
 /*   Set<String> ids =act.getWindowHandles();
    
   Iterator<String> infront= ids.iterator();
   
   String modatidi =infront.next();
    
   String rendodi = infront.next();
   act.switchTo().window(rendodi);
   System.out.println("After swithicng"+act.getTitle());

   
   act.findElement(By.xpath(".//*[@id='user']")).sendKeys("djsbfhdfb");
   act.findElement(By.xpath(".//*[@id='pass']")).sendKeys("5454");
 */

    /* Actions obj = new Actions(act);
     
    WebElement element = act.findElement(By.xpath(".//*[@id='gs_htif0']"));
     
     //obj.moveToElement(act.findElement(By.xpath(".//*[@id='nav-main']/ul/li[2]/a"))).build().perform();


    obj.keyDown(Keys.SHIFT).moveToElement(element).sendKeys("nayanathara").build().perform();*/
     
    // act.switchTo().window(arg0)
     
     
	}

}
