package com.java.class17;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        //Write a program to print out all character
        //in a String
        //do I know how many times my loop
        //should be iterated?
        String str = "Let's go Mars";//13 characters
        int startingIndex = 0;
        //if you need to increment then use
        //var
        while (startingIndex < 13) {
            char eachChar = str.charAt(startingIndex);
            System.out.println(eachChar);
            startingIndex++;
        }
        //1.starting point
        //2.define a boolean expression where you
        //are using the variable of starting point
        //3.write body of the while loop.
        //4.make sure you have an updater of a variable
        //in the boolean expression

        //write a program that prints the all characters of a String
        //in reverse order
        //ex:java-avaj
        //obama-amabo
        System.out.println("-----------------");
        String str1 = "Pacific Ocean";
        int p = str1.length()-1;
        while (p >= 0) {
            char ch = str1.charAt(p);
            System.out.println(ch);
            p--;
        }
        System.out.println("=================");
        String str2 = "Welcome to NYC";
        int i = str2.length()-1;
        while (i >= 0) {
            System.out.println(str2.charAt(i));
            i--;
        }
    }
}
