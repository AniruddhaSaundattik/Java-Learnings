package org.example.ds.patterns.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSubArrayTest {

    SmallestSubArray smallestSubArray;
    @BeforeEach
    void setUp() {
        smallestSubArray = new SmallestSubArray();
    }

    @Test
    void case1() {
        assertEquals(3, smallestSubArray.smallestSubArrayForAGivenSum(new int[]{3, 4, 1, 1, 6},8));
    }

    @Test
    void case2() {
        assertEquals(1, smallestSubArray.smallestSubArrayForAGivenSum(new int[]{2, 1, 5, 2, 8},7));
    }

    @Test
    void case3() {
        assertEquals(0, smallestSubArray.smallestSubArrayForAGivenSum(new int[]{3, 4, 1, 1, 6},80));
    }

    @Test
    void case4() {
        assertEquals(2, smallestSubArray.smallestSubArrayForAGivenSum(new int[]{2, 1, 5, 2, 3, 2},7));
    }
}