package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WebLoginCarLoan(String urlName,String key)
	{
		System.out.println("weblogincar");
		System.out.println(urlName);
		System.out.println(key);
	}
	
	@Test(dataProvider="getData")
	public void MobileLoginCarLoan(String username,String password)
	{
		System.out.println("Mobilelogincar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("Execution before each method in day 3");
	}
	
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("Execution after each method in day 3");
	}
	
	@BeforeClass
	public void BfClass()
	{
		System.out.println("Execution before any method in the class");
	}
	
	@AfterClass
	public void AfClass()
	{
		System.out.println("Execution after any method in the class");
	}
	
	@Test(enabled=false)
	public void MobileSignInCarLoan()
	{
		System.out.println("Mobile SIGNIN");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileSignOutCarLoan()
	{
		System.out.println("Mobile SIGNOUT");
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan","MobileSignOutCarLoan"})
	public void APICarLoan()
	{
		System.out.println("APIlogincar");
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("First execution");
	}	
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination= good credit history(usrname&pass)
		//2nd combination= no credit history(usrname&pass)
		//3rd combination= fraudulent history
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0]="username1";
		data[0][1]="password1";
		//columns in the row are nothing but values for that particular row
		//2nd set
		data[1][0]="username2";
		data[1][1]="password2";
		//3rd set
		data[2][0]="username3";
		data[2][1]="password3";
		return data;
	}
	
}
