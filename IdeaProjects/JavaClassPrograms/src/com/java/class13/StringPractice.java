package com.java.class13;

public class StringPractice {
    public static void main(String[] args) {
        //How to concatenate a String

        String str = "Hello";
        String str2 = "DevX";
        //I can use + sign with strings
        //it basically means I want to append one String to another
        String str3 = str + str2;
        System.out.println(str3);
        String str4 = str + "  " + str2;
        System.out.println(str4);

        String str5 = "10";
        String str6 = "15";
        String str7 = str5 + str6;
        System.out.println(str7);
        //when concatenating a String with different data types
        //everything turns(casts) into a String.
        String str9 = 42 + 10 + "DevX";
        System.out.println(str9);
        String str10 = "Hello" + 42 + 10 + "DevX";
        System.out.println(str10 );
    }
}
