package com.java.class26;

public class Uber {

    double balance;
    String accName;
    String accNumber;

    Uber() {
        System.out.println("No Arg Constructor");

    }
    Uber(String accName) {
        System.out.println("From 2nd Constructor " + accName);
    }
     Uber(int amount) {
        System.out.println("Balance after last ride is "+ amount);

    }
}
