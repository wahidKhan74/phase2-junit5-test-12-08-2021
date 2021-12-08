package com.webservice.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
	
	String firstname = "John";
	String lastname;
	boolean isMarried = false;
	int age = 35;
	String[] family = {"Mike","David","Marry"};
	int[] numbers = {10,20,30};
	
	@Test
	@DisplayName("Test Assert Equal")
	public void testAssertEqual() {
		assertEquals(firstname, "John");
		assertEquals(age, 35);
		assertEquals(isMarried, false);
		String [] data = {"Mike","David","Rahul"};
		int[] dataInt = {10,20,30};
//		assertArrayEquals(family, data);
		assertArrayEquals(numbers, dataInt);
	}
	
	@Test
	@DisplayName("Test Assert True and False")
	public void testAssertTrueAndFalse(){
		assertEquals(true, true);
		assertTrue(true);
		assertFalse(false);
		
		assertTrue(300>200);
		assertFalse(200>300);
	}
	
	@Test
	@DisplayName("Test Assert Null and Not Null")
	public void testAssertNullNotNull(){ 
		
		assertNull(null);
		assertNull(lastname);
		
		assertNotNull(firstname);
		assertNotNull(family);		
		assertNotNull(age);
	}
}
