package com.java.class06;

//must have to be able to use Scanner
//import statement is a statement that tell our class to use functionalities
//from different packages
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        //before you can use scanner you have to have import statement
        //before public class line
        Scanner input = new Scanner(System.in);
        //input.nextInt() -> will enable us to input and int data to our program
        //it will allow us to enter an integer
        //input.nextInt();
        input.nextDouble();
        //user can write any decimal value
        //I can input int value which will be converted to a double
        // 10=> 10.0


    }
}
