package com.java.class22;

import java.util.Scanner;

//write a program to print sum of data stored in the array
public class FindIndexOfNumber {
    public static void main(String[] args) {
        int listOfData[] = {10, 30, 50, 30, 70, 40, 45, 32};
        int targetNumber = 70;
        for (int i = 0; i < listOfData.length; i++) {
            if (listOfData[i] == targetNumber) {
                System.out.println(i);

            }
        }

    }
}
