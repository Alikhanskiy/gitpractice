package com.java.class23;

import java.util.Scanner;

public class LengthOfArray {
    public static void main(String[] args) {
        int listOfNum[] = new int[10];

        listOfNum[0] = 10;
        listOfNum[1] = 20;
        listOfNum[2] = 30;
        System.out.println(listOfNum.length);//length starts from 1
        //index we start from 0
        for (int i =0;i<listOfNum.length;i++) {
            System.out.println(listOfNum[i]);
        }

        String listOfNames[] = new String [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 String :");
        for (int i = 0;i < listOfNames.length;i++) {
            listOfNames[i] = sc.next();
        }
        for (int i =0; i<listOfNames.length;i++) {
            System.out.println(listOfNames[i]+ "=" + listOfNames[i].length());
        }
    }
}
