package all;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracDay4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");

		WebDriver qa = new FirefoxDriver();
		
		qa.get("https://www.cheapoair.com/");
		
		//qa.findElement(By.xpath(".//*[@id='rtFlight1']")).click();
		
	
		int num=qa.findElements(By.xpath("//input[@type='radio']")).size();
		
		for(int i=0; i<num; i++){
			
		String trip=qa.findElements(By.xpath("//input[@type='radio']")).get(2).getAttribute("value");
		
		if(trip.equals("ONEWAYTRIP")){
			
			
			qa.findElement(By.xpath("//input[@type='radio']")).click();
		}
		
		}
		
		qa.findElement(By.xpath(".//*[@id='ember707']")).sendKeys("Chicago");
		qa.findElement(By.xpath(".//*[@id='ember718']")).sendKeys("Del");
		qa.findElement(By.xpath(".//*[@id='departCalendar_0']")).click();
		qa.findElement(By.xpath(".//*[@id='calendarCompId']/section/div/div[1]/ol/div[28]/li")).click();
		qa.findElement(By.xpath(".//*[@id='arrivalCalendar_0']")).click();
		qa.findElement(By.xpath(".//*[@id='calendarCompId']/section/div/div[1]/ol/div[29]/li")).click();
		Select adoti = new Select(qa.findElement(By.xpath(".//*[@id='ember738']")));
		adoti.selectByIndex(4);
		adoti.selectByIndex(5);
		System.out.println(adoti.equals(adoti));
		
		
		qa.findElement(By.xpath(".//*[@id='ember691']/section/form/input")).click();
	}

}
