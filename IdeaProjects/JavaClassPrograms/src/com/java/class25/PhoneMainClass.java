package com.java.class25;

public class PhoneMainClass {
    public static void main(String[] args) {
        Phone alisPhone = new Phone("Jay",2018);
        Phone brosPhone = new Phone("Qara",2019);

        alisPhone.name = "JayPhone";
        alisPhone.color = "Black";
        alisPhone.memory = 256;

        brosPhone.color = "Gray";
        brosPhone.memory = 512;

        brosPhone.storage(243);
        System.out.println(brosPhone.memory + " GB available");

        brosPhone.update();

        alisPhone.update();

        alisPhone.storage(164);
        System.out.println(alisPhone.memory + " GB available");

        alisPhone.talkToSiri();
    }
}
