package com.java.class12;

import java.util.Scanner;

public class MethodsTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you on vacation : ");
        boolean vacation = sc.nextBoolean();
        System.out.println("Please enter the day of the week : ");
        int day = sc.nextInt();
        boolean result = canWeSleepIn(day , vacation);
        System.out.println(result);


    }


    public static boolean canWeSleepIn(int dayOfWeek, boolean isOnVacation) {
        if (isOnVacation) {
            return true;
        }
        else {
            if (dayOfWeek <= 5) {
                return false;
            }
            else if (dayOfWeek == 6 || dayOfWeek == 7)
                return true;
            else {
                return false;

            }
        }

    }
}



