package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringExamplesTest {

    private static StringExamples stringExamples;
    @BeforeAll
    static void setUp() {
        stringExamples = new StringExamples();
    }

    @Test
    void reverseInputString() {
        assertEquals("cba", stringExamples.reverseInputString("abc"));
    }

    @Test
    void returnNullIfInputIsNull() {
        assertNull(null, stringExamples.reverseInputString(null));
    }

    @Test
    void returnEmptyStringIfInputIsBlankOrEmpty() {
        assertEquals("", stringExamples.reverseInputString("     "));
        assertEquals("", stringExamples.reverseInputString(""));
    }
}