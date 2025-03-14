package org.example.ds.patterns.slidingwindow;

public class ContiguousSubArrayAverage {
    public static void main(String[] args) {
        double[] input = new double[]{1,3,2,6,-1,4,1,8,2};
        double[] result1 =  findAverageBetterApproach(input,5);
        System.out.println("sliding window : ");
        for (double d: result1) {
            System.out.print(" " + d + " ");
        }
        double[] result2 =  bruteForceAverage(input,5);
        System.out.println("\n brute force: ");
        for (double d: result2) {
            System.out.print(" " + d + " ");
        }
    }

    static double[] bruteForceAverage(double[] input, int size) {
        double[] result = new double[input.length - size + 1];
        for(int i=0; i<= (input.length - size);i++) {
            double sum = 0.0;
            for(int j=i; j<i+size;j++) {
                sum += input[j];
            }
            result[i] = (sum/size);
        }
        return result;
    }
    static double[] findAverage(double[] input, int size) {
        int arrLength = input.length;
        double[] result = new double[arrLength - size + 1];
        double sum = 0.0;
        int windowStart = 0;
        for(int i = 0; i < arrLength; i++) {
            if(i < size) {
                sum += input[i];
            } else {
                if(i == size) {
                    result[windowStart] = (sum/size);
                    windowStart++;
                }
                sum += input[i] -  input[i - size];
                result[windowStart] = (sum/size);
                windowStart++;
            }
        }
        return result;
    }

    static double[] findAverageBetterApproach(double[] input, int size) {
        int arrLength = input.length;
        double[] result = new double[arrLength - size + 1];
        double sum = 0.0;
        int windowStart = 0;
        for(int i = 0; i < arrLength; i++) {
            sum += input[i];
            if(i >= size - 1) {
                result[windowStart] = sum/size;
                sum -=  input[i - size + 1];
                windowStart++;
            }
        }
        return result;
    }
}

