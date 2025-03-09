package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ArraysExampleTest {

    ArraysExample arraysExample;
    @BeforeEach
    void setUp() {
        arraysExample = new ArraysExample();
    }

    @Test
    void sumOfMultiDimensionalArray() {
        int[][] input = {{10,10},{1,1}};
        assertEquals(22, arraysExample.sumOfMultiDimensionalArray(input) );
    }

    @Test
    void sumOfJaggedArray() {
        int[][] inputJaggedArray = {{10,10},{1}};
        assertEquals(21, arraysExample.sumOfMultiDimensionalArray(inputJaggedArray) );
    }

    @Test
    void sumOfGivenArray() {
        int[] input = IntStream.range(1,10).toArray();
        assertEquals(45,arraysExample.sumOfGivenArray(input));
    }

    @Test
    void sumOfGivenArrayWithRangeClosed() {
        int[] input = IntStream.rangeClosed(1,9).toArray();
        assertEquals(45,arraysExample.sumOfGivenArray(input));
    }
}