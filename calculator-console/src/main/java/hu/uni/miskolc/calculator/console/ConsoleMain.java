package hu.uni.miskolc.calculator.console;

import hu.uni.miskolc.calculator.service.Calculator;
import hu.uni.miskolc.calculator.service.impl.CalculatorImpl;

public class ConsoleMain {

	public static void main(String[] args) {
		Calculator demo = new CalculatorImpl();
		demo.add(5, 86);
		demo.subtraction(53, 32);
		demo.multiplication(5, 42);
		demo.division(56, 8);
	}

}
