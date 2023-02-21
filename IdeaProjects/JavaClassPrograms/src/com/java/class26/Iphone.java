package com.java.class26;

public class Iphone {
    /*Task 1:
    Write a program to create an IPhone Class with variables (property)
     and methods (actions) inside it.,
    Create three constructors inside the IPhone class
    Identify and create static variables inside the IPhone class
    (Brainstorm on which variables can be static in IPhone Class )
    Create an IPhoneMainClass and use these three constructors
    to create three different objects
    Set static variable value for each object & Print all the values
    Using three objects call methods of IPhone class*/
    String operSystem;
    String feature;
    int memory;


    Iphone(){
        System.out.println("No Arg Constructor");
    }
    Iphone(String fromTheUser) {
        feature = fromTheUser;
        System.out.println("Iphone's feature "+ fromTheUser);
    }
    Iphone(int num) {
        memory = num;
        System.out.println("Iphone's memory "+ num);
    }
}

