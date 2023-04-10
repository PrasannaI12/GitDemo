package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String uName)
	{
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uName);
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("Mobileloginhome");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginhome");
	}
	
}
