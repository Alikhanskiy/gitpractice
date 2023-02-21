package com.java.class19;

import java.util.Scanner;

public class HWForLoop {
    public static void main(String[] args) {
       /* 1. Write a program to print the sum of even numbers from 1 to 10
        2. Write a program to count the number of divisors of the given numbers
        For example - Number 6 has 4 divisors & 12 has 6 divisors
        3. Write a program to find a magic number from 1 to 100,
        if you divide that number by 5 you will get remainder 4
        if you divide that number by 4 you will get remainder 3
        if you divide that number by 3 you will get remainder 2
        if you divide that number by 2 you will get remainder 1
        4.  Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
        5.  Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
        6.  Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2*/ /*(edited)*/
        //1
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);

            System.out.println("2====================");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number:");
            int num = sc.nextInt();
            int i1;
            int numOfDivs = 0;
            for (i1 = 1; i1 <= num; i1++) {
                if (num % i1 == 0) {
                    numOfDivs++;
                }
            }
            System.out.println(num + " has " + numOfDivs + " divisors");
        System.out.println("3====================");
        for (int i = 1;i <= 100; i++) {
            if (i % 5==4 && i % 4==3 && i % 3==2 && i % 2==1) {
                System.out.println("Magic number/s : "+ i);
            }
        }
        System.out.println("4============================");
        int sum2 = 0;
        for (int i = 1; i <= 10;i++) {
            if (i % 3 == 0) {
                sum2 = sum2 -i;
            }
            else {
                sum2 = sum2 +i;
            }
        }
        System.out.println("The sum is : " + sum2);
        System.out.println("5========================");
        int sum3 = 0;
        for (int i = 1;i <= 5;i++ ){
            sum3 = sum3 + i;
        }
        for (int j = 10;j >= 6;j--) {
            sum3 = sum3 + j;
        }
        System.out.println(sum3);
            System.out.println("6==============================");
            int sum = 0;
            for (int i2 = 1; i2 <= 5; i2++) {
                sum = sum + (i2 * i2);
            }
            System.out.println(sum);
        }
    }


