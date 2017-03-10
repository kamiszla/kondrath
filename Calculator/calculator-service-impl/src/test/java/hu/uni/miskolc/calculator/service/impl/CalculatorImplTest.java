package hu.uni.miskolc.calculator.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hu.uni.miskolc.calculator.service.Calculator;
import hu.uni.miskolc.calculator.service.ZeroDivisonException;

public class CalculatorImplTest {

	private Calculator calc;

	@Before
	public void setUp() throws Exception {
		calc = new CalculatorImpl();
	}

	@Test
	public void test1() {
		final double expected = 8.0;
		final double actual = calc.add(3, 5);
		assertEquals(expected, actual, 1e-5);
	}

	@Test
	public void test2() {
		final double expected = 36.0;
		final double actual = calc.multiplication(12, 3);
		assertEquals(expected, actual, 1e-5);
	}

	@Test
	public void test3() throws ZeroDivisonException {
		final double expected = 6.0;
		final double actual = calc.division(42, 7);
		assertEquals(expected, actual, 1e-5);
	}

	@Test
	public void test4() {
		final double expected = -113.0;
		final double actual = calc.subtraction(7, 120);
		assertEquals(expected, actual, 1e-5);
	}

	@Test
	public void test5() {
		final double expected = 70.0;
		final double actual = calc.add(25, 45);
		assertEquals(expected, actual, 1e-5);
	}

	@Test(expected=ZeroDivisonException.class)
	public void test6() throws ZeroDivisonException {

		final double actual = calc.division(45, 0);
	}

	@Test
	public void test7() {
		final double expected = -330.0;
		final double actual = calc.multiplication(33, -10);
		assertEquals(expected, actual, 1e-5);
	}

	@Test
	public void test8() {
		final double expected = -1120350.0;
		final double actual = calc.multiplication(1120350, -1);
		assertEquals(expected, actual, 1e-5);
	}

	@Test
	public void test9() {
		final double expected = -2.0;
		final double actual = calc.subtraction(220, 222);
		assertEquals(expected, actual, 1e-5);
	}
}
