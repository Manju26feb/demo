package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestTestNg9 {

	@Test(priority=1)
	public void test()
	{
		Reporter.log("Hello from 9",true);
	}
}
