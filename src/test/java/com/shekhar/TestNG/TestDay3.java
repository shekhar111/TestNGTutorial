package com.shekhar.TestNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDay3 {
	
@Test
public void WebLoginCar()
{
	System.out.println("WebLoginCar");
}
@Parameters({"URL"})
@Test
public void MobileLoginCar(String url)
{
	System.out.println("MobileLoginCar");
	System.out.println("URL "+ url);
}
@Test(groups={"smoke"})
public void APILoginCar()
{
	System.out.println("APILoginCar");
}


}
