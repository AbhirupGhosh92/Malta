package core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidAppDriver {
	
	private AndroidDriver androidDriver;
	private MyDesiredCapabilities capabilities;
	
	public AndroidAppDriver (String Case,String Path)
	
	{
		capabilities = new MyDesiredCapabilities(Case,Path);
		
		try {
			androidDriver = new AndroidDriver(new URL("http://"+capabilities.getUrl()+"/wd/hub"),capabilities.getDesiredCapabilities());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public AndroidDriver getAndroidDriver()
	{
		return androidDriver;
	}
}
