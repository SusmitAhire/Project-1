package TestNGbasics;

import org.testng.annotations.Test;

public class Introduction {
	
	
	@Test
	public void openUrl() {
		System.out.println("Url is opened");
	}
	
	@Test
	public void login() {
		System.out.println("Logged in to the website");
	}
	
	@Test
	public void logout() {
		System.out.println("Logged out from the website");
	}
	

}
