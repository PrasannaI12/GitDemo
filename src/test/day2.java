package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void Demo3()
	{
		System.out.println("Good");
		System.out.println("Bad");
	}
	
	@Test(groups= {"Smoke"})
	public void Demo4()
	{
		System.out.println("Appium");
		System.out.println("Selenium");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("First execution PL");
	}
}
