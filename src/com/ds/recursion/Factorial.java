package com.ds.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if(n == 0) return 1; // Base case

        return n * factorial(n - 1); // recursive case
    }
}
