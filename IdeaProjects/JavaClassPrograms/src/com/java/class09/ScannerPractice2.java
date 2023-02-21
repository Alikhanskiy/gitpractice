package com.java.class09;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your gender? M or F");
        char genderInChar = input.next().charAt(0);
        if (genderInChar == 'M' || genderInChar == 'm') {
            System.out.println("Go work hard");
        }
        else if (genderInChar == 'F'|| genderInChar == 'f') {
            System.out.println("Enjoy your life");
        }
        else {
            System.out.println("Wrong entry!");
        }
    }
}
