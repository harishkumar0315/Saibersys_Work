package testNgFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotate2 {

	@BeforeSuite
	public void installsoftware()
	
	{
		System.out.println("I am the First");
	}
	
	@AfterSuite
	public void uninstallsoftware()
	{
		System.out.println("I am the Last");
	}
}
