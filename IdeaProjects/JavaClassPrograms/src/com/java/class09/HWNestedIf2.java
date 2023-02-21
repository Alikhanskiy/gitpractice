package com.java.class09;

import java.util.Scanner;

public class HWNestedIf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int creditlimit1 = 10000;
        int creditlimit2 = 20000;
        int creditlimit3 = 50000;
        System.out.println("Please enter your age : ");
        int age = input.nextInt();
        System.out.println("Please enter your salary : ");
        int salary = input.nextInt();
        System.out.println("Please enter the loan amount : ");
        int loanAmount = input.nextInt();
        if (age < 18 || salary < 1000 || loanAmount > 20000) {
            System.out.println("Sorry,not eligible");
        } else {
            if (loanAmount < 5000) {
                if (salary >= 1001 && salary <= 5000) {
                    System.out.println("The Limit is " + creditlimit1);
                } else if (salary >= 5001 && salary <= 10000) {
                    System.out.println("The limit is " + creditlimit2);
                } else {
                    System.out.println("The limit is " + creditlimit3);

                }
            } else if (loanAmount >= 5001 && loanAmount <= 20000) {
                if (salary >= 1001 && salary <= 5000) {
                    System.out.println("Limit is : " + creditlimit1);
                } else if (salary >= 5001 && salary <= 10000) {
                    System.out.println("Limit is : " + (creditlimit2 - loanAmount / 2));
                } else {
                    System.out.println("Limit is : " + (creditlimit3 - loanAmount / 2));
                }
            }
        }
    }
}
