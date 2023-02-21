package com.java.class13;

public class PlatformBugsPractice {
    public static String welcomeBackSuperstar() {
        return "Welcome back, Superstar!";
    }
    public static void main(String[] args) {
        String str = welcomeBackSuperstar();
        System.out.printf(str+ "\n");
        //System.out.printf(str+"\n");
        //System.out.printf(str+"\n");


        String str2 = myNameisBruno();
        System.out.println(str2);
    }
    public static String myNameisBruno() {
        return "My name is Bruno and I am 22 years old.";
    }
}
