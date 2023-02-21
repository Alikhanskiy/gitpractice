package com.java.class22;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        /*3. Write a program to check given number is palindrome or not
                Example1
        Input - 1221
        Output - Palindrome
        Example2
        Input - 122321
        Output - Not Palindrome*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(rev);
        System.out.println(originalNum);
        if (rev == originalNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
