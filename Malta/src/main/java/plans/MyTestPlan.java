package plans;

import cases.FirstTestCase;
import cases.SecondTestCase;
import core.TestPlanFramework;

public class MyTestPlan extends TestPlanFramework{

	
	//SecondTestCase secondTestCase = new SecondTestCase("dialer");
	
	
	@Override
	public void execute(String Path) {
		// TODO Auto-generated method stub
		try{
			FirstTestCase firstTestCase = new FirstTestCase("dialer",Path);
			addToTestReport(firstTestCase.getClass().getName(), firstTestCase.executeTest());
			SecondTestCase secondTestCase = new SecondTestCase("dialer", Path);
			addToTestReport(secondTestCase.getClass().getName(), secondTestCase.executeTest());
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			printTestReport();
		}
	}

}
