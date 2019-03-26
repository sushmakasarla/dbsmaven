package com.dbs.training.demoproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dbs.training.demoproject.Calculator;

public class CalculatorTest {

	
	@Test
	public void testAdd()
	{
		Calculator c=new Calculator();
		assertEquals(6,c.add(3,3));
	}
	@Test
	public void testSubtract()
	{
		Calculator c=new Calculator();
		assertEquals(0,c.subtract(3,3));
	}

}
