package com.java.class20;

import java.util.Scanner;

public class DisplayDigit {
    public static void main(String[] args) {
        //Write a program to print each digit in different line of the given number
        //in output in reverse order
        //input - 5435
        //Output
        //5
        //3
        //4
        //5
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();//
        //long num = input.nextLong();
        //int count = 0;
        while (num>0) {
            System.out.print(num%10);
            num = num /10;//remove one digit from number
            //count++;
            //System.out.println(count);
        }

    }
}
