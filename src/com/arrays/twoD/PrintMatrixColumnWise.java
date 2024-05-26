package com.arrays.twoD;

public class PrintMatrixColumnWise {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;


        System.out.println("Print matrix row wise:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Print matrix column wise:");
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }


        System.out.println("Print matrix row wise:");
        for(int i = 0; i < rows2; i++) {
            for(int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Print matrix column wise:");
        for(int i = 0; i < cols2; i++) {
            for(int j = 0; j < rows2; j++) {
                System.out.print(matrix2[j][i] + " ");
            }
            System.out.println();
        }

    }
}
