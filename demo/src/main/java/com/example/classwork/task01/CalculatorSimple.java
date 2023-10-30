package com.example.classwork.task01;

public class CalculatorSimple {
	private Logger logger;

	public CalculatorSimple(Logger logger) {
		this.logger = logger;
	}

	public int add(int a, int b) {
		int result = a + b;
		logger.log("Addition: " + a + " + " + b + " = " + result);
		return result;
	}

	public int subtract(int a, int b) {
		int result = a - b;
		logger.log("Substraction: " + a + " - " + b + " = " + result);
		return result;
	}
}
