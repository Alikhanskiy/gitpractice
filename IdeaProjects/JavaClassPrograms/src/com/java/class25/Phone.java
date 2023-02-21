package com.java.class25;

public class Phone {

    boolean isApple;
    String color;
    int memory;
    String name;
    int year;

    void storage(int usedMemory) {
        memory = memory - usedMemory;
    }
    void update() {
        System.out.println(name + " is updating");
    }
    void talkToSiri() {
        System.out.println(name + " is checking the weather");
    }
    Phone(String nameFromUser,int yearFromUser) {
        name = nameFromUser;
        year = yearFromUser;
    }



}
