package com.java.class08;

import java.util.Scanner;

public class HomeWorkElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1-7 : ");
        int numOfDay = input.nextInt();
        if (numOfDay == 1) {
            System.out.println("It's Monday");
        }
        else if (numOfDay == 2) {
            System.out.println("It's Tuesday");
        }
        else if (numOfDay == 3) {
            System.out.println("It's Wednesday");
        }
        else if (numOfDay == 4) {
            System.out.println("It's Thursday");
        }
        else if (numOfDay == 5) {
            System.out.println("It's Friday");
        }
        else if (numOfDay == 6) {
            System.out.println("It's Saturday");
        }
        else if (numOfDay == 7) {
            System.out.println("It's Sunday");
        }
        else {
            System.out.println("Error,please enter a number between 1-7");
        }
        System.out.println("Task #2!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Welcome to Trump Tower!");
        System.out.println("Are you staying with us for the first time(true/false) ? ");
        boolean firstTime = input.nextBoolean();
        if (firstTime) {
            System.out.println("Enjoy your stay!");
        }
        else if (!firstTime) {
            System.out.println("Welcome back!You are going to have 10% discount on your stay");
            System.out.println("Enjoy your stay!");
        }
    }
}
