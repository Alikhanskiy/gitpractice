package com.java.class24;

import java.util.Scanner;

public class TrickyOne {
    public static void main(String[] args) {
        int data[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter 3 numbers for row " + (i + 1));
            int greatest = 0;//it's not gonna work
            for (int j = 0;j<data[i].length;j++) {
                data [i][j] = sc.nextInt();
                if (data[i][j] > greatest) {
                    greatest=data[i][j];
                }
            }
            System.out.println("The greatest number of row "+(i+1)+ " is "+ greatest);
        }
    }
}



