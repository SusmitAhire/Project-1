package TestAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Open the browser");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the browser");
		
	}	
	@Test
	public void m1() {
		System.out.println("Method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("Method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("Method m3");
	}	

}
