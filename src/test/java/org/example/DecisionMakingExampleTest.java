package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecisionMakingExampleTest {

    private static DecisionMakingExample decisionMakingExample;

    @BeforeAll
    static void setup() {
        decisionMakingExample = new DecisionMakingExample();
    }
    @Test
    void isGreaterThanFifteen() {
        assertFalse(decisionMakingExample.isGreaterThanFifteen(10));
        assertTrue(decisionMakingExample.isGreaterThanFifteen(20));
        assertFalse(decisionMakingExample.isGreaterThanFifteen(15));
    }

    @Test
    void doubleTheInputIfInRangeOf5to10() {
        assertEquals(10, decisionMakingExample.doubleTheInputIfInRangeOf5to10(5));
        assertEquals(20, decisionMakingExample.doubleTheInputIfInRangeOf5to10(10));
    }

    @Test
    void invalidInputToDoubleThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> decisionMakingExample.doubleTheInputIfInRangeOf5to10(4), "Invalid input");
    }
}