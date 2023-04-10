package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void postrequisite()
	{
		System.out.println("Last execution PL");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello World");
		Assert.assertTrue(false);
	}
	
	@Test
	public void Demo1() 
	{
		System.out.println("Bye");
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("Last execution");
	}
}
