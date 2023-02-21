package com.java.class27;

public class IphoneMainClass {
    public static void main(String[] args) {
        Iphone X = new Iphone("Iphone",6);
        Iphone Y = new Iphone();
        Y.info();
        X.name="Aisy";
        Y.name = "Zeema";
        System.out.println(X.name);
        Iphone.os();
        System.out.println(X.name+"'s "+Iphone.phone + " is with screen size " + X.screeninches);


    }
}
