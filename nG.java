package all;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class nG {
	
	@Test(dependsOnMethods="somemetd")
	public void method1(){
		
		System.out.println("http://google.com");
	}
	
	@BeforeTest
	public void method2(){
		
		System.out.println("This is my url");
	}
	
	@BeforeMethod
	public void method3(){
		
		System.out.println("Boys I am first");
	}
	
	@AfterTest
	public void method4(){
		System.out.println("opening browser");
		
	}
	
	@AfterMethod(enabled=false)
	public void method5(){
		System.out.println("Girls you are last");
	}
	
	@Test
	public void somemetd(){
		System.out.println("Google king of Networks");
		
	}

	
}
