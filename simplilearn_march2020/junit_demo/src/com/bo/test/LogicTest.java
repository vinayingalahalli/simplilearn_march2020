package com.bo.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bo.Logic;

public class LogicTest {

	private static Logic logic;
	@BeforeClass
	public static void createLogic() {
		logic=new Logic();
	}
	@Test
	public void testIsPrime() {
		boolean b=logic.isPrime(4);
		assertFalse(b);
	}
	@Test
	public void testIsPrimeForNegative() {
//		boolean b=logic.isPrime(4);
//		assertFalse(b);
		assertEquals(false, logic.isPrime(-5));
	}
	
	@Test
	public void testisPan() {
		assertEquals(true, logic.isValidPan("ABCDE1111O"));
	}
	
	@Test
	public void testisPanForNull() {
		assertEquals(false, logic.isValidPan(null));
	}
}
