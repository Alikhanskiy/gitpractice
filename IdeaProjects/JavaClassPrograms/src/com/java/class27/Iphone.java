package com.java.class27;

public class Iphone {
    static String operSystem;
    static String phone;
    String name;
    String display;
    int model;
    int screeninches;

    Iphone (String whatPhone,int howbig) {
        phone=whatPhone;
        screeninches = howbig;
    }
    Iphone() {

    }

    public static void os() {
        operSystem = "IOS";
        System.out.println("Iphone's operational system is "+operSystem);
        //phone="Iphone";
        System.out.println("One of the biggest openings in early 2000's was "+phone);
    }

    public void info () {
        display = "Touchscreen";
        model = 12;
        int memory = 256;
        System.out.println(phone +" "+ model+" came out in 2019");
        System.out.println(phone+"'s screen is " + display);
        System.out.println("Iphone with size of "+memory+" GB is popular one");
    }

}
