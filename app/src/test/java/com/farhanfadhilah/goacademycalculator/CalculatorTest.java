package com.farhanfadhilah.goacademycalculator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    App classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new App();
    }

    @Test
    public void givenCalculatorAppToStringShouldReturnString() {
        classUnderTest.displayedNumber = 1.0;
        assertEquals("1.0", classUnderTest.toString());
    }

    @Test
    public void givenCalculatorAppCancelShouldResetToZero() {
        classUnderTest.displayedNumber = 10.0;
        classUnderTest.cancel();
        assertEquals("0.0", classUnderTest.toString());
    }

    @Test
    public void givenCalculatorAppAddShouldReturnNumber() {
        classUnderTest.displayedNumber = 1.0;
        classUnderTest.add(2);
        assertEquals("3.0", classUnderTest.toString());
    }

    @Test
    public void givenCalculatorAppSubtractShouldReturnNumber() {
        classUnderTest.displayedNumber = 1.0;
        classUnderTest.subtract(1);
        assertEquals("0.0", classUnderTest.toString());
    }

    @Test
    public void givenCalculatorAppMultiplyShouldReturnNumber() {
        classUnderTest.displayedNumber = 2.0;
        classUnderTest.multiply(2);
        assertEquals("4.0", classUnderTest.toString());
    }

    @Test
    public void givenCalculatorAppDivideShouldReturnNumber() {
        classUnderTest.divide(2);
        assertEquals("0.0", classUnderTest.toString());
    }

    @Test
    public void givenCalculatorAppDivideByZeroShouldReturnZero() {
        classUnderTest.divide(0);
        assertEquals("0.0", classUnderTest.toString());
    }

    @Test
    public void givenCalculatorAppIsExitShouldReturnTrue() {
        classUnderTest.isExit = false;
        assertTrue(classUnderTest.isExit());
    }

}
