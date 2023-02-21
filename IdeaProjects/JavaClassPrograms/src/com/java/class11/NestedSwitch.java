package com.java.class11;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        //case or default statements can have entire switch statement inside
        //default is like else if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Total spending for shipping : ");
        //int totalSpending;
        int totalSpending = sc.nextInt();
        System.out.println("What's the destination : ");
        String destination = sc.next();
        //double totalSpending = 155;
        if ((int) totalSpending > 0) {
            switch ((int) totalSpending) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Shipping cost is $5");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Shipping cost is $10");
                    break;
                default:
                    switch (destination) {
                        case "USA"://10%
                            System.out.println("Shipping cost is $ " + totalSpending * 0.1);
                            break;
                        case "Canada"://15%
                            System.out.println("Shipping cost is $ " + totalSpending * 0.15);
                            break;
                        case "Europe"://20%
                            System.out.println("Shipping cost is $ " + totalSpending * 0.2);
                            break;
                        default://25%
                            System.out.println("Shipping cost is $ " + totalSpending * 0.25);
                            break;

                    }
            }

        } else {
            System.out.println("Invalid entry");
        }

    }
}

