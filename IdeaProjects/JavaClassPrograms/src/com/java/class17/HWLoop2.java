package com.java.class17;

public class HWLoop2 {
    public static void main(String[] args) {
        /*Homework:
        1. Write a program that calculates the sum of all even numbers between 1 and a 100 using a while loop.
        2+4+6+8 … = ?
        2. Write a program that prints all prime numbers between 1 and a 100  using a while loop.*/

        int n = 0;
        int sum = 0;
        while (n <= 100) {
            sum = sum + n;
            n += 2;
        }
        System.out.println(sum);


        System.out.println("====================");
        int count = 1;
        int num1 = 2;
        while (count < 100) {
            count++;
            if (count % 2 != 0 && count % 3 != 0 && count % 5 != 0 && count % 7 != 0) {
                System.out.println(count);
            } else if (count == 3 || count == 5 || count == 7) {
                System.out.println(count);
            } else if (num1 == count) {
                System.out.println(num1);
            }
        }
    }
}



