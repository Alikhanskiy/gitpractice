package com.java.class10;

import java.util.Scanner;

public class HWShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double shippingcost;
        System.out.println("Please enter the shipping country : ");
        String destination = input.nextLine();
        System.out.println("Please enter the weight of your item in lbs :");
        double weight = input.nextDouble();
        if (destination.equalsIgnoreCase("United States") || destination.equalsIgnoreCase("US")) {
            if (weight < 2) {
                  System.out.println("The shipping cost is $5");
            } else if (weight >= 2) {
                shippingcost = 5 + weight * 0.5;
                System.out.println("The shipping cost is : " + shippingcost);
            }
        }
        else {
                shippingcost = 5 + weight * 1.5;
                System.out.println("The shipping cost is : " + shippingcost);
            }
        }
    }

