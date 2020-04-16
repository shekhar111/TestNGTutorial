package com.shekhar.TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDay2 {
	
	
	@AfterSuite
	public void AfterSuiteMethod()
	{
		System.out.println("After all tests in testng file");
	}
	@Test
	public void WebLoginBike()
	{
		System.out.println("WebLoginBike--");
	}
	@Test(groups={"smoke"})
	public void MobileLoginBike()
	{
		System.out.println("MobileLoginBike");
	}
	
	@Test(dependsOnMethods={"MobileLoginBike","WebLoginBike"},enabled=false,timeOut=5000)
	public void Mobile_SignIn_Bike()
	{
		System.out.println("MobileSignIn_Bike");
	}
	@Test
	public void APILoginBike()
	{
		System.out.println("APILoginBike");
	}
	@org.testng.annotations.BeforeMethod 
	public void BeforeMethod()
	{
		System.out.println("Before every test within class");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After every test within class");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before any test within class");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("After all test within class");
	}
}
