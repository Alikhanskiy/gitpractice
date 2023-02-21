package com.java.class23;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        //write a program to scan 8 fruits from user
        // (some of them enter duplicates) and print
        //all the duplicate fruits
        //Input
        //Banana,Mango,Apple,Orange,mango,Apple,Kiwi,Apple
        //Output-Duplicates are:Apple,Mango
        String fruits[] = new String[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 8 fruits : ");
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.next().trim();
        }
        System.out.println("Duplicate fruits are : ");
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i+1; j < fruits.length; j++) {
                if (fruits[i].equals(fruits[j])) {
                    System.out.println(fruits[i]);
                    break;
                }
            }
        }
    }
}
