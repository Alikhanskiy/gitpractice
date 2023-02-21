package com.java.class11;

import java.util.Scanner;
    public  class SwitchPractice3 {
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




