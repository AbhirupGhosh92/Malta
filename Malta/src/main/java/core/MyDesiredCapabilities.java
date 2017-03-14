package core;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyDesiredCapabilities {

	private DesiredCapabilities capabilities;
	private TestConfig config;
	
	public MyDesiredCapabilities(String Case,String Path)
	{
		capabilities = new DesiredCapabilities();
		config = new TestConfig(Case,Path);
		try{
		capabilities.setCapability("deviceName", config.getDevice());
		capabilities.setCapability(CapabilityType.VERSION, config.getVersions());
		capabilities.setCapability(CapabilityType.PLATFORM, config.getPlatform());
		capabilities.setCapability("androidPackage", config.getPackages());
	    capabilities.setCapability("appActivity", config.getActivity());
		}
		catch(Exception e)
		{
			System.out.println("Configurations not properly defined for case :- "+Case);
			e.printStackTrace();
		}
	}
	
	public DesiredCapabilities getDesiredCapabilities()
	{
		return capabilities;
	}
	
	public String getUrl()
	{
		return config.getUrl();
	}
}
