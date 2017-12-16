package edu.neu.csye6200.project_FinalExam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int a = 9;
		int b = 3;
		int expected = a+b;
		int actual = calc.add(a, b);
		assertEquals(expected, actual);

	}

	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		int a = 9;
		int b = 3;
		int expected = a-b;
		int actual = calc.sub(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void testMult() {
		Calculator calc = new Calculator();
		int a = 9;
		int b = 3;
		int expected = a*b;
		int actual = calc.mult(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		int a = 9;
		int b = 3;
		int expected = a/b;
		int actual = calc.divide(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void testDemo() {
		fail("Not yet implemented");
	}

}
