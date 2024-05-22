package com.homework.beginner;

import com.ds.util.ArrayUtil;

public class PrefixSumHomework {

    public static void main(String[] args) {
        /**
         * Find prefix sum of the given array
         */
        int[] arr = ArrayUtil.getArray();

        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }

        for(int eachsum : prefixSum){
            System.out.println(eachsum);
        }

        // TimeComplexity : O(N)
        // spaceComplexity: 0(N)
    }
}
