package org.example.ds.patterns.twopointer;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] res = findPairForGivenSum(new int[]{1,2,3,4,5,6},6);
        for(int i: res ) {
            System.out.println(i);
        }
    }

    static int[] findPairForGivenSum(int[] arr, int sum) {
        int pointerStart = 0;
        int pointerEnd = arr.length -1;
        int targetSum;
        while(pointerStart<pointerEnd) {
            targetSum = arr[pointerStart] + arr[pointerEnd];
            if(sum == targetSum) {
                return new int[]{pointerStart,pointerEnd};
            } else if(targetSum>sum) {
                pointerEnd--;
            } else {
                pointerStart++;
            }
        }
        return new int[]{};
    }
}