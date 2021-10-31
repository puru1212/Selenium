package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	
	@Test 
	public void loginTest() {
		System.out.println("login test");
		//int i = 9/0;
	}
	
	@Test (priority =3)
	public void homePageTest() {
		System.out.println("home Page test");
		int i = 8/0;
	
	}
	
	@Test (priority=2)
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test (dependsOnMethods = {"loginTest" , "homePageTest", "searchTest"}, priority=1)
	public void logoutTest() {
		System.out.println("logout test");
	}
}

	//never use dependency for test methods
	//test methods should be independent