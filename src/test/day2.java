package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void Demo3()
	{
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("First execution PL");
	}
}
