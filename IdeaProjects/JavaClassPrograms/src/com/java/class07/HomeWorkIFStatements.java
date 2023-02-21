package com.java.class07;

import java.util.Scanner;

public class HomeWorkIFStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Homework Java exercises!!!!!!!!!!!!!!!!");
        System.out.println("How many java exercises are you solving per day? : ");
        int exercises = input.nextInt();
        if (exercises < 3) {
            System.out.println("You are too lazy!");
        }
        if (exercises >= 3 && exercises < 5) {
            System.out.println("Good job,but you should do better!");
        }
        if (exercises >= 5) {
            System.out.println("Great job!You are on the right track!");
        }
        System.out.println("Task#2!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Please enter the first positive integer number : ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number : ");
        int num2 = input.nextInt();
        System.out.println("Please enter the third number : ");
        int num3 = input.nextInt();
        int average = (num1 + num2 + num3)/3;
        System.out.println("The average of these numbers is : " + average);
        System.out.println("Task#3!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Welcome to the Alaskan Airlines!" +
                "Are you travelling from connecting flight(true/false OR yes/no)?");
        boolean isConnecting = input.nextBoolean();
        if (isConnecting) {
            System.out.println("Please proceed to security check!");
        }
        if (!isConnecting) {
            System.out.println("Enjoy your flight!");
        }
        /*String isConnecting = input.next();
        if (isConnecting.equalsIgnoreCase("yes")) {
            System.out.println("Please proceed to security check!");
        }
        if (isConnecting.equalsIgnoreCase("no")) {
            System.out.println("Enjoy your flight!");
        }*/

        System.out.println("Who got more salary?");
        System.out.println("Please enter the John's salary : ");
        int Johns = input.nextInt();
        System.out.println("Please enter the Sam's salary : ");
        int Sams = input.nextInt();
        if (Johns > Sams) {
            System.out.println("John got more salary!");
        }
        else
            System.out.println("Sam got more salary!");
        }
    }

