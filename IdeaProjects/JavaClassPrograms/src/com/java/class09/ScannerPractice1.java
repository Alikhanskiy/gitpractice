package com.java.class09;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender? M or F");
        String gender = sc.next();
        //charAt(0) method takes the first character of
        //a String
       char genderInCharDataType = gender.charAt(0);
        System.out.println(genderInCharDataType);
        System.out.println("What is your Tesla Model?");
        char teslaModel = sc.next().charAt(0);
        System.out.println(teslaModel);
    }
}
