package com.java.class16;

public class WhileLoop {
    public static void main(String[] args) {
        //In programming pretty often you need to rerun the same set of
        // code multiple times
        //and you need to accomplish that with minimal code


        int activeUsers = 0;
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        activeUsers++;
        activeUsers++;
        activeUsers++;
        activeUsers++;
        //()-> boolean expression
        //while boolean expression is true
        int activeU = 0;
        //if you are dealing with counters
        //your boolean expressions are going to be
        //<comparison operator
        while (activeU<10) {
            activeU++;
            System.out.println("Welcome User number " + activeU);
            //body
        }
    }
    //reuse the same logic is for methods.
    //infinite loop
}
