package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestHello {

	@BeforeClass
	public static void beforeTheClass() {
		System.out.println("before the class");
	}
	@Test
	public void test1() {
		System.out.println("Hello Test");
	}
	@Test
	public void test2() {
		System.out.println("Hello Test Once Again");
	}
	@Before
	public void beforeMethod() {
		System.out.println("Before any Test method is executed");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After every Test method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	

}
