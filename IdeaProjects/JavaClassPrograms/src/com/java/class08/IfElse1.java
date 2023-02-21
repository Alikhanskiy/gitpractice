package com.java.class08;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        boolean doesHaveLicence = true;
        Scanner input = new Scanner(System.in);
        //the program checks this if statement first
        if (doesHaveLicence) {
            System.out.println("Have a safe trip!");
        }
        //regardless of the result of thr first if statement
        //the program will come and check this statement as well
        //so the program spends time to check it

        if (!doesHaveLicence) {
            System.out.println("Here is your ticket");
        }
        //the program will check if statement
        //if it's true it executes the if statement
        //if it's false the program jumps to else and executes the body of else
        if (doesHaveLicence) {
            System.out.println("Have a safe trip!");
        }
        else {
            System.out.println("Here is your ticket!");
        }
        //if the user has a licence and their speed is less than 80m/hr
        boolean haslicense = true;
        int speed = 70;
        if (haslicense && speed < 80) {
            System.out.println("Have a safe journey!");
            System.out.println("Be careful it's snowing today");
        }
        else {
            System.out.println("Give a ticket 2");
            System.out.println("Please obey the rules!");
        }
        System.out.println("Who got more salary?");
        System.out.println("Please enter the Bill Gate's salary : ");
        int Bills = input.nextInt();
        System.out.println("Please enter the Elon Musk's salary : ");
        int Musks = input.nextInt();
        if (Bills > Musks) {
            System.out.println("Bill Gates got more salary!");
        }
        else {
            System.out.println("Elon Musk got more money!");
        }
    }
}
