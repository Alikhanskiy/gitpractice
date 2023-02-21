package com.java.class24;

import java.util.Scanner;

public class TrickyVersion3 {
    public static void main(String[] args) {
        int data [][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<data.length;i++) {
            System.out.println("Enter data in row "+ (i+1));
            data [i][0] = sc.nextInt();
            int max = data[i][0];
            for (int j=1;j<data[i].length;j++) {
                data[i][j]= sc.nextInt();
                if (data[i][j]>max) {
                    max = data[i][j];
                }
            }
            System.out.println("Greatest in row "+ (i+1) +" is "+ max);
        }
    }
}
