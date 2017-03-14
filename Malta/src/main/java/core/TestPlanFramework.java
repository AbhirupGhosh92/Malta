package core;

import java.util.HashMap;
import java.util.Map;

public abstract class TestPlanFramework {

	protected HashMap<String, String> testReport = new HashMap();
	
	public abstract void execute(String Path); 
	
	protected void addToTestReport(String caseName,String caseStatus)
	{
		testReport.put(caseName, caseStatus);
	}
	
	protected void printTestReport() {
		
		System.out.println("*************TEST REPORT*********************");
		for (Map.Entry<String, String> entry : testReport.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		System.out.println("*********************************************");
	}
}
