package com.ds.simpleprograms;

public class printA2DArray {
    public static void main(String[] args) {
       int[][] arr = {{1,2}, {3,4}, {5,6}};
       // int[][] arr1 = new int[][] {{1,2}, {3,4}, {5,6}};

        for(int i = 0; i<arr.length; i++){
           for(int j = 0; j<arr[i].length; j++){
               System.out.print(arr[i][j]+" ");
           }
       }
        System.out.println();
        for(int i = arr.length-1; i>=0; i--){
            for(int j = arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
        }



    }
}
