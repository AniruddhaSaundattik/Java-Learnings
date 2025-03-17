package org.example.ds.patterns.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareASortedArrayTest {

    SquareASortedArray squareASortedArray;
    @BeforeEach
    void setUp() {
        squareASortedArray = new SquareASortedArray();
    }

    @Test
    void squaredArray() {
        int[] inputArray = new int[] {-2, -1, 0, 2, 3};
        int[] actualArray = squareASortedArray.calculateASquaredArray(inputArray);
        for (int i: actualArray)
            System.out.println(i);
        int[] expectedArray = new int[] {0, 1, 4, 4, 9};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void squaredArray2() {
        int[] inputArray = new int[] {-3, -1, 0, 1, 2};
        int[] expectedArray = new int[] {0, 1, 4, 4, 9};
        assertArrayEquals(expectedArray, squareASortedArray.calculateASquaredArray(inputArray));
    }
}