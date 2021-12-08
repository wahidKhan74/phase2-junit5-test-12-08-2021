package com.webservice.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
	
	@Test
	@DisplayName("Test Run on Window OS")
	@EnabledOnOs({OS.WINDOWS})
	public void testOnWindows() {
		System.out.println("This Test Run only On Winodws OS");
	}
	
	@Test
	@DisplayName("Test Run on Linux OS")
	@EnabledOnOs({OS.LINUX})
	public void testOnLinux() {
		System.out.println("This Test Run only On Linux OS");
	}
	
	@Test
	@DisplayName("Test Run on other than Linux OS")
	@DisabledOnOs({OS.LINUX})
	public void testOtherThanLinux() {
		System.out.println("This Test Run only On Other than Linux OS");
	}
	
	
	@Test
	@DisplayName("Test Run On JRE 1.8")
	@EnabledOnJre(JRE.JAVA_8)
	public void testRunOnJRE8() {
		System.out.println("This test only runs with JRE 1.8");
	}
	
	@Test
	@DisplayName("Test Run On JRE 11")
	@EnabledOnJre(JRE.JAVA_11)
	public void testRunOnJRE11() {
		System.out.println("This test only runs with JRE 11");
	}
	
	@Test
	@DisplayName("Test Run On JRE 11")
	@DisabledOnJre(JRE.JAVA_11)
	public void testRunOnOtherthanJRE11() {
		System.out.println("This test other than runs with JRE 11");
	}
	
//	@Test
//	@DisplayName("Test Run On Random number check")
//	@EnabledIf("true")
//	public void testRunOnRandomNumber() {
//		System.out.println("This may or may not execute.");
//		 Assertions.assertTrue(true);
//	}
}
