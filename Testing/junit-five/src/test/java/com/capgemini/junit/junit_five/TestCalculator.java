package com.capgemini.junit.junit_five;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {
	Calculator c = null;

	@BeforeEach
	void createObject() {
		c = new Calculator();
	}

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int i = c.add(10, 5);
		assertEquals(i, 15);
	}

	@Test
	public void testAddForNegative() {
		Calculator c = new Calculator();
		int i = c.add(-2, 5);
		assertEquals(i, 3);
	}

	@Test
	public void testMultiply() {
		Calculator c = new Calculator();
		int i = c.mul(4, 5);
		assertEquals(i, 20);
	}

	@Test
	public void testMultiplyForNegative() {
		Calculator c = new Calculator();
		int i = c.mul(-4, 5);
		assertEquals(i, -20);
	}

	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		assertThrows(ArithmeticException.class, () -> {
			c.div(10, 0);
		});
	}

	@Test
	void testFindLength() {
		Calculator c = new Calculator();
		int res = c.findLength("Priya");
		assertEquals(5, res);
	}

	@Test
	void testFindLengthForNull() {
		Calculator c = new Calculator();

		assertThrows(NullPointerException.class, () -> {
			c.findLength(null);
		});
	}
}
