package com.webservice.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Outer Test Group")
public class NestedTestDemo {
	
	@BeforeEach
	public void setUp() {
		System.out.println("--- Before each test ---");
	}
	
	@AfterEach
	public void cleanUp() {
		System.out.println("--- After each test ---");
	}
	
	@Test
	void testOneOuter() {
		System.out.println("-- Test One Outer Completed ");
	}
	
	@Nested
	@DisplayName("Inner Test Group")
	class InnerTest {
		
		@Test
		void testOne() {
			System.out.println("-- Test One Completed ");
		}
		
		@Test
		void testTwo() {
			System.out.println("-- Test Two Completed ");
		}
	}
}	
