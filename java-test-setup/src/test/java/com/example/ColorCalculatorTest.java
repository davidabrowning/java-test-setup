package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorCalculatorTest {

    private ColorCalculator testColorCalculator;

    @BeforeEach
    void setup() {
        testColorCalculator = new ColorCalculator();
    }

    @Test
    void twoReturnsBlue() {
        assertEquals("Blue", testColorCalculator.findRhyme(2));
    }

    @Test
    void threeReturnsGreen() {
        assertEquals("Green", testColorCalculator.findRhyme(3));
    }
    
}
