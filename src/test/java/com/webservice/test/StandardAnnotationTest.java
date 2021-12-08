package com.webservice.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Standard Annotation Test ")
public class StandardAnnotationTest {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("--- Before all test ---");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("--- After all test ---");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("--- Before each test ---");
	}
	
	@AfterEach
	public void cleanUp() {
		System.out.println("--- After each test ---");
	}
	
	@Test
	@DisplayName("Test One")
	public void testOne() {
		System.out.println("Test One executed !");
	}
	
	@Test
	@Disabled
	@DisplayName("Test Two")
	public void testTwo() {
		System.out.println("Test Two executed !");
	}
	
	@Test
	@DisplayName("Test Three")
	public void testThree() {
		System.out.println("Test Three executed !");
	}
}
