package com.ds.simpleprograms;

public class CheckIfAStringIsPalindrome {
    public static void main(String[] args) {
        String input = "alaq";
        boolean flag = true;
        for(int i= 0,j = input.length()-1; i<j ;i++,j--){
            if(input.charAt(i) != input.charAt(j)) {
               flag= false;
                break;
            }
        }
        if(flag) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }

    }

}
