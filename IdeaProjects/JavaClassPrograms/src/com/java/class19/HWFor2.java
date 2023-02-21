package com.java.class19;

public class HWFor2 {
    public static void main(String[] args) {
        //4.  Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
        int result = 0;
        for (int i = 0; i <= 10;i++) {
            if (i % 3==0) {
                result = result - i;
            }
            else {
                result = result + i;
            }
        }
        System.out.println(result);
        System.out.println("4=====================");
        int sum = 0;
        for (int i =0;i<=10;i++) {
            if (i%3==0) {
                sum=sum-i;
            }
            else {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        System.out.println("6======================");
        //6.  Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2*/ /*(edited)*/
        int sum1 = 0;
        for (int i1 =1;i1<=5;i1++) {
            sum1=sum1+i1*i1;
            //sum1=sum1+(int)Math.pow(i1,2);2nd option n better
        }
        System.out.println(sum1);


    }
}
