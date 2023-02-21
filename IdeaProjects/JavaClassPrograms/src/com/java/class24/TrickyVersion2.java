package com.java.class24;

import java.util.Scanner;

public class TrickyVersion2 {
    public static void main(String[] args) {
        int data[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<data.length;i++) {
            System.out.println("Enter data in row " +(i+1));
            int max = Integer.MIN_VALUE;
            for (int j =0;j<data[i].length;j++) {
                data[i][j] = sc.nextInt();
                if (data[i][j]>max) {
                    max = data[i][j];

                }
            }
            System.out.println("Greatest in row "+ (i+1)+ " is "+ max);
        }
        System.out.println(Integer.MIN_VALUE);
    }
}
