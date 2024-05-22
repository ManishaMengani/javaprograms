package com.bitmanipulations;

public class NoOfTrailingZeros {
    public static void main(String[] args) {
        System.out.println(1<<0); // 1
        System.out.println(1<<1); //2
        System.out.println(1<<2); //4
        System.out.println(1<<3); //8

        int number = 8;
        int count = 0;

        while((number & 1<<count) == 0) {
            count++;
        }
        System.out.println( "No of trailing zeros : "+ count);


        /**
         *  Also observe the difference between n and n-1 in the binary form:
         *  ((n&n-1)^(n)) -> nth bit is set ...
         *
         */

        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(8-1));

        System.out.println(Integer.toBinaryString(88));
        System.out.println(Integer.toBinaryString(88-1));

        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(7-1));


    }




}
