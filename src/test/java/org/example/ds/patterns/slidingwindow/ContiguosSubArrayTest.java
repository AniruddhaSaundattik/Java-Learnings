package org.example.ds.patterns.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContiguosSubArrayTest {

    ContiguosSubArray contiguosSubArray;
    @BeforeEach
    void Setup() {
        contiguosSubArray = new ContiguosSubArray();
    }
    @Test
    void subArrayMaxSum() {
        assertEquals(9, contiguosSubArray.subArrayMaxSum(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }

    @Test
    void case2() {
        assertEquals(7, contiguosSubArray.subArrayMaxSum(new int[]{2, 3, 4, 1, 5}, 2));
    }

    @Test
    void case3() {
        assertEquals(0, contiguosSubArray.subArrayMaxSum(new int[]{2, 1, 5, 1, 3, 2}, 10));
    }

    @Test
    void case4() {
        assertEquals(0, contiguosSubArray.subArrayMaxSum(new int[]{}, 3));
    }

    @Test
    void case5() {
        assertEquals(8, contiguosSubArray.subArrayMaxSum(new int[]{2, 1, 5}, 3));
    }

    @Test
    void case6() {
        assertEquals(0, contiguosSubArray.subArrayMaxSum(new int[]{}, 0));
    }
}