package com.java.class15;

public class Replace2 {
    public static void main(String[] args) {
        String str = "DevX Adventures World";//=DevX AdvXntures World
        //write a program that updates the first e in the second word
        //to X

        int indexOfFirstSpace = str.indexOf(" ");
        String noDevXEReplaced = str.substring(indexOfFirstSpace).replaceFirst("e","X");
        //we skipped word DevX
        String devXOnly = str.substring(0,indexOfFirstSpace);
        String finalRESULT = devXOnly.concat(noDevXEReplaced);
        System.out.println(finalRESULT);

        String str1 = "Hello Coder superstar";// = Hello CodXr superstar
        int indexOf1stSpace = str1.indexOf(" ");
        String xReplacing = str1.substring(indexOf1stSpace).replaceFirst("e","X");
        System.out.println(xReplacing);
        String coderOnly = str1.substring(0,indexOf1stSpace);
        String result = coderOnly.concat(xReplacing);
        System.out.println(result);

        String str2 = "I went to College";//=I went to CollXge
        int indexOf3rdSpace = str2.lastIndexOf(" ");
        String xReplace = str2.substring(indexOf3rdSpace).replaceFirst("e","X");
        System.out.println(xReplace);
        String collegeOnly = str2.substring(0,indexOf3rdSpace);
        String finalr = collegeOnly.concat(xReplace);
        System.out.println(finalr);

        int length = str2.indexOf("e");
        String str3 = str2.replace("e","X");
        System.out.println(str3);
        String str4 = str2.substring(0,length +1).concat(str2.substring(length +1).replaceFirst("e","X"));
        System.out.println(str4);

    }
}
