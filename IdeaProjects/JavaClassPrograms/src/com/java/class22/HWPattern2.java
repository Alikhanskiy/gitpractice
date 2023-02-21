package com.java.class22;

public class HWPattern2 {
    public static void main(String[] args) {
        /*6.  Write a program to print the below pattern
         *********
         *******
         *****
         ***
         */

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
