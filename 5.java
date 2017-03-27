package all;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracDay5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/chromedriver.exe");

		WebDriver practice = new ChromeDriver();
		
	/*	String yo = "https://facebook.com/";
		practice.get(yo);
		//practice.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("ileyana d cruz");
		//System.out.println(practice.findElement(By.xpath("//*[@id='u_0_i']")).isSelected());
		//practice.findElement(By.xpath("//*[@id='u_0_i']")).click();
		///System.out.println(practice.findElement(By.xpath("//*[@id='u_0_i']")).isSelected());
		
		System.out.println(practice.findElement(By.xpath("//*[@id='u_0_j']")).isDisplayed());
		practice.findElement(By.partialLinkText("Forgot")).click();
		System.out.println(practice.findElement(By.xpath("//*[@id='u_0_j']")).isDisplayed());
*/
		
		practice.get("https://www.google.com/");
		
		Actions obj = new Actions(practice);
		//obj.keyDown(Keys.SHIFT).moveToElement(practice.findElement(By.xpath("//*[@id='lst-ib']"))).click().sendKeys("nayanathara");
		
		
		//obj.contextClick().build().perform();
		
		practice.findElement(By.xpath("//*[@id='lst-ib']")).click();
		obj.sendKeys(Keys.SHIFT).sendKeys("sahdsahd").build().perform();

		obj.doubleClick().build().perform();
		}

}
