package com.homework.beginner;

import com.ds.util.ArrayUtil;

public class SuffixSumHomework {
    public static void main(String[] args) {

        int[] arr = ArrayUtil.getArray();

        for(int eachSum : arr) {
            System.out.print(eachSum + " ");
        }

        System.out.println();

        int[] suffixSum = new int[arr.length];

        suffixSum[arr.length-1] = arr[arr.length-1];  //

        for (int i = arr.length-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i+1] + arr[i];
        }

        for(int eachSum : suffixSum) {
            System.out.print(eachSum + " ");
        }

        // Time Complexity : O(N)
        // Space Complexity : O(N)
    }
}
