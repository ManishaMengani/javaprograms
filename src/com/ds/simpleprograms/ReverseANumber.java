package com.ds.simpleprograms;

public class ReverseANumber {

    public static void main(String[] args) {

        int number = 123456;
        System.out.println(reverseNumber(number));

    }

    public static int reverseNumber(int number) {

        int ans = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            ans = ans * 10 + remainder;
        }
        return ans;
    }




}
