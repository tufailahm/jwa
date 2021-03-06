package com.training.jwa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
class CalculatorTest2 {
	int expected=0;
	Calculator calc ;
	@BeforeAll		//This will gets called once at the beginning of all the tests
	static void setUpBeforeClass() throws Exception {
		System.out.println("FIRST.  Hello and welcome to Calculator Test -Mohammad Tufail Ahmed");
	}
	@AfterAll //This will gets called ONCE at the END of all the tests
	static void tearDownAfterClass() throws Exception {
		System.out.println("LAST.    Thanks for using my Calculator Test -Mohammad Tufail Ahmed");
	}
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Testing started");
		expected =20;
		calc = new Calculator();
	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Testing Ended");
		expected =0;
		calc = null;		//it removes the calculator object from memory
	}
	@Test
	@DisplayName("2. Adding two whole numbers ")
	@Order(2)
	void testAddNumbers1() {
		System.out.println("test addd numbers 1 called");
		int actual = calc.addNumbers(10,10);
		assertEquals(expected, actual);	
	}
	@Test
	@DisplayName("1. Adding two whole numbers that are not equal ")
	@Order(1)
	void testAddNumbers2() {
		System.out.println("test addd numbers 2 called");
		int actual = calc.addNumbers(3,17);
		assertEquals(expected, actual);	
	}

	
	@Test
	@DisplayName("4. Checking palidrome for alex ")
	@Order(4)
	void testCheckPalindrome() {
		boolean expected = true;
		boolean actual = calc.checkPalindrome("alex");
		assertNotEquals(expected, actual);	
	}

	
	@Test
	@DisplayName("5. Checking palidrome for izzi ")
	@Order(5)
	void testCheckPalindrome2() {
		boolean expected = true;
		boolean actual = calc.checkPalindrome("izzi");
		assertEquals(expected, actual);	
	}
	
	@Test
	@DisplayName("6. Checking palidrome for 1881 ")
	@Order(6)
	void testCheckPalindrome3() {
		boolean expected = true;
		boolean actual = calc.checkPalindrome("1881");
		assertEquals(expected, actual);	
	}
	
	@Test
	@DisplayName("7. Checking sum for multiple numbers ")
	@Order(7)
	void testAddNumbers9() {
		int expected = 100;
		int actual = calc.addNumbers(10,10,20,30,30);
		assertEquals(expected, actual);	
		actual = calc.addNumbers(50,50);
		assertEquals(expected, actual);	
	}
}














