package com.java.class12;

import java.util.Scanner;

public class HWMethods2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade : ");
        char grade = input.next().charAt(0);
        boolean p = Passing(grade);
        System.out.println(p);
    }
    public static boolean Passing (char abc ) {
        //char G;
        switch (abc) {
            case 'A':
            case 'B':
                return true;
            case 'C':
            case 'D':
            case 'F':
                return false;
            default:
                System.out.println("Wrong entry");
                return false;
                //4:32 pm
        }
        /*if (char a || char b) {
            return true;
        }
        else if (char c || char d) {
            return false;
        }
        else if (char f) {
            return false;
        }*/
    }
}
