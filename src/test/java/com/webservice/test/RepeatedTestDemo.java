package com.webservice.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {

Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}
	
	@AfterEach
	public void cleanUp() {
		calculator = null;
	}

	@Test
	@DisplayName("Additions Test : +ve values")
	@RepeatedTest(4)
	public void testAdditions1() {
		double expected = 2000.0;
		double actual = calculator.addition(1000, 1000);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Additions Test : -ve values")
	@RepeatedTest(value=3, name="{displayName} - repetition {currentRepetition} of  {totalRepetitions}")
	public void testAdditions2() {
		double expected = -400.0;
		double actual = calculator.addition(-300, -100);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Additions Test : -ve & +v values")
	@RepeatedTest(value=2, name=RepeatedTest.LONG_DISPLAY_NAME)
	public void testAdditions3() {
		double expected = 200.0;
		double actual = calculator.addition(300, -100);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Subtraction Test : +ve values")
	@RepeatedTest(value=2, name=RepeatedTest.SHORT_DISPLAY_NAME)
	public void testSubtraction1() {
		double expected = 200.0;
		double actual = calculator.substraction(300, 100);
		Assertions.assertEquals(expected, actual);
	}
}
