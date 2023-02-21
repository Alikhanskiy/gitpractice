package com.java.class25;

public class TeslaMainClass {
    public static void main(String[] args) {


        Tesla alisTesla = new Tesla();
        alisTesla.name = "Wolfy";
        alisTesla.color = "Gray";
        alisTesla.mileRange = 345;

        alisTesla.battery(126);
        System.out.println(alisTesla.mileRange + " miles left");

        alisTesla.charge();

        alisTesla.lightShow();
    }
}
