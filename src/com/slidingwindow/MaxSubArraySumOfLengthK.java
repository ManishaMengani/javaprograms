package com.slidingwindow;

/**
 * No of subarrays of size K : N-k+1
 *
 * size     1  2  3  4 .. ... ... . .k
 * count    8  7  6  5  .. . .. ... N-k+1
 *
 *
 */
public class MaxSubArraySumOfLengthK {
    public static void main(String[] args) {
        int[] arr = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        int k = 5;
        // First sub array : [0, k-1]

        int sum = 0;
        for (int i = 0; i <k ; i++) {
            sum = sum + arr[i];
        }

        for(int i=1, j= k; j< arr.length; i++, j++) {
            if(sum-arr[i-1]+arr[j] > sum) {
                sum = sum - arr[i-1]+ arr[j];
            }
        }

        System.out.println("Max sub array sum = " + sum);
    }
}
