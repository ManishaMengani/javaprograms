package com.ds.max;

import com.ds.util.ArrayUtil;

public class leftMax {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 8, 3, 15, 9, 5, 1, 10};
        int[] lmax = new int[arr.length];

        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            lmax[i] = max;
        }

        ArrayUtil.printArray(lmax);
    }


}
