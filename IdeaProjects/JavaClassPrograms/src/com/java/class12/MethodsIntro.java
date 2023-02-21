package com.java.class12;

import java.util.Scanner;

public class MethodsIntro {
    public static void main(String[] args) {
       double num = calculateTax();
        System.out.println(num);

        double taxAmount = calculateTax2(190000);
        System.out.println(taxAmount);
        //travelto("Bali");
        //travelto("London");
        Scanner sc = new Scanner(System.in);
        System.out.println("Where do you want to travel ? :");
        String destination = sc.next();
        travelto(destination);

        //Methods are predefined logic
        //that can be used to execute through the whole project
    }
    double spentAmount1 = 1000;
    double taxPercent1 = 0.05;
    double total = spentAmount1 + (spentAmount1 * taxPercent1);

    double spentAmount2 = 1000;
    double taxPercent2 = 0.03;
    double total2 = spentAmount2 + (spentAmount2 * taxPercent2);
    //first put an access modifier -> public , protected, default,private
    //second put static
    //return data type
        public static double calculateTax() {

            return 10.0 * 5.0;
        }
        //void methods do not require a return statement.
    public static  void sayHello() {
            int year = 2023;
            double salaryTarget = 130000;
        System.out.println("Hello" + year);
        System.out.println("My target salary is " + salaryTarget);
    }
    //write a function that calculates
    //employees annual tax amount.
    //if the annual salary is less than 100k then tax percent is 10%
    //if more than 15%


    public static double calculateTax2(double annualSalary) {
            if (annualSalary <= 100000) {
                return annualSalary*0.10;
            }
            else {
                return annualSalary*0.15;
            }

    }


    //
    public static void travelto(String destination) {
        System.out.println("I want to travel to " + destination);



    }
    }


