package com.farhanfadhilah.goacademycalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void givenCalculatorAppToStringShouldReturnString() {
        App classUnderTest = new App();
        double displayedNumber = classUnderTest.displayedNumber;
        assertEquals(String.valueOf(displayedNumber), classUnderTest.toString());
    }

    @Test
    public void givenCalculatorAppCancelShouldResetToZero() {
        App classUnderTest = new App();
        assertEquals("0.0", classUnderTest.cancel());
    }

    @Test
    public void givenCalculatorAppAddShouldReturnNumber() {
        App classUnderTest = new App();
        double firstNumber = classUnderTest.displayedNumber;
        int secondNumber = 1;
        assertEquals(String.valueOf(firstNumber + secondNumber), classUnderTest.add(firstNumber, secondNumber));
    }

    @Test
    public void givenCalculatorAppSubtractShouldReturnNumber() {
        App classUnderTest = new App();
        double firstNumber = classUnderTest.displayedNumber;
        int secondNumber = 1;
        assertEquals(String.valueOf(firstNumber - secondNumber), classUnderTest.subtract(firstNumber, secondNumber));
    }

    @Test
    public void givenCalculatorAppMultiplyShouldReturnNumber() {
        App classUnderTest = new App();
        double firstNumber = classUnderTest.displayedNumber;
        int secondNumber = 1;
        assertEquals(String.valueOf(firstNumber * secondNumber), classUnderTest.multiply(firstNumber, secondNumber));
    }

    @Test
    public void givenCalculatorAppDivideShouldReturnNumber() {
        App classUnderTest = new App();
        double firstNumber = classUnderTest.displayedNumber;
        int secondNumber = 1;
        assertEquals(String.valueOf(firstNumber / secondNumber), classUnderTest.divide(firstNumber, secondNumber));
    }

    @Test
    public void givenCalculatorAppIsExitShouldReturnTrue() {
        App classUnderTest = new App();
        assertTrue(classUnderTest.isExit());
    }

    @Test
    public void givenCalculatorAppHasInput() {
        App classUnderTest = new App();
        String command = "add";
        int commandNumber = 1;
        assertNotNull("add 1", classUnderTest.calculate(command, commandNumber));
    }

}
