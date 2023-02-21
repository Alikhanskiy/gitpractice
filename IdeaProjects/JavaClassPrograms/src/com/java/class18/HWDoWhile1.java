package com.java.class18;

import java.util.Scanner;

public class HWDoWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int more;
        do {
            System.out.println("Welcome to the Chase bank ATM!\nPlease enter your account opening balance :");
            int balance = sc.nextInt();
            System.out.println("Please choose the operations you want to perform:");
            System.out.println("1)Withdraw\n2)deposit\n3)Check Balance");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Please enter the amount to withdraw:");
                    int withdraw = sc.nextInt();
                    if (balance>=withdraw) {
                        System.out.println("The available balance is : "+(balance-withdraw));
                    }
                    else {
                        System.out.println("The amount is over the limit!");
                    }
                    break;
                case 2:
                    System.out.println("Please enter the amount you want to deposit:");
                    int deposit = sc.nextInt();
                    System.out.println("The available balance is : "+ (balance + deposit));
                    break;
                case 3:
                    System.out.println("The available balance is : " + balance);
                    break;
                default:
                    System.out.println("Please enter the valid operation : ");
            }
            System.out.println("Would you like to do more operations ?\n(1 for yes/2 for no)");
             more = sc.nextInt();
             if (more == 2) {
                 System.out.println("Your operation is completed!");
             }
             else if (more!=1) {
                 System.out.println("Wrong entry,try again!");
             }
             else {
                 System.out.println("Wrong entry,try again!");
             }
        }
        while (more == 1);
    }
}
