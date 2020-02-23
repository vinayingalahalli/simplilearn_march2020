package com.demo.logic.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.logic.Logic;

public class LogicTest {

	private static Logic logic;
	
	@BeforeClass
	public static void createObject() {
		logic=new Logic();
	}
	//@Before - executed everytime before any method in class
	//@After - executed everytime after any method in the class
	//@AfterClass - executed only once after all the text methods in the class is executed
	@Test
	public void testIsValidPrimeNumber() {
		//assertEquals(true, logic.isValidPrimeNumber(3));
		assertFalse(logic.isValidPrimeNumber(4));
		//assertNull
	}
	
	@Test
	public void testIsValidPrimeNumberNegative() {
		//assertEquals(true, logic.isValidPrimeNumber(3));
		assertFalse(logic.isValidPrimeNumber(-2));
		//assertNull
	}
}
