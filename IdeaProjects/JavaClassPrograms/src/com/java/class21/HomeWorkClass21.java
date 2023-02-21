package com.java.class21;

import java.util.Scanner;

public class HomeWorkClass21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*1. Write a program to count the number of vowels from the String (Ignoring Case)
        Example
        Input - Welcome to Java Class
        Output - Num of vowels=7*/
        System.out.println("Please enter a String:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int count = 0;
        for (int i =0; i< str.length();i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                count++;
            }
        }
        System.out.println("Vowel numbers : " +count);
       /* 2. Write a program to print reverse of the given String
        Example
        Input - Wedevx
        Output - xvedeW*/
        System.out.println("2=====================");
        System.out.println("Please enter a String :");
        String str2 = sc.nextLine();
        int j = str2.length();
        while (0 < j) {
            j--;
            System.out.print(str2.charAt(j));
        }
        System.out.println();

        System.out.println("3====================");
        /*3. Write a program to check given number is palindrome or not
                Example1
        Input - 1221
        Output - Palindrome
        Example2
        Input - 122321
        Output - Not Palindrome
        */
        System.out.println("Please enter a number :");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        while (num>0) {
            int lastDigit=num%10;
             reverse = reverse*10 + lastDigit;
            num/=10;
        }
        if ( original == reverse) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
