package com.java.class19;
//1 + 2 + 3 + 4 + 5 = 15
public class SumOf1to5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =1;i<=5;i++) {
            sum = sum + i;

        }
        System.out.println(sum);

        System.out.println("===============");
        //1*2*3*4*5
        int sum1 = 1;
        for (int l = 1;l<=5 ; l++) {
            sum1 = sum1 * l;
        }
        System.out.println(sum1);
        System.out.println("===============");

    }
}
