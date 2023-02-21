package com.java.class25;

public class Tesla {

    String name;
    int mileRange;
    String color;
    int year;

    void battery(int miles) {
        mileRange = mileRange-miles;
    }
    void charge() {
        System.out.println(name + " is charging");
    }

    void lightShow() {
        System.out.println(name + " is doing light show");
    }

}
