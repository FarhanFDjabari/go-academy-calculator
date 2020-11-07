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

}
