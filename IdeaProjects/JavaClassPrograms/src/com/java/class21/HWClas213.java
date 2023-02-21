package com.java.class21;

public class HWClas213 {
    public static void main(String[] args) {
        /*4.  Write a program to print the below pattern
         *
         **
         ***
         ****
         *****  */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("5===============");
    /*5.  Write a program to print the below pattern
         *
        ***
       *****
      *******
     *********/
        for(int i = 1;i<=5;i++) {
        for (int j = 1; j <= 5 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2*i-1; k++) {
            System.out.print("*");
            }
        System.out.println();
        }
        System.out.println("6================");
        /*6.  Write a program to print the below pattern
     *********
      *******
       *****
        ***
         */
        for (int i = 1;i<=5;i++) {
            for (int j =1; j<=i-1; j++) {
                System.out.print(" ");
            }
            for (int k =1;k<=11-2*i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

