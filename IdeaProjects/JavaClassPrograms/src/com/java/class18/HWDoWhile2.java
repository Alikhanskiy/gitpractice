package com.java.class18;

public class HWDoWhile2 {
    public static void main(String[] args) {
        int i =10;
        //10-1
        do {
            System.out.println(i--);
        }while (0 < i);
        System.out.println("============================");
        //1-10
        int in = 1;
        do {
            System.out.println(in++);
        } while (in <= 10);
        System.out.println("==================");
        //1 10 2 9 3 8 4 7 5 6
        int a = 1;
        int b = 10;
        do {

            System.out.println(a++);
            System.out.println(b--);
            //i--;
            //in++;

        } while (a <= 5 );
        System.out.println("==================");
        //even numbers between 1-100
        int c = 0;
        do {
            System.out.println(c);
            c+=2;
        } while (c <=100);

    }

}
