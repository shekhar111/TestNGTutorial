package com.shekhar.TestNG1;

import java.io.FileInputStream;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PropertiesClassParametrization {
	WebDriver driver = null;
	@Test
	public void Login() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("D:\\SeleniumPractice\\TestDocuments\\dataset.properties");
		//FileInputStream fi = new FileInputStream("D:\\Workspace-neon2\\TestNG\\src\\test\\java\\com\\shekhar\\TestNG1\\dataset.properties");
		//Make sure file is of type properties(File type) not as .txt
		prop.load(fi);
		if(prop.getProperty("browser").contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		System.out.println(prop.getProperty("name"));
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	    String browserName = cap.getBrowserName().toLowerCase();
	    System.out.println(browserName);
	    String os = cap.getPlatform().toString();
	    System.out.println(os);
	    String v = cap.getVersion().toString();
	    System.out.println(v);
		
		
	}

}
