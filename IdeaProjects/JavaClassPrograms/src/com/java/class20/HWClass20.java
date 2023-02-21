package com.java.class20;

import java.util.Scanner;

public class HWClass20 {
    public static void main(String[] args) {
        //HomeWork
        /*1. Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
        2. Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
        Note - Please print the sum in decimal, answer should not be zero
        3. Write a program to print the sum of each digit from the given number
        Example1
        Input - 3521
        Output - 11
        Example2
        Input - 5390
        Output - 17
        4.  Write a program to print the greatest digit from the given number
        Example1
        Input - 86545
        Output - Greatest digit is 8
        Example2
        Input - 23561
        Output - Greatest digit is 6
        5.  Write a program to print the reverse of the given number
                Example1
        Input - 86545
        Output - 54568
        Example2
        Input - 23561
        Output - 16532*/
        int sum = 0;
        for (int i = 1;i <= 5;i++) {
            sum = sum + (int)Math.pow(i,i);
        }
        System.out.println(sum);
        System.out.println("2====================");
        double sum2 = 0;
        for (double j = 1;j <= 10;j++) {
            sum2 = sum2 + j/(j+1);
        }
        System.out.println(sum2);
        System.out.println("3====================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        int sum3 = 0;
        while (num > 0) {
            sum3+= num % 10;
           num = num/10;
        }
        System.out.println(sum3);
        System.out.println("4====================");
        System.out.println("Please enter a number:");
        int num2 = sc.nextInt();
        int max = 0;
        while (num2 > 0) {
            int k = num2 % 10;
            if (k > max) {
                max = k;
            }
            num2=num2/10;
        }
        System.out.println("The greatest number from given number is : "+ max);
        System.out.println("5========================");
        System.out.println("Please enter a number");
        int num3 = sc.nextInt();
        int rev;
        while (num3 > 0) {
            rev = num3 % 10;
            num3/=10;
            System.out.print(rev);
        }
    }
}
