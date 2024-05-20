package com.ds.simpleprograms;

public class CheckIfAnIntegerIsPalindrome {
    public static void main(String[] args) {
       int input = 1231;
        int reverse = reverse(input);

        System.out.println(input == reverse ? "Palindrome" : "Not a palindrome");
    }

    public static int reverse(int input) {
        int ans = 0;
        while(input > 0 ) {
            int remainder = input % 10;
            input = input/10;

            ans = ans * 10 + remainder;
        }

        return ans;
    }
}
