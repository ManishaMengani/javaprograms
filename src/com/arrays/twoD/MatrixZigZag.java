package com.arrays.twoD;

public class MatrixZigZag {
    public static void main(String[] args) {
        int[][] matrix3x3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix4x4 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printZigZag(matrix3x3);
        printZigZag(matrix4x4);
    }

    public static void printZigZag(int[][] matrix) {
        System.out.println("Print matrix");

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Print matrix in zig zag way");
        for(int i=0; i<matrix.length; i++){
            if(i%2==0){
                for(int j=0; j<matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for(int j=matrix[i].length -1; j>=0; j--){
                    System.out.print(matrix[i][j] +" ");
                }
            }
            System.out.println();
        }
    }
}
