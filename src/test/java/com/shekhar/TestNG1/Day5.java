package com.shekhar.TestNG1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day5 {
	
	@Test(dataProvider="getData")
	public void method51(String uName,String Pw)
	{
		System.out.println("Username "+ uName+" Password "+Pw);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//Passing dataset for login - used in method51
		//Pass credentials of Bank Employees, Bank Users , Bank Management
		Object[][] obj = new Object[3][2];
		//First set
		obj[0][0]="User1";
		obj[0][1]="Pass1";
		//Second set
		obj[1][0]="User2";
		obj[1][1]="Pass2";
				//Third set
		obj[2][0]="User3";
		obj[2][1]="Pass3";
		
		return obj;
	}
	
	

}
