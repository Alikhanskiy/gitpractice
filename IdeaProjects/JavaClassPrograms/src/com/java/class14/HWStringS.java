package com.java.class14;

import java.util.Scanner;

public class HWStringS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an word which starts with 'hi' :");
        String s = sc.next();
        System.out.println(hi(s));

        String String = sc.next();
        System.out.println(copies(String));

        String in = sc.next();
        System.out.println(swap(in));
    }
    public static boolean hi(String str) {
        return str.substring(0, 2).equalsIgnoreCase("hi");
    }
    public static String copies(String st) {
            String st1 = st.substring(st.length()-2);
            return st1 + st1 + st1;
        }
        public static String swap(String ing) {
            //String str1 = ing.substring(0, ing.length() - 2);
            //char str2 = ing.charAt(ing.length() - 1);
            //char str3 = ing.charAt(ing.length() - 2);
            //return str1 + str2 + str3;
            String str1 = ing.substring(ing.length()-2);
            str1 = str1.substring(1).concat(str1.substring(0,1));
            return ing.substring(0,ing.length()-2).concat(str1);
        }

    }






