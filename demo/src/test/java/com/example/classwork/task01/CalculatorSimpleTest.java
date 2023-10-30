package com.example.classwork.task01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CalculatorSimpleTest {

	@Test
	public void testCalculatorIntegration() {

		Logger logger = new Logger();

		CalculatorSimple calculator = new CalculatorSimple(logger);

		calculator.add(5, 3);
		calculator.subtract(10, 4);

		List<String> logs = logger.getLogs();

		assertEquals(2, logs.size());
		assertEquals("Addition: 5 + 3 = 8", logs.get(0));
		assertEquals("Substraction: 10 - 4 = 6", logs.get(1));
	}
}
