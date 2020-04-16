package com.shekhar.TestNG;
import org.testng.annotations.*;
public class TestDay1 {
	
	@Test(groups={"smoke"})
	public void WebLoginPersonal()
	{
		System.out.println("WebLoginPersonal");
	}
	@Test
	public void MobileLoginPersonal()
	{
		System.out.println("MobileLoginPersonal");
	}
	@Parameters({"URL","Username","Password"})
	@Test
	public void APILoginPersonal(String ur , String usname,String pw)
	{
		System.out.println("APILoginPersonal");
		System.out.println("URL "+ur +" Username "+usname+" Password "+pw);
	}
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Clean up data");
	}

}