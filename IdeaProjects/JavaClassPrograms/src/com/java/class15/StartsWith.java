package com.java.class15;

public class StartsWith {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("Java"));

        String str2 = "";
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());
    }
}
