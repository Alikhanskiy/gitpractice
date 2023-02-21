package com.java.class10;

import java.util.Scanner;

public class HWNestedIf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the loan amount in $ : ");
        int loanAmount = input.nextInt();
        System.out.println("Please enter your credit score between 300-850 : ");
        int creditScore = input.nextInt();
        if (loanAmount < 10000) {
            if (creditScore < 600) {
                System.out.println("The interest rate is set to 15% ");
            }
            else if (creditScore >=600) {
                System.out.println("The interest rate is set to 10% ");
            }
        }
        else if (loanAmount >= 10000) {
            if (creditScore < 600) {
                System.out.println("The interest rate is set to 12% ");
            }
            else if (creditScore >= 600) {
                System.out.println("The interest rate is set to 8% ");
            }
        }
        else {
            System.out.println("Wrong entry!");
        }
    }
}
