package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestClass extends BaseTest {
	
	@Test(priority = 1)
	public void testcase1() {
		System.out.println("This is testcase1");
	}
	
	@Test(priority = 2)
	public void testcase2() {
		System.out.println("This is testcase2");
	}
	
	@Test(priority = 3)
	public void testcase3() {
		System.out.println("This is testcase3");
	}
	
	@Test(priority = 4)
	public void testcase4() {
		System.out.println("This is testcase4");
	}

}
