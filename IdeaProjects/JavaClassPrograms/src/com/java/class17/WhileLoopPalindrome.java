package com.java.class17;

import java.util.Scanner;

public class WhileLoopPalindrome {
    public static void main(String[] args) {
        //Write a program to check given number is palindrome or not,
//
//A palindromic number is a number (such as 16461) that remains the same when its digits are reversed

//you can work with String
//54945
//print out if the number is palindrome or not
//Example 1:
//
//Input:  12321
//Output: Palindrome
//
//Example 2:
//
//Input:  843179
//Output: Not Palindrome
        //Scanner sc = new Scanner(System.in);

        String original = "miami";
        int i = original.length()-1;
        String reverse = "";
        while (0 <= i) {
            reverse+= original.charAt(i);
            i--;
            System.out.println(reverse);
        }
        boolean palindrome = true;
        i = 0;
        while (i < original.length()-1) {
            i++;
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not a palindrome!");
        }

        System.out.println("=========================");
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int backUp = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        if (backUp == rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

