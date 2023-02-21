package com.java.class17;

public class WhileLoopPractice4 {
    public static void main(String[] args) {

        String str1 = "Atlantic";
        int i = 1;
        while (i < str1.length()) {
            char ch = str1.charAt(i);
            System.out.println(ch);
            i+= 2;
        }
        System.out.println("================");
        String str2 = "Hello World from Mars";
        int index1 = 1;
        while (index1 < str2.length()) {
            System.out.println(str2.charAt(index1));
            index1+=2;
        }
    }
}
