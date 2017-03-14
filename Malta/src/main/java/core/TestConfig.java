package core;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;

public class TestConfig {
	
	private String path;
	private String device,packages,versions,activity,platform,url;
	private File file;
	
	
	public TestConfig(String Case,String Path)
	{
		//System.out.println("Enter the path of the config.xml file");
		//Scanner scanner = new Scanner(System.in);
		//path = scanner.nextLine();
		file = new File(Path);
		if(file.exists())
		{
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			org.w3c.dom.Document document =  builder.parse(file);
			document.getDocumentElement().normalize();
			
			NodeList list =document.getElementsByTagName("desired-capabilities");
			for(int i=0;i<list.getLength();i++)
			{
			org.w3c.dom.Element element = (org.w3c.dom.Element) list.item(i);
			if(element.getElementsByTagName("case").item(0).getTextContent().equalsIgnoreCase(Case))
					{
				try{
			device = element.getElementsByTagName("device").item(0).getTextContent();
			packages = element.getElementsByTagName("packages").item(0).getTextContent();
			versions = element.getElementsByTagName("versions").item(0).getTextContent();
			activity = element.getElementsByTagName("activity").item(0).getTextContent();
			platform = element.getElementsByTagName("platform").item(0).getTextContent();
			url = element.getElementsByTagName("URL").item(0).getTextContent();
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("No configuration found for case:- "+Case);
				}
					}
			}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		else
		{
			System.out.println("No config file found. PLease palce your config.xml in the root folder.");
		}

		
		}


	public String getDevice() {
		return device;
	}


	public String getPackages() {
		return packages;
	}


	public String getVersions() {
		return versions;
	}


	public String getActivity() {
		return activity;
	}


	public String getPlatform() {
		return platform;
	}


	public String getUrl() {
		return url;
	}


	public File getFile() {
		return file;
	}
	}
