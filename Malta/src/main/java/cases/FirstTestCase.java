package cases;

import java.util.ArrayList;
import java.util.Scanner;

import core.AndroidAppDriver;
import core.TestCaseFramework;
import core.TestHelper;
import io.appium.java_client.android.AndroidDriver;

public class FirstTestCase  extends TestCaseFramework{
	
	public FirstTestCase(String Case,String Path) {
		super(Case,Path);
		// TODO Auto-generated constructor stub
	}

	AndroidDriver androidDriver = getAndroidDriver();
	@SuppressWarnings("finally")
	@Override
	public String executeTest() {
		// TODO Auto-generated method stub
		try
		{
		TestHelper.findElement(androidDriver, "com.android.dialer:id/floating_action_button").click();
		TestHelper.dialNumber(androidDriver);
		TestHelper.disconnectCall(androidDriver);
		}
		catch(Exception e)
		{
			System.out.println("Error faced in test case execution");
			
			testFailed(e);
		}
	
			return testStatus();
	}
	
}
