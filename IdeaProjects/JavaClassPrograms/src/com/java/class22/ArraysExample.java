package com.java.class22;

import java.util.Arrays;
import java.util.Scanner;
//Array - collection of values of similar type
public class ArraysExample {
    public static void main(String[] args) {
        //Create and initialize an array
        int listOfData[] = {10, 30, 50, 30, 70, 40, 45, 32};
        //Access element from the array
        System.out.println(listOfData[2]);
        System.out.println("===============");
        System.out.println(listOfData.length);
        System.out.println("===============");
        for (int i = 0; i < listOfData.length; i++) {
            System.out.println(listOfData[i]);
        }
        System.out.println(listOfData);//memory location

        System.out.println(Arrays.toString(listOfData));//only for debugging
        System.out.println(listOfData[6]);
        //Declaration of Array

        int data[] = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i =0;i<data.length;i++) {
            data[i] = input.nextInt();
        }
    }
}
