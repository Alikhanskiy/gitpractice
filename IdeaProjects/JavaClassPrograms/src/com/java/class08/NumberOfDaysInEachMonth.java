package com.java.class08;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-12 : ");
        int num = sc.nextInt();
        if (num == 1 || num == 3 || num == 5 || num == 7 || num == 10 || num == 12 || num == 8) {
            System.out.println("This month has 31 days");
        }
        else if (num == 2) {
            System.out.println("This month has 28 or 29 days");
        }
        else if (num == 4 || num == 6 || num == 9 || num == 11) {
            System.out.println("This month has 30 days");
        }
        else {
            System.out.println("Wrong entry,numbers between 1-12 only");

        }
    }
}
