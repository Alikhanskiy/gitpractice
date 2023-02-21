package com.java.class27;

class Car{
    int speed = 100;//Instance
     static int price = 600;
    void drive() {
        int speed=150;//local variable
        System.out.println(speed);
    }
}

public class StaticExample1 {
    public static void main(String[] args) {
        int speed=120;//local variable- must be initialized
        //before use
        //System.out.println(speed);
        Car c = new Car();
        c.drive();
        //System.out.println(Car.speed);//error
        System.out.println(c.speed);//100
        System.out.println(Car.price);//600
        System.out.println(c.price);//600
    }
}
