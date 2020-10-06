package com.dxc.jenkinsdemo.business;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class CalculatorTest 
{
	Calculator calc=null;
	@Before
	public void setUp() throws Exception
	{
		calc=new Calculator();
	}
	@After
	public void tearDown() throws Exception
	{
		calc=null;
	}
	public void testsum()
	{
		assertEquals(30,calc.sum(10, 20));
	}
	public void testSqr()
	{
		assertEquals(30,calc.square(11));
	}
	public void testPower()
	{
		assertEquals(125,calc.power(5, 3));
	}
	
	public void testDivide()
	{
		assertEquals(30,calc.divide(10, 5));
	}

}
