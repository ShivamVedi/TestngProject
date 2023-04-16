package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
	

	
	//@Test(enabled=false) //This we do for excluding the test for not running,
	@Test(dependsOnMethods="test2")
	public void test1() {
		System.out.println("Inside home loan Test1");
		
	}
	
	@Test(groups = {"sanity", "regression"})	
	public void test2() {
		System.out.println("Inside home loan Test2");
	}
	


}
