package testcases2;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class AppBeforeAfterMethod {
	
	
	@BeforeMethod
	public void beforeTest() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void AfterTest() {
		System.out.println("After Method");
	}
	
	@Test(priority=1)
	public void LoginTest() {
		
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void PasswordChange() {
		
		System.out.println("Changing Password");
}
	@Test(priority=3)
	public void LogoutTest() {
		
		System.out.println("Logout");
	}
}
	


