package com.java.class14;

import java.util.Scanner;

public class CharAt {
    //charAt(int i) ->
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "wedevx.co";
        System.out.println(str.charAt(1));//e
        System.out.println(str.charAt(0));//w
        System.out.println(str.charAt(5));//x
        System.out.println(str.charAt(6));//.

        String str2 = "Hello World";
        System.out.println(str2.charAt(5));//space

        String str3 = "Superstar";
        System.out.println(str3.charAt(8));//index out of bound if 10-11
        //
        System.out.println("Enter an word :");
        String str4 = sc.next();
        System.out.println("The last character is : " +lastChar(str4));


        String str6 = sc.next();
        System.out.println(lastCharAt(str6 ));

    }
    public static char lastChar(String word) {
        return word.charAt(word.length()-1);


    }
    public static char lastCharAt(String str5) {
        int length = str5.length();
        return str5.charAt(length-1);
    }
}
