package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestCase {

    @Test
    void testInitializedWith0() {

        //setup
        Calculator calculator;
        calculator = new Calculator();

        //execution
        int expected=0;
        int actual = calculator.getValue();

        //assertion
        assertEquals(expected, actual);

        //teardown
    }
}

