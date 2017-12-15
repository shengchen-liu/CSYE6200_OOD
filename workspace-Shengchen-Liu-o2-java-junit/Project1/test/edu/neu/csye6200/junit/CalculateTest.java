package edu.neu.csye6200.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {
// all classes inherit form object
// how to use a class without instantiating a class: static
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("setUpAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(" tearDown ");
	}

	@Test
	public void testAdd() {
		Calculate calc = new Calculate();
		int a = 9;
		int b = 3;
		int expected = a+b;
		int actual = calc.add(a, b);
		// junit assertion
		assertEquals(expected, actual);

	}

	@Test
	public void testSub() {
		Calculate calc = new Calculate();
		int a = 9;
		int b = 3;
		int expected = a-b;
		int actual = calc.sub(a, b);
		assertEquals(expected, actual);

	}

	@Test
	public void testDivide() {
		Calculate calc = new Calculate();
		int a = 9;
		int b = 3;
		int expected = a/b;
		int actual = calc.divide(a, b);
		assertEquals(expected, actual);

	}

	@Test
	public void testMulti() {
		Calculate calc = new Calculate();
		int a = 9;
		int b = 3;
		int expected = a*b;
		int actual = calc.multi(a, b);
		assertEquals(expected, actual);

	}

}
