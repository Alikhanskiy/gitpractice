package com.java.class16;

public class WhileLoop2 {
    public static void main(String[] args) {
        //write a program that will print out this:
        //*
        //**
        //***
        //****
        //*****
        String c = "*";
        while (c.length() < 6) {
            System.out.println(c);
            c+="*";
        }
        String str = "*";
        int iterator = 0;
        while (iterator < 5) {
            System.out.println(str);
            str = str.concat("*");
            //if after str.concat
            iterator++;
        }
        String str2 = "*";
        while (str2.length() < 6) {
            //that updates
            //str2 = str2.concat("*");
            System.out.println(str2);
            str2 = str2.concat("*");


        }
        //from 10 to 0
        int st = 10;
        while (st >= 0) {
            System.out.println(st);
            st--;
        }
        //how to print 1 less character i n a String? ->substring
        //substring(0,st1.length()-4)
        String st1 = "*****";
        while (st1.length() > 0) {
            System.out.println(st1);
            st1 = st1.substring(0, st1.length() - 1);
        }
        //numbers 2-4-6-8-10----20
        int num = 0;
        while (num < 20) {
            num += 2;
            System.out.println(num);
            //code is optimal,10 loop
            //second one loop 20
            //space complexity
            //time complexity
            //big annotation
        }
        int num1 = 0;
        while (num1 <= 20) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }
        String str3 = "Hello DevXer";
        //4 - vowels
        //8 consonants including the space
        //iterate through all characters
        int letters = 0;
        int vowel = 0;
        int consonant = 0;
        while (letters < str3.length()) {
            if (str3.charAt(letters) == 'a' || str3.charAt(letters) == 'o' || str3.charAt(letters) == 'e' || str3.charAt(letters) == 'i' || str3.charAt(letters) == 'u') {
                vowel++;
            }
            else {
                consonant++;
            }
            letters++;
        }
        System.out.println("Vowels " + vowel);
        System.out.println("Consonants " + consonant);
    }
}
