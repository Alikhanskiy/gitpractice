package com.java.class11;

import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Please enter the day of the week : ");
        String day = ali.next();
        int n = 0;
        switch (day.toUpperCase()) {
            case "MONDAY": n = 5;System.out.println(n + " day/days until the weekend");
            break;
            case "TUESDAY": n = 4;System.out.println(n + " day/days until the weekend");
            break;
            case "WEDNESDAY": n = 3;System.out.println(n + " day/days until the weekend");
            break;
            case "THURSDAY": n = 2;
                System.out.println(n + " day/days until the weekend");
                break;
            case "FRIDAY": n = 1;
                System.out.println(n + " day/days until the weekend");
                break;
            case "SATURDAY": n = 0;
            case "SUNDAY": n = 0;
                System.out.println("It's an weekend,enjoy!");
                break;
            default:
                System.out.println("Wrong entry!");
            }
        }

    public static class SwitchPractice3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the year : ");
            int year = sc.nextInt();
            System.out.println("Please enter the month : ");
            String month = sc.next();
            switch (month.toLowerCase()) {
                case "january":
                case "march":
                case "may":
                case "july":
                case "august":
                case "october":
                case "december":
                    System.out.println(month + " has 31 days");
                    break;
                case "february":
                    if (year == 2023) {
                        System.out.println(month + " has 28 days");
                    } else if (year == 2022) {
                        System.out.println(month + " has 29 days");
                    } else
                        System.out.println("Check the calendar,please!");
                    break;
                case "april":
                case "june":
                case "september":
                case "november":
                    System.out.println(month + " has 30 days");
                    break;
                default:
                    System.out.println("Wrong entry");

            }
        }
    }
}


