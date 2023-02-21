package com.java.class15;

public class IndexOfSubstringPrctice {
    public static void main(String[] args) {
        String str = "I love waking 5am up at";
        int length = "5am".length();
        int indexOf5am = str.indexOf("5am");
        System.out.println(indexOf5am);
        System.out.println(length);
        System.out.println(length+indexOf5am);
        //System.out.println(str.substring(14,17));explanation
        //check for the length of this String
        //
        System.out.println(str.substring(indexOf5am, indexOf5am+length));
    }
}
