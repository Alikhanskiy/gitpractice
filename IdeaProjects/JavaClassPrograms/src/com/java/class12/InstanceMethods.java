package com.java.class12;

public class InstanceMethods {
    //What
    //What is a static method?
    //static methods are predefined functions
    //that can be used without creating an Object.
    //what is a non-static method?
    //non-static method os an instance method
    //In order to use
    //
    public static void main(String[] args) {
        print();
        //print1();error
        InstanceMethods somevarName = new InstanceMethods();
        somevarName.print1();
    }
    public static void print() {

        System.out.println("Hello");
    }
    public void print1() {
        System.out.println("Hello");

    }
}
