package com.java.class14;

import java.util.Scanner;

public class HWPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an word starting with 'hi': ");
        String str = sc.next();
        System.out.println(startsHi(str));

       String str1 = sc.next();
        System.out.println(copies(str1));

        String s = sc.next();
        System.out.println(swap(s));
    }
    public static boolean startsHi(String s) {
        return s.substring(0,2).equalsIgnoreCase("hi");
    }

    public static String copies(String st) {
       String st1 = st.substring(st.length()-2);
       return st1+st1+st1;
    }

    public static String swap(String string) {
        String str2 = string.substring(string.length()-2);
        str2 = str2.substring(1).concat(str2.substring(0,1));
        return string.substring(0,string.length()-2).concat(str2);
    }
}
