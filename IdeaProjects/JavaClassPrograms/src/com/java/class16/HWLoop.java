package com.java.class16;

public class HWLoop {
    public static void main(String[] args) {
       /* @channel Homework:
        Write a program that uses a while loop to print the odd numbers from 1 to 20.
         => 1,3,5,7,9,11,13,15,17,19
        Write a program that uses a while loop to print the sum of the numbers from 1 to 10.
        => 1+2+3+4+5+6+7+8+9+10. result should be 55?
        Write a program that uses a while loop to print the multiplication table for a given number.
        Enter number to print table: 7
        7 * 1 = 7
        7 * 2 = 14
        7 * 3 = 21
        7 * 4 = 28
        7 * 5 = 35
        7 * 6 = 42
        7 * 7 = 49
        7 * 8 = 56
        7 * 9 = 63
        7 * 10 = 70*/

        int num = 1;
        while (num<20) {
            System.out.println(num);
             num +=2;
        }
        System.out.println("==================");
        int num1 = 1;
        while (num1 < 20) {
            if (num1 % 2 !=0) {
                System.out.println(num1);
            }
            num1++;
        }
        System.out.println("==================");
        int num2 = 0;
         int sum = 0;
        while ( num2 <= 10) {
            sum =sum + num2;
            num2++;
        }
            System.out.println(sum);
        System.out.println("==================");

        int num3 = 7;
        int num4 = 0;
        int multi = 0;
        while (num4 < 10) {
            num4++;
            multi = num3 * num4;
            System.out.println(num3+ " * " +num4+" = "+multi);
        }
    }
}
