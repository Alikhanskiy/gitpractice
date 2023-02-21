package com.java.class03;

public class IdentifierExample {
    public static void main(String[] args) {
        //Syntax for the variable
        //dara_type variable_name = value
        //In the example we have
        //mySum = variable name
        //value = 127
        byte mySum = 127; // 8 bit
        mySum = 15 + 16;
        System.out.println(mySum) ;
        short num2 = 343; //2 bytes
        int num3 = 345; //4 bytes
        long num4 = 456454; // 8 bytes
        //below data types can store deciml number ex - 323.54, 43.23
        float num5 = 35345.343f; // 4 bytes
        double num6 = 4354.2332; // 6 bytes
        String name = "Ali";
        char gender = 'm';
        boolean answer = true;// or false - it's value
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(answer);

    }
}
