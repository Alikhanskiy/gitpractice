package com.java.class19;

public class ForLoopTricky {
    public static void main(String[] args) {
        for (int i =1;i<=10;) {
            i++;
            System.out.println(i+1);
        }
        System.out.println("====================");
        for (int j = 1;j <= 10; j++) {
            System.out.println(j+1);
        }
        System.out.println("==================");
        int k;
        for ( k = 1;k<=10;k++) {
        }
        System.out.println(k);

        System.out.println("================");
        for (int i =1;i<=10;i++) {
            i=i+2;
            System.out.println(i);
        }
        System.out.println("================");
        int i;
        for (i =1;i<=10;i++) {
            i=i+2;
        }
        System.out.println(i);
        System.out.println("================");
        int sum =0;
        for (int l = 1;l<=5;l++) {
            sum = sum + l;
        }
        System.out.println(sum);

    }
}
