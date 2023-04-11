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
		System.out.println("postJira");
		System.out.println("postJira1");
		System.out.println("postJira2");
		System.out.println("postJira3");
	}
	
	@Test
	public void Demo2() 
	{
		System.out.println("Bye");
		System.out.println("postJira4");
		System.out.println("postJira5");
		System.out.println("postJira6");
		System.out.println("postJira7");
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("Last execution");
	}
}
