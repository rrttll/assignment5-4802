package com.CEN4802Cass5.app.my_app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
	int a = 5;
	int b = 10;
	int expectedResult = 15;
	assertEquals(expectedResult, a + b);
    }
}
