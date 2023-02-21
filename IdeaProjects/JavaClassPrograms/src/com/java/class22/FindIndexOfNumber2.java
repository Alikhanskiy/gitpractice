package com.java.class22;

import java.util.Scanner;

public class FindIndexOfNumber2 {
    public static void main(String[] args) {


        int listOfData[] = new int[8];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 8 numbers");
        for (int i =0;i<listOfData.length;i++) {
            listOfData[i] = input.nextInt();
        }
        System.out.println("Please enter target number");
        int targetNumber = input.nextInt();
        for (int i =0;i<listOfData.length;i++) {
            if (listOfData[i] == targetNumber) {
                System.out.println(i);
        }
    }
        System.out.println("=====================");
        int sum = 0;
        for (int i =0;i<listOfData.length;i++) {
            sum+=listOfData[i];
        }
        System.out.println(sum);
}
}

