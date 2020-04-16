package com.shekhar.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4 {
	
@Test
public void WebLoginHome()
{
	System.out.println("WebLoginHome");
}
@Test
public void MobileLoginHome()
{
	System.out.println("MobileLoginHome");
}
@Test(groups={"smoke"})
public void APILoginHome()
{
	System.out.println("APILoginHome");
}
@AfterTest
public void AfterTestMethod()
{
	System.out.println("After all tests");
}
@BeforeSuite
public void BeforeSuiteMethod()
{
	System.out.println("Before any test in complete testng file");
}

}
