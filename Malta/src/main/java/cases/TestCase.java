package cases;

import core.TestCaseFramework;
import io.appium.java_client.android.AndroidDriver;

public class TestCase extends TestCaseFramework{

	public TestCase(String CaseName, String Path) {
		super(CaseName, Path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeTest() {
		// TODO Auto-generated method stub
		try
		{
			AndroidDriver androidDriver= getAndroidDriver();
		}
		catch (Exception e) {
			// TODO: handle exception
			testFailed(e);
		}
			return testStatus();
	}

}
