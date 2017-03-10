package hu.uni.miskolc.calculator.console;

import hu.uni.miskolc.calculator.service.Calculator;
import hu.uni.miskolc.calculator.service.impl.CalculatorImpl;

public class ConsoleMain {

	public static void main(String[] args) {
		Calculator demo = new CalculatorImpl();
		System.out.println(demo.add(5, 86));
		System.out.println(demo.subtraction(53, 32));
		System.out.println(demo.multiplication(5, 42));
		System.out.println(demo.division(56, 8));
	}
}