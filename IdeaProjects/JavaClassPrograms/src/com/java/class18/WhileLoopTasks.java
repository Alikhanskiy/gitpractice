package com.java.class18;

import java.util.Scanner;

public class WhileLoopTasks {
    public static void main(String[] args) {
        //numbers divisible by 3 , 1-20
        Scanner sc = new Scanner(System.in);
        int n =1;
        while(n<=20) {
            if (n%3==0) {
                System.out.println(n);
            }
            n++;
        }
        System.out.println("========================");
        //number that divisible by 3 & 5 between 1-50;
        int num = 1;
        while (num <= 50) {
            if (num%3==0 || num % 5 ==0) {
                System.out.println(num);
            }
            num++;
        }
        //factorial 5!=5*4*3*2*1--120
       //Scanner sc = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Please enter the number:");
        int num1 = sc.nextInt();
        long factorial = num1;
        int i = 1;
        while (i < num1) {
            num1--;
            factorial=factorial*num1;
            System.out.println(factorial);
        }


        System.out.println("====================");
        //6 by the power of 8-index

        System.out.println("Please enter the base number:");
        int base = sc.nextInt();
        System.out.println("Please enter the power number:");
        int power = sc.nextInt();
        int result = 1;
        int i1 = 1;
        while (power>=i1) {
            i1++;
            result=result*base;

            System.out.println(result);
        }

    }
}
