package hu.uni.miskolc.calculator.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hu.uni.miskolc.calculator.service.Calculator;

public class CalculatorImplTest {

	private Calculator calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new CalculatorImpl();
	}

	@Test
	public void test() {
		final double expected = 8.0;
		final double actual = calc.add(3, 5);
		assertEquals(expected, actual,1e-5);
	}

}
