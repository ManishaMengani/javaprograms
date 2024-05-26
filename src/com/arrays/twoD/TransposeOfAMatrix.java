package com.arrays.twoD;

/**
 * In place transpose of a matrix:
 *
 *   00 01 02
 *   10 11 12
 *   20 21 22
 *
 *    1 2 3
 *    4 5 6
 *    7 8 9
 *
 */
public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(matrix[j][i]);
            }
        }

    }
}
