package core;

import io.appium.java_client.android.AndroidDriver;

public abstract class TestCaseFramework{

	private AndroidDriver androidDriver;
	private boolean testFailed = false;
	private String testStatus = "success";
	private String statusReport;
	public TestCaseFramework(String Case,String Path)
	{
		androidDriver = new AndroidAppDriver(Case,Path).getAndroidDriver();
	}
	
	protected AndroidDriver getAndroidDriver()
	{
		return androidDriver;
	}
	
	public abstract String executeTest() ;
	
	protected void testFailed(Exception e) {
		StringBuilder stringBuilder = new StringBuilder();
		testFailed = true;
		stringBuilder.append(e.getMessage()+"\n");
		for(int i=0;i<e.getStackTrace().length;i++)
		{
			stringBuilder.append(e.getStackTrace()[i].toString()+"\n");
		}
		testStatus = "failed due to \n<<<<"+stringBuilder+"\n>>>>";
	}
	
	protected String testStatus()
	{
		androidDriver.quit();
		return testStatus;
	}
}
