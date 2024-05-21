package com.ds.prefixsum;

import com.ds.util.ArrayUtil;

public class PrefixSumExample {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] psum = new int[arr.length];

        psum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i-1] + arr[i];
        }

        ArrayUtil.printArray(arr);
        ArrayUtil.printArray(psum);
    }
}
