package com.java.class09;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = input.nextInt();
        System.out.println("Please enter your salary : ");
        int salary = input.nextInt();
        if (age > 18) {
            if (salary < 5000) {
                System.out.println("Sorry,you need to work hard to get a credit card");
            }
            else if (salary >= 5000 && salary<20000) {
                System.out.println("You are eligible!");
            }
            else  {
                System.out.println("You'll get a free credit card!");
            }
        }
        else {
            System.out.println("Sorry,you are not eligible!");
        }
    }
}
