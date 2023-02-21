package com.java.class06;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //nextInt(),nextLine()-> threy are all methods
        //all methods return a result.
        //before we ask for user input we should tell the user
        //what type of info we want from them
        System.out.println("Please enter your age and hit enter");
        int age = input.nextInt();
        System.out.println("Your age is:" + age);
        System.out.println("Please enter your credit score between 0-820");
        int creditScore = input.nextInt();
        System.out.println("Your credit score is: " + creditScore);
        //ask a user their marital status
        //married,single
        //true, false
        System.out.println("What's your marital status?");
        String maritalStatus = input.next();
        System.out.println("Your marital status is : " + maritalStatus);


    }
}
