package com.java.class17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //write a program to print
        //1 10 2 9 3 8 4 7 5 6
        int a = 1;//1.starting point
        int b = 10;//
        while (a <= 5) {
            //()->how many times it should run?
            //if your problems is asking to run specific
            //number of times
            //there should be at least one var
            //in the body of the while I must have a
            //boolean expression updater
            //a++ - is updater
            //1.starting point
            //2.define a boolean expression where you
            //are using the variable of starting point
            //3.write body of the while loop.
            //4.make sure you have an updater of a variable
            //in the boolean expression
            System.out.println(a);
            System.out.println(b);
            a++;
            b--;

        }
    }
}
