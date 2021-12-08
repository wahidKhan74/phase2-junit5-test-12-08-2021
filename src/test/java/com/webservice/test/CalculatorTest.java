package com.webservice.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
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
	public void testAdditions1() {
		double expected = 2000.0;
		double actual = calculator.addition(1000, 1000);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Additions Test : -ve values")
	public void testAdditions2() {
		double expected = -400.0;
		double actual = calculator.addition(-300, -100);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Additions Test : -ve & +v values")
	public void testAdditions3() {
		double expected = 200.0;
		double actual = calculator.addition(300, -100);
		Assertions.assertEquals(expected, actual);
	}
	
	// sub method should always take positive value.
	@Test
	@DisplayName("Subtraction Test : +ve values")
	public void testSubtraction1() {
		double expected = 200.0;
		double actual = calculator.substraction(300, 100);
		Assertions.assertEquals(expected, actual);
	}
	
	// lower value to higher value subtraction return zero
	@Test
	@DisplayName("Subtraction Test : +ve values")
	public void testSubtraction2() {
		double expected = 0.0;
		double actual = calculator.substraction(100, 300);
		Assertions.assertEquals(expected, actual);
	}
	
	// first -ve value second -ve value then return zero.
	@Test
	@DisplayName("Subtraction Test : -ve values")
	public void testSubtraction3() {
		double expected = 0.0;
		double actual = calculator.substraction(-100, -300);
		Assertions.assertEquals(expected, actual);
	}
}
