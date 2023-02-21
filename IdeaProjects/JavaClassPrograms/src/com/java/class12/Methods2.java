package com.java.class12;

import java.util.Scanner;

public class Methods2 {
    //Params are the info is required for method to successfully function.
    //If you don't provide the required info by method that the method won't be able to execute.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //
        System.out.println("Please enter the first number:");
        int n1 = s.nextInt();
        System.out.println("Please enter the second number:");
        int n2 = s.nextInt();
        System.out.println(add (n1,n2));

        //
        int c = 13;
        int d = 8;
        inTheRange(c,d);
        System.out.println(inTheRange(c,d));

        int y= 8;
        int x = 9;
        range(y,x);
        System.out.println(range(y,x));




    }
    public static int add (int a,int b) {
       /* int ans = (a + b);
        return ans;*/
        if (b != a) {
            return a + b;
        }

            return (a+b)*2;// we can also do it without else//with else
        }

    public static boolean inTheRange (int n1,int n2) {
        //checking if at least one of 2 numbers are in the range between 10 & 20
        if ((n1 >=10 && n1 <= 20) || (n2 >= 10 && n2 <= 20)) {
            return true;
        }
            return false;//we can do it with else or without
    }

    public static boolean range (int e,int f) {
        //cleanest code
        return e>=10 && e<=20 || f >= 10 && f <=20;
    }
}

