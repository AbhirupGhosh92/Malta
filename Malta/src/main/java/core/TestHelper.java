package core;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class TestHelper {
	
public static void disconnectCall(AndroidDriver androidDriver)
	{
		androidDriver.findElement(By.id("com.android.dialer:id/floating_end_call_action_button")).click();
	}
		
public static WebElement findElement(AndroidDriver androidDriver,String elementID)
	{
		WebElement element = null;
		
		try{
			
			element= androidDriver.findElement(By.id(elementID));
			
		}
		catch(Exception e)
		{
			System.out.println("No element found");
			e.printStackTrace();
		}
		
		return element;
	}
	
public static void dialNumber(AndroidDriver driver)
{
	try{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to dial");
	String number = sc.nextLine();
	
	ArrayList<String> dialedNumberArraylist = convertToWords(number);
	
	 for(int i=0;i<number.length();i++)
     {
    	 driver.findElement(By.id("com.android.dialer:id/"+dialedNumberArraylist.get(i))).click();
     }
	 
	 driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
	
public static ArrayList<String> convertToWords(String string)
	
	{
		
		ArrayList<String> arrayList = new ArrayList();
		for(int i =0;i<string.length();i++)
		{
			int temp = Integer.parseInt(String.valueOf(string.charAt(i)));
			switch(temp)
					{
						case 0:
						{
							arrayList.add("zero");
							break;
						}
						
						case 1:
						{
							arrayList.add("one");
							break;
						}
						
						case 2:
						{
							arrayList.add("two");
							break;
						}
						
						case 3:
						{
							arrayList.add("three");
							break;
						}
						
						case 4:
						{
							arrayList.add("four");
							break;
						}
						
						case 5:
						{
							arrayList.add("five");
							break;
						}
						
						case 6:
						{
							arrayList.add("six");
							break;
						}
						
						case 7:
						{
							arrayList.add("seven");
							break;
						}
						
						case 8:
						{
							arrayList.add("eight");
							break;
						}
						
						case 9:
						{
							arrayList.add("nine");
							break;
						}
						
						default :
							
						{
							break;
						}
					}
		}
		return arrayList;
		
	}

}
