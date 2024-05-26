package com.strings;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String value = "I am a string";

        String[] arr = value.split("\\s"); // Here use \\s if required.
        Stack<String> stack = new Stack<String>();

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            stack.push(arr[i]);
        }

        String reverse = "";
        while(!stack.isEmpty()) {
            reverse =reverse +  stack.pop() + " ";
        }
        System.out.println(reverse);
    }
}
