
package com.java.class12;

import java.util.Scanner;

public class InstanceMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter non-negative first number : ");
        int num1 = sc.nextInt();
        System.out.println("Please enter non-negative second number : ");
        int num2 = sc.nextInt();

        InstanceMethod2 var = new InstanceMethod2();
        System.out.println(var.lastDigit(num1, num2));


        int number = sc.nextInt();
        InstanceMethod2 vr = new InstanceMethod2();
        System.out.println(vr.threeOrFive(number));


        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println(vr.isten(e,f));

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(var.isiItTen(n1,n2));

    }

    public boolean threeOrFive(int num) {
        if (num < 0) {
            System.out.println("The number should be non-negative");
        }
        return num % 3 == 0 || num % 5 == 0;
    }

    public boolean lastDigit(int a, int b) {
        if (a >= 0 && b >= 0) {

            if (a % 10 == b % 10) {
                return true;
            }
        }
        return false;
    }


    public boolean isten (int c,int d) {
        if ( c == 10 || d == 10) {
            return true;
        }
        else if (c + d == 10) {
            return true;
        }
        return false;
    }
    public boolean isiItTen (int x,int y) {
        return x == 10 || y == 10 || x + y == 10 ;
    }

}

//String values must be surrounded inside double quotes.
//String has methods like ->