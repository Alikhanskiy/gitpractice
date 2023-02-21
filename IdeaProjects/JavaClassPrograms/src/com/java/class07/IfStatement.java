package com.java.class07;

public class IfStatement {
    public static void main(String[] args) {
        //if statement is a logical flow control
        //you can write a program that executes certain portion of the code
        //only in certain conditions.
        if (true) {
            System.out.println("Hello World");
            System.out.println("Hello Jupiter");
        }
        //proceeds with a normal execution
        System.out.println("I'm outside of If Statement");
        //when you have only one statementninside if statement u can skip {}
        if (false)
            System.out.println("Hello Mars");
        System.out.println("Hello Saturn");//this line is in fsct outside of the if statement scope
        //it will print it in any condition
        int gallonOfOil = 4000;

        if (gallonOfOil>1000) {
            System.out.println("Hello Venus");
        }

    }
}
