package com.java.class12;

import java.util.Scanner;

public class MethodsTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is parrot talking? ");
        boolean talking = sc.nextBoolean();
        System.out.println("What time is it ? ");
        int hour = sc.nextInt();
        boolean a = trouble(hour, talking);
        System.out.println(a);

    }
    public static boolean trouble (int hour, boolean isParrotTalking) {

        if (isParrotTalking) {
            if (hour < 7 || (hour > 20 && hour <= 24)) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
            }
    }
}
