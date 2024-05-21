package com.ds.max;

public class maxElements {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 8, 3, 15, 9, 5, 1, 10};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
