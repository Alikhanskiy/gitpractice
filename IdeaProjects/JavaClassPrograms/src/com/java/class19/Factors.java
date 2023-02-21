package com.java.class19;

import java.util.Scanner;

//14 factors-1-2-7-14
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        //write a program to find factors
        //of given number
        for (int i =1;i<=num;i++) {
            if (num % i== 0) {
                System.out.println(i);
            }

        }
    }
}
