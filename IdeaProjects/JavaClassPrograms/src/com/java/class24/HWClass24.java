package com.java.class24;

import java.util.Scanner;

public class HWClass24 {
    public static void main(String[] args) {
        /*1. Write a program to get two 2D arrays from the user and print the sum of it
        Input:
        Array 1
        1 1 1
        2 2 2
        3 3 3
        Array 2
        4 4 4
        2 2 2
        1 1 1
        Output:
        5 5 5
        4 4 4
        4 4 4*/
        Scanner sc = new Scanner(System.in);
        int data[][] = new int[3][3];
        for (int i =0;i<data.length;i++) {
            System.out.println("1st Array,enter 3 numbers for row # " + (i+1));
            for (int j=0;j<data[i].length;j++) {
                data [i][j] = sc.nextInt();
            }
        }
        int data2[][] = new int[3][3];
        for (int i = 0;i<data2.length;i++) {
            System.out.println("2nd Array,please enter 3 numbers for row # " +(i+1));
            for (int j = 0;j<data2[i].length;j++) {
                data2[i][j] = sc.nextInt();
            }
        }
        int sum[][] = new int[3][3];
        for (int i =0;i<data.length;i++) {
            for (int j =0;j<data[i].length;j++) {
                sum[i][j]=data[i][j]+data2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
