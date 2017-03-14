import java.util.Scanner;

import org.openqa.selenium.remote.DesiredCapabilities;

import cases.FirstTestCase;
import core.AndroidAppDriver;
import core.MyDesiredCapabilities;
import core.TestHelper;
import io.appium.java_client.android.AndroidDriver;
import plans.MyTestPlan;
import plans.OtherTestPlan;

public class TestExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			System.out.println("Enter the location of the config.xml file");
			Scanner scanner = new Scanner(System.in);
			String path = scanner.nextLine();
			MyTestPlan myTestPlan = new MyTestPlan();
			myTestPlan.execute(path);
			OtherTestPlan otherTestPlan = new OtherTestPlan();
			otherTestPlan.execute(path);
			
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
	}

}
