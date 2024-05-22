package com.ascii;

public class AsciiPlay {

    public static void main(String[] args) {
        int[] arr = {0, 11, 22, 33, 44, 55, 66, 77, 88, 99};

        char a = 'a';
        char b = 'b';
        char c = 'c';
        char number0 = '0';
        char number1 = '1';
        char number2 = '2';
        char number3 = '3';
        char number4 = '4';
        char number5 = '5';
        char number6 = '6';
        char number7 = '7';
        char number8 = '8';
        char number9 = '9';
        System.out.println(number0);
        System.out.println(number1);

        //System.out.println(arr[number0]); //java.lang.ArrayIndexOutOfBoundsException: Index 48 out of bounds for length 10
        System.out.println(arr[number0-'0']);
        System.out.println(arr[number1-'0']);
        System.out.println(arr[number2-'0']);

    }
}
