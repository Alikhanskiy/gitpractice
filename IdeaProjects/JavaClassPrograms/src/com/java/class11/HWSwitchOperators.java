package com.java.class11;

import java.util.Scanner;

public class HWSwitchOperators {
    public static void main(String[] args) {
        /*String PLUS = "+";
        String MINUS = "-";
        String MULTIPLY = "*";
        String DIVIDE = "/";*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        double n1 = sc.nextDouble();
        System.out.println("Please enter the operator : ");
        String operator = sc.next();
        System.out.println("Please enter the second number : ");
        double n2 = sc.nextDouble();
        switch (operator) {
            case "+":
                System.out.println("The result is : " + (n1 + n2));
                break;
            case "-":
                System.out.println("The result is : " + (n1 - n2));
                break;
            case "*":
                System.out.println("The result is : " + (n1 * n2));
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("Division by zero is not allowed!");
                } else {
                    System.out.println("The result is : " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Wrong entry");
        }

    }
}

