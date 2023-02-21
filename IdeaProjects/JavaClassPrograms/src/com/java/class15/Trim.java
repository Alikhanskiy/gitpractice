package com.java.class15;

public class Trim {
    public static void main(String[] args) {
        String str = "Elon ";
        boolean isEqual = str.equals("Elon");//false because of whitespace
        System.out.println(isEqual);
        String answer = "             yes          ";
        boolean yesOrNo = answer.equalsIgnoreCase("yes");
        System.out.println(yesOrNo);
        answer.trim();
        // return yes without the space
        System.out.println(answer.trim());
        //method chaining only if method return a String
        switch (answer.toLowerCase().trim()) {
        }
        if (answer.trim().equalsIgnoreCase("elon musk")) {
        }
    }
}