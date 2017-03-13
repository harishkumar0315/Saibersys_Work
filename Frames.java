package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies(); //To delete all the cookies whenever we are executing the script
		
		driver.navigate().to("http://only-testing-blog.blogspot.in/2015/01/iframe1.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='text1']")).sendKeys("Texas");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath(".//*[@id='post-body-3107268830657760720']/div[1]/table/tbody/tr[2]/td[2]/input")).click();  
		
		driver.switchTo().defaultContent(); // To come out of the current frame 
		Thread.sleep(3000);
		driver.switchTo().frame("frame2");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='check3']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); // To come out of the current frame
		driver.findElement(By.xpath(".//*[@id='text2']")).sendKeys("USA");
						
		
	}

}
