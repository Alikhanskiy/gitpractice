package com.java.class21;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

   /* 3. Write a program to print the sum of each digit from the given number
    Example1
    Input - 3521
    Output - 11
    Example2
    Input - 5390
    Output - 17*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        System.out.println(sum);
        System.out.println("4=================");
        /*4.  Write a program to print the greatest digit from the given number
        Example1
        Input - 86545
        Output - Greatest digit is 8
        Example2
        Input - 23561
        Output - Greatest digit is 6*/
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        int max = num1 % 10;
        while (num1 > 0) {
            int lastDigit1 = num1 % 10;
            if (lastDigit1 > max) {
                max = lastDigit1;
            }
            num1 = num1 / 10;
        }
        System.out.println(max);
        System.out.println("5===================");
        /*5.  Write a program to print the reverse of the given number
                Example1
        Input - 86545
        Output - 54568
        Example2
        Input - 23561
        Output - 16532*/
        System.out.println("Enter a number:");
        int num2 = sc.nextInt();
        while (num2 > 0) {
            int lastDigit2 = num2 % 10;
            System.out.print(lastDigit2);
            num2 = num2 / 10;
        }
        System.out.println();
        System.out.println("==================");
        System.out.println("Enter a number:");
        int num3 = sc.nextInt();
        int rev = 0;

        while (num3 > 0) {
            int lastDigit3 = num3 % 10;
            rev = rev * 10 + lastDigit3;
            num3 = num3 / 10;
        }
        System.out.println(rev);
    }
}
