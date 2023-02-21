package com.java.class08;

public class ElseIF {
    public static void main(String[] args) {
        boolean hasLicense = true;
        int speed = 80;
        //one if statement is like one use case,one scenario from your users(application)
        //as soos as you get a true if or else if statement you execute that if statement
        //and jump out of the whole else if group.
        if (hasLicense && speed < 80) {
            System.out.println("Have a safe journey!");
        }
        else if (hasLicense && speed >= 80) {
            System.out.println("Here is your speeding ticket");
        }
        else if (!hasLicense && speed < 80) {
            System.out.println("We have to tow your car");
        }
        else if (!hasLicense && speed >= 80) {
            System.out.println("You must appear in the court");
        }
        else {
            System.out.println("Buy a car");
        }
        //the coding standard is:
        //usually the pairs go as if one or more else ifs
        //else
    }
}
