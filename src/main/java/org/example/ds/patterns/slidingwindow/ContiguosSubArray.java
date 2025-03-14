package org.example.ds.patterns.slidingwindow;

/**
 * Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
 *
 * Example 1:
 *
 * Input: [2, 1, 5, 1, 3, 2], k=3
 * Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3].
 * Example 2:
 *
 * Input: [2, 3, 4, 1, 5], k=2
 * Output: 7
 * Explanation: Subarray with maximum sum is [3, 4].
 */
class ContiguosSubArray {

    public static void main(String[] args) {
        ContiguosSubArray contiguosSubArray = new ContiguosSubArray();
        contiguosSubArray.subArrayMaxSum(new int[]{2, 1, 5, 1, 3, 2}, 3);
    }
    public int subArrayMaxSum(int[] arr, int k) {
        if(arr.length < k) {
            return 0;
        }

        int maxSum = 0;
        for(int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int windowSum = maxSum;

        for(int i = k; i < (arr.length); i++) {
            windowSum = windowSum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }

        return maxSum;
    }
}
