package com.java.class07;

public class TypeCasting {

    public static void main(String[] args) {
        double  gasPrice = 1.99;
        //int wholeNumber = gasPrice;//incompatible types compilation error
        //Type of casting:
        //1.Compilation error -> is thee error that happens before running the program
        //2.Runtime error -> type of error that happens while your program is already running
        int a = 40;//4 bytes
        //short smallNum = a;//2 bytes,incompatible types compilation error
        //incompatible means->not supported.things that don't fit each other
        //truncate= delete
        //explicit type casting-> manual
        double price = 2.99;
        //(int) is a type casting operator
        int convert = (int)price;
        System.out.println(convert);
        double num2 = 9.01;
        int convert2 = (int)num2;
        System.out.println(num2);
        float floatNum = 2.4f;
        byte convertfloat = (byte)floatNum;
        System.out.println(convertfloat);
        //implicit ->automatic casting
        int num1 = 24;
        double doubleNum = num1;//automatically adds .0 at the end
        System.out.println(doubleNum);
        int num5 = 55;
        double doubleNum2 = num5;
        System.out.println(doubleNum2);
        double sold = 4544950.96;
        int clients = 64;
        double average = sold/clients;
        System.out.println(average);
        //whenever  you have a double and int in one math expression
        //you should have a double result
        //implicit casting
        System.out.println("Miles per gallon!!!!!!!!!!!!!!!!!!!!!");
        int miles = 100;
        double gallons = 2.4;
        double mpg = miles/gallons;
        System.out.println(mpg);

        }

    }

