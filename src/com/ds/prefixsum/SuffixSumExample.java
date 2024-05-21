package com.ds.prefixsum;

import com.ds.util.ArrayUtil;

public class SuffixSumExample {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] suffixSum = new int[arr.length];

        suffixSum[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) {
            suffixSum[i] = suffixSum[i+1] + arr[i];
        }

        ArrayUtil.printArray(arr);
        ArrayUtil.printArray(suffixSum);
    }
}
