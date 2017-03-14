package plans;

import cases.TestCase;
import core.TestPlanFramework;

public class OtherTestPlan extends TestPlanFramework{

	@Override
	public void execute(String Path) {
		// TODO Auto-generated method stub
		TestCase testCase = new TestCase(this.getClass().getName(), Path);
		addToTestReport(testCase.getClass().getName(), testCase.executeTest());
	}

}
