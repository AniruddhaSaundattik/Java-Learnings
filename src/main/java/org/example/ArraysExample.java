package org.example;

public class ArraysExample {

    public int sumOfGivenArray(int[] arr) {
        int result = 0;
        for (int val: arr) {
            result += val;
        }
        return result;
    }

    public int sumOfMultiDimensionalArray(int[][] multiDimensionalyArray) {
        int result = 0;
        for(int row = 0; row < multiDimensionalyArray.length; row++)  {
            for(int column = 0; column < multiDimensionalyArray[row].length; column++ ) {
                result += multiDimensionalyArray[row][column];
            }
        }
        return result;
    }
}
