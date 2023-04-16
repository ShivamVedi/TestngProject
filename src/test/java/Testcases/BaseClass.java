package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest(alwaysRun = true)
	public void Method3() {
		System.out.println("Inside before test");
	}
	
	//Run all the before all the test case.
	@BeforeMethod(alwaysRun = true)
	public void Method1() {
		System.out.println("Inside before method");
	}
	
	@AfterMethod(alwaysRun = true)
	public void Method2() {
		System.out.println("Afterethod");
	}
	
	@AfterTest(alwaysRun = true)
	public void Method4(){
		System.out.println("Inside after test");
	}
	

}
