package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS--dbConnection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT--createUser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--launchBrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM--login");
	}
	
	@Test
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	
	@Test
	public void addToCartPageTest() {
		System.out.println("addToCartPageTest");
	}
	
	@Test
	public void paymentPageTest() {
		System.out.println("paymentPageTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--closeBrowser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT--deleteUser");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS--disconnectDB");
	}
	
	/*
	BS--dbConnection
	BT--createUser
	BC--launchBrowser
		BM--login
			addToCartPageTest
		AM--logout
		
		BM--login
			homePageTest
		AM--logout
		
		BM--login
			paymentPageTest
		AM--logout
	AC--closeBrowser
	AT--deleteUser
	AS--disconnectDB
	
	PASSED: addToCartPageTest
	PASSED: homePageTest
	PASSED: paymentPageTest
	*/
	
	
	
	
	
	
	

}
