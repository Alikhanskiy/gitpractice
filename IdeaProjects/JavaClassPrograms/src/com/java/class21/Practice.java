package com.java.class21;

public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //3 times
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                //executes 6 times
            }
            System.out.println();
            //3 times
        }//12 total times
        System.out.println("===============");
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

