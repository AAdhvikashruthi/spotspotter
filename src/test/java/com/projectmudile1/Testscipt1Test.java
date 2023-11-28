package com.projectmudile1;

import org.testng.annotations.Test;

public class Testscipt1Test {
	@Test(groups="smoke")
	public void Ts1test()
	{
		System.out.println("test method is created");
	}
	@Test(groups = "regression")
	public void Ts2test()
	{
		System.out.println(" test2 method is created");
	}

}
