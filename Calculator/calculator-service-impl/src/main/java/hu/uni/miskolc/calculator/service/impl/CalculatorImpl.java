package hu.uni.miskolc.calculator.service.impl;

import hu.uni.miskolc.calculator.service.Calculator;

public class CalculatorImpl implements Calculator {

	public double add(double a, double b) {		
		return a+b;
	}

	public double subtraction(double a, double b) {
		return a-b;
	}

	public double multiplication(double a, double b) {
		return a*b;
	}

	public double division(double a, double b) {
		return a / (double)b;
	}

}