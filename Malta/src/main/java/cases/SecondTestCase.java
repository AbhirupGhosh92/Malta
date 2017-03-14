package cases;

import core.TestCaseFramework;
import io.appium.java_client.android.AndroidDriver;

public class SecondTestCase extends TestCaseFramework{

	public SecondTestCase(String Case,String Path) {
		super(Case,Path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeTest() {
		// TODO Auto-generated method stub
		try{
			AndroidDriver androidDriver = getAndroidDriver();
		}
		catch (Exception e) {
			// TODO: handle exception
			testFailed(e);
		}
			return testStatus();
	}

}
