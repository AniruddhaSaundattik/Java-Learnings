package org.example.ds.patterns.twopointer;

/**
 * Input: [-2, -1, 0, 2, 3]
 * Output: [0, 1, 4, 4, 9]
 */
public class SquareASortedArray {

    int[] calculateASquaredArray(int[] inputArray) {
        int[] result = new int[inputArray.length];
        int leftPointer = 0;
        int rightPointer = inputArray.length - 1;
        int i = inputArray.length -1;

        while (leftPointer <= rightPointer) {
            int leftSqr = inputArray[leftPointer] * inputArray[leftPointer];
            int rightSqr = inputArray[rightPointer] * inputArray[rightPointer];
            if(leftSqr > rightSqr) {
                result[i--] = leftSqr;
                leftPointer++;
            } else {
                result[i--] = rightSqr;
                rightPointer--;
            }
        }
        return result;
    }
}
