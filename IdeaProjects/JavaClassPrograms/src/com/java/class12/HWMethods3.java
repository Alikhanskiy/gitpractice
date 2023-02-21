package com.java.class12;

import java.util.Scanner;

public class HWMethods3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter purchase amount ? ");
        double money = input.nextDouble();
        System.out.println("Are you a member of our loyalty program ? (true/false)");
        boolean areU = input.nextBoolean();
        //double final = discount(areU, money);
        System.out.println("The final cost will be : " + discount(areU,money));

    }
    public static double discount (boolean loyal ,double purchase) {
        if (loyal) {
            return (purchase - purchase*0.10);
        }
        else {
            return purchase;
        }
    }
}
