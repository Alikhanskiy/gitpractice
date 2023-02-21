package com.java.class11;

import java.util.Locale;
import java.util.Scanner;

public class HWSwitch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day of the week : ");
        String day = input.nextLine();
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("5 days till the weekend");
                break;
            case "tuesday":
                System.out.println("4 days till the weekend");
                break;
            case "wednesday":
                System.out.println("3 days till the weekend");
                break;
            case "thursday":
                System.out.println("2 days till the weekend");
                break;
            case "friday":
                System.out.println("1 day till the weekend");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It's an weekend,enjoy it!");
                break;
            default:
                System.out.println("Wrong entry");

        }
    }
}
