package com.ds.util;

public class ArrayUtil {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] getRandomArray() {
        return  new int[]{2, 4, 8, 3, 15, 9, 5, 1, 10};
    }

    public static int[] getArray() {
        return new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
}
