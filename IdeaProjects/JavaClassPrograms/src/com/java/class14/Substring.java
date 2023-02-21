package com.java.class14;

public class Substring {
    //
    public static void main(String[] args) {
        String str = "Hello World";

        str.substring(6);
        System.out.println(str.substring(6));
        System.out.println(str);
        System.out.println(str.substring(4,5));

        String str1 = "Tesla Motors Inc.";
        System.out.println(str1.substring(6));
        System.out.println(str1.substring(10));

        String str2 = "La Ferrari";
        System.out.println(str2.substring(3,8));

        String str3 = "Maldive Islands";
        System.out.println(str3.substring(0,5));


    }
}
