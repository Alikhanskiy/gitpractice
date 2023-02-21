package com.java.class28;

public class Phone {
    void call() {
        System.out.println(" is calling");
    }
    void text() {
        System.out.println(" is texting");
    }
    Phone(){
        System.out.println("Iphone or Samsung?");
    }
}
class Iphone extends Phone{
    void callSiri() {
        System.out.println(" is calling Siri");
    }
    void takeSelfie(){
        System.out.println(" is taking selfie");
    }
    Iphone(){
        System.out.println("Iphone got IOS");
    }
}
class IphonePro extends Iphone{
    void rotate() {
        System.out.println(" is rotating");
    }
    void bend () {
        System.out.println(" is bending");
    }
    IphonePro() {
        System.out.println("IphonePro got better camera");
    }
}
class PhoneMainClass {
    public static void main(String[] args) {
        IphonePro X = new IphonePro();
        X.bend();
        X.call();
        X.rotate();
        X.text();
        X.takeSelfie();
        X.callSiri();
    }
}

