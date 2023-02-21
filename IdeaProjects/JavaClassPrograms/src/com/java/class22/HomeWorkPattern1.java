package com.java.class22;

import java.util.Scanner;

public class HomeWorkPattern1 {
    public static void main(String[] args) {
        /*5.  Write a program to print the below pattern
             *
            ***
           *****
          *******
         *********/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {

            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i-1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
