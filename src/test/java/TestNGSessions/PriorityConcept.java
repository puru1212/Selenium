package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {

	
	
	@Test
	public void a_test() {
		System.out.println("a test");
	}
	
	@Test
	public void b_test() {
		System.out.println("b test");
	}

	@Test (priority = 1)
	public void c_test() {
		System.out.println("c test");
	}

	@Test
	public void d_test() {
		System.out.println("d test");
	}

	@Test(priority = 4)
	public void e_test() {
		System.out.println("e test");
	}
}
