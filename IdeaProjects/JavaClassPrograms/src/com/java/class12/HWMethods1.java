package com.java.class12;

import java.util.Scanner;

public class HWMethods1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in meters/centimeters : ");
        double heightM = input.nextDouble();
        String answer = heightInInches(heightM);
        System.out.println(answer);


        System.out.println("Please enter your height in meters/centimeters \nThe answer will be only in inches):");
        double height = input.nextDouble();
        System.out.println((onlyinches(height)) + " inches");
    }
    public static String heightInInches (double c) {
        double answerInch = c * 39.37;//only in inches
        double restInches = answerInch % 12;//rest inches after feet
        int feet = (int) ((answerInch - restInches)/12);
        String height = (feet + " feet and " + restInches + " inches ");
        return height;
        }
        public static double onlyinches (double i) {
        double inches = i * 39.37;
                return inches;
        }
    }


