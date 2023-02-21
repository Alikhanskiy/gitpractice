package com.java.class12;

import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {
        //option1
        //goTo("Thailand");
        //goTo("England");
        Scanner sc = new Scanner(System.in);
        System.out.println("Where do you want to go ?");
        String country = sc.next();
        goTo(country);


    }
    public static void goTo(String country) {

        System.out.println("I want to go to  " + country);
    }
}
