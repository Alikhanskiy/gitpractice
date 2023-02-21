package com.java.class06;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Please input an username : ");
        String username = sc.next();
        System.out.println("Please enter a password : ");
        String password = sc.next();
        boolean login = true;
        login = username.equalsIgnoreCase("best@devx.com") && password.equalsIgnoreCase("Fall2022");
        System.out.println(login);*/
        //==
        //!=
        //needs to be used with caution when using for Strings
        //you cqn use ==,!= when only working with constant values
        //when you are taking the values from user ==,!= do not work
        //like want it to.
        //for Strings the best way to compare is to use .equals()
        //every String variable has .equals(), .equalsIgnorecase()
        //equalsIgnorecase() --> a method that compares two strings
        //it will return true regardless of the cases.
        // ex: Ali.equalsIgnoreCase("aLI") --> returns true
        System.out.println("HomeWork-Credit landing program");
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your credit score 0-820 : ");
        int creditscore = sc.nextInt();
        System.out.println("Please enter your marital status: (married/single)");
        String maritalStatus = sc.next();
        boolean Approved = age >= 25 && creditscore >= 700 && maritalStatus.equalsIgnoreCase("married");
        System.out.println(Approved);

    }
}
