package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	
	String name = "testing";
	
	@Test (expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void homePageTest() {
		System.out.println("home Page test");
		//int i = 8/0;
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj.name = null;
		System.out.println(obj.name);
		
}
}
