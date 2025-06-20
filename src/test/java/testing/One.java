package testing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class One {

	@Test()
	public void m1() {
		   
		Reporter.log("M1 is running",false);
	}
	@Test(dependsOnMethods="m1")
	public void m2() {
		Reporter.log("M2 is running",true);
	}
	@Test
	public void m3() {
		Reporter.log("M3 is running",true);
	}
}
