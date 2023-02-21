package com.java.class18;

import com.java.class06.ScannerPractice;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Please enter the second number");
            int num2 = sc.nextInt();
            System.out.println("please enter the operation you want to perform");
            String operation = sc.next();

            switch (operation.toLowerCase()) {
                case "add":
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "sub":
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "mul":
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "div":
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Please enter the valid operation");
            }
            System.out.println("Would you like to do more operations:(Yes / No)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("===========================");
        String st;
        do {
            System.out.println("Please enter the number");
            int num3 = sc.nextInt();
            System.out.println("The square of this number is : "+ num3 * num3);
            System.out.println("Would you like  to do more operations(Yes/No)");
            st = sc.next();
        } while (st.equalsIgnoreCase("yes"));
    }
}
